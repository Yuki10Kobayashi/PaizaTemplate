package com.sample;

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Sample {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        for (int i = 0; i < N; i++) {
            String readLine = br.readLine();
            readLine = readLine.trim();
            String[] readLineArray = readLine.split(",");
            System.out.println("hello = " + readLineArray[0] + " , world = " + readLineArray[1]);
        }
    }
}