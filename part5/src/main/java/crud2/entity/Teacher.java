package crud2.entity;

import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Iterator;
import java.util.List;

@Entity
@NoArgsConstructor
public class Teacher extends User {

    private String phone;

    private int experiences;


    public Teacher(String name, String email, String password, String phone, int experiences) {
        super(name, email, password);
        this.phone = phone;
        this.experiences = experiences;
    }
}
