package ch23_interpreter;

public class Context {
	private String[] tokens;
	private String lastToken;
	private int index;
	
	public Context(String text) {
		this.tokens = text.split("\\s+");
		this.index = 0;
		nextToken();
	}
	
	public String nextToken() {
		if(index < tokens.length) {
			lastToken = tokens[index++];
		}else {
			lastToken = null;
		}
		return lastToken;
	}
	
	public String currentToken() {
		return lastToken;
	}
	
	public void skipToken(String token) throws ParseException {
		if(currentToken() == null) {
			throw new ParseException("Error " + token + "is expected bu no more token is found");
		}else if(!token.equals(currentToken())) {
			throw new ParseException("ddd");
		}
		nextToken();
	}
	
	public int currentNumber() throws ParseException {
		if(currentToken() == null) {
			throw new ParseException("dddd");
		}
		int number = 0;
		try {
			number = Integer.parseInt(currentToken());
		}catch (NumberFormatException e) {
			throw new ParseException("Error" + e);
		}
		return number;
	}
}
