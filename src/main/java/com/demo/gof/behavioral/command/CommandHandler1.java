package com.demo.gof.behavioral.command;

//Receiver class
public class CommandHandler1 implements Command<ClientCommandParameters, String> {

	public static final String OPERATION = "handler1";

	public String execute(ClientCommandParameters param) {
		System.out.println(CommandHandler1.class + " - " + param.getParameter());
		return "OK";
	}

	public boolean isHandler(ClientCommandParameters param) {
		return OPERATION.equals(param.getOperationType());
	}

}
