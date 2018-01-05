package com.test.t;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

//@Target(ElementType.FIELD)
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface Ex {

	String[] dataString() default {};

	int[] dataInt() default {};
	
	String describe() default "";

}
