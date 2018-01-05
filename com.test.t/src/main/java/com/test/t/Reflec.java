package com.test.t;

import java.lang.reflect.Method;

public class Reflec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HW4Solution t = new HW4Solution();

		Class className = t.getClass();
		System.out.println("Class Name: " + className);

		Method[] m = className.getDeclaredMethods();
		
		int num = m.length;
		for (Method s : m) {
			System.out.print(s.getName());
			Boolean whether = s.isAnnotationPresent(Grade.class);
			System.out.print(", " + whether);
			if (whether == true) {
				Grade g = s.getAnnotation(Grade.class);
				
				int v = g.value();
				System.out.println(", " + v);
			}else{
				System.out.println("");
			}

		}

		System.out.println("Length: " + num);
	}

}
