package veer.com;

public class FactorialRerusion {
	
	public static int Factorila(int  n) {
		if(n==0) {
			return 1;
		}
		return  n* Factorila(n-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int n=5;
   System.out.println(Factorila(n));
   
   for(int i=0;i<=n;i++) {
	   System.out.println(Factorila(i));  // nth number of factriol number
   }
	}

}
