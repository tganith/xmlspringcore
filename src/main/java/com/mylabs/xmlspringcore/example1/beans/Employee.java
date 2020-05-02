package com.mylabs.xmlspringcore.example1.beans;


public class Employee {

    private int empId;
    private String empName;
    private Address address;


    public Employee(){
        System.out.println("employee object created !!!");
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public void display() {
        System.out.println("Emp Id :"+empId+" ,Emp Name:"+empName);
    }
}
