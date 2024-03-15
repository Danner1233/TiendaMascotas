package com.generics20902081;

import java.util.HashMap;
import java.util.Map;

import entities.Canario;
import entities.Gato;
import entities.Jaula;
import entities.Perro;


public class PetStore {

    public static void main(String[] args) {
        
        Map<String , Jaula<?>> PetStore = new HashMap<String , Jaula<?>>();

        PetStore.put("J1", new Jaula<>(new Perro("canino"), new Gato("felino") ));
        PetStore.put("J2", new Jaula<>(new Canario("Ave"), new Canario("Ave") ));

        for (Map.Entry<String , Jaula<?>> m : PetStore.entrySet()) {

            System.out.println("Identificador: " + m.getKey());
            System.out.println("Jaula");
            System.out.println("Tipo mascota 1 " + m.getValue().getPet1().getType());
            System.out.println("----------------------------------------------");
            
        }

        for (Map.Entry<String , Jaula<?>> m : PetStore.entrySet()) {

            System.out.println("Identificador: " + m.getKey());
            System.out.println("Jaula");
            System.out.println("Tipo mascota 1 " + m.getValue().getPet2().getType());
            System.out.println("----------------------------------------------");
            
        }

    }

    
}
