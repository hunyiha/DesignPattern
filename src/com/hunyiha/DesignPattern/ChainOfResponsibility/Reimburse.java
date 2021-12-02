package com.hunyiha.DesignPattern.ChainOfResponsibility;

import com.hunyiha.DesignPattern.ChainOfResponsibility.chain.HandlerChain;
import com.hunyiha.DesignPattern.ChainOfResponsibility.handler.impl.CEOHandler;
import com.hunyiha.DesignPattern.ChainOfResponsibility.handler.impl.DirectorHandler;
import com.hunyiha.DesignPattern.ChainOfResponsibility.handler.impl.ManagerHandler;
import com.hunyiha.DesignPattern.ChainOfResponsibility.request.Request;

import java.math.BigDecimal;

public class Reimburse {
    public static void main(String[] args) {
        Request request = new Request("zhangsan", BigDecimal.valueOf(1500));
        HandlerChain handlerChain = new HandlerChain();
        handlerChain.addHandler(new ManagerHandler());
        handlerChain.addHandler(new CEOHandler());
        handlerChain.addHandler(new DirectorHandler());

        handlerChain.process(request);
    }
}
