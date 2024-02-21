package ch21_proxy;

public class PrinterProxy implements Printable {
	private String name;
	private Printer real;
	
	public PrinterProxy() {
		this.name = "no name";
		this.real = null;
	}
	
	public PrinterProxy(String name) {
		this.name = name;
		this.real = null;
	}

	@Override
	public synchronized void setPrinterName(String name) {
		// TODO Auto-generated method stub
		if(real != null) {
			real.setPrinterName(name);
		}
		this.name = name;
	}

	@Override
	public String getPrinterName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public void print(String string) {
		// TODO Auto-generated method stub
		realize();
		real.print(string);

	}
	
	private synchronized void realize() {
		if(real == null) {
			real = new Printer(name);
		}
	}

}
