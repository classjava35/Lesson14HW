package lab1;

import java.util.ArrayList;

import sorting.State;

public class Test {
	public static void main(String[] args) {
		
		ArrayList<Employee> list = new ArrayList<>();
		list.add(new Employee("David","Levi", 2000,1));
		list.add(new Employee("Moshe","Levi", 3000,1));
		list.add(new Employee("Sara","Cohen", 5000,2));
		list.add(new Employee("David","Israel", 2000,4));
		
		System.out.println("The avaerage salary is : "+EmployeeStatistics.averageSalary(list));;
		System.out.println("The number of Employees is : "+EmployeeStatistics.numOfEmployees(list));;
		System.out.println("The number of Employees in department "+ 1+ " : "+ EmployeeStatistics.numOfEmployees(list,1));;

	}

}
