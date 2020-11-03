package com.example.demo.util;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class Passgenerator {

    public static void main(String ...args) {
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder(4);
        //El String que mandamos al metodo encode es el password que queremos encriptar.
	System.out.println(bCryptPasswordEncoder.encode("1234567"));
    }
    
    public static String codificar(String pass){
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder(4);

    	return bCryptPasswordEncoder.encode(pass);
    }
}