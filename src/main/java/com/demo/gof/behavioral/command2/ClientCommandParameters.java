package com.demo.gof.behavioral.command2;

public class ClientCommandParameters {

	private Object parameter;
	
	public ClientCommandParameters(Object parameter) {
		super();
		this.parameter = parameter;
	}
	
	public Object getParameter() {
		return parameter;
	}

}
