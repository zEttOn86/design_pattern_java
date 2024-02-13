package ch12_decorator;

public class StringDisplay extends Display {
	private String string;
	public StringDisplay(String string) {
		this.string = string;
	}
	@Override
	public int getColums() {
		// TODO Auto-generated method stub
		return string.length();
	}

	@Override
	public int getRows() {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public String getRowText(int row) {
		// TODO Auto-generated method stub
		if(row !=0) {
			throw new IndexOutOfBoundsException();
		}
		return string;
	}

}
