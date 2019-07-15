package edu.pk.mediatorHomeWork;

public abstract class Component {
protected Mediator dialogue;
public Component(Mediator m) {
	dialogue = m;
}
public void click(String message) {
	dialogue.notify(message,this);
}
public void keyPress(String message) {
	dialogue.notify(message, this);
}
}
