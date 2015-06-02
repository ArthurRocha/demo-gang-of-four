package com.demo.gof.behavioral.command;

public class ClientCommandParameters {

	private String operationType;
	private Object parameter;
	
	public ClientCommandParameters(final String operationType, final Object parameter) {
		super();
		this.operationType = operationType;
		this.parameter = parameter;
	}
	
	public String getOperationType() {
		return operationType;
	}

	public Object getParameter() {
		return parameter;
	}

}
