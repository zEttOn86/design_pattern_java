package game;

import java.util.ArrayList;
import java.util.List;

public class Memento {
	private int money;
	private List<String> fruits;
	
	public int getMoney() {
		return money;
	}
	
	public Memento(int money) {
		// TODO Auto-generated constructor stub
		this.money = money;
		this.fruits = new ArrayList<>();
	}
	
	void addFruit(String fruit) {
		fruits.add(fruit);
	}
	
	List<String> getFruits(){
		return new ArrayList<>(fruits);
	}
}
