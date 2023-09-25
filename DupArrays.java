package week3.day1;

public class DupArrays {

	public static void main(String[] args) {

		int[] num= {2,4,7,2,4,3,7,9,89,98,89,3};
		//dup value:2,4,7,3,89
		
		
		//num[0]=2 num[1]=4
		for (int i = 0; i < num.length; i++) {
			//num[0+2] num[1]=4 num[2]=7
			for (int j = i+1; j < num.length; j++) {
				
				if(num[i]==num[j]) {
					System.out.println(num[i]);
				}
				
			}
		}

	}

}
