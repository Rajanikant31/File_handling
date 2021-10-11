package com.company;
import java.io.File;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args) throws Exception
    {

        File file = new File("C:\\Users\\Rajanikant\\Documents\\3 sept 2021.txt");
        Scanner sc = new Scanner(file);

        while (sc.hasNextLine())
            System.out.println(sc.nextLine());
    }
}