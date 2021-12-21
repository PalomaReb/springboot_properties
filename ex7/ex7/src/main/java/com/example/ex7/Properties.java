package com.example.ex7;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties()

public class Properties {

    @Value("${Var1: no tiene valor}")
    private String Var1;

    @Value("${Var2: 0}")
    private int Var2;

    @Value("${Var3: no tiene valor}")
    private String Var3;

    public String getVar1() {
        return Var1;
    }

    public int getVar2() {
        return Var2;
    }

    public String getVar3() {
        return Var3;
    }

    public void setVar1(String var1) {
        Var1 = var1;
    }

    public void setVar2(int var2) {
        Var2 = var2;
    }

    public void setVar3(String var3) {
        Var3 = var3;
    }
}
