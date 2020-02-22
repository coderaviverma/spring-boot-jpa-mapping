package com.coderaviverma.spring_jpa_demo;

import org.hibernate.annotations.NaturalId;

import javax.persistence.*;

@Entity
@Table(name="employee_table")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long emp_id;

    @NaturalId
    @Column(name="user_name",length=60,nullable=false)
    private String username;

    @Column(name="password",nullable=false)
    private String password;

    @Column(name="accress_level")
    private int accessLevel;


    @ManyToOne(fetch = FetchType.LAZY,optional = true)
    @JoinColumn(name = "dept_id")
    private Department department;


    public Long getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(Long emp_id) {
        this.emp_id = emp_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAccessLevel() {
        return accessLevel;
    }

    public void setAccessLevel(int accessLevel) {
        this.accessLevel = accessLevel;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public boolean equals(Object obj) {
        return true;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", accessLevel=" + accessLevel +
                '}';
    }
}
