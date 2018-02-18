package com.dw.gps.processor.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class GpsDumpController {
    private static Logger log  = LoggerFactory.getLogger(GpsDumpController.class);

    @RequestMapping(value ="/gps",
            method = RequestMethod.POST,
            consumes = MediaType.ALL_VALUE)
    public @ResponseBody String dump(@RequestBody String payload) {
        log.info(payload);
        return "OK";
    }
}
