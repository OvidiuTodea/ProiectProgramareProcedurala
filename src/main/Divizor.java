package main;

public class Divizor {

	public static void main(String[] args) {

 //VARIANTA 1:
//		int count=0;
//		
//			for (long i=1; i<10000;i++) {
//				long sum = 0;
//				for (long j=1; j<i;j++) {
//					if (i % j == 0) {
//						sum = sum +j;
//					}
//				}
//				if ((i==sum) && (count<=5)){
//					System.out.println(i);
//					count++;
//				}
//			}
//		
	
	// VARIANTA 2	
		int count=0;
			for (int i=2; i<10000; i++) {
				if (isNumPerfect(i)){
						System.out.println(i);
						count++;
				}
			}
		
	}
	
	public static boolean isNumPerfect(int n) {
        int sum = 1;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum == n;
    }

}
