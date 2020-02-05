package main;

public class ShowNegativeValueFromArray {

	public static void main(String[] args) {
		// declarati un array cu o singura valoare negativa si afisati pozitia acesteia
		
		int[] givenArray = new int[] {1, 1, 2, 4, -7, 5, 8};
		for (int i=0; i<givenArray.length; i++) {
			if (givenArray[i]<0)
				System.out.println("Position of negative element " + givenArray[i] + " is :" + i);  
		}

	}

}
