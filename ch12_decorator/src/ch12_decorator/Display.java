package ch12_decorator;

public abstract class Display {
	public abstract int getColums();
	public abstract int getRows();
	public abstract String getRowText(int row);
	
	public void show() {
		for(int i=0; i<getRows(); i++) {
			System.out.println(getRowText(i));
		}
	}
}
