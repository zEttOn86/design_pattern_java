package ch23_interpreter;

//import java.text.ParseException;

public class ProgramNode extends Node {
	private Node commanListNode;
	
	public void parse(Context context) throws ParseException{
		context.skipToken("program");
		commanListNode = new CommandListNode();
		commanListNode.parse(context);
	}
	
	public String toString() {
		return "[program " + commanListNode + "]";
	}
}
