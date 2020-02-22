package com.coderaviverma.spring_jpa_demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DemoRepository extends JpaRepository<Department,Long> {




}
