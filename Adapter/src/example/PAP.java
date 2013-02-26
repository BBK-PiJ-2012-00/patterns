/**
 * 
 */
package example;

/**
 * @author ataylo20
 *
 */
public class PAP extends Person implements AnotherPerson {

	/* (non-Javadoc)
	 * @see example.AnotherPerson#youAreWho()
	 */
	@Override
	public String youAreWho() {
		return whoAreYou();
	}

}
