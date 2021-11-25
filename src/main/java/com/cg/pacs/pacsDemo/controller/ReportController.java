package com.cg.pacs.pacsDemo.controller;

import com.cg.pacs.pacsDemo.model.Report;
import com.cg.pacs.pacsDemo.service.ReportService;
import com.cg.pacs.pacsDemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ReportController {

    @Autowired
    private ReportService reportService;

    @PostMapping("/createreport")
    public Report createReport(@RequestBody Report report){
        Report createdReport = reportService.addReport(report);
        return createdReport;
    }

    @GetMapping("/viewreport/{rollNo}")
    public List<Report> viewByRollNo(@PathVariable("rollNo") Integer rollNo) throws Exception {
        return reportService.viewByRollNo(rollNo);
    }

    @GetMapping("/viewreport/{rollNo}/{days}")
    public List<Report> viewByRollNoAndDay(@PathVariable("rollNo") Integer rollNo, @PathVariable("days") String days) throws Exception {
        return reportService.viewByRollNoAndDay(rollNo, days);
    }

}
