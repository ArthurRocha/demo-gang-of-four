package com.demo.gof.behavioral.command2;

public class DoAnotherthingCommandHandler implements Command {

	private ReceiverService receiverService;
	private ClientCommandParameters argument;
	
	public DoAnotherthingCommandHandler(ReceiverService receiver, ClientCommandParameters argument) {
		this.receiverService = receiver;
		this.argument = argument;
	}
	public void execute() {
		receiverService.doAnotherThing(argument.getParameter());
	}

}
