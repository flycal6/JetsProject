package com.brianthomas.jets;

public class Jet {
	private String model;
	private double speed;
	private double range;
	private int price;
	private final static double MACH_CONV = 0.0013;

	public Jet(String model, double speed, double range, int price) {
		this.model = model;
		speed = Math.round(((speed * MACH_CONV) * 100.0))/100.0;
		this.speed = speed;
		this.range = range;
		this.price = price;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed * MACH_CONV;
		this.speed = Math.round((speed * 100.0))/100.0;
		this.speed = speed;
	}

	public double getRange() {
		return range;
	}

	public void setRange(double range) {
		this.range = range;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		if (model != null) {
			builder.append("Model: ");
			builder.append(getModel());
			builder.append(",\n ");
		}
		builder.append("\tSpeed: ");
		builder.append(getSpeed());
		builder.append(" mach\n");
		builder.append("\tRange: ");
		builder.append(getRange());
		builder.append(" nm\n");
		builder.append("\tPrice: $");
		builder.append(getPrice());
		builder.append("\n");
		return builder.toString();
	}

	
}
