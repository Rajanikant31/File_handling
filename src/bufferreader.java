package com.company;

import java.io.*;
public class bufferreader
{
    public static void main(String[] args)throws Exception
    {
        File file = new File("C:\\Users\\Rajanikant\\Documents\\3 sept 2021.txt");

        BufferedReader br = new BufferedReader(new FileReader(file));

        String st;
        while ((st = br.readLine()) != null)
            System.out.println(st);
    }
}