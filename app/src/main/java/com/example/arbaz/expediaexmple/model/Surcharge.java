package com.example.arbaz.expediaexmple.model;

import java.io.Serializable;

public class Surcharge implements Serializable{
	public String amount;
	public String type;

	public void setAmount(String amount){
		this.amount = amount;
	}

	public String getAmount(){
		return amount;
	}

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return type;
	}
}
