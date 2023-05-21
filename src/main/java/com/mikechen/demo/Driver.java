package com.mikechen.demo;

import com.mikechen.demo.model.Hospital;
import com.mikechen.demo.model.Patient;

public class Driver {
	
	public static void main(String[] args) {
		// initialize patinet
		Patient mike=new Patient("Mike");
		Patient sandy=new Patient("sandy");
		Patient sandy2=new Patient("sandy2");
		Patient sandy3=new Patient("sandy3");
		Patient sandy4=new Patient("sandy4");
		
		// initialize hospital 
		Hospital hospital = new Hospital(3);
		
		mike.checkInOnline(hospital);
		sandy.checkInOnline(hospital);
		sandy2.checkInOnline(hospital);
		sandy3.checkInOnline(hospital);
		sandy4.checkInOnline(hospital);
		System.out.println(hospital.callNumber());
		System.out.println(hospital.skipNumber());
		sandy.checkInAgain(hospital);
		System.out.println(hospital.callNumber());
		System.out.println(hospital.callNumber());
		System.out.println(hospital.callNumber());
		System.out.println(hospital.callNumber());
		System.out.println(hospital.callNumber());
		System.out.println(hospital.callNumber());
	}
}
