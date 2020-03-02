//package com.coderaviverma.spring_jpa_demo.cyclicmapping;
//
//
//import com.coderaviverma.spring_jpa_demo.Department;
//import org.hibernate.annotations.NaturalId;
//
//import javax.persistence.*;
//
//@Entity
//@Table(name="employee_table")
//public class User {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    @Column(name="user_name",length=60,nullable=false)
//    private String username;
//
//    @Column(name="password",nullable=false)
//    private String password;
//
//    @OneToOne(mappedBy = "app", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
//    private Obligation obligation;
//
//    @ManyToOne(fetch = FetchType.LAZY,optional = true)
//    @JoinColumn(name = "appid")
//    private App app;
//
//    public Obligation getObligation() {
//        return obligation;
//    }
//
//    public void setObligation(Obligation obligation) {
//        this.obligation = obligation;
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
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
//    public App getApp() {
//        return app;
//    }
//
//    public void setApp(App app) {
//        this.app = app;
//    }
//}
