package Tester;

import static com.validate.ValidationRule.ValidateEmployee;

import java.util.Map;
import java.util.Scanner;

import com.code.Employee;
import com.utils.UtilsIO;

public class TestEmployee {
	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("1. Hire new emp\r\n" + "		2. List all emp details\r\n"
					+ "		3. Promote an emp\r\n" + "		4. Delete emp details\r\n"
					+ "		5. Sort emps as per join date n display the same.\r\n" + "		0. Exit");

			boolean flag = false;

			// Map<String,Employee> Maplist=new HashMap<>();

			System.out.println("enter file name to restore");
			Map<String, Employee> Maplist = UtilsIO.restoreProductDetails(sc.next());
			System.out.println("restored Map: " + Maplist);

			// m.forEach((k,v)->System.out.println(v));
			/*
			 * for(Employee e:m.values()) { if(m!=null) { System.out.println(m); } }
			 */

			while (!flag) {
				System.out.println("enter choice:");
				try {
					switch (sc.nextInt()) {
					case 1:
						System.out.println("enter empid, firstName, lastName, deptName, salary, joining Date");
						Employee emp = ValidateEmployee(sc.next(), sc.next(), sc.next(), sc.next(), sc.nextDouble(),
								sc.next(), Maplist);

						Maplist.put(emp.getEmpid(), emp);
						System.out.println("employee added successfully!!!");

						break;

					case 2:
						System.out.println("Employee list:");
						// Maplist.forEach((k,v)->System.out.println(v));
						Maplist.values().forEach(System.out::println);
						break;

					case 3:
						System.out.println("enter empId");
						String empiid = sc.next();

						Employee emp2=Maplist.get(empiid);
						emp2.setSalary(emp2.getSalary()*1.1);
 
//						Maplist.values() // map to collection
//								.stream() // stream<Employee>
//								.filter(p -> p.getEmpid().equals(empiid)) // filtered Stream<Employee>
//								.forEach(p -> p.setSalary(p.getSalary() * 1.10));

						/*
						 * String emp1=sc.next(); Maplist.values().stream().filter(p ->
						 * p.getEmpid().equals(emp1)) .forEach(p->p.setSalary(p.getDept()));
						 * 
						 */
						break;

					case 4:
						System.out.println("enter empid to remove employee");
						String s = sc.next();
						Maplist.values().removeIf(p -> p.getEmpid().equals(s));

						break;

					case 5:
						System.out.println("Sorted emps as per join date:");

						Maplist.values().stream().sorted((x, y) -> x.getJoiningDate().compareTo(y.getJoiningDate()))
								.forEach(p -> System.out.println(p));
						break;

					case 0:
						System.out.println("enter fileName");
						// UtilsIO.restoreProductDetails(sc.next());
						UtilsIO.storeProductDetails(sc.next(), Maplist);

						System.out.println("data stored!!!!" + "\n Exited");
						flag = true;

						break;

					default:
						System.out.println("invalid choice!!!");
						break;
					}

				} catch (Exception e) {
					e.printStackTrace();
					sc.nextLine();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
