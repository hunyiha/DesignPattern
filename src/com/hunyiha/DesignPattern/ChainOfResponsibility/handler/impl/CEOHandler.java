package com.hunyiha.DesignPattern.ChainOfResponsibility.handler.impl;

import com.hunyiha.DesignPattern.ChainOfResponsibility.handler.Handler;
import com.hunyiha.DesignPattern.ChainOfResponsibility.request.Request;

public class CEOHandler implements Handler {
    @Override
    public Boolean process(Request request) {
        System.out.println("CEO处理了任意额度的报销");
        return true;
    }
}
