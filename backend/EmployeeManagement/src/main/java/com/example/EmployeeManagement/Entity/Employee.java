package com.example.EmployeeManagement.Entity;


import jakarta.persistence.*;

@Entity
@Table(name="Employee")
public class Employee {
    @Id
    @Column(name="Employee_id", length=50)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;

    @Column(name="Employee_name", length=50)
    private String Name;

    @Column(name="Employee_address", length=80)
    private String Address;

    @Column(name="Employee_mobile", length=10)
    private String Mobile;

    public Employee() {
    }

    public Employee(int ID, String name, String address, String mobile) {
        this.ID = ID;
        Name = name;
        Address = address;
        Mobile = mobile;
    }

    public Employee(String name, String address, String mobile) {
        this.ID = ID;
        Name = name;
        Address = address;
        Mobile = mobile;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getMobile() {
        return Mobile;
    }

    public void setMobile(String mobile) {
        Mobile = mobile;
    }
}
