package lab1;

import java.util.ArrayList;
import java.util.List;

public class EmployeeStatistics {

	public static double averageSalary(ArrayList<? extends Employee> list) {
		double avg = 0;
		int sum = 0;

		for (Employee e : list) {
			int val = e.getSalary();
			sum += val;

		}

		avg = sum / (double) list.size();
		return avg;
	}

	public static int numOfEmployees(ArrayList<? extends Employee> list) {
		return list.size();
	}

	public static int numOfEmployees(ArrayList<? extends Employee> list, int department) {
		int count = 0;

		for (Employee e : list) {
			if (e.getDepartment() == department) {
				count++;
			}
		}
		return count;

	}

}
