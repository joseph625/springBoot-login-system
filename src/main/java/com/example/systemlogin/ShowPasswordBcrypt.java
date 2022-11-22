package com.example.systemlogin;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class ShowPasswordBcrypt {
    public static void main(String args[]){

        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String encodedPassword = encoder.encode("1");
        System.out.println(encodedPassword);
        //$2a$10$neDySE3fYiTLBT/7XuLdgeEv8cvrZafQmzf2QoKKBq9IxbJxF/Oeq
    }
}
