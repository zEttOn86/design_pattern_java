package ch23_interpreter;

//import java.text.ParseException;

public class PrimitiveCommandNode extends Node {
	private String name;

	@Override
	public void parse(Context context) throws ParseException {
		// TODO Auto-generated method stub
		name = context.currentToken();
		if(name == null) {
			throw new ParseException("Error Missing <primitive command>");
		} else if(!name.equals("go") && !name.equals("right") && !name.equals("left")) {
			throw new ParseException("Error: unknown <primitive command>");
		}
		context.skipToken(name);
	}
	
	public String toString() {
		return name;
	}

}
