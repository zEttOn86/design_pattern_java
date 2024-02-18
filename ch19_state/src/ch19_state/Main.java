package ch19_state;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SafeFrame frame = new SafeFrame("State sample");
		while(true) {
			for(int hour =0; hour<24; hour++) {
				frame.setClock(hour);
			}
			try {
				Thread.sleep(1000);
			}
			catch (InterruptedException e) {
				// TODO: handle exception
			}
		}
	}

}
