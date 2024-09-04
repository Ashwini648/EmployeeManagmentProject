package com.dao;
import java.util.Arrays;
import com.entity.Employee;

public class EmployeeDao {



	Employee e1 = new Employee(1, "Amit Sharma", "HR",50000);
	Employee e2 = new Employee(9, "Rohit Verma", "Developer", 65000);
	Employee e3 = new Employee(6, "Sneha Patil", "Developer", 55000);
	Employee e4 = new Employee(2, "Anjali Nair", "Developer", 67000);
	Employee e5 = new Employee(5, "Vikram Singh", "Tester", 48000);
	Employee e6 = new Employee(3, "Pooja Joshi", "Tester", 56000);
	Employee e7 = new Employee(7, "Karan Mehta", "Developer", 52000);
	Employee e8 = new Employee(8, "Neha Gupta", "Developer", 70000);
	Employee e9 = new Employee(4, "Suresh Reddy", "Developer", 45000);
	Employee e10 = new Employee(10, "Priya Iyer", "CEO", 229000); 


	Employee [] emp= new Employee[10];

	//**********************************Single Employee id *******************************************************
	public Employee singleEmployeeById(int empid) {
		emp[0]=e1;
		emp[1]=e2;
		emp[2]=e3;
		emp[3]=e4;
		emp[4]=e5;
		emp[5]=e6;
		emp[6]=e7;
		emp[7]=e8;
		emp[8]=e9;
		emp[9]=e10;

		int index =empid-1;
		return emp[index];

	}

	//**********************************Show Employee By ID*******************************************************
	public Employee [] showEmployeeById(int empid) {
		emp[0]=e1;
		emp[1]=e2;
		emp[2]=e3;
		emp[3]=e4;
		emp[4]=e5;
		emp[5]=e6;
		emp[6]=e7;
		emp[7]=e8;
		emp[8]=e9;
		emp[9]=e10;

		int index =empid-1;
		return emp;

	}


	//**********************************Show Employee by role*******************************************************
	public void  showEmployeeByRole(String role) {
		emp[0]=e1;
		emp[1]=e2;
		emp[2]=e3;
		emp[3]=e4;
		emp[4]=e5;
		emp[5]=e6;
		emp[6]=e7;
		emp[7]=e8;
		emp[8]=e9;
		emp[9]=e10;

		for(Employee employee:emp) {
			if(employee.getRole().equalsIgnoreCase(role)) {
				System.out.println(employee);
			}
		}

	}

	//**********************************Maximum Salary of Employee*******************************************************
	public void employeeMaxSalary() {
		emp[0]=e1;
		emp[1]=e2;
		emp[2]=e3;
		emp[3]=e4;
		emp[4]=e5;
		emp[5]=e6;
		emp[6]=e7;
		emp[7]=e8;
		emp[8]=e9;
		emp[9]=e10;

		//    	int maxsalary=emp[0].getSalary();
		Employee maxemployee=emp[0];
		for(int i=0;i<emp.length;i++) {

			if(emp[0].getSalary() < emp[i].getSalary()) {
				//    			maxsalary=emp[i].getSalary();
				maxemployee=emp[i];


			}

		}
		System.out.println("Maximun salary of employee:"+maxemployee);
		System.out.println("Maximun salary of employee:"+maxemployee.getSalary());


		//    	Employee maxsalary=emp[0];
		//    	
		//    	for(Employee emax:emp) {
		//    		if(e.getSalary()>maxsalary.getSalary()) {
		//    			maxsalary=e;
		//    		}
		//    	}
		//    	System.out.println("Employee with the maximum salary:"+maxsalary);
		//    	System.out.println("Employee with the maximum salary:"+maxsalary.getSalary());
		//    }

	}


	//**********************************Minimum Salary of Employee*******************************************************

	public void employeeMinSalary() {
		emp[0]=e1;
		emp[1]=e2;
		emp[2]=e3;
		emp[3]=e4;
		emp[4]=e5;
		emp[5]=e6;
		emp[6]=e7;
		emp[7]=e8;
		emp[8]=e9;
		emp[9]=e10;

		//    	 Employee minsalary=emp[0];
		//    		
		//    		for(Employee emin:emp) {
		//    			if(emin.getSalary()<minsalary.getSalary()) {
		//    				minsalary=emin;
		//    			}
		//    		}
		//    		System.out.println("Employee with the maximum salary:"+minsalary);
		//    		System.out.println("Employee with the maximum salary:"+minsalary.getSalary());
		//    	
		// }

		Employee minemployee=emp[0];
		for(int i=0;i<emp.length;i++) {
			if(emp[0].getSalary() > emp[i].getSalary()) {
				minemployee=emp[i];

			}

		}
		System.out.println("Maximun salary of employee:"+minemployee);
		System.out.println("Maximun salary of employee:"+minemployee.getSalary());

	}

	//********************************** Ascending Employee data*******************************************************

	public Employee[] sortEmployeeAsc() {
		emp[0]=e1;
		emp[1]=e2;
		emp[2]=e3;
		emp[3]=e4;
		emp[4]=e5;
		emp[5]=e6;
		emp[6]=e7;
		emp[7]=e8;
		emp[8]=e9;
		emp[9]=e10;

		
		for(int i=0; i<emp.length; i++) {
			for(int j=i+1; j< emp.length;j++) {
				
				if(emp[i].getEmpid()>emp[j].getEmpid()) {
					Employee temp=emp[i];
					emp[i]=emp[j];
					emp[j]=temp;
				}
			}
		}
		 
		for(Employee employee : emp) {
			
			System.out.println(employee);
		}
         return emp;
                  
	}

	//********************************** Descending Employee data*******************************************************

	public Employee[] sortEmployeeDesc() {
		emp[0]=e1;
		emp[1]=e2;
		emp[2]=e3;
		emp[3]=e4;
		emp[4]=e5;
		emp[5]=e6;
		emp[6]=e7;
		emp[7]=e8;
		emp[8]=e9;
		emp[9]=e10;

		for(int i=0; i<emp.length; i++) {
			for(int j=i+1; j< emp.length;j++) {
				
				if(emp[i].getEmpid()<emp[j].getEmpid()) {
					Employee temp=emp[i];
					emp[i]=emp[j];
					emp[j]=temp;
				}
			}
		}
		 
		for(Employee employee : emp) {
			
			System.out.println(employee);
		}
         return emp;
                  
	}
}

