package com.jenny.controller;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HealthController {

    @RequestMapping(value = "/health", method = {RequestMethod.GET})
    @ApiOperation(value = "health", nickname = "health")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "Success", response = String.class),
            @ApiResponse(code = 500, message = "Internal Server Error")})

    public String index() {
        return "OK";
    }
}
