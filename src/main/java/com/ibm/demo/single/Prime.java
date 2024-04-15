package com.ibm.demo.single;

public class Prime {

	// eager loading 
//	private static Prime prime = new Prime();
	// lazy loading 
	private static Prime prime;

	private Prime() {
		super();
	}

	public static Prime getInstance() {
		if (null == prime)
			prime = new Prime();
		return prime;
	}

	// other busoness methods

}
