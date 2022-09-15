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
	 * UC4
	 * using switch case statement
	 */
	//Constant
		public static final  int IS_PART_TIME = 1;
		public static final int IS_FULL_TIME = 2;
		public static final int EMP_RATE_PER_HOUR = 20;

	
	public static void main(String[] args) {
		
		//variables
		int empHrs = 0;
		int empWage = 0;
		//computation
		int empCheck =(int) Math.floor(Math.random()*10)%3;
		switch(empCheck){
		
		case IS_FULL_TIME:
			System.out.println("Employee is Present for Part time");
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
		System.out.println(empWage);

	}

}
