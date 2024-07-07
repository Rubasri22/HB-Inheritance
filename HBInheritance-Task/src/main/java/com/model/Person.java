package com.model;
import javax.validation.constraints.*;

import jakarta.persistence.*;

@Entity
@Table(name="Person")
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)

public class Person {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
@Column(name="id")
int id;
@Column(name="name")
@NotEmpty(message = "name field should not empty")
String name;
@Column(name="address")
@NotBlank(message = "Address should not be left blank ... Fill in address field")
String address;



public Person() {
super();
}

public Person(@NotEmpty(message = "name field should not empty") String name) {
super();
this.name = name;
}

public Person(@NotEmpty(message = "name field should not empty") String name,
@NotBlank(message = "Address should not be left blank ... Fill in address field") String address) {
super();
this.name = name;
this.address = address;
}

public Person(int id, @NotEmpty(message = "name field should not empty") String name,
@NotBlank(message = "Address should not be left blank ... Fill in address field") String address) {
super();
this.id = id;
this.name = name;
this.address = address;
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
public String getAddress() {
return address;
}
public void setAddress(String address) {
this.address = address;
}



}