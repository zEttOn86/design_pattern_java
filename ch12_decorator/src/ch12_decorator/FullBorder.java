package ch12_decorator;



public class FullBorder extends Border {
	public FullBorder(Display display) {
		super(display);
	}

	@Override
	public int getColums() {
		// TODO Auto-generated method stub
		return 1+display.getColums()+1;
	}

	@Override
	public int getRows() {
		// TODO Auto-generated method stub
		return 1+display.getRows()+1;
	}

	@Override
	public String getRowText(int row) {
		// TODO Auto-generated method stub
		if(row==0) {
			return "+" +makeLine('-',display.getColums()) + "+";
		}else if(row ==display.getRows()+1) {
			return "+" +makeLine('-',display.getColums()) + "+";
		}else {
			return "|" +display.getRowText(row-1) + "|";
		}
		
	}
	
	private String makeLine(char ch, int count) {
		StringBuilder line = new StringBuilder();
		for(int i=0; i<count;i++) {
			line.append(ch);
		}
		return line.toString();
	}

}
