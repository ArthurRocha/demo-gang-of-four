package com.demo.gof.behavioral.command;

public interface Command<ParamType extends ClientCommandParameters, ReturnType> {

	ReturnType execute(final ParamType param);
	
	boolean isHandler(final ParamType param);
}
