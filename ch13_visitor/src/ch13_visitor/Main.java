package ch13_visitor;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Directory rootdir = new Directory("root");
		Directory bindir = new Directory("bin");
		Directory tmpdir = new Directory("tmp");
		Directory usrdir = new Directory("usr");
		
		rootdir.add(bindir);
		rootdir.add(tmpdir);
		rootdir.add(usrdir);
		
		bindir.add(new File("vi", 1000));
		bindir.add(new File("latex", 12000));
		rootdir.accept(new ListVisitor());
		
		System.out.println();
		
		Directory yuki = new Directory("yuki");
		Directory hanako = new Directory("hanako");
		Directory tomura = new Directory("tomura");
		usrdir.add(yuki);
		usrdir.add(hanako);
		usrdir.add(tomura);
		yuki.add(new File("diary.html", 100));
		hanako.add(new File("diary.html", 100));
		tomura.add(new File("diary.html", 100));
		rootdir.accept(new ListVisitor());
	}

}
