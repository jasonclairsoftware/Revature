package dev.jason.testpackage;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hamcrest.core.IsCollectionContaining;
import org.junit.Assert;
import org.junit.Test;

import dev.jason.projectdefault.EvaluationService;
import dev.jason.projectdefault.EvaluationService.Triangle;

public class EvaluationTests {

	@Test
	public void reverseTest() {
		EvaluationService es = new EvaluationService();
		String result = "Jason";
		result = es.reverse(result);
		Assert.assertEquals("nosaJ", result);
	}

	@Test
	public void acronymTest() {
		EvaluationService es = new EvaluationService();
		String result = es.acronym("National Security Agency");
		Assert.assertEquals("NSA", result);
	}

	@Test
	public void scrabbleScoreTest() {
		EvaluationService es = new EvaluationService();
		int result = es.getScrabbleScore("cabbage");
		Assert.assertEquals(14, result);
	}

	@Test
	public void cleanPhoneNumbersTest() {
		EvaluationService es = new EvaluationService();
		String resultone = es.cleanPhoneNumber("+1 (613)-995-0253");
		String resulttwo = es.cleanPhoneNumber("613-995-0253");
		String resultthree = es.cleanPhoneNumber("1 613 995 0253");
		String resultfour = es.cleanPhoneNumber("613.995.0253");

		Assert.assertEquals("6139950253", resultone);
		Assert.assertEquals("6139950253", resulttwo);
		Assert.assertEquals("6139950253", resultthree);
		Assert.assertEquals("6139950253", resultfour);

	}

	@Test
	public void wordCountTest() {
		// "olly olly in come free"
		EvaluationService es = new EvaluationService();
		Map<String, Integer> testmap;// = new HashMap<String, Integer>();

		testmap = es.wordCount("olly olly in come free");
		int testint = testmap.get("olly");
		Assert.assertEquals(2, testint);

		testint = testmap.get("in");
		Assert.assertEquals(1, testint);

		testint = testmap.get("come");
		Assert.assertEquals(1, testint);

		testint = testmap.get("free");
		Assert.assertEquals(1, testint);
	}

	@Test
	public void isEquilateralTest() {
		EvaluationService.Triangle tri = new EvaluationService.Triangle(1.0, 1.0, 1.0);

		boolean result = tri.isEquilateral();
		Assert.assertEquals(true, result);

		tri.setSideOne(1.2);
		result = tri.isEquilateral();
		Assert.assertEquals(false, result);

		tri.setSideOne(1.0);
		tri.setSideTwo(1.2);
		result = tri.isEquilateral();
		Assert.assertEquals(false, result);

		tri.setSideTwo(1.0);
		tri.setSideThree(1.2);
		result = tri.isEquilateral();
		Assert.assertEquals(false, result);

	}

	@Test
	public void isIsoscelesTest() {

		EvaluationService.Triangle tri = new EvaluationService.Triangle(1.0, 1.0, 1.0);

		boolean result = tri.isIsosceles();
		Assert.assertEquals(true, result);

		tri.setSideOne(1.2);
		result = tri.isIsosceles();
		Assert.assertEquals(true, result);

		tri.setSideOne(1.0);
		tri.setSideTwo(1.2);
		result = tri.isIsosceles();
		Assert.assertEquals(true, result);

		tri.setSideTwo(1.0);
		tri.setSideThree(1.2);
		result = tri.isIsosceles();
		Assert.assertEquals(true, result);

		tri.setSideOne(1.0);
		tri.setSideTwo(1.2);
		tri.setSideThree(1.3);
		result = tri.isIsosceles();
		Assert.assertEquals(false, result);

	}

	@Test
	public void isScaleneTest() {

		EvaluationService.Triangle tri = new EvaluationService.Triangle(1.0, 1.0, 1.0);
		boolean result = tri.isScalene();
		Assert.assertEquals(false, result);

		tri.setSideTwo(1.2);
		result = tri.isScalene();
		Assert.assertEquals(false, result);

		tri.setSideOne(1.3);
		result = tri.isScalene();
		Assert.assertEquals(true, result);

	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
