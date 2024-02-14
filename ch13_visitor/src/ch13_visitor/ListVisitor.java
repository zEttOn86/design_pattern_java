package ch13_visitor;

public class ListVisitor extends Visitor {
	private String currentdir ="";

	@Override
	public void visit(File file) {
		// TODO Auto-generated method stub
		System.out.println(currentdir + "/" + file);
	}

	@Override
	public void visit(Directory directory) {
		// TODO Auto-generated method stub
		System.out.println(currentdir + "/" + directory);
		String savedir = currentdir;
		currentdir = currentdir + "/" + directory.getName();
		for(Entry entry: directory) {
			entry.accept(this);
		}
		currentdir = savedir;
	}

}
