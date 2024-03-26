package veer.com;

public class Fibonseresies {
	
	public static int  Fibonacaseries(int n) {
		if (n==0 || n==1) {
			return n;
		}
		
		return Fibonacaseries(n-1)+Fibonacaseries(n-2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		
		for (int i = 0; i <=n; i++) {
			System.out.println(Fibonacaseries(i));
		}
		System.out.print(Fibonacaseries(n));

	}

}
