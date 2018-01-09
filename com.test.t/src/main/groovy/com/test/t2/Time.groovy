package com.test.t2
import java.lang.annotation.*
import org.spockframework.runtime.extension.ExtensionAnnotation

@Retention(RetentionPolicy.RUNTIME)
@Target([ElementType.TYPE, ElementType.METHOD])

@ExtensionAnnotation(TimingExtension)

public @interface Time {}