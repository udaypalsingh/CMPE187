package com.scholarship;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StudentTest {

	@Test
	void test() {
		Student a = new Student(18,2,6,true,true,100000);
		assertEquals(a.ScholarshipEligibility(),"1");
	}

}
