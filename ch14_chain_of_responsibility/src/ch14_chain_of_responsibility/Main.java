package ch14_chain_of_responsibility;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Support aliceSupport = new NoSupport("Alice");
		Support bob = new LimitSupport("Bob", 100);
		Support charlie = new SpecialSupport("Charlie", 429);
		Support diana = new LimitSupport("diana", 200);
		Support elmo = new OddSupport("elmo");
		Support fred = new LimitSupport("fred", 300);
		
		
		aliceSupport.setNext(bob).setNext(charlie).setNext(diana).setNext(elmo).setNext(fred);
		
		for(int i= 0; i<500; i+=33) {
			aliceSupport.support(new Trouble(i));
		}
	}

}
