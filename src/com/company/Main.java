package com.company;

public class Main {

    private static Object String;

    public static void main(String[] args) {

        String[] names = new String[3];
        names[0] = "Jackie";
        names[1] = "Kianu";
        names[2] = "Statham";


        for (int i = 0; i < 3; i++) {

        switch (i) {
            case 0:
                System.out.println("Доброе утро!" + names[0]);
                break;
            case 1:
                System.out.println("Добрый день!" + names[1]);
                break;
            case 2:
                System.out.println("Добрый вечер!" + names[2]);
                break;
        }}

    }

}




