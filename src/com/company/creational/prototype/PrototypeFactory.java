package com.company.creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class PrototypeFactory {  //Cliente

    private static Map<String, PrototypeCard> prototypes = new HashMap<>();

    public static PrototypeCard getInstance(final String tipo) throws CloneNotSupportedException {

        return prototypes.get(tipo).clone();
    }

    public static class CarType {

        public static final String VISA = "visa";
        public static final String AMEX = "amex";
    }

    public static void loadCard(){

        Visa visa = new Visa();
        visa.setName("Esta tarjeta es Visa con número 0000");
        prototypes.put(CarType.VISA,visa);

        Amex amex = new Amex();
        amex.setName("Esta tarjeta es Amex con número 0000");
        prototypes.put(CarType.AMEX,amex);
    }

}

