package ch16_mediator;

import java.awt.Button;

public class ColleagueButton extends Button implements Colleague {
	private Mediator mediator;
	
	public ColleagueButton(String caption) {
		super(caption);
	}

	@Override
	public void setMediator(Mediator mediator) {
		// TODO Auto-generated method stub
		this.mediator = mediator;
	}

	@Override
	public void setColleagueEnabled(boolean enabled) {
		// TODO Auto-generated method stub
		setEnabled(enabled);
	}

}
