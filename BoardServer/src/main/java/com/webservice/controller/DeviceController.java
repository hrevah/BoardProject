package com.webservice.controller;

import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.UUID;

@RestController
@RequestMapping("/devices")

public class DeviceController {

    @Autowired
    DevicesRepository deviceRepository;
    Gson gson;

    @RequestMapping(value="/new", method = RequestMethod.POST)
    public Boolean addNewDevice(@RequestBody String json) throws SQLException {
        gson = new Gson();
        Devices d = gson.fromJson(json,Devices.class);
        deviceRepository.save(d);
        return true;

    }

}

