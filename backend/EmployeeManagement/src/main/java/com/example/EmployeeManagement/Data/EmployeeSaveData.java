package com.example.EmployeeManagement.Data;

public class EmployeeSaveData {

    private String Name;
    private String Address;
    private String Mobile;

    public EmployeeSaveData(String name, String address, String mobile) {
        Name = name;
        Address = address;
        Mobile = mobile;
    }

    public EmployeeSaveData() {
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
