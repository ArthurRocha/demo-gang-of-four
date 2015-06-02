package com.demo.gof.behavioral.command;

/**
 * Purpose
 * Encapsulates a request allowing it to be treated as an object.
 * This allows the request to be handled in traditionally object
 * based relationships such as queuing and callbacks.
 * Use When
 * You need callback functionality.
 * Requests need to be handled at variant times or in variant orders.
 * A history of requests is needed.
 * The invoker should be decoupled from the object handling the
 * invocation.
 * Example
 * Job queues are widely used to facilitate the asynchronous
 * processing of algorithms. By utilizing the command pattern the
 * functionality to be executed can be given to a job queue for
 * processing without any need for the queue to have knowledge
 * of the actual implementation it is invoking. The command object
 * that is enqueued implements its particular algorithm within the
 * confines of the interface the queue is expecting.
 * 
 * ---
 * 
 * Structure
 * The client that creates a command is not the same client that executes it. 
 * This separation provides flexibility in the timing and sequencing of commands.
 * Materializing commands as objects means they can be passed, staged, shared, 
 * loaded in a table, and otherwise instrumented or manipulated like any other object.
 * 
 * Check list
 * Define a Command interface with a method signature like execute().
 * Create one or more derived classes that encapsulate some subset of 
 * the following: a "receiver" object, the method to invoke, the arguments to pass.
 * Instantiate a Command object for each deferred execution request.
 * Pass the Command object from the creator (aka sender) to the invoker (aka receiver).
 * The invoker decides when to execute().
 * Rules of thumb
 * 
 * Chain of Responsibility, Command, Mediator, and Observer, address how you can
 * decouple senders and receivers, but with different trade-offs. Command normally 
 * specifies a sender-receiver connection with a subclass.
 * 
 * Chain of Responsibility can use Command to represent requests as objects.
 * 
 * Command and Memento act as magic tokens to be passed around and invoked 
 * at a later time. In Command, the token represents a request; in Memento, it 
 * represents the internal state of an object at a particular time. 
 * Polymorphism is important to Command, but not to Memento because its interface 
 * is so narrow that a memento can only be passed as a value.
 * 
 * Command can use Memento to maintain the state required for an undo operation.
 * 
 * MacroCommands can be implemented with Composite.
 * 
 * A Command that must be copied before being placed on a history list acts as a Prototype.
 * 
 * Two important aspects of the Command pattern: interface separation (the invoker is 
 * isolated from the receiver), time separation (stores a ready-to-go processing 
 * request that's to be stated later).
 */
public class Main {

	public static void main(String[] args) {
		SomeBusinessCommandInvoker invoker = getCommandInvoker();
		
		ClientCommandParameters clientCommandArgument = new ClientCommandParameters(CommandHandler1.OPERATION, "{name:'Person', age:25}");
		invoker.runCommand(clientCommandArgument);
		
		clientCommandArgument = new ClientCommandParameters(CommandHandler2.OPERATION, "{name:'Person', age:25}");
		invoker.runCommand(clientCommandArgument);
	}

	private static SomeBusinessCommandInvoker getCommandInvoker() {
		SomeBusinessCommandInvoker invoker = new SomeBusinessCommandInvoker();
		invoker.addCommand(new CommandHandler1());
		invoker.addCommand(new CommandHandler2());
		return invoker;
	}
}
