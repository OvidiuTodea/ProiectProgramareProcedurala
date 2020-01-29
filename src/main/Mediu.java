package main;

public class Mediu {
	
	int x=0; // var globala
	
	void method1() {
		int x=1, y; //var locale pt method1
		y=x; //y=1
	}
	
	void method2() {
		int z=1;  // var locala method2
		System.out.println(x);
		x = 9 + z; 
		System.out.println(x);
		
	}

}
