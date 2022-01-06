package com.company;

public class Main {

    public static void main(String[] args) {
        String myString = "slwllsnaw";
        char x = 's';
        int count = 0;
        for (int i = 0; i < myString.length(); i++) {
            if(x == myString.charAt(i)){
                count++;
            }
        }
        System.out.println(count);
    }
}
