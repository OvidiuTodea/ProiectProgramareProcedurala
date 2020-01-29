package main;

public class Asignare {

	public static void main(String[] args) {
		int a = 3;            	//linia 1
		int b = (a=2)*a;		//linia 2
		int c = b * (b=5);		//linia 3
		System.out.println("a="+ a + ", b=" + b + ", c=" + c);
		
		// a=2 deoarece ultima atribuire pt a se face pe linia 2 ->(a=2)
		// b=5 deoarece valoarea lui b se stabileste pe linia 3 ->(b=5)
		// c=20 foloseste (b=4 de pe linia 2) * (b=5) => 4*5=20
	}

}
