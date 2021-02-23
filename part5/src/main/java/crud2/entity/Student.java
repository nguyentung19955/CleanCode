package crud2.entity;

import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Entity
@NoArgsConstructor
public class Student extends User {
	
	private int year;
	
	
	public Student(String name, String email, String password, int year) {
		super(name, email, password);
		this.year = year;
	}
}
