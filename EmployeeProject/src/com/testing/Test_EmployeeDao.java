package com.testing;
import com.dao. EmployeeDao;
import com.entity.Employee;
public class Test_EmployeeDao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeDao obj= new EmployeeDao();

		//**********************************Single Employee id *******************************************************
		Employee eemp = obj.singleEmployeeById(10);
		System.out.println("PRINT SINGLE EMPLOYEE EMPLOYEE");
		System.out.println(eemp);
		System.out.println("------------------------------------------------------------------------");

		//**********************************Show Employee By ID*******************************************************
		System.out.println("PRINT EMPLOYEE BY ID");
		Employee[] eemp1 = obj.showEmployeeById(10);
		for(Employee eemp2:eemp1) {
			System.out.println(eemp2);
		}
		System.out.println("-----------------------------------------------------------------------------");

		//**********************************Show Employee by role*******************************************************       
		System.out.println("PRINT ROLE OF EMPLOYEE");
		obj.showEmployeeByRole("tester");
		obj.showEmployeeByRole("Developer");
		obj.showEmployeeByRole("HR");
		obj.showEmployeeByRole("CEO");
		obj.showEmployeeByRole("Manager");

		System.out.println("------------------------------------------------------------------------------");
		//**********************************Maximum Salary of Employee*******************************************************
		System.out.println("PRINT MAXIMUM SALARY OF EMPLOYEE");
		obj.employeeMaxSalary();
		System.out.println("------------------------------------------------------------------------------");

		//**********************************Minimum Salary of Employee*******************************************************
		System.out.println("PRINT MINIMUM SALARY OF EMPLOYEE");
		obj.employeeMinSalary();
		System.out.println("------------------------------------------------------------------------------");
		//**********************************Ascending  Employee*******************************************************
		System.out.println("Ascending order");
		obj.sortEmployeeAsc();
		 for (Employee e : eemp1 ) {
		        System.out.println(e);
		 }
		//**********************************Ascending  Employee*******************************************************
		System.out.println("Descending order");
		obj.sortEmployeeDesc();
		 for (Employee e : eemp1 ) {
		        System.out.println(e);
		 }
	}

}
