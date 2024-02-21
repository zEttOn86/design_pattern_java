package ch21_proxy;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printable p = new PrinterProxy("Alice");
		System.out.println(p.getPrinterName());
		p.setPrinterName("Bob");
		System.out.println(p.getPrinterName());
		p.print("hello worls");
	}

}
