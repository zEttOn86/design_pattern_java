package ch17_observer;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumberGenerator generator = new RandomNumberGenerator();
		Observer observer1 = new DigitObserver();
		Observer observer2 = new GraphObserver();
		
		generator.addObserver(observer1);
		generator.addObserver(observer2);
		generator.execute();
		
	}

}
