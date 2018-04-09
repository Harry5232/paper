package com.test.t;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

//@Target(ElementType.FIELD)
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface Ex {

	String[] dataString() default {};
	
	char[] dataChar() default {};

	int[] dataInt() default {};

	float[] dataFlo() default {};

	double[] dataDou() default {};

	String describe() default "";

}
