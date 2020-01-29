package main;

public class Calc3{

	public static void main(String[] args) {
		int suma = 0;
		for (int i=1; i<10; i++) {
			suma += suma + i;
			//System.out.println("Suma: " + suma);
		}
		System.out.println("Suma  este : " + suma);

		// suma finala va fi 1013
		// practic la fiecare dintre cei 10 pasi ai for-ului
		// va aduna la suma de doua ori suma de pana atunci si pasul ( adica pe i) 
		//daca decomentam println- ul din for vedem evolutia sumei la fiecare pas
	}

}
