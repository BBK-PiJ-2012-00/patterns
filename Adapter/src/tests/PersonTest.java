package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import example.AnotherPerson;
import example.Nosrep;
import example.PAP;
import example.Person;

public class PersonTest {

	@Test
	public void test() {
		String expectedAnswer = "A person";
		String actualAnswer;
		Person classUnderTest = new Person();
		actualAnswer = classUnderTest.whoAreYou();
		assertEquals("Wrong Answer!", expectedAnswer, actualAnswer);
	}
	
	
	@Test
	public void test2() {
		String expectedAnswer = "A person"; 
		String actualAnswer; 
		AnotherPerson classUnderTest = new Nosrep(); 
		
		actualAnswer = classUnderTest.youAreWho(); 
		assertEquals("Wrong Answer!", expectedAnswer, actualAnswer);
	}
	
	
	@Test
	public void test3() {
		String expectedAnswer = "A person";
		String actualAnswer;
		
		PAP classUnderTest = new PAP();
		actualAnswer = classUnderTest.youAreWho();
		assertEquals("Wrong Answer!", expectedAnswer, actualAnswer);
	}

}


