package com.lbodaszsservidor.apiahorcado;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

import java.security.SecureRandom;
import java.util.*;


@org.springframework.web.bind.annotation.RestController
public class RestController {

    @GetMapping("/palabra-random")
    public Palabra returnList (){
        return new Palabra(ListaPalabras.getInstance().getNumeroRandom());

    }
}
