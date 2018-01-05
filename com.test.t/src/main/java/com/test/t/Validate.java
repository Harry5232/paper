package com.test.t;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;


// @Target(ElementType.FIELD)
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface Validate {
	Ex[] ex() default {};

	int number() default 3;
	
	boolean test() default true;

}