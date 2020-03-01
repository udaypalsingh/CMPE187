package com.scholarship;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StudentTest {

	@Test
	void test() {
		Student a = new Student(17,0,1,false,false,5000);
		assertEquals(a.ScholarshipEligibility(),"0");
	}

}
