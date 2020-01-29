package main;

public class Calc1 {

	public static void main(String[] args) {
		double d = 2.95;
		int i=4;
		System.out.println(++d > i ? d : i);
		
		// daca (++d)=3.95 este mai mare decat i=4 atunci afisam d , altfel afisam i
		// compileaza si se va afisa 4 deoarece 3.95 < 4

	}

}
