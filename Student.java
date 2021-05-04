import java.util.Scanner;

public class Student {
	//=========================== properties
	private String name, gender; 
	private double avg;
	
	//=========================== constructors
	
	public Student (Scanner fin) {
		this(fin.nextLine().split("\t"));
	}
	public Student (String s) {
		this(s.split("\t")); //takes the string then make0s it a array and moves it one constructor below
	}
	public Student (String[] parts) { //takes the array then separates it into parts to then set the variables in the next constructor
		this(parts[0], parts[1], Double.parseDouble(parts[2]));
	}

	public Student (String name, String gender, double avg) {
		setName(name);
		setGender(gender);
		setAvg(avg);
	}
	
	
	//============================== Getters / Setters
	

	public String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}
	
	
	
	
	
	
}
