//Check Employee is Present or Absent

package com.day3UCases;

public class EmployeeWageUC1 {

	public static void main(String[] args) {
	int IS_FULL_TIME =1;

double empCheck=Math.floor(Math.random()*10)%2;
if(empCheck==IS_FULL_TIME)
	System.out.println("Employee is Present");
else
	System.out.println("Employeeis Abscent");
}
}