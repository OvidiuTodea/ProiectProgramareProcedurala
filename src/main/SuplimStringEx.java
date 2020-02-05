package main;

public class SuplimStringEx {

	public static void main(String[] args) {
	
		String string = "Acesta e un exercitiu mai interesant";
		
		String[] splitString = string.trim().split("\\s");  // regex: \\s  inseamna un spatiu  \\s+ inseamna mai multe spatii 
		
		System.out.println(splitString[0]);
		System.out.println(splitString[1]);
		System.out.println(splitString[2]);
		System.out.println(splitString[3]);
		System.out.println(splitString[4]);
		System.out.println(splitString[5]);
		
		System.out.println();
		System.out.println("Lenght of splitString = " + splitString.length);
		System.out.println();
		
		// verificam daca toate elementele au aceeasi lungime
		
		String string1 = "Mara este bine";
		String[] splitString1 = string1.trim().split("\\s");
		
		boolean allSameLength = true;
		for(int i=0; i<splitString1.length;i++) {
			if (splitString1[i].length() != splitString1[0].length())
				allSameLength = false;
		}
		
		char [][] matrice = new char[10][10];
		
		// populam matricea cu valori
		
		if (allSameLength==true) {
			for (int i=0; i<splitString1.length; i++) {
				for (int j=0; j<splitString1[i].length(); j++) {
					matrice[i][j] = splitString1[i].charAt(j);
				}
			}
			
		} else {
			System.out.println("Elements are not equal !");
		}
		
		// parcurgem matricea pentru afisare
		
		for (int i=0; i<splitString1.length; i++) {
			for (int j=0; j<splitString1[i].length(); j++) {
				System.out.print(matrice[i][j] +" ");
			}
			System.out.println();
		}
		

	}

}
