package com.example.springboot.report;

public class ReportPayExpected {

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getPayExpected() {
		return payExpected;
	}

	public void setPayExpected(int payExpected) {
		this.payExpected = payExpected;
	}

	private int month;
	private int payExpected;

	public ReportPayExpected() {
		super();
	}
	
	public ReportPayExpected(int id, int month, int funds) {
		super();
		this.id=id;
		this.month=month;
		this.funds=funds;
		return;

}
}
