package com.test.t;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

//@Target(ElementType.FIELD)
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface Grade {
	public enum Type {NORMAL, EASY, HARD, DIFFICULT}; // exam type

	Type type() default Type.NORMAL;
	
	int value() default 5; // exam score

	int total() default 100; // total score

	float weight() default 1; // weight

}
