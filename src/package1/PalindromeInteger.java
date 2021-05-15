package package1;

public class PalindromeInteger {

	public static void findPalindrome(int num) {

		int temp = num;
		int rev = 0;
		int rem = 0;

		while (temp > 0) {
			rem = temp % 10; // 1 //2
			rev = rev * 10 + rem; // 1 //2
			temp = temp / 10; // 12 //1
		}

		if (num == rev)
			System.out.println(num+" = Number is palindrome");
		else
			System.out.println(num+" = Number is not palindrome");

	}

	public static void main(String[] args) {
		int a = 12345;
		int b = 12321;
		int c = 1221;
		findPalindrome(c);
		findPalindrome(a);
		findPalindrome(b);

	}

}
