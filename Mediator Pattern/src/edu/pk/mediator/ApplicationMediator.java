package edu.pk.mediator;

import java.util.*;

public class ApplicationMediator implements Mediator {
	private List<Colleague> colleagues = new ArrayList<Colleague>();
	@Override
	public void send(String message, Colleague orginator) {
		for(Colleague colleague:colleagues) {
			if(colleague!=orginator)
				colleague.receive(message);
		}
		
	}

	public void addColleague(Colleague colleague) {
		this.colleagues.add(colleague);
	}
}
