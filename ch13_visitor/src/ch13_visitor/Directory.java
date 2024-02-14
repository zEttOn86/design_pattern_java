package ch13_visitor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Directory extends Entry implements Iterable<Entry> {
	private String name;
	private List<Entry> direcotry = new ArrayList<>();
	public Entry add(Entry entry) {
		direcotry.add(entry);
		return this;
	}

	public Directory(String name) {
		this.name = name;
	}

	@Override
	public void accept(Visitor v) {
		// TODO Auto-generated method stub
		v.visit(this);

	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		int size =0;
		for(Entry entry: direcotry) {
			size += entry.getSize();
		}
		return size;
	}
	
	public Iterator<Entry> iterator(){
		return direcotry.iterator();
	}

}
