package ch20_flyweight;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length == 0) {
			System.exit(0);
		}
		
		BigString bs = new BigString(args[0]);
		bs.print();
	}

}
