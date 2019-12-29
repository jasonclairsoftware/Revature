package dev.jason.test;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import dev.jason.app.Dummy;

public class myTestCase {

	@Test
	public void isGoodiesTest() {
		Dummy d = new Dummy();
		
		boolean result = d.isGoodies();
		Assert.assertEquals(true, result);
		
		
	}

}
