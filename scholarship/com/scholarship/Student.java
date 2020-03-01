package com.scholarship;

public class Student {
	private int age;
	private int livedInCali;
	private int partTimeDuration;
	private boolean parentsStateTax;
	private boolean volunteered;
	private int householdIncome;

	/**
	 * Constructor for the class Student
	 * 
	 * @param age              the age of the student
	 * @param livedInCali      how long the student has lived in California
	 *                         currently
	 * @param partTimeDuration how long the student worked part time in the relevant
	 *                         field of study in months.
	 * @param parentsStateTax  if the parents of the student have paid California
	 *                         state tax for at least 1 year in their lifetime
	 * @param volunteered      if the student has volunteered for a cause and has a
	 *                         valid proof of it
	 * @param householdIncome  the student's household income per annum.
	 */

	public Student(int age, int livedInCali, int partTimeDuration, boolean parentsStateTax, boolean volunteered,
			int householdIncome) {
		this.age = age;
		this.livedInCali = livedInCali;
		this.partTimeDuration = partTimeDuration;
		this.parentsStateTax = parentsStateTax;
		this.volunteered = volunteered;
		this.householdIncome = householdIncome;
	}

	/**
	 * Method that checks if this student is eligible for a scholarship. Checks if student satisfies the multiple criteria in this order:
	 * 	1. Student's age is between 18 and 24.
	 *  2. Student has lived in California for the last 2 years (Go to criteria 4 if false).
	 *  3. Student has worked part time for at least 6 months in the relevant field of study (Go to criteria 5 if false).
	 *  4. Parents of the student have paid California state tax for at least 1 year in their lifetime.
	 *  5. Has volunteered for a cause and has valid proof of it.
	 *  6. Has household income less than $5000 per annum then one need not satisfy criteria 3 and he will be redirected to "Dean for consideration".
	 * @return the eligibility of this student
	 */
	public String ScholarshipEligibility() {
		int i = 1;
		boolean case3Check = false;
		boolean solved = false;
		while (!solved) {
			switch (i) {
			case 1:
				if (18 <= age && age <= 24) {
					i = 2;
					break;
				} else {
					solved = true;
					return "0";
				}
			case 2:
				if (livedInCali >= 2) {
					i = 3;
					break;
				} else {
					i = 4;
					break;
				}
			case 3:
				if (partTimeDuration>=6) {
					solved = true;
					return "1";
				}
				else {
					i=5;
					break;
				}
			case 4:
				if(parentsStateTax) {
					i=3;
					break;
				}
				else {
					solved = true;
					return "0";
				}
			case 5:
				if(volunteered) {
					solved = true;
					return "1";
				}
				else {
					i=6;
					break;
				}
			case 6:
				if (householdIncome<5000) {
					solved = true;
					return "Dean for consideration";
				}
				else {
					solved = true;
					return "0";
				}
					
				

			}
		}
		return "ERROR";
	}

}
