package in.model;

public class Person {

	private String name;

	private Integer age;

	private String gender;

	public Person() {

	}

	public Person(String name, String gender, Integer age) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public void displayRole() {

	}

}
