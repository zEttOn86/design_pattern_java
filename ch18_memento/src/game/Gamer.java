package game;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Gamer {
	private int money;
	private List<String> fruits = new ArrayList<>();
	private Random random = new Random();
	
	private static String[] fruitsName = {
			"Ringo", "Banana", "Mikan", "Budo"
	};
	
	public Gamer(int money) {
		this.money = money;
	}
	
	public int getMoney() {
		return money;
	}
	
	public void bet() {
		int dice = random.nextInt(6) + 1;
		if(dice == 1) {
			money += 100;
			System.out.println("Fueta");
		}else if(dice == 2) {
			money /= 2;
			System.out.println("1/2");
		}
		else if(dice == 6) {
			String f = getFruits();
			System.out.println(f + "wo get");
			fruits.add(f);
		}else {
			System.out.println("Do nothing");
		}
	}
	
	public Memento createMemento() {
		Memento m = new Memento(money);
		for(String f : fruits) {
			if(f.startsWith("good")) {
				m.addFruit(f);
			}
		}
		return m;
	}
	
	public void restoreMemnto(Memento memento) {
		this.money = memento.getMoney();
		this.fruits = memento.getFruits();
	}
	
	public String toString() {
		return "[money = " + money + ", [Fruits = " + fruits +"]";
	}
	
	private String getFruits() {
		String f = fruitsName[random.nextInt(fruitsName.length)];
		if(random.nextBoolean()) {
			return "good" + f;
		}else {
			return f;
		}
	}
}
