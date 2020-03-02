package com.coderaviverma.spring_jpa_demo;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
@Table(name="multifk2_table")
public class MultiFK2 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long emp_id;

    @Column(name="user_name",length=60,nullable=false)
    private String username;


//    @ManyToOne(fetch = FetchType.LAZY)
//    @MapsId
//    private Department department;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonBackReference("abc")
    @JoinColumn(name = "dept_idfk1", referencedColumnName = "dept_id")
    private Department department;
//

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

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }


    @Override
    public String toString() {
        return "MultiFK{" +
                "emp_id=" + emp_id +
                ", username='" + username + '\'' +
                ", department=" + department +
                '}';
    }
}
