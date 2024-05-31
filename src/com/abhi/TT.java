package com.abhi;

public class TT {
	void mi() {

		System.out.println("hii");

	}

}

     class MM extends TT {

	void mi() {
		System.out.println("mm");
		TT m = new MM();
		m.mi();

	}

	public static void main(String[] args) {
		MM m = new MM();
		m.mi();
	}
}
