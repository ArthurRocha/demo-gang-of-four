package com.demo.gof.behavioral.command;

//Receiver class
public class CommandHandler2 implements Command<ClientCommandParameters, Integer> {
	
	public static final String OPERATION = "handler2";

	public Integer execute(ClientCommandParameters param) {
		System.out.println(CommandHandler2.class + " - " + param.getParameter());
		return 1;
	}

	public boolean isHandler(ClientCommandParameters param) {
		return OPERATION.equals(param.getOperationType());
	}

}
