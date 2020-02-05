package main;



public class PrintVectorElements {

	public static void main(String[] args) {
		//stocati intr-un vector 3 variabile de tip double si afisati-le parcurgand vectorul
		
		double[] vectorDouble = new double[3];
		
		vectorDouble[0]= 1.25;
		vectorDouble[1]= 2.55;
		vectorDouble[2]= 100.33;
		
		for(int i=0; i<vectorDouble.length; i++) {
			System.out.println("Element on index " + i + " is: " + vectorDouble[i]);
		}

	}

}
