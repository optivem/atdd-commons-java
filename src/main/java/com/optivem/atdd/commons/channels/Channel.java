package com.optivem.atdd.commons.channels;

import org.junit.jupiter.api.TestTemplate;
import org.junit.jupiter.api.extension.ExtendWith;
import java.lang.annotation.*;

/**
 * Annotation for defining multi-channel test methods that run across different channels.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@TestTemplate
@ExtendWith(ChannelExtension.class)
public @interface Channel {
    /**
     * The channel identifiers for which the test should be executed.
     * 
     * @return array of channel identifiers
     */
    String[] value();
}