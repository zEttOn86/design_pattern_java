package ch23_interpreter;

//import java.text.ParseException;

public class RepeatCommandNode extends Node {
	private int number;
	private Node commandListNode;
	
	@Override
	public void parse(Context context) throws ParseException {
		// TODO Auto-generated method stub
		context.skipToken("repeat");
		number = context.currentNumber();
		context.nextToken();
		commandListNode = new CommandListNode();
		commandListNode.parse(context);
	}
	
	public String toString() {
		return "[repeat " + number + " " + commandListNode + "]";
	}
	
}
