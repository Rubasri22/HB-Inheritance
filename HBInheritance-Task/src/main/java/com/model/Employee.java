package com.model;

import javax.validation.constraints.*;
import jakarta.persistence.*;

@Entity
@Table(name="Employee")
@AttributeOverrides({
@AttributeOverride(name="id", column=@Column(name="id")),
@AttributeOverride(name="name", column=@Column(name="name")),
@AttributeOverride(name="address", column=@Column(name="address"))
})
public class Employee extends Person{
@Column(name = "designation")
@NotEmpty(message = "Designation field must not be empty")
String desig;
@Column(name = "salary")
@Digits(integer = 7,fraction = 3,message = "give valid salary of you")
float salary;
@Column(name = "doj")
@NotEmpty(message="plaese give your date of joining")
String doj;
public Employee() {
super();
}
public Employee(@NotEmpty(message = "name field should not empty")
String name,@NotEmpty(message = "Designation field must not be empty") String desig,
@Digits(integer = 7, fraction = 3, message = "give valid salary of you") float salary,
@NotEmpty(message = "plaese give your date of joining") String doj,
@NotBlank(message = "Address should not be left blank ... Fill in address field") String address) {
super();
this.name=name;
this.desig = desig;
this.salary = salary;
this.doj = doj;
this.address=address;
}

public Employee(@Digits(integer = 7, fraction = 3, message = "give valid salary of you") float salary,
@NotEmpty(message = "plaese give your date of joining") String doj) {
super();
this.salary = salary;
this.doj = doj;
}

public Employee(@NotEmpty(message = "Designation field must not be empty") String desig,
@Digits(integer = 7, fraction = 3, message = "give valid salary of you") float salary,
@NotEmpty(message = "plaese give your date of joining") String doj) {
super();
this.desig = desig;
this.salary = salary;
this.doj = doj;
}
public Employee(@NotEmpty(message = "Designation field must not be empty") String desig) {
super();
this.desig = desig;
}
public String getDesig() {
return desig;
}
public void setDesig(String desig) {
this.desig = desig;
}
public float getSalary() {
return salary;
}
public void setSalary(float salary) {
this.salary = salary;
}
public String getDoj() {
return doj;
}
public void setDoj(String doj) {
this.doj = doj;
}




}

