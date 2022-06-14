package com.niit.hemant;
interface Chai{
	void drink();
}
class Nomad implements Chai{
	public void drink() {
		System.out.println("Nomad loves chai");
	}
}
class Vikrant extends Nomad{
	public void drink() {
		System.out.println("Vikrant has taken away the chai  from Nomad");
	}
}
class Hashim implements Chai{

	@Override
	public void drink() {
		// TODO Auto-generated method stub
		System.out.println("Hashim drinks tea");
	}
	
}
public class Mango {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vikrant vikrant=new Vikrant();
		vikrant.drink();
		Hashim hashim=new Hashim();
		hashim.drink();

	}

}
