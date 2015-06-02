package com.demo.gof.behavioral.command;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings({ "unchecked", "rawtypes" })
public class SomeBusinessCommandInvoker {

	private List<Command<ClientCommandParameters, Object>> lsCommands = new ArrayList();

	public void addCommand(Command command) {
		lsCommands.add(command);
	}

	public Object runCommand(ClientCommandParameters param) {
		for (Command command : lsCommands) {
			if (command.isHandler(param)) {
				return command.execute(param);
			}
		}
		return null;
	}
}
