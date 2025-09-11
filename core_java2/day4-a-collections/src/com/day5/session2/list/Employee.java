package com.day5.session2.list;
//Comprable vs Comparator

import java.util.Comparator;

class EmployeeSortAsPerNameAndThenAsPerSalary implements Comparator<Employee>{
	@Override
	public int compare(Employee o1, Employee o2) {
		int val= o1.getName().compareTo(o2.getName());
		if(val==0) {
			val=Double.compare(o2.getSalary(), o1.getSalary());
		}
		return val;
	}
}



//extra sort seq
class EmployeeSortAsPerName implements Comparator<Employee>{
	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getName().compareTo(o2.getName());
	}
}

//natural sort

public class Employee implements Comparable<Employee>{

	private int id;
	private String name;
	private double salary;

	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", salary=");
		builder.append(salary);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int compareTo(Employee o) {
		return Integer.compare(this.id, o.id);
	}


}
