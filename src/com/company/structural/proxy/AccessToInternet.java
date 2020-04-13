package com.company.structural.proxy;

public class AccessToInternet implements Internet{ //RealSubject

    @Override
    public void connectTo(String url) throws Exception {

        System.out.println("Conectando a: " + url);
    }


}
