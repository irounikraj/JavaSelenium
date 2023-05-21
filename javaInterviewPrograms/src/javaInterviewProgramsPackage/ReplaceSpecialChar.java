package javaInterviewProgramsPackage;

public class ReplaceSpecialChar {

	public static void main(String[] args) {
		String s="1r3`86318jkhadiysgbjoi792738r9";
		String  afterreplacement = s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(afterreplacement);

	}

}
