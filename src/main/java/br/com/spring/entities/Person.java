package br.com.spring.entities;

import java.io.Serializable;

import javax.persistence.Column;

import org.springframework.stereotype.Component;

@Component
public class Person implements Serializable{

	private static final long serialVersionUID = 6983061029534262321L;
	
	public Person(){
		
	}
	
	public Person(String name, Integer age){
		this.name = name;
		this.age = age;
	}
	
	@Column(name="name", length=50)
	private String name;
	
	@Column(name="age")
	private Integer age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	
	
}
