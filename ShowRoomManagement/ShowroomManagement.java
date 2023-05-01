package com.code;

import static com.code.ValidateVehicleDetails.ValidateAll;

import java.util.Scanner;

public class ShowroomManagement {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("enter capacity of showroom:");
			Vehicle[] Showroom = new Vehicle[sc.nextInt()];
			int counter = 0;
			boolean exit = false;

			System.out.println("1.add vehicle \n2.show all vehicles \3.exit");
			while (!exit) {

				System.out.println("enter key:");
				switch (sc.nextInt()) {
				case 1:
					try {
						if (counter < Showroom.length) {
							System.out.println("chasisNo,  name,  color,  basePrice,  manufacturingDate");

							Vehicle v = ValidateAll(sc.next(), sc.next(), sc.next(), sc.nextDouble(), sc.next(),
									Showroom);
//						ValidateVehicleDetails.ValidateAll();
							Showroom[counter++] = v;
							System.out.println("vehicle is added to the showroom!");
						} else {
							System.out.println("showroom is full!!!!!");
						}
					} catch (Exception e) {
						e.printStackTrace();
					}
					break;

				case 2:
					for (Vehicle v : Showroom) {
						if (v != null) {
							System.out.println(v);
						}
					}

					break;

				case 3:
					exit = true;

					break;

				}
			}

		}

	}

}
