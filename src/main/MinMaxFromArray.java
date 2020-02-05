package main;

public class MinMaxFromArray {

	public static void main(String[] args) {
		// min si max dintr-un array de 10 elemente
		
		int[] givenArray = new int[] {4, 5, 7, 2, 8, 11, 57, 1, 9, 3};
		
		
		int min = givenArray[0];  //minimul ia valoarea primului element din array
		for (int i=0; i<givenArray.length; i++) {
			if (givenArray[i]<min)
				min=givenArray[i];
		}
		System.out.println("Min form array is : "+ min);
		
		int max = givenArray[0];  //maximul ia valoarea primului element din array
		for (int j=0; j<givenArray.length; j++) {
			if (givenArray[j]>max)
				max=givenArray[j];
		}
		System.out.println("Max from array is: "+ max);
		System.out.println();
		
		// mai jos varianta in care stim ca array-ul are 10 elemente (asta inseamna i de la 0 la 9)
		
		for (int i=0; i<9; i++) {
			if (givenArray[i]<min)
				min=givenArray[i];
		}
		System.out.println("Min' form array is : "+ min);
		
		
		for (int j=0; j<9; j++) {
			if (givenArray[j]>max)
				max=givenArray[j];
		}
		System.out.println("Max' from array is: "+ max);
		
		
	}

}
