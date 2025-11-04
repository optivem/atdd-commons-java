package com.optivem.atdd.commons.channels;

import org.junit.jupiter.api.extension.*;

import java.util.Arrays;
import java.util.List;

/**
 * Context for a single channel invocation in a parameterized test.
 */
public class ChannelInvocationContext implements TestTemplateInvocationContext {

    private final String channel;
    private final Object[] arguments;
    private final String[] paramNames;

    /**
     * Creates a new channel invocation context.
     * 
     * @param channel the channel identifier
     * @param arguments the test method arguments
     * @param paramNames the parameter names
     */
    public ChannelInvocationContext(String channel, Object[] arguments, String[] paramNames) {
        this.channel = channel;
        this.arguments = arguments;
        this.paramNames = paramNames;
    }

    @Override
    public String getDisplayName(int invocationIndex) {
        if (arguments.length == 0) {
            return "Channel: " + channel;
        }
        String argsString = java.util.stream.IntStream.range(0, arguments.length)
            .mapToObj(i -> (paramNames.length > i ? paramNames[i] + "=" : "") + arguments[i])
            .collect(java.util.stream.Collectors.joining(", "));
        return "Channel: " + channel + " | Args: [" + argsString + "]";
    }

    @Override
    public List<Extension> getAdditionalExtensions() {
        return Arrays.asList(
            (BeforeEachCallback) context -> ChannelContext.set(channel),
            (AfterEachCallback) context -> ChannelContext.clear(),
            new ParameterResolver() {
                @Override
                public boolean supportsParameter(ParameterContext parameterContext, ExtensionContext extensionContext) {
                    return parameterContext.getIndex() < arguments.length;
                }

                @Override
                public Object resolveParameter(ParameterContext parameterContext, ExtensionContext extensionContext) {
                    return arguments[parameterContext.getIndex()];
                }
            }
        );
    }
}