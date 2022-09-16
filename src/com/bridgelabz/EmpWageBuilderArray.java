package com.bridgelabz;

import java.util.ArrayList;

/**
 * @author Iam_A
 *
 */

public class EmpWageBuilderArray implements ComputeEmpWage {
	/*
	 * UC11
	 */
	
	public static final int IS_PART_TIME =1;
	public static final int IS_FULL_TIME =2;
	
	private int numOfCompany = 0;
	//private CompanyEmpWage[] companyEmpWageArray;
	public ArrayList<CompanyEmpWage> companyEmpWageList;
	public EmpWageBuilderArray() {
		companyEmpWageList = new ArrayList() ;
	}
	public void addCompanyEmpWage(String company,int empRatePerHour,int numOfWorkingDays,int maxHoursPerMonth) {
		CompanyEmpWage comEpWage  = new CompanyEmpWage(company, empRatePerHour, numOfWorkingDays, maxHoursPerMonth);
		companyEmpWageList.add(comEpWage);
	}
	public void computeEmpWage() {
		for(int i=0;i<companyEmpWageList.size();i++) {
			CompanyEmpWage c1 =companyEmpWageList.get(i);
			c1.setTotalEmpWage(this.computeEmpWage(c1));
			System.out.println(c1.totalEmpWage);
		}
		
	}
	private int computeEmpWage(CompanyEmpWage comEpWage) {
		// variables
		int empHrs = 0;
		int totalEmpHrs = 0;
		int totalWorkingDays = 0;
		// computation
					while(totalEmpHrs <= comEpWage.maxHoursPerMonth && totalWorkingDays < comEpWage.numOfWorkingDays  ) {
						totalWorkingDays++;
						int empCheck = (int)Math.floor (Math.random() * 10)%3;
						switch (empCheck) {
						case IS_PART_TIME:
							empHrs = 4;
							break;
						case IS_FULL_TIME:
							empHrs = 8;
							break;
						default:
							empHrs = 0;
						
						} 
						totalEmpHrs += empHrs;
						System.out.println("Day#: " +totalWorkingDays + "Emp Hr:" +empHrs);
					}
					return totalEmpHrs * comEpWage.empRatePerHour;
					
	}
	public static void main(String[] args) {
		EmpWageBuilderArray empWageBuilder = new EmpWageBuilderArray();
		empWageBuilder.addCompanyEmpWage("Dmart",20,2,10);
		empWageBuilder.addCompanyEmpWage("Reliance",10,4,20);
		empWageBuilder.computeEmpWage();
	}


}
