package veer.com;

import java.util.ArrayList;
import java.util.Objects;
import java.util.jar.Attributes.Name;

public class Arrayselist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ArrayList<Emlopys> mpArrayList =new ArrayList<>();
    
     mpArrayList.add(new Emlopys(1,"veer",1234,"har","male",2650,2021));
     mpArrayList.add(new Emlopys(1,"reer",1234,"har","male",2650,2021));
     mpArrayList.add(new Emlopys(1,"reer",1234,"har","male",2650,2021));
     mpArrayList.add(new Emlopys(1,"veer",1234,"har","male",2650,2021));
     mpArrayList.add(new Emlopys(1,"v=ger",1234,"har","male",2650,2021));
     
    
    	 
    	 
     System.out.println(mpArrayList );
	}

}


class Emlopys{
	
	
	private int age;
	private String name;
	private int id;
	private String Department;
	private String gender;
	private int Salary;
	private int yearofjoing;
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the department
	 */
	public String getDepartment() {
		return Department;
	}
	/**
	 * @param department the department to set
	 */
	public void setDepartment(String department) {
		Department = department;
	}
	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}
	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	/**
	 * @return the salary
	 */
	public int getSalary() {
		return Salary;
	}
	/**
	 * @param salary the salary to set
	 */
	public void setSalary(int salary) {
		Salary = salary;
	}
	/**
	 * @return the yearofjoing
	 */
	public int getYearofjoing() {
		return yearofjoing;
	}
	/**
	 * @param yearofjoing the yearofjoing to set
	 */
	public void setYearofjoing(int yearofjoing) {
		this.yearofjoing = yearofjoing;
	}
	public Emlopys(int age, String name, int id, String department, String gender, int salary, int yearofjoing) {
		super();
		this.age = age;
		this.name = name;
		this.id = id;
		Department = department;
		this.gender = gender;
		Salary = salary;
		this.yearofjoing = yearofjoing;
	}
	public Emlopys() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return " [age=" + age + ", name=" + name + ", id=" + id + ", Department=" + Department + ", gender="
				+ gender + ", Salary=" + Salary + ", yearofjoing=" + yearofjoing + "]";
	}

}
