package com.example.demo;

import java.io.Serializable;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

public class EchoForm implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@NotEmpty
	@Size(min = 4, max = 10)
	private String id;
	@NotEmpty
	@Size(min = 8, max = 30)
	private String password;
	
	
	//setter,getterがないと「Does the return type of the getter match the parameter type of the setter?」って怒られる
	//その時は名前に注意　
	// th:field = *{id}なのにgetText()/setText()だと名前があっていなくて実行時に怒られる
	public String getId(){
		return id;
	}
	
	public void setId(String id){
		this.id = id;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
}