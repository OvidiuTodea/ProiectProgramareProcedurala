package main;

public class AddingDoubleNrToIntArrValues {

	public static void main(String[] args) {
		// se da un vector de numere intregi; adunati un nr double la valorile stocate si pastrati rezultatul in alt vector
		
		int[] intArray = new int[] {1, 2, 3, 4, 5};
		double[] doubleArray = new double[intArray.length];
		int[] intArray2 = new int[intArray.length];
		
		double nr = 2.5;
		
		for(int i=0; i<intArray.length; i++) {
			doubleArray[i] = intArray[i] + nr;
		}
		
		for(int i=0; i<intArray.length; i++) {  // afisam primul array
			System.out.println(intArray[i]);
		}
		
		System.out.println();
		for(int i=0; i<doubleArray.length; i++) { // afisam array-ul double la care am adunat 2.5 elementelor
			System.out.println(doubleArray[i]);
		}
		
		for(int i=0; i<intArray.length; i++) {
			intArray2[i] = intArray[i] + (int)nr;
		}
		
		System.out.println();
		for(int i=0; i<intArray2.length; i++) { // afisam array-ul int la care am adunat 2.5 elementelor
			System.out.println(intArray2[i]);
		}

	}

}
