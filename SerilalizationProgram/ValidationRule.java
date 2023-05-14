package com.validate;

import java.time.LocalDate;
import java.time.Period;
import java.util.Map;

import com.code.Department;
import com.code.Employee;
import com.exception.InvalidEmployeeException;

public class ValidationRule {
	public static Employee ValidateEmployee(String empId, String firstName, String lastName, String deptName,
			double sal, String joiningDate, Map<String, Employee> Maplist) throws InvalidEmployeeException {

		Department dept = parseAndValidateDept(deptName);
		validateEmpId(empId, Maplist);
		LocalDate jd = parseAndValidateJoiningDate(joiningDate);

		return new Employee(empId, firstName, lastName, dept, sal, jd);

	}

	private static Department parseAndValidateDept(String deptName) {

		return Department.valueOf(deptName.toUpperCase());
	}

	private static void validateEmpId(String empId, Map<String, Employee> Maplist) throws InvalidEmployeeException {

		/*
		 * for(Employee e:Maplist.values()) { if(empId.equals(e.getEmpid())) { throw new
		 * InvalidEmployeeException("duplicate empid!!!"); } }
		 */

		if (Maplist.containsKey(empId)) {
			throw new InvalidEmployeeException("duplicate empid!!!");
		}

	}

	private static LocalDate parseAndValidateJoiningDate(String joiningDate) throws InvalidEmployeeException {
		LocalDate jd = LocalDate.parse(joiningDate);

		int perd = Period.between(LocalDate.now(), jd).getYears();
		if (perd > 3) {
			throw new InvalidEmployeeException("Employee date is Invalid");
		}
		return jd;
	}

}
