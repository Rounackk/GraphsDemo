package com.cg.pacs.pacsDemo.service;

import com.cg.pacs.pacsDemo.model.Report;
import com.cg.pacs.pacsDemo.repository.ReportRepository;
import com.cg.pacs.pacsDemo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReportServiceImpl implements ReportService {

    @Autowired
    private ReportRepository reportRepository;

    @Autowired
    private UserRepository userRepository;

    @Override
    public Report addReport(Report report){
        /*Report report1 = new Report();
        report1.setDays(report.getDays());
        report1.setTimeTaken(report.getTimeTaken());
        report1.setTopicsCovered(report.getTopicsCovered());*/
       // report1.setRollNo_fk(report.getRollNo_fk());
        Report savedReport = reportRepository.save(report);
        return savedReport;
    }

    @Override
    public List<Report> viewByRollNo(Integer rollNo) throws Exception {
        List<Report> reportList = reportRepository.viewByRollNo(rollNo);
        if(reportList.isEmpty())
            throw new Exception("No report found");
        return reportList;
    }

    @Override
    public List<Report> viewByRollNoAndDay(Integer rollNo, String days) throws Exception {
        List<Report> reportList = reportRepository.viewByRollNoAndDay(rollNo, days);
        if(reportList.isEmpty())
            throw new Exception("No report found");
        return reportList;
    }
}
