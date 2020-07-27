package com.inheritance;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EstherTest {
	Tochuckwu esther;

	@BeforeEach
	void setUp() throws Exception {
		esther = new  Esther();
	}

	@Test
	void estherExists() {
		assertNotNull(esther);
	}
	
	@Test
	void estherCanSing() {
		assertTrue((esther.canSing().equalsIgnoreCase("like an angel")));
	}

}
