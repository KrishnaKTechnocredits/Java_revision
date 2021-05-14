/*
 Program 1 :
A) Find maximum/Minimun number from
int[] a = {36,43,67,12,77}
 */


package package1;

public class FindMaxMinArray {
	
	
	static void findSecondMin(int[] a) {
		int min = a[0];
		int secondMin = a[1];
		int temp=0;
		for(int i=0; i<a.length; i++) {        //{36,7,43,67,12,77};
			for(int j = 1; j<a.length;j++) {	//  0  1  2  3  4  5
				if(a[i]<a[j])
					
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}			
		}
		System.out.println(min);
		System.out.println(secondMin);
	}
	
	
	public static void main(String[] args) {
		int[] a = {36,7,43,67,12,77};
		findSecondMin(a);
		
		}
		
}