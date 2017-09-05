package com.demo.spring;

import java.util.List;

public class Mail {
	//private String[] toAddress;
	private List<String> toAddress;
	private String fromAddress;
	private Message message;
	
	public Mail() {
		// TODO Auto-generated constructor stub
	}

	public List<String> getToAddress() {
		return toAddress;
	}

	public void setToAddress(List<String> toAddress) {
		this.toAddress = toAddress;
	}

	public String getFromAddress() {
		return fromAddress;
	}

	public void setFromAddress(String fromAddress) {
		this.fromAddress = fromAddress;
	}

	public Message getMessage() {
		return message;
	}

	public void setMessage(Message message) {
		this.message = message;
	}
	
	
	public void init(){
		System.out.println("Init method called..");
	}
	
	public void cleanup(){
		System.out.println("Cleanup method called..");
	}
	
}
