package com.demo.gof.behavioral.chainofresponsibility;



/**
 *  CHAIN OF RESPONSIBILITY Object Behavioral
 *  Purpose
 *  Gives more than one object an opportunity to handle a request
 *  by linking receiving objects together.
 *
 *  Use When
 *  Multiple objects may handle a request and the handler
 *  doesn’t have to be a specific object.
 *  A set of objects should be able to handle a request with the
 *  handler determined at runtime.
 *  A request not being handled is an acceptable potential
 *  outcome.
 *
 *  Example
 *  Exception handling in some languages implements this pattern.
 *  When an exception is thrown in a method the runtime checks to
 *  see if the method has a mechanism to handle the exception or
 *  if it should be passed up the call stack. When passed up the call
 *  stack the process repeats until code to handle the exception is
 *  encountered or until there are no more parent objects to hand
 *  the request to.
 */
public class Main {

	public static void main(String[] args) {
		Handler handler = Handler.getInstance();
		handler.handleRequest();
	}
	
}
