package javaInterviewProgramsPackage;

public class StringManupalation {

	public static void main(String[] args) {
		String str1 = "The game is on       ";
		String str2 = "the game is on ";
		System.out.println(str1 + str2);

		System.out.println(str1.length());
		System.out.println(str2.length());
		System.out.println(str1.equals(str2));
		System.out.println(str1.charAt(6));
		System.out.println(str2.contains("game"));
		System.out.println(str1.indexOf("game"));
		System.out.println(str1.concat(str2));
		System.out.println(str1.isEmpty());
		System.out.println(str1.replaceAll(" ", "*"));
		System.out.println(str1.replaceAll(" ", ""));

		System.out.println(str1.trim());
		// String Str3 []= {"the room is locked"};
		// System.out.println(str3.split(" ", "%"));
		StringBuffer Sbf = new StringBuffer(str2);
		System.out.println(Sbf.reverse());

		int Len = str1.length();
		String rev = "";

		for (int i = Len - 1; i >= 0; i--) {
			rev = rev + str1.charAt(i);

		}
		System.out.println("the reveresed string is:" + rev);

	}

}
