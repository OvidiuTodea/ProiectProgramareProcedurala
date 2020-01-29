package main;

public class Calc2_1 {

		public static void main(String[] args) {
			int a=3;
			if(++a < 4)
				{if (a++ < 4)
					System.out.println(a);
				else
					System.out.println(a);}
			//else System.out.println("test");
			
			/* nu va afisa nimic pt ca nu va intra pe prima ramura if
			 deoarece conditia nu e adevarata si nu avem ramura else.
			 Daca am avea ar intra pe aceasta.	
			 
			*/
		}

	}
