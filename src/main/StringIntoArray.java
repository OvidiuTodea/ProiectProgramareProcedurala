package main;

public class StringIntoArray {

	public static void main(String[] args) {
		// transformati un String intr-un array de caractere
		
		String string = "Vom transforma acest string intr-un array de caractere";
		char[] arrayFromString = new char[string.length()];
		
		for(int i=0; i<string.length();i++) {
			arrayFromString[i]=string.charAt(i);
		}
		
		// verificam prin parcurgerea noului array
		for (int i=0; i<arrayFromString.length; i++) {   
			System.out.print(arrayFromString[i]);
		}
		

	}

}
