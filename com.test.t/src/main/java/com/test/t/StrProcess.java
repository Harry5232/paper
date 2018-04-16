package com.test.t;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class StrProcess {
	public static void main(String[] args) throws IOException {
		boolean flag = false;
		FileReader fr = new FileReader(
				"src\\main\\java\\com\\test\\t\\HW1Solution.java");
		BufferedReader br = new BufferedReader(fr);

		FileWriter fw = new FileWriter(
				"src\\main\\java\\com\\test\\t\\HW1Solution2.java");

		String line;

		while ((line = br.readLine()) != null) {
			String patternStart = "^.*//hwstart.*$";
			String patternEnd = "^.*//hwend.*$";
			System.out.println(line);

			if (line.matches(patternEnd)) {
				flag = false;

			} else if (line.matches(patternStart) || flag) {
				flag = true;
				
			} else {
				fw.write(line + "\n");

			}

		}

		fw.flush();
		fw.close();
		fr.close();
	}
}
