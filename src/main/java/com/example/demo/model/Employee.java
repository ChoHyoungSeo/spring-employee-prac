package com.example.demo.model;
import javax.persistence.*;

@Entity
public class Employee {

    @Id
    @Column(name = "ssn")
    private Integer ssn;

    @Column(name = "fname")
    private String fname;

    @Column(name = "lname")
    private String lname;

    @Column(name = "bdate")
    private String bdate;

    @Column(name = "address")
    private String address;

    @Column(name = "sex")
    private String sex;

    @Column(name = "salary")
    private Integer salary;

    @Column(name = "superssn")
    private Integer superssn;

    @Column(name = "dno")
    private Integer dno;

    public Employee() {
        super();
    }


    public Employee(Integer ssn, String fname, String lname, String bdate, String address, String sex, Integer salary, Integer superssn, Integer dno) {
        super();
        this.ssn=ssn;
        this.fname=fname;
        this.lname=lname;
        this.bdate=bdate;
        this.address=address;
        this.sex=sex;
        this.salary=salary;
        this.superssn=superssn;
        this.dno=dno;
    }

    public Integer getSsn() {
        return ssn;
    }

    public void setSsn(Integer SSN) {
        this.ssn = ssn;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String FNAME) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String LNAME) {
        this.lname = lname;
    }

    public String getBdate() {
        return bdate;
    }

    public void setBdate(String BDATE) {
        this.bdate = bdate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String ADDRESS) {
        this.address = address;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String SEX) {
        this.sex = sex;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public Integer getSuperssn() {
        return superssn;
    }

    public void setSuperssn(Integer superssn) {
        this.superssn = superssn;
    }

    public Integer getDno() {
        return dno;
    }

    public void setDno(Integer dno) {
        this.dno = dno;
    }
}