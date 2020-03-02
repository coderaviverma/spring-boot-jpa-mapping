package com.coderaviverma.spring_jpa_demo;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.NaturalId;

import javax.persistence.*;

@Entity
@Table(name="multifk_table")
public class MultiFK {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long emp_id;

    @Column(name="user_name",length=60,nullable=false)
    private String username;


//    @OneToOne(fetch = FetchType.LAZY,optional = true)
////    @JoinColumn(name = "dept_id", referencedColumnName = "dept_id")
//    @MapsId
//    @JsonIgnore
//    @JsonBackReference
//    private Department department;

//    @ManyToOne(fetch = FetchType.LAZY,optional = true)
//    @JoinColumn(name = "dept_idfk1", referencedColumnName = "dept_id")
//    private Department department1;
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

//    public Department getDepartment() {
//        return department;
//    }
//
//    public void setDepartment(Department department) {
//        this.department = department;
//    }


//    @Override
//    public String toString() {
//        return "MultiFK{" +
//                "emp_id=" + emp_id +
//                ", username='" + username + '\'' +
//                ", department=" + department +
//                '}';
//    }
}
