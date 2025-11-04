package com.optivem.atdd.commons.channels;

/**
 * Thread-local context for managing the current channel during test execution.
 */
public class ChannelContext {
    private static final ThreadLocal<String> current = new ThreadLocal<>();

    /**
     * Private constructor to prevent instantiation.
     */
    private ChannelContext() {
        throw new UnsupportedOperationException("Utility class");
    }

    /**
     * Sets the current channel for the executing thread.
     * 
     * @param channel the channel identifier to set
     */
    public static void set(String channel) {
        current.set(channel);
    }

    /**
     * Gets the current channel for the executing thread.
     * 
     * @return the current channel identifier
     * @throws RuntimeException if no channel is set
     */
    public static String get() {
        var channel = current.get();

        if(channel == null) {
            throw new RuntimeException("Channel type is not set. Please ensure that the test class is annotated with @ExtendWith(ChannelExtension.class) and that test methods are annotated with @Channel and @TestTemplate");
        }

        return channel;
    }

    /**
     * Clears the current channel for the executing thread.
     */
    public static void clear() {
        current.remove();
    }
}