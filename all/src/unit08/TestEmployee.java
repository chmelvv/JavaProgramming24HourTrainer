package unit08;

import java.util.ArrayList;
import java.util.List;

import com.practicaljava.lesson7.tryit.Employee;

/**
 * Create a simple program that uses generics with the class RetiredEmployee (which
extends the class Employee) from Listing 7-2. Write a generic method that accepts a
collection of RetiredEmployee objects and copies it into a collection of Employee objects.
Use the method unloadToDock() from class Ferry as an example.
 *
 */

public class TestEmployee {
	
	public static void copyRetToEmp(List<? extends Employee> retiredEmployeeList, List<? super Employee> employeeList){		
			for (Employee employee: retiredEmployeeList){
				employeeList.add(employee);
				System.out.println(employee.toString());
			}
	}

	public static void main(String[] args) {
		
		// Initialization of collection of RetiredEmployee objects
		List<RetiredEmployee> retiredEmployeeList = new ArrayList<RetiredEmployee>();
		for (int i=0; i<10; i++){
			retiredEmployeeList.add(new RetiredEmployee("name" + i));
		}
		
		List<Employee> employeeList = new ArrayList<Employee>();
		copyRetToEmp(retiredEmployeeList, employeeList);

	}

}
