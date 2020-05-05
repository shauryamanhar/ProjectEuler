package project.euler.shaurya;

public class Lcm {
	public static void main(String[] args) {
		long ans=1;
		long s=System.currentTimeMillis();
		for(long i=2;i<=20;i++) {
			ans = (ans*i)/gcd(ans,i);
		}
		long e=System.currentTimeMillis();
		System.out.println(ans);
		System.out.println(e-s+"ms");// 0ms
	}
	static long gcd(long a,long b) {
		if(b==0) {
			return a;
		}else {
			return gcd(b,a%b);
		}
	}
}
