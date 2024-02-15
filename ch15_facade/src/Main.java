import java.io.File;

import pagemaker.PageMaker;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		File file = new File(".");
//      for (String fileNames : file.list()) System.out.println(fileNames);
		PageMaker.makeWelcomePage("hyuki@example.com", "welcome.html");
	}

}
