package com.brianthomas.jets;

public class Pilot {
	private String name;
	private int age;
	private int experience;

	
	public Pilot(String name) {
		this.name = name;
	}

	public Pilot(String name, int age, int experience) {
		this.name = name;
		this.age = age;
		this.experience = experience;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("\nPilot: ");
		if (name != null) {
//			builder.append("");
			builder.append(name);
			builder.append("\n");
		}
		builder.append("\tAge: ");
		builder.append(age);
		builder.append("\n\tExperience: ");
		builder.append(experience);
		builder.append("\n");
		return builder.toString();
	}

}
