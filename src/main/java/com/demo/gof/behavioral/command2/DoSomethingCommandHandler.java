package com.demo.gof.behavioral.command2;

public class DoSomethingCommandHandler implements Command {

	private ReceiverService receiverService;
	private ClientCommandParameters argument;
	
	public DoSomethingCommandHandler(ReceiverService receiver, ClientCommandParameters argument) {
		this.receiverService = receiver;
		this.argument = argument;
	}
	public void execute() {
		receiverService.doSomething(argument.getParameter());
	}

}
