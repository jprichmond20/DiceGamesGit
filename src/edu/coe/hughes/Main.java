package edu.coe.hughes;

public class Main {

    public static void main(String[] args) {
	Dice d1 = new Dice();
	try {

		Dice d2 = new Dice(7);

		System.out.println(d1.roll());
		System.out.println(d2.roll());

		System.out.println(d1.getFace());
		System.out.println(d2.getFace());
	}
	catch( IllegalArgumentException iae){
		System.out.println("Bad dice Type");
	}
    }
}
