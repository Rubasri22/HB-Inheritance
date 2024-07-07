package com.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="customer")
@AttributeOverrides({
@AttributeOverride(name="id", column=@Column(name="id")),
@AttributeOverride(name="name", column=@Column(name="name")),
@AttributeOverride(name="address", column=@Column(name="address"))
})
public class Customer extends Person{
@Column(name = "email")
@Email(message = "provide valid email")
String email;
@Column(name = "mbno")
@Size(max = 10,min = 10,message = "give valid mobile number")
String mbno;
@Column(name = "ctype")
@NotEmpty(message="mention the type of customer")
String ctype;

public Customer() {
super();
}

public Customer(@NotEmpty(message = "name field should not empty")
String name,@Email(message = "provide valid email") String email,
@Size(max = 10, min = 10, message = "give valid mobile number") String mbno,
@NotEmpty(message = "mention the type of customer") String ctype,
@NotBlank(message = "Address should not be left blank ... Fill in address field") String address) {
super();
this.name=name;
this.email = email;
this.mbno = mbno;
this.ctype = ctype;
this.address=address;
}


public Customer(@Email(message = "provide valid email") String email,
@Size(max = 10, min = 10, message = "give valid mobile number") String mbno,
@NotEmpty(message = "mention the type of customer") String ctype) {
super();
this.email = email;
this.mbno = mbno;
this.ctype = ctype;
}

public Customer(@Email(message = "provide valid email") String email) {
super();
this.email = email;
}


public Customer(@Size(max = 10, min = 10, message = "give valid mobile number") String mbno,
@NotEmpty(message = "mention the type of customer") String ctype) {
super();
this.mbno = mbno;
this.ctype = ctype;
}

public String getEmail() {
return email;
}

public void setEmail(String email) {
this.email = email;
}

public String getMbno() {
return mbno;
}

public void setMbno(String mbno) {
this.mbno = mbno;
}

public String getCtype() {
return ctype;
}

public void setCtype(String ctype) {
this.ctype = ctype;
}






}


