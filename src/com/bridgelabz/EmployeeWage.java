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
	 * UC9
	 * Compute Employee Wage and Save Total Wage by Company
	 */
	//Constant
		public static final  int IS_PART_TIME = 1;
		public static final int IS_FULL_TIME = 2;
	
		

	
	public static int computeEmpWage(String company,int empRatePerHours,int numOfWorkingDays,int maxHoursPerMonth) {
		
		//variables
		int empHrs = 0;
		int empWage = 0;
		int totalEmpWage = 0;
		int totalEmpHrs = 0;
		int totalWorkingDays = 0;
		//computation
		while( totalEmpHrs <= maxHoursPerMonth && totalWorkingDays < numOfWorkingDays ) {
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
		
		totalEmpWage = totalEmpHrs*empRatePerHours;
		System.out.println("Total Emp Wage for comapny:"+company+":is" +totalEmpWage);
		return totalEmpWage;
	  }
	
	 public static void main(String[] args) {
		 computeEmpWage("Dmart",20,5,100);
		 computeEmpWage("Reliance",20,4,100);
	 }
	}
		

