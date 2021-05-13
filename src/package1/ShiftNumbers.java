package package1;

import java.util.Arrays;

public class ShiftNumbers {
	
	public static void main(String[] args) {
		
		int a[] = {2,3,4,5,1};
		int b[] = new int[a.length];
		 
		for(int i=1; i<a.length ; i++) {
			int temp = a[0];
			if(i<5)
			b[i-1]= a[i];
			b[b.length-1]= temp;
		}
		System.out.println(Arrays.toString(b));
		
	}
}
