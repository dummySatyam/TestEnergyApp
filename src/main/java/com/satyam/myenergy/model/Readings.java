package com.satyam.myenergy.model;

public class Readings {
	
	
	private String smartMeterId;
	
	private ElectricityReadings electricityReadings;
	
	public Readings()
	{
		System.out.println(" Hello reading bro");
	}

	public String getSmartMeterId() {
		return smartMeterId;
	}

	public void setSmartMeterId(String smartMeterId) {
		this.smartMeterId = smartMeterId;
	}

	public ElectricityReadings getElectricityReadings() {
		return electricityReadings;
	}

	public void setElectricityReadings(ElectricityReadings electricityReadings) {
		this.electricityReadings = electricityReadings;
	}
	
	

}
