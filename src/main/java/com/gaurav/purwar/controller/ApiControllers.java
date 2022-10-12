package com.gaurav.purwar.controller;


/*
@RestController
public class ApiControllers {

    @GetMapping(value = "/")
    public String getPage() {
        return "Welcome";
    }
}*/



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiControllers {

    @GetMapping(value = {"/","/home"})
    public String showHomePage() {
        return "{\n" +
                "    \"reference_code\": \"drQU19xpfz\",\n" +
                "    \"account_id\": \"13\",\n" +
                "    \"mobile_no\": \"067354534\"\n" +
                "}";// jsp page name
    }
}

