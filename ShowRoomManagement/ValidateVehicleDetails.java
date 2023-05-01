package com.code;

import java.time.LocalDate;

public class ValidateVehicleDetails {

	public static Vehicle ValidateAll(String chasisNo, String name, String color, double basePrice,
			String manufacturingDate, Vehicle[] vehicles) throws VehicleHandlingException {
		ValidateDuplicate(chasisNo, vehicles);

		VehicleColor validColor = ValidateColor(color);
		double netsal = basePrice + validColor.getColorCost();

		LocalDate validDate = parseAndValidateDate(manufacturingDate);

		return new Vehicle(chasisNo, name, validColor, basePrice, manufacturingDate);
	}

	private static LocalDate parseAndValidateDate(String manufacturingDate) throws VehicleHandlingException {
		LocalDate d1 = LocalDate.parse(manufacturingDate);

		LocalDate beginYear = LocalDate.of(LocalDate.now().getYear(), 1, 1);

		if (beginYear.isBefore(d1) == true)
			return d1;
		else
			throw new VehicleHandlingException("the date is not in that year");
	}

	private static VehicleColor ValidateColor(String color) {

		return VehicleColor.valueOf(color.toUpperCase());
	}

	public static void ValidateDuplicate(String chasisNo, Vehicle[] vehicles) throws VehicleHandlingException {
		Vehicle v = new Vehicle(chasisNo);

		for (Vehicle v1 : vehicles) {
			if (v1 != null) {
				if (v1.equals(v)) {
					throw new VehicleHandlingException("duplicate vehicle");
				}
				System.out.println("no deplicate found");
			}
		}
	}
}
