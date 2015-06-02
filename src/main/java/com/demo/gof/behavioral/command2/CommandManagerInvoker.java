package com.demo.gof.behavioral.command2;

import java.util.ArrayList;
import java.util.List;

// FooManager FooInvoker
public class CommandManagerInvoker {

	private List<Command> lsCommands = new ArrayList<Command>();
	
	public void addCommand(Command command) {
		lsCommands.add(command);
	}
	
	public void runCommands() {
		for (Command command : lsCommands) {
			command.execute();
		}
	}
	
}
