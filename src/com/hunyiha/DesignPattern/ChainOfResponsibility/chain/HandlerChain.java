package com.hunyiha.DesignPattern.ChainOfResponsibility.chain;

import com.hunyiha.DesignPattern.ChainOfResponsibility.handler.Handler;
import com.hunyiha.DesignPattern.ChainOfResponsibility.request.Request;

import java.util.ArrayList;
import java.util.List;

public class HandlerChain {

    private List<Handler> handlers = new ArrayList<>();

    public void addHandler(Handler handler){
        this.handlers.add(handler);
    }

    public boolean process(Request request){
        for (Handler handler : handlers) {
            Boolean result = handler.process(request);
            if(result != null){
                System.out.println("报销已经处理完成");
                return result;
            }
        }

        throw new RuntimeException("could not handle request: " + request);
    }
}
