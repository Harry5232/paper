package com.test.t3
import java.lang.annotation.*
import org.spockframework.runtime.extension.ExtensionAnnotation

@Retention(RetentionPolicy.RUNTIME)
@Target([ElementType.TYPE, ElementType.METHOD])

@ExtensionAnnotation(ScoresExtension)

public @interface Scores {
	int points() default 5; // points
	
	
}