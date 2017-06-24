package com.example.demo;

import java.io.Serializable;

public class EchoForm implements Serializable{
	
	private String id;
	
	//setter,getterがないと「Does the return type of the getter match the parameter type of the setter?」って怒られる
	//その時は名前に注意　
	// th:field = *{id}なのにgetText()/setText()だと名前があっていなくて実行時に怒られる
	public String getId(){
		return id;
	}
	
	public void setId(String id){
		this.id = id;
	}
}