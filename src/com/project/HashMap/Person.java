package com.project.HashMap;

class Person {
	private int age;
	private String name;
	private String mobile;
	private String email;
	private Relation relations;
	private Salarystructure salarystu;

	public void setName(String name) {
		this.name = name;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setRelations(Relation relations) {
		this.relations = relations;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setsalarystu(Salarystructure salarystu) {
		this.salarystu = salarystu;
	}

	public String getName() {
		return name;
	}

	public String getMobile() {
		return mobile;
	}

	public String getEmail() {
		return email;
	}

	public Relation getRelations() {
		return relations;
	}

	public int getAge() {
		return age;
	}

	public Salarystructure getsalarystu() {
		return salarystu;
	}

}
