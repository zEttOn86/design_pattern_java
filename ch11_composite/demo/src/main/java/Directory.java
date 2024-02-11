import java.util.ArrayList;
import java.util.List;

import javax.swing.text.html.parser.Entity;

public class Directory extends Entry{
    private String name;
    private List<Entry> directory = new ArrayList<>();

    public Directory(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public int getSize(){
        int size = 0;
        for(Entry entry: directory){
            size += entry.getSize();
        }
        return size;
    }

    protected void printList(String prefix){
        System.out.println(prefix + "/" + this);
        for(Entry entry: directory){
            entry.printList(prefix + "/"+name);
        }
    }

    public Entry add(Entry entry){
        directory.add(entry);
        return this;
    }
}
