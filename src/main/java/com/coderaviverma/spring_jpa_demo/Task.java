package com.coderaviverma.spring_jpa_demo;

import org.hibernate.annotations.NaturalId;

import javax.persistence.*;

@Entity
@Table(name="task_table")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long task_id;

    @Column(name="task",length=60,nullable=false)
    private String task;

    @OneToOne(fetch = FetchType.LAZY,optional = true)
    @JoinColumn(name = "dept_id")
    private Department department;

    public Long getTask_id() {
        return task_id;
    }

    public void setTask_id(Long task_id) {
        this.task_id = task_id;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
