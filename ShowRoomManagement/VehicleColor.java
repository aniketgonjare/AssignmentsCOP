package com.code;

public enum VehicleColor {
	WHITE(1000), BLACK(2000), BLUE(3000), RED(4000), SILVER(5000);

	private int colorCost;

	private VehicleColor(int i) {
		this.colorCost = i;
	}

	@Override
	public String toString() {
		return name() + "@" + this.colorCost;
	}

	public int getColorCost() {
		return colorCost;
	}

}
