package com.rakesh.junitEx;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.rakesh.junitEx.App;

public class AppTest

{
	App app = new App();

	@Test
	public void testShowMessage() {
		String name = "Ram";
		String str = "Welcome " + name;
		assertEquals(str, app.message(name));
	}
	@Test
	public void testShowMessage1() {
		assertEquals("Welcome", app.message("ram"));
	}
}
