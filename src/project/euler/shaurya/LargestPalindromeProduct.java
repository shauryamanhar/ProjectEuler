package project.euler.shaurya;


//A palindromic number reads the same both ways. 
//The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
//Find the largest palindrome made from the product of two 3-digit numbers.

public class LargestPalindromeProduct {

	public static void main(String[] args) {
		int l=999,r=999;
		int prod;
		int ans=-1;
		for(int i=l;i>50;i--) {
			for(int j=r;j>50;j--) {
				prod = i*j;
				if(isPalindrome(i*j+"")) {
					if(ans<prod) {
						ans=prod;
					}
					break;
				}
			}
		}
		System.out.println(ans);
		
	}
	
	static boolean isPalindrome(String s) {
		int l=0,r=s.length()-1;
		while(l<r) {
			if(s.charAt(l)!=s.charAt(r)) {
				return false;
			}
			l++;r--;
		}
		return true;
	}

}
