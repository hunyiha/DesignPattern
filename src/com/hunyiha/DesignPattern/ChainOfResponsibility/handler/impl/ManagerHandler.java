package com.hunyiha.DesignPattern.ChainOfResponsibility.handler.impl;

import com.hunyiha.DesignPattern.ChainOfResponsibility.handler.Handler;
import com.hunyiha.DesignPattern.ChainOfResponsibility.request.Request;

import java.math.BigDecimal;

public class ManagerHandler implements Handler {
    @Override
    public Boolean process(Request request) {
        if(request.getAmount().compareTo(BigDecimal.valueOf(1000)) > 0){
            return null;
        }
        System.out.println("manager处理了1000元以下的报销");
        return true;
    }
}
