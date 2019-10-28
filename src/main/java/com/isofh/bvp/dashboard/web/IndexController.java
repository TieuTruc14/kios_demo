package com.isofh.bvp.dashboard.web;

import com.isofh.bvp.dashboard.common.PagingResult;
import com.isofh.bvp.dashboard.model.*;
import com.opencsv.CSVWriter;
import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;
import org.apache.commons.jexl2.UnifiedJEXL;
import org.apache.commons.lang3.StringUtils;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/")
public class IndexController {
//    @Autowired
//    IndexService service;
    @Autowired
    RootRepository repository;
//    @Autowired
//    IndexRepository indexRepository;

    @GetMapping("/home")
    public String home() {
        return "index";
    }

    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @GetMapping("/map")
    public String map() {
        return "map/map";
    }

    @GetMapping("/checkup")
    public String checkup() {
        return "checkup";
    }

    @GetMapping("/search/service")
    public String searchService() {
        return "search/service";
    }
    //    public ResponseEntity<BieuDo2GiaTri> luotkham(int year, @RequestParam(value = "month", required = false, defaultValue = "0")int month
//            , @RequestParam(value = "week", required = false, defaultValue = "0") int week){
//        try{
//            BieuDo2GiaTri item=service.LuotKhamBenh(year,month,week).orElse(new BieuDo2GiaTri());
//            return new ResponseEntity<BieuDo2GiaTri>(item,HttpStatus.OK);
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//        return new ResponseEntity<BieuDo2GiaTri>(new BieuDo2GiaTri(),HttpStatus.OK);
//    }
//    @GetMapping("/last-update")
//    public ResponseEntity<Date> lastUpdate(){
//        Date date=repository.getLastUpdated();
//        return new ResponseEntity<Date>(date,HttpStatus.OK);
//    }
    @GetMapping("/search/service-list")
    public ResponseEntity<PagingResult> searchServiceList() {
        PagingResult page=new PagingResult();
        page.setPageNumber(1);
        page.setItems(repository.services);
        page.setRowCount(repository.services.size());
        return new ResponseEntity<PagingResult>(page,HttpStatus.OK);
    }

    @GetMapping("/search/result")
    public String searchResult() {
        return "search/service";
    }

    @GetMapping("/survey")
    public String survey() {
        return "survey";
    }

    @GetMapping("/checkup/bhyt")
    public String checkupbhyt() {
        return "bhyt";
    }

    @GetMapping("/checkup/dv")
    public String checkupdv() {
        return "dv";
    }

    @GetMapping("/checkup/tyc")
    public String checkuptyc() {
        return "tyc";
    }

    @GetMapping("/checkup/cc")
    public String checkupcc() {
        return "cc";
    }

    @GetMapping("/checkup/nt")
    public String checkupnt() {
        return "nt";
    }

}
