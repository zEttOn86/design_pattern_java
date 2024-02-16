package ch16_mediator;

import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFrame extends Frame implements ActionListener, Mediator {
	private ColleagueCheckbox checkGuest;
	private ColleagueCheckbox checkLogin;
	private CollegueTextField textUser;
	private CollegueTextField textPass;
	private ColleagueButton buttonOk;
	private ColleagueButton buttonCancel;

	public LoginFrame(String title) {
		super(title);
		
		setBackground(Color.lightGray);
		setLayout(new GridLayout(4,2));

		createColleagues();
		
		add(checkGuest);
		add(checkLogin);
		add(new Label("Username:"));
		add(textUser);
		add(new Label("Password:"));
		add(textPass);
		add(buttonOk);
		add(buttonCancel);
		
		colleagueChanged();
		
		pack();
		setVisible(true);
	}

	@Override
	public void createColleagues() {
		// TODO Auto-generated method stub
		CheckboxGroup g = new CheckboxGroup();
		checkGuest = new ColleagueCheckbox("Guest", g, true);
		checkLogin = new ColleagueCheckbox("Login", g, false);
		
		textUser = new CollegueTextField("", 10);
		textPass = new CollegueTextField("", 10);
		textPass.setEchoChar('*');
		
		buttonOk = new ColleagueButton("ok");
		buttonCancel = new ColleagueButton("cancel");
		
		checkGuest.setMediator(this);
		checkLogin.setMediator(this);
		textUser.setMediator(this);
		textPass.setMediator(this);
		buttonOk.setMediator(this);
		buttonCancel.setMediator(this);
		
		checkGuest.addItemListener(checkGuest);
		checkLogin.addItemListener(checkLogin);
		textUser.addTextListener(textUser);
		textPass.addTextListener(textPass);
		buttonOk.addActionListener(this);
		buttonCancel.addActionListener(this);

	}

	@Override
	public void colleagueChanged() {
		// TODO Auto-generated method stub
		if(checkGuest.getState()) {
			textUser.setColleagueEnabled(false);
			textPass.setColleagueEnabled(false);
			buttonOk.setColleagueEnabled(true);
		} else {
			textUser.setColleagueEnabled(true);
			userpassChanged();
		}

	}
	
	private void userpassChanged() {
		if(textUser.getText().length() > 0) {
			textPass.setColleagueEnabled(true);
			if(textPass.getText().length() > 0) {
				buttonOk.setColleagueEnabled(true);
			}else {
				buttonOk.setColleagueEnabled(false);
			}
		} else {
			textPass.setColleagueEnabled(false);
			buttonOk.setColleagueEnabled(false);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println(e.toString());
		System.exit(0);

	}

}
