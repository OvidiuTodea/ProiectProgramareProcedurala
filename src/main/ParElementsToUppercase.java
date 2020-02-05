package main;

public class ParElementsToUppercase {

	public static void main(String[] args) {
		// transformati un sir de caractere astfel ca elementele de pe pozitiile pare sa fie uppercase
		
		String stringToTransform = "abcdefghijklmnopqrstuvw";
		String transformedString="";
		
		
		for(int i=0; i<stringToTransform.length(); i++) {
			if (i % 2 == 0) {
			transformedString +=  stringToTransform.toUpperCase().charAt(i);
			}
			else {
			transformedString += stringToTransform.charAt(i);
			}
		}
		
			System.out.println(stringToTransform);
			System.out.println(transformedString);
		
		
		
		

	}

}
