package project.euler.shaurya;
public class SumSquareDifference {
	public static void main(String[] args) {
		long n=100;
		long sumN2 = ((n)*(n+1)*(2*n+1))/6;
		long sumN = (n*(n+1))/2;
		sumN = sumN*sumN;
		System.out.println(sumN-sumN2);
	}
}
