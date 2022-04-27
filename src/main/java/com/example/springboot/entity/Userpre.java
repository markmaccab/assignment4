/*
 * package com.example.springboot.model;
 

public class Userpre {

}
*/
package com.example.springboot.entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//DB record. Class Userpre.
@Entity
public class Userpre {
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public int getStuNo() {
		return stuNo;
	}
	public void setStuNo(int stuNo) {
		this.stuNo = stuNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getDue() {
		return due;
	}
	public void setDue(int due) {
		this.due = due;
	}
	public int getPaid() {
		return paid;
	}
	public void setPaid(int paid) {
		this.paid = paid;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Integer id;
//stuNo name month due paid
	int stuNo;
	String name;
	int month; 
	int due; 
	int paid;
}
