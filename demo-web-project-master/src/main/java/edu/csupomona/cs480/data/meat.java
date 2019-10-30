package edu.csupomona.cs480.data;

public class meat implements Food{
	
	private String name;
	private double weight;
	private String imageURL;
	private double calorie_g;
	
	
	public meat(String n, double w, String i,double c) {
		name =n;
		weight = w;
		imageURL =i;
		calorie_g = c;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public double getWeight() {
		// TODO Auto-generated method stub
		return weight;
	}

	@Override
	public String getImageURL() {
		// TODO Auto-generated method stub
		return imageURL;
	}

	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public double getCalorie () {
		return calorie_g*weight;
	}

	public double getCalorie_g() {
		return calorie_g;
	}

	public void setCalorie_g(double calorie_g) {
		this.calorie_g = calorie_g;
	}
	

}
