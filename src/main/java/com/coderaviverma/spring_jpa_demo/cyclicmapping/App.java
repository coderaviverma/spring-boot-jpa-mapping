//package com.coderaviverma.spring_jpa_demo.cyclicmapping;
//
//
//import com.coderaviverma.spring_jpa_demo.Department;
//import com.coderaviverma.spring_jpa_demo.MultiFK;
//import com.fasterxml.jackson.annotation.JsonIgnore;
//import com.fasterxml.jackson.annotation.JsonManagedReference;
//import org.hibernate.annotations.LazyCollection;
//import org.hibernate.annotations.LazyCollectionOption;
//import org.hibernate.annotations.NaturalId;
//
//import javax.persistence.*;
//import java.util.ArrayList;
//import java.util.List;
//
//@Entity
//@Table(name = "app")
//public class App {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long emp_id;
//
//    @Column(name = "app_name", length = 60, nullable = false)
//    private String username;
//
//    @Column(name = "password", nullable = false)
//    private String password;
//
//    @OneToOne(mappedBy = "app", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
//    private Obligation obligation;
//
//    @OneToMany(mappedBy = "app", cascade = CascadeType.ALL)
//    @JsonManagedReference("abc")
//    @LazyCollection(LazyCollectionOption.FALSE)
//    private List<User> users = new ArrayList<>();
//
//    public Long getEmp_id() {
//        return emp_id;
//    }
//
//    public void setEmp_id(Long emp_id) {
//        this.emp_id = emp_id;
//    }
//
//    public String getUsername() {
//        return username;
//    }
//
//    public void setUsername(String username) {
//        this.username = username;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    public Obligation getObligation() {
//        return obligation;
//    }
//
//    public void setObligation(Obligation obligation) {
//        this.obligation = obligation;
//    }
//
//    public List<User> getUsers() {
//        return users;
//    }
//
//    public void setUsers(List<User> users) {
//        this.users = users;
//    }
//}
