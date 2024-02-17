import game.Gamer;
import game.Memento;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gamer gamer = new Gamer(100);
		Memento memento= gamer.createMemento();
		
		for(int i=0; i<100; i++) {
			System.out.println("=== "+i);
			System.out.println("Now "+ gamer);
			
			gamer.bet();
			
			System.out.println(gamer.getMoney());
			
			if(gamer.getMoney() > memento.getMoney()) {
				System.out.println("saved");
				memento= gamer.createMemento();
			}else if(gamer.getMoney() < memento.getMoney() /2) {
				System.out.println("restored");
				gamer.restoreMemnto(memento);
			}
		}
		try {
			Thread.sleep(1000);
		}catch (InterruptedException e) {
			// TODO: handle exception
		}
		System.out.println();
	}

}
