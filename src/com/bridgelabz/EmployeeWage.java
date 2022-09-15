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
	 * UC6
	 * Calculate Wages till a condition of total working hours of 100 or max days of 20 is reached for a month
	 */
	//Constant
		public static final  int IS_PART_TIME = 1;
		public static final int IS_FULL_TIME = 2;
		public static final int EMP_RATE_PER_HOUR = 20;
		public static final int NUM_OF_WORKING_DAYS= 20;
		public static final int MAX_HR_IN_MONTH = 100; 
		

	
	public static void main(String[] args) {
		
		//variables
		int empHrs = 0;
		int empWage = 0;
		int totalEmpWage = 0;
		int totalEmpHrs = 0;
		int totalWorkingDays = 0;
		//computation
		while( totalEmpHrs <= MAX_HR_IN_MONTH && totalWorkingDays < NUM_OF_WORKING_DAYS ) {
			totalWorkingDays++;
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
		totalEmpHrs += empHrs;
		System.out.println("Day#:"+totalWorkingDays+" Emp hrs"+empHrs);
		}
		
		totalEmpWage = totalEmpHrs*EMP_RATE_PER_HOUR;
		System.out.println("Total Emp Wage:"+totalEmpWage);
	  }

	}
		

