package com.webservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;

@RestController
public class ControllerSample {

    @RequestMapping("/Sample")
    public String serverStatusJ(@RequestParam("sample") String sample) throws SQLException {
        return sample;

    }

}

