/**
 * 
 */
package com.guru.bharath.beans;

import java.math.BigDecimal;

/**
 * @author AB40286
 *
 */
public class DeveloperBean {

	private String name;
	private BigDecimal salary;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getSalary() {
		return salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public DeveloperBean(String name, BigDecimal salary, int age) {
		super();
		this.name = name;
		this.salary = salary;
		this.age = age;
	}

	@Override
	public String toString() {
		return "DeveloperBean [name=" + name + ", salary=" + salary + ", age=" + age + "]";
	}

}
