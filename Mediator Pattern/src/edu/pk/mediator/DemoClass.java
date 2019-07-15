package edu.pk.mediator;

public class DemoClass {

	public static void main(String[] args) {
		ApplicationMediator   app = new ApplicationMediator();
		DesktopCollegaue desk = new DesktopCollegaue(app);
		MobileColleague mob = new MobileColleague(app);
		app.addColleague(desk);
		app.addColleague(mob);
		desk.send(" hello world");
		desk.send(" hello");

	}

}
