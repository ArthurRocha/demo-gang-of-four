package com.demo.gof.behavioral.chainofresponsibility;

import java.util.ArrayList;
import java.util.List;

public abstract class Handler {

	public abstract void handleRequest();
	
	public static Handler getInstance() {
		FooHandlerImpl handlerImpl = new FooHandlerImpl();
		handlerImpl.registerHandlers();
		return handlerImpl;
	}
	
	private static class FooHandlerImpl extends Handler {

		private List<Handler> lsHandlers;
		
		void registerHandlers() {
			lsHandlers = new ArrayList<Handler>();
			lsHandlers.add(new ConcreteHandler1());
			lsHandlers.add(new ConcreteHandler2());
		}
		
		@Override
		public void handleRequest() {
			if (lsHandlers == null || lsHandlers.size() == 0) {
				return ;
			}
			for (Handler handler : lsHandlers) {
				handler.handleRequest();
			}
		}
		
	}
}
