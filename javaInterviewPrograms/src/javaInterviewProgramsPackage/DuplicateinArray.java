package javaInterviewProgramsPackage;

import java.util.HashSet;

public class DuplicateinArray {

	public static void main(String[] args) {

		String names[] = { "java", "python", "java", "ruby", "python" };
		for (int i = 0; i < names.length; i++) {
			for (int j = i + 1; j < names.length; j++) {
				if (names[i] == names[j])
					System.out.println("duplicate found" + names[i]);
			}

		}

	}

	// using hashset
	Set <String> hashset= new HashSet<String>();
	for(String name:names)
	{
		if (hashset.add(name) == false) 
			System.out.println(name);

		

	}
}}
