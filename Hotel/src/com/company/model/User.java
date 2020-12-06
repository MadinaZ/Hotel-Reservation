package com.company.model;

import com.company.view.View3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class User {
//    private String name;
//    private String username;
//    private String password;
//    private int reservationNumber;

    public User() {
    }
//    private int accountNumber;
//
//    public User(String name, String username, String password, int reservationNumber, int accountNumber) {
//        this.name = name;
//        this.username = username;
//        this.password = password;
//        this.reservationNumber = reservationNumber;
//        this.accountNumber = accountNumber;
//    }

//    public int getReservationNumber() { return reservationNumber; }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public String getUsername() {
//        return username;
//    }
//
//    public int getAccountNumber() { return accountNumber; }

    public void saveUser(View3 view3) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("UserDatabase.txt"));
        bw.write(view3.getSignUpName());
        bw.newLine();
        bw.write(view3.getSignUpUsername());
        bw.newLine();
        bw.write(view3.getSignUpPassword());
        bw.newLine();
        bw.close();
    }
}
