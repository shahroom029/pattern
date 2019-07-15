package edu.pk.mediatorHomeWork;

public class ApplicationDiagloue implements Mediator{
	private String title;
	private boolean loginOrRegister;
	private Textbox loginUsername,loginPassword;
	private Button ok,cancel;
	private ChecKBox rememberme;
	
	
	@Override
	public void notify(String message, Component sender) {
		if (sender == rememberme && message=="check")
            if (loginOrRegisterChkBx.checked)
            	
		
	}

}
