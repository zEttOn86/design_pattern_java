package ch23_interpreter;

import java.nio.file.Files;
import java.nio.file.Path;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			for(String text: Files.readAllLines(Path.of("program.txt"))) {
				System.out.println("text = \"" + text + "\"");
				Node node = new ProgramNode();
				node.parse(new Context(text));
				System.out.println("node = " + node);
			}
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
