package com.cg.pacs.pacsDemo.repository;

import com.cg.pacs.pacsDemo.model.Report;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReportRepository extends JpaRepository<Report, Integer> {

    @Query("from Report r where r.user = (from User u where u.rollNo = :rollNo)")
    public List<Report> viewByRollNo(@Param("rollNo") Integer rollNo);

    @Query("from Report r where r.user = (from User u where u.rollNo = :rollNo) and r.days = :days")
    public List<Report> viewByRollNoAndDay(@Param("rollNo") Integer rollNo, @Param("days") String days);
}
