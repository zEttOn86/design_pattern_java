package ch21_proxy;

public class Printer implements Printable{
	private String name;
	
	public Printer() {
		heavyJob("create instance");
	}
	
	public Printer(String name) {
		this.name = name;
		heavyJob("create instance");		
	}
	
	public void setPrinterName(String name) {
		this.name = name;
	}
	
	public String getPrinterName() {
		return name;
	}
	
	public void print(String string) {
		System.out.println("=== " + name + " ===");
		System.out.println(string);
	}
	
	private void heavyJob(String msg) {
		System.out.println(msg);
		for(int i=0; i<5; i++) {
			try {
				Thread.sleep(1000);
			}catch (InterruptedException e) {
				// TODO: handle exception
			}
			System.out.print(".");
		}
		System.out.println("Completed");
	}

}
