package package1;

public class DuplicateFromIntArr {
public static void main(String[] args) {
	/*
	 * P5

print duplicates element from the array

int a[] = {1,2,2,6,5,6}
Output: 2,6
	 */
	
	
	int a[] = {1,2,2,6,5,6};
	for(int i=0;i<a.length;i++) {
		for(int j=i+1; j<a.length;j++) {
			if(a[i]==a[j]) {
				System.out.println(a[i] + " is duplicate");
			}
		}
	}
}
}
