package com.company.structural.flyweight;

import java.util.HashMap;

public class EnemyFactory { //FyweigthFactory

    private static HashMap<String, Enemy> enemigos = new HashMap<>();

    public static Enemy getEnemy(String type) {

        Enemy enemy = null;
        if (enemigos.containsKey(type)) {
            enemy =enemigos.get(type);
        } else {
            switch (type) {
                case "Private":
                    System.out.println("--------------------------------------------");
                    System.out.println("****  Soldado ha sido creado  ****");
                    System.out.println("--------------------------------------------");
                    enemy = new Private();
                    break;
                case "Detective":
                    System.out.println("--------------------------------------------");
                    System.out.println("****  Detective ha sido creado  ****");
                    System.out.println("--------------------------------------------");
                    enemy = new Detective();
                    break;
                default:
                    System.out.println("No se ha creado enemigo");
            }
            enemigos.put(type, enemy);
        }
        return enemy;
    }
}
