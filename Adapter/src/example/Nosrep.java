package example;

public class Nosrep implements AnotherPerson {
	private Person person;
	
	public Nosrep() {
		person = new Person();
	}
	
	public String youAreWho() {
		return person.whoAreYou();
	}

}
