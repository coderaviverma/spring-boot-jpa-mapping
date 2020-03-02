//package com.coderaviverma.spring_jpa_demo.cyclicmapping;
//
//
//import org.hibernate.annotations.NaturalId;
//
//import javax.persistence.*;
//
//@Entity
//@Table(name="obligation")
//public class Obligation {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    @Column(name="user_name",length=60,nullable=false)
//    private String username;
//
//
//    @OneToOne(fetch = FetchType.LAZY,optional = true)
//    @JoinColumn(name = "cuid")
//    private User user;
//
//    @OneToOne(fetch = FetchType.LAZY,optional = true)
//    @JoinColumn(name = "appid")
//    private App app;
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
//    public User getUser() {
//        return user;
//    }
//
//    public void setUser(User user) {
//        this.user = user;
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
