package package1;

import java.util.Arrays;

public class ArrayOps1 {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5 };

		int[] b = new int[a.length];
		//System.out.println(Arrays.toString(a));
		int sum = 0;
		// b[0] = 0;
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
			b[i] = sum;
			System.out.println(b[i]);
		}
		System.out.println(Arrays.toString(b));
	}

}
/*
 * output: int[] a = {1,2,3,4,5};
 * 
 * int b[] = {1,3,6,10,15}
 * 
 * 
 * // 0 +a[0] = 1b[0] 1b[0]+2a[1] = 3b[1] 3b[1]+3a[2] = 6b[2] 6b[2]+4a[3] =
 * 10b[3] 10b[3]+5a[4] = 15b[4]
 */