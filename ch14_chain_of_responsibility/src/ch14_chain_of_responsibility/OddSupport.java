package ch14_chain_of_responsibility;

public class OddSupport extends Support {
	public OddSupport(String string) {
		super(string);
	}

	@Override
	protected boolean resolve(Trouble trouble) {
		if(trouble.getNumber() % 2 == 1) {
			return true;
		}
		// TODO Auto-generated method stub
		return false;
	}

}
