package com.example.ex7;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GETController {

    @Autowired
    Properties properties;


    @GetMapping("/valores")
    public String propertyGet() {
        return "valor de var1 es: "+ properties.getVar1()+ " valor de my.var2 es: " +properties.getVar2();

    }

    @GetMapping ("/var3")
    public String otherPropGet(){
        return "valor de var3 es: "+properties.getVar3();
    }


}


