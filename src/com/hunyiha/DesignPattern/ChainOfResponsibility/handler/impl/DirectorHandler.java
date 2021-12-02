package com.hunyiha.DesignPattern.ChainOfResponsibility.handler.impl;

import com.hunyiha.DesignPattern.ChainOfResponsibility.handler.Handler;
import com.hunyiha.DesignPattern.ChainOfResponsibility.request.Request;

import java.math.BigDecimal;

public class DirectorHandler implements Handler {
    @Override
    public Boolean process(Request request) {
        if(request.getAmount().compareTo(BigDecimal.valueOf(10000)) > 0){
            return null;
        }
        System.out.println("Director处理了10000以下的报销");
        return true;
    }
}
