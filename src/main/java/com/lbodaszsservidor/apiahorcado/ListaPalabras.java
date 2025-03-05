package com.lbodaszsservidor.apiahorcado;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ListaPalabras {

    private List<String> listaPalabras = List.of(
            "Pingüino",
            "Patata",
            "especialización",
            "marketing",
            "informática",
            "vergüenza",
            "mañana"
    );

    private static ListaPalabras instance;
    public static ListaPalabras getInstance() {
        if (instance == null) {
            instance = new ListaPalabras();
        }
        return instance;
    }
    public String getNumeroRandom(){
        int index = new Random().nextInt(listaPalabras.size());
        return listaPalabras.get(index);
    }
}
