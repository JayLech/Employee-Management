package com.example.EmployeeManagement.Data;
public class EmployeeData {

    private int ID;
    private String Name;
    private String Address;
    private String Mobile;

    public EmployeeData(int ID, String name, String address, String mobile) {
        this.ID = ID;
        Name = name;
        Address = address;
        Mobile = mobile;
    }

    public EmployeeData() {
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

    @Override
    public String toString() {
        return "EmployeeData{" +
                "ID=" + ID +
                ", Name='" + Name + '\'' +
                ", Address='" + Address + '\'' +
                ", Mobile='" + Mobile + '\'' +
                '}';
    }
}
