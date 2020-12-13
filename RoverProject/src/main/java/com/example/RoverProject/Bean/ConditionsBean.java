package com.example.RoverProject.Bean;

public class ConditionsBean {
	
	enum value{water,TRUE,Integer;}
	enum operator{eq, ne,lte,gte,lt,gt;}
	
	private String type;
	private String property;
	private operator operator;
	private value value;
	public value getValue() {
		return value;
	}
	public void setValue(value value) {
		this.value = value;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getProperty() {
		return property;
	}
	public void setProperty(String property) {
		this.property = property;
	}
	public operator getOperator() {
		return operator;
	}
	public void setOperator(operator operator) {
		this.operator = operator;
	}
	
	
	
}
