package com.mikechen.demo.model;

import java.util.Queue;

public class Patient {
	
	
	private String name;
	private boolean firstCheckInOnline=true;        // 預設為true ，代表可以線上註冊
	private boolean haveBeenSkipNumber=false;       
	private boolean checkInAgain=false;
	private boolean haveBeenSeenDoctor=false;
	
	public Patient(String name) {
		super();
		this.name = name;
	}
	
	public void checkInOnline(Hospital hospital) {
		
		if( firstCheckInOnline ) {
			Queue normalQueue=hospital.getNormalQueue();
			normalQueue.add( this);
			this.setFirstCheckInOnline(false);
			System.out.println(" this is your first time to checkinonline");
		}else {
			System.out.println("you have already checked in online");
		}
	
	}
	
	public void checkInAgain(Hospital hospital) {
		if( haveBeenSkipNumber &&  checkInAgain ==false  ) {
			Queue skipQueue=hospital.getSkipQueue();
			skipQueue.add( this);
			System.out.println(this.name+ " 已經加到跳號列表中 ");
		}else {
			System.out.println(this.name + " 還沒有被跳號過 ");
		}
	
	
	}

	@Override
	public String toString() {
		return "Patient [name=" + name + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isFirstCheckInOnline() {
		return firstCheckInOnline;
	}

	public void setFirstCheckInOnline(boolean firstCheckInOnline) {
		this.firstCheckInOnline = firstCheckInOnline;
	}

	public boolean isHaveBeenSkipNumber() {
		return haveBeenSkipNumber;
	}

	public void setHaveBeenSkipNumber(boolean haveBeenSkipNumber) {
		this.haveBeenSkipNumber = haveBeenSkipNumber;
	}

	public boolean isCheckInAgain() {
		return checkInAgain;
	}

	public void setCheckInAgain(boolean checkInAgain) {
		this.checkInAgain = checkInAgain;
	}

	public boolean isHaveBeenSeenDoctor() {
		return haveBeenSeenDoctor;
	}

	public void setHaveBeenSeenDoctor(boolean haveBeenSeenDoctor) {
		this.haveBeenSeenDoctor = haveBeenSeenDoctor;
	}
	
	
	
}
