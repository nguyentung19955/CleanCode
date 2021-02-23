package crud.entity;

import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Entity
@NoArgsConstructor
public class Teacher extends User {
	
	private String phone;
	
	private int experience;
	
	
	public Teacher(String name, String email, String password, String phone, int experience) {
		super(name, email, password);
		this.phone = phone;
		this.experience = experience;
	}
}
