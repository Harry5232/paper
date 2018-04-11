package com.test.t;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.apache.commons.lang.ArrayUtils;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import org.apache.velocity.runtime.RuntimeConstants;
import org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader;

import com.test.t.Grade.Type;

public class TemplateGenerator {

	public static void main(String[] args) {
		// 宣告class變數 method個數 屬性個數
		HW1Solution t = new HW1Solution();
		Class className = t.getClass();
		String clsName = className.toString();
		String clsName2[] = clsName.split(" ");
		String clsName3 = clsName2[1];

		Method[] m = className.getDeclaredMethods();
		int m_len = m.length; // method個數
		List methods = new ArrayList<Object>(); // 最後要執行測試的methods

		// 為每一個method放入變數
		for (int i = 0; i < m_len; i++) {
			// method名字 、類型
			Object parTypes[] = m[i].getGenericParameterTypes();// int
			Object parReturn = m[i].getGenericReturnType(); // java.util.List<T>
			Object TypeV[] = m[i].getTypeParameters(); // T


			if (parReturn.toString().equals("class java.lang.String")) {
				parReturn = (Object) "String";
			}

			Object paras[] = m[i].getParameters(); // 參數

			int numPara = paras.length; // 參數個數

			Map A = new HashMap<String, Object>();
			String methodName = m[i].getName();
			Grade g = m[i].getAnnotation(Grade.class);
			Validate v = m[i].getAnnotation(Validate.class);
			// 代表沒有要測試
			if (g == null || v == null || v.test() == false) {
				continue;
			}

			List exam = new ArrayList<Object>();
			for (Ex k : v.ex()) {
				exam.add(k);
			}

			Type type = g.type();
			float score = g.value();
			float total = 100;
			float weight = 1;
			int testNum = v.number();
			int examNum = exam.size();

			List<Ex> exam2 = caseGenerate(testNum, examNum, exam);
			List result = new ArrayList<Object>();

			for (int h = 0; h < exam.size(); h++) {
				// Object[] argment = ArrayUtils.toObject(exam[h].dataInt());
				List argment = new ArrayList<Object>();

				int snum = 0, inum = 0, dnum = 0, fnum = 0, cnum = 0;

				String ds[] = ((Ex) exam.get(h)).dataString();
				int di[] = ((Ex) exam.get(h)).dataInt();
				double dd[] = ((Ex) exam.get(h)).dataDou();
				float df[] = ((Ex) exam.get(h)).dataFlo();
				char dc[] = ((Ex) exam.get(h)).dataChar();

				for (Object parType : parTypes) {
					
					if (parType.toString().equals("String")) {
						argment.add(ds[snum++]);
						
					} else if (parType.toString().equals("int")) {
			
						argment.add(di[inum++]);
						
					} else if (parType.toString().equals("double")) {
						argment.add(dd[dnum++]);
						
					} else if (parType.toString().equals("float")) {
						argment.add(df[fnum++]);
						
					} else if(parType.toString().equals("char")){
						argment.add(dc[cnum++]);
					}

				}
				/*
				 * for (int num : ((Ex) exam.get(h)).dataInt()) {
				 * argment.add(num); } for (String s : ((Ex)
				 * exam.get(h)).dataString()) { argment.add(s); }
				 */

				Object ob[] = argment.toArray();

				List temp = new ArrayList<Object>();
				try {

					temp.add(ob);

					Object r = m[i].invoke(t, ob);
					if (r instanceof String) {
						String r2 = ((String) r).replace("\r", "\\n");
						String r3 = ((String) r2).replace("\n", "\\n");
						temp.add(r3);
					} else {
						temp.add(r);
					}
					//temp.add(r);
					result.add(temp);

				} catch (IllegalAccessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IllegalArgumentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (InvocationTargetException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

			A.put("className", clsName3);
			A.put("methodName", methodName);
			A.put("type", type);// type
			A.put("total", total);// total score
			A.put("score", score);// score
			A.put("weight", weight);// score weight

			A.put("parType", parTypes);
			A.put("paras", paras);
			A.put("TypeV", TypeV);
			A.put("parReturn", parReturn);
			A.put("numPara", numPara);
			A.put("testNum", testNum);

			A.put("result", result);

			methods.add(A);

		}

		// 設定Velocity engine各項參數
		VelocityEngine ve = new VelocityEngine();
		ve.setProperty(RuntimeConstants.RESOURCE_LOADER, "classpath");
		ve.setProperty("classpath.resource.loader.class",
				ClasspathResourceLoader.class.getName());

		ve.init();

		// 選擇template
		Template JavaTpt = ve.getTemplate("Javatemplate.vm");
		VelocityContext ctx = new VelocityContext();

		// 放入變數
		ctx.put("methods", methods);
		ctx.put("newline", "\n");

		// 設定產生的檔案位置
		String rootPath = TemplateGenerator.class.getClassLoader()
				.getResource("").getFile()
				+ "../../../../src/test";

		merge(JavaTpt, ctx, rootPath + "/groovy/JavaSpec.groovy");

		System.out.println("generation success...");

	}

	// 產生需要的case
	public static List<Ex> caseGenerate(int testNum, int examNum, List<Ex> t) {
		if (examNum == 0) {
			System.out.println("please enter at least one exam !");
		} else {
			Ex exam = (Ex) t.get(0);
			final int intNum = exam.dataInt().length; // 2
			final int stringNum = exam.dataString().length; // 1

			for (int i = examNum; i < testNum; i++) {
				Ex exTemp = new Ex() {

					public Class<? extends Annotation> annotationType() {
						// TODO Auto-generated method stub
						return null;
					}

					public String describe() {
						// TODO Auto-generated method stub
						return null;
					}

					public String[] dataString() {
						// TODO Auto-generated method stub
						List<String> slist = new ArrayList<String>();
						String[] s = { "apple", "banana", "orange", "grape" };
						for (int b = 0; b < stringNum; b++) {
							slist.add(s[b]);
						}

						return slist.toArray(new String[slist.size()]);
					}

					public int[] dataInt() {
						// TODO Auto-generated method stub
						List<Integer> nlist = new ArrayList<Integer>();
						for (int k = 0; k < intNum; k++) {
							nlist.add((int) (Math.random() * 50) + 1);
						}

						Integer[] integers = nlist.toArray(new Integer[nlist
								.size()]);
						int[] primitives = ArrayUtils.toPrimitive(integers);

						return primitives;
					}

					@Override
					public float[] dataFlo() {
						// TODO Auto-generated method stub
						return null;
					}

					@Override
					public double[] dataDou() {
						// TODO Auto-generated method stub
						return null;
					}

					@Override
					public char[] dataChar() {
						// TODO Auto-generated method stub
						return null;
					}
				};
				t.add(exTemp);
			}
		}
		return t;
	}

	// 檔案位置的merge
	private static void merge(Template template, VelocityContext ctx,
			String path) {
		PrintWriter writer = null;
		try {
			writer = new PrintWriter(path);
			template.merge(ctx, writer);
			writer.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			writer.close();
		}
	}
}