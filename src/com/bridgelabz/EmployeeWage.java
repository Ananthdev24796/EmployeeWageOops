/**
 * 
 */
package com.bridgelabz;

/**
 * @author Iam_A
 *
 */
public class EmployeeWage {
	/**
	 * UC5
	 * Calculating Wages for a Month assuming 20 Working Days in a Month
	 */
	//Constant
		public static final  int IS_PART_TIME = 1;
		public static final int IS_FULL_TIME = 2;
		public static final int EMP_RATE_PER_HOUR = 20;
		public static final int NUM_OF_WORKING_DAYS= 20;

	
	public static void main(String[] args) {
		
		//variables
		int empHrs = 0;
		int empWage = 0;
		int totalEmpWage = 0;
		//computation
		for(int day =1;day<=NUM_OF_WORKING_DAYS;day++) {
		int empCheck =(int) Math.floor(Math.random()*10)%3;
		switch(empCheck){
		
		case IS_FULL_TIME:
			System.out.println("Employee is Present for Part time	");
			empHrs = 4;
			break;
		case IS_PART_TIME:
			System.out.println("Employee is Present for full time");
			empHrs = 8;
			break;
		default :
			System.out.println("Employee is Absent");
			empHrs = 0;
			break;
		}
		empWage = empHrs*EMP_RATE_PER_HOUR;
		totalEmpWage += empWage;
		System.out.println(empWage);

	}
		System.out.println(totalEmpWage);
  }
}
