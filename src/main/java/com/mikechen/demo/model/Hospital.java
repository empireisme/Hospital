package com.mikechen.demo.model;

import java.util.LinkedList;
import java.util.Queue;

public class Hospital {
	
	int skipNumber=3;
	int skipNumberNow=0;
	
	Queue<Patient> normalQueue= new LinkedList<>();
	Queue<Patient> skipQueue= new LinkedList<>();
	// 叫號
	public Patient callNumber() {
		
		if(skipNumberNow<skipNumber ) {
			
			skipNumberNow++;
			if( skipNumberNow==skipNumber  ) {
				skipNumberNow=0;
				Patient patient = skipQueue.poll();
				if(patient!=null) {
					patient.setHaveBeenSeenDoctor(true);
				}
			
				return patient;
			}
			
			Patient patient = normalQueue.poll();
			if(patient!=null) {
				patient.setHaveBeenSeenDoctor(true);
			}
			return patient;
			
		}
		return null;
		
	}
	// 跳號
	public Patient skipNumber() {
		Patient patient = normalQueue.poll();
		
		if(patient!=null) {
			patient.setHaveBeenSkipNumber(true);
			System.out.println(patient.getName()+" 沒來，所以跳號");
			return patient;
		}else {
			System.out.println("the normalQueue is empty");
			return null;
		}
	}

	public int getSkipNumber() {
		return skipNumber;
	}

	public void setSkipNumber(int skipNumber) {
		this.skipNumber = skipNumber;
	}

	public Queue<Patient> getNormalQueue() {
		return normalQueue;
	}

	public void setNormalQueue(Queue<Patient> normalQueue) {
		this.normalQueue = normalQueue;
	}

	public Queue<Patient> getSkipQueue() {
		return skipQueue;
	}

	public void setSkipQueue(Queue<Patient> skipQueue) {
		this.skipQueue = skipQueue;
	}

	public Hospital(int skipNumber) {
		this.skipNumber = skipNumber;
	}

	public int getSkipNumberNow() {
		return skipNumberNow;
	}

	public void setSkipNumberNow(int skipNumberNow) {
		this.skipNumberNow = skipNumberNow;
	}
	
}
