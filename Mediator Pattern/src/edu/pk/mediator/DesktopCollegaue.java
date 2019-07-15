package edu.pk.mediator;

public class DesktopCollegaue extends Colleague {
	
	public DesktopCollegaue(Mediator m) {
		super(m);
	}
	@Override
	public void receive(String message) {
		
		System.out.println("desktop Colleague receieve the message"+message);
	}

}
