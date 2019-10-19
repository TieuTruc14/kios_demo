package com.isofh.bvp.dashboard.web;

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
//    @Autowired
//    RootRepository repository;
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
        return "map";
    }

    @GetMapping("/checkup")
    public String checkup() {
        return "checkup";
    }

    @GetMapping("/search/service")
    public String searchService() {
        return "search/service";
    }
    @GetMapping("/search/result")
    public String searchResult() {
        return "search/service";
    }

    @GetMapping("/survey")
    public String survey() {
        return "survey";
    }

}
