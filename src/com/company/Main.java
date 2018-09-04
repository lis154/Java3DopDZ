package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc = new Scanner(new File("1.txt"));
        ArrayList<Integer> array = new ArrayList<Integer>();
        while(sc.hasNext())
        {
            int n = sc.nextInt();
            array.add(n);
        }
       Integer[] mass = mas(array);
        for (int i = 0; i < mass.length; i++) {
            System.out.print(mass[i] + " ");
        }


    }

    public static Integer[] mas (ArrayList<Integer> masIs)
    {
        Integer[] mass = new Integer[20];
        for (int i = 0; i < 20; i++) {
            mass[i] = 0;
        }
        for (Integer n: masIs) {
            mass[n + 1]++;
        }
        return mass;
    }

}
