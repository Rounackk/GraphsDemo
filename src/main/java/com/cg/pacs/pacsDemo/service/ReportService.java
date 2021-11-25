package com.cg.pacs.pacsDemo.service;

import com.cg.pacs.pacsDemo.model.Report;

import java.util.List;

public interface ReportService {
    public Report addReport(Report report);

    List<Report> viewByRollNo(Integer rollNo) throws Exception;

    List<Report> viewByRollNoAndDay(Integer rollNo, String days) throws Exception;
}
