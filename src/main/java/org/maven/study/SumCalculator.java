package org.maven.study;

public class SumCalculator {

	public int sum(int n){
		if (n==0) {
			 throw  new IllegalArgumentException("Arguments can't equals 0");
		}
		int sum = 0;
		for (int i = 0; i <= n; i++) {
			sum+=i;
		}
		return sum;
	}
}
