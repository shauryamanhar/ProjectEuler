package project.euler.shaurya;

public class LargestPrimeFactor {

	public static void main(String[] args) {
		long n = 600851475143L;
//		long n = 13195 ;
		long start = System.currentTimeMillis();
		System.out.println(largestPrimeFactor(n));
		System.out.println(largestPrimeFactorUsing2Step(n));
		System.out.println(largestPrimeFactorUsingRoot(n));
		long end = System.currentTimeMillis();
		System.out.println("time: "+(end-start)+"ms");
	}
	
	static long largestPrimeFactorUsingRoot(long n) {
		int factor=2;
		int lastfactor=0;
		if(n%2==0) {
			while(n>1 && n%2==0) {
				n=n/2;
			}
			lastfactor=2;
		}
		factor=3;
		
		int maxFactor = (int)Math.sqrt(n);
		while(n>1 && factor<=maxFactor) {
			if(n%factor==0) {
				n=n/factor;
				lastfactor=factor;
				while(n%factor==0) {
					n=n/factor;
				}
				maxFactor = (int)Math.sqrt(n);
			}
			factor=factor+2;
		}
		return n==1?lastfactor:n;
	}
	static long largestPrimeFactorUsing2Step(long n) {
		int factor=2;
		int lastfactor=0;
		if(n%2==0) {
			while(n>1 && n%2==0) {
				n=n/2;
			}
			lastfactor=2;
		}
		factor=3;
		while(n>1 ) {
			lastfactor=factor;
			while(n%factor==0) {
				n=n/factor;
			}
			factor=factor+2;
		}
		return lastfactor;
	}
	static long largestPrimeFactor(long n) {
		int factor=2;
		int lastfactor=0;
		while(n>1 ) {
			lastfactor=factor;
			while(n%factor==0) {
				n=n/factor;
			}
			factor++;
		}
		return lastfactor;
	}

}
