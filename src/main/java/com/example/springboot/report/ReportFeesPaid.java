package com.example.springboot.report;

public class ReportFeesPaid {

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getPaid() {
		return paid;
	}

	public void setPaid(int paid) {
		this.paid = paid;
	}

	private int month;
	private int paid;

	public ReportFeesPaid() {
		super();
	}
	
	public ReportFeesPaid(int id, int month, int paid) {
		super();
		this.month=month;
		this.paid=paid;
		return;

}
}
