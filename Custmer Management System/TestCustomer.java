package com.app.customer;

import static com.app.customer.CustomerValidationRule.cheakLoginDetails;

import java.time.LocalDate;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class TestCustomer {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// List<Customer> cust = new ArrayList<>();
			List<Customer> cust = CustomerUtils.PopulateCustomers();
			boolean exit = false;

			System.out.println("\t*Available Serivice plans*\n");
			ServicePlan[] SP = ServicePlan.values();
			for (ServicePlan sp : SP) {
				System.out.println(sp);
			}

			System.out.println("\n\n\t *choose from this options*");

			System.out.println("1.Sign up");
			System.out.println("2.Sign in");
			System.out.println("3.Update pasword");
			System.out.println("4.Unsubscribe user");
			System.out.println("5.Display registered Customers");
			System.out.println("6.Sort registered Customersusing email");
			System.out.println("7.Sort registered Customers using email and registration amount");
			System.out.println("8.Update Subscription");
			System.out.println("9.remove user's who's subscription plan is over");
			System.out.println("0.exit");

			while (!exit) {
				try {
					System.out.println(" enter choice:");
					switch (sc.nextInt()) {
					case 1: {
						System.out.println("enter firstname, lastname, email, passwd,reg amount, dob, Plan:");
						Customer customer = CustomerValidationRule.ValidateAll(sc.next(), sc.next(), sc.next(),
								sc.next(), sc.nextDouble(), sc.next(), sc.next(), sc.next(), cust);
						cust.add(customer);

						System.out.println("sucessfully registered!!!!!!!!!!!");
					}
						break;
					case 2:
						System.out.println("enter email ID and password ");

						Customer validCustomer = cheakLoginDetails(sc.next(), sc.next(), cust);
						System.out.println("successfully logged in!!!");

						break;
					case 3:
						System.out.println("enter email,old passwd and new passwd");
						validCustomer = cheakLoginDetails(sc.next(), sc.next(), cust);

						validCustomer.setPasswd(sc.next());
						System.out.println("passwd updated successfully");

						break;

					case 4:
						System.out.println("enter email and passwd ");
						validCustomer = cheakLoginDetails(sc.next(), sc.next(), cust);

						System.out.println("removed " + validCustomer);

						break;

					case 5:
						System.out.println("\t registered customers are");

						for (int i = 0; i < cust.size(); i++) {

							System.out.println(cust.get(i));
						}

						break;
					case 6:
						Collections.sort(cust);
						break;
					case 7:
						Collections.sort(cust, new Comparator<Customer>() {
							public int compare(Customer c1, Customer c2) {
								int ret = c1.getDob().compareTo(c2.getDob());
								if (ret == 0) {
									return ((Double) c1.getRegAmt()).compareTo(((Double) c2.getRegAmt()));
								}
								return ret;
							}
						});

						break;

					case 8:
						System.out.println("enter email id and passwd");
						validCustomer = cheakLoginDetails(sc.next(), sc.next(), cust);

						LocalDate SubscriptionDate = CustomerValidationRule.updateSubscriptionAmount(validCustomer);
						validCustomer.setLastSubscriptionDate(SubscriptionDate);
						int s = sc.nextInt();
						System.out.println("Amount Paid:" + s);
						break;

					case 9:
						CustomerValidationRule.removeCustomers(cust);

						break;

					case 0:
						System.out.println("\t Thank You...!!!!");
						exit = true;
						break;
					}
				} catch (Exception e) {
					e.printStackTrace();
					sc.nextLine();
				}
			}
		}

	}

}
