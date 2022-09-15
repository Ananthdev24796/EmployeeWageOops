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
		
		private final String company;
		private final int empRatePerHour;
		private final int numOfWorkingDays;
		private final int maxHoursPerMonth; 
		private int totalEmpWage;
		
		public EmployeeWage(String company,int empRatePerHour,int numOfWorkingDays,int maxHoursPerMonth) {
			this.company=company;
			this.empRatePerHour=empRatePerHour;
			this.numOfWorkingDays=numOfWorkingDays;
			this.maxHoursPerMonth=maxHoursPerMonth;
		}

	
	public void  computeEmpWage(){
		
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
		
		totalEmpWage = totalEmpHrs*empRatePerHour;
		//System.out.println("Total Emp Wage for comapny:"+company+":is" +totalEmpWage);
		
	  }
	
	 @Override 
	public String toString() {
		return "Total Emp wage or company:" +company+ "is:"+totalEmpWage ;
	}


	public static void main(String[] args) {
		EmployeeWage dmart = new EmployeeWage("Dmart",20,2,20);
		EmployeeWage reliance = new EmployeeWage("Reliance",20,5,10);
		dmart.computeEmpWage();
		System.out.println(dmart);
		reliance.computeEmpWage();
		System.out.println(reliance);
		
	 }
	}
		

