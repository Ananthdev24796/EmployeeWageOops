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
	 * UC1
	 * Check Employee is Present or Absent
	 */
	public static void main(String[] args) {
		//Constant
		int IS_FULL_TIME = 1;
		//computation
		double empCheck = Math.floor(Math.random()*10)%2;
		if(empCheck == 1) {
			System.out.println("Employee is Present");
		}else {
			System.out.println("Employee is Absent");
		}

	}

}
