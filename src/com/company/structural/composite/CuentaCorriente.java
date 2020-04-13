package com.company.structural.composite;

public class CuentaCorriente implements CuentaComponent{  //leaf

    private Double amount;
    private String name;

    public CuentaCorriente(Double amount, String name){

        this.amount = amount;
        this.name = name;
    }

    @Override
    public void showAccountName() {

        System.out.println("Cuenta Corriente: " + name);
    }

    @Override
    public Double getAmount() {

        return amount;
    }



}
