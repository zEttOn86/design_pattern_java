package ch12_decorator;

public class SideBorder extends Border {
	private char borderChar;

	public SideBorder(Display display,char ch) {
		super(display);
		this.borderChar = ch;
	}

	@Override
	public int getColums() {
		// TODO Auto-generated method stub
		return 1 + display.getColums() +1;
	}

	@Override
	public int getRows() {
		// TODO Auto-generated method stub
		return display.getRows();
	}

	@Override
	public String getRowText(int row) {
		// TODO Auto-generated method stub
		return borderChar+display.getRowText(row)+borderChar;
	}

}
