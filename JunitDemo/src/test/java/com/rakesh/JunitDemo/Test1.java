package com.rakesh.JunitDemo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.rakesh.JunitDemo.App;

public class Test1 {

	private App app=new App();
	@Test
	public void testMessage() {
		
		assertEquals("Hai", app.message("Hai"));
	}
	@Test
	public void testAdd() {
		assertEquals(0, app.add(2, 8));
	}
}
