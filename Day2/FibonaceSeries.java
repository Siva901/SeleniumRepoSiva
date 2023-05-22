package week1.Day2;

public class FibonaceSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1=0;
		int n2=1;
		int sum=0;
		
		System.out.println(n1);
		System.out.println(n2);

		
		for (int i=1;i<=5;i++) {
			
			sum=n1+n2;
			n1=n2;
			n2=sum;
			System.out.println(sum);
			

		
		}
}

	}

