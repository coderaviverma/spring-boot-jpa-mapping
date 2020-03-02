package com.coderaviverma.spring_jpa_demo;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Entity
@Table(name = "department")
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long dept_id;


    @Column(name="dept_name",length=100,nullable=false)
    private String deptName;

//    @OneToMany(mappedBy = "department",cascade = CascadeType.ALL)
//    @LazyCollection(LazyCollectionOption.FALSE)
//    private List<Employee> employees=new ArrayList<>();

//    @OneToMany(mappedBy = "department",cascade = CascadeType.ALL)
//    @JsonManagedReference("abc")
//    @LazyCollection(LazyCollectionOption.FALSE)
//    private List<MultiFK2> multiFKS=new ArrayList<>();

//    @JsonIgnore
//    @OneToOne(mappedBy = "department",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
//    private Task task;

//    @JsonIgnore
//    @OneToOne(mappedBy = "department",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
//    @JsonIgnore
//    private MultiFK multiFK;

//    public Task getTask() {
//        return task;
//    }
//
//    public void setTask(Task task) {
//        this.task = task;
//    }

//    public Long getDept_id() {
//        return dept_id;
//    }
//
//    public void setDept_id(Long dept_id) {
//        this.dept_id = dept_id;
//    }
//
//    public String getDeptName() {
//        return deptName;
//    }
//
//    public void setDeptName(String deptName) {
//        this.deptName = deptName;
//    }
//
////    public List<Employee> getEmployees() {
////        return employees;
////    }
////
////    public void setEmployees(List<Employee> employees) {
////        this.employees = employees;
////    }
//
////    public List<MultiFK2> getMultiFKS() {
////        return multiFKS;
////    }
//
////    public void setMultiFKS(List<MultiFK2> multiFKS) {
////        if (multiFKS==null){
////            if (this.multiFKS!=null){
////                for (int i = 0; i < this.multiFKS.size(); i++) {
////                    this.multiFKS.get(i).setDepartment(null);
////                }
////            }
////        }else {
////            for (int i = 0; i < multiFKS.size(); i++) {
////                multiFKS.get(i).setDepartment(this);
////            }
////        }
////        this.multiFKS = multiFKS;
////    }
//
////    public synchronized void setMultiFKS(List<MultiFK2> multiFKS) {
////        if (multiFKS!=null)
////        for (MultiFK2 multiFK2 :multiFKS){
////            multiFK2.setDepartment(this);
////        }
////        this.multiFKS = multiFKS;
////    }
//
//
//    public MultiFK getMultiFK() {
//        return multiFK;
//    }
//
//    @JsonIgnore
//    public synchronized void setMultiFK(MultiFK multiFK) {
//        if (multiFK == null) {
//            if (this.multiFK != null) {
//                this.multiFK.setDepartment(null);
//            }
//        }
//        else {
//            multiFK.setDepartment(this);
//        }
//        this.multiFK = multiFK;
//    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Department{");
        sb.append("dept_id=").append(dept_id);
        sb.append(", deptName='").append(deptName).append('\'');
//        sb.append(", multiFKS=").append(multiFKS);
        sb.append('}');
        return sb.toString();
    }
}
