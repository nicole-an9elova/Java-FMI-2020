package com.jetbrains;

import com.jetbrains.Computer;

public class Main {

    public static void main(String[] args) {
        Computer c1 = new Computer();
        Computer c2 = new Computer("Acer", 900,
                new String[]{"1.png", "2.png"});
        Computer copyC = new Computer("Lenovo", 1100,
                new String[]{"A.pdf", "B.pdf"});
        Computer c3 = new Computer(copyC);

        //System.out.print(c1);
//        System.out.print(c2);
        System.out.print(c3);

        c1.setType("Apple");
        c1.setFiles(new String[]{"1.swift", "2.swift", "3.swift"});

        c2.setProcSpeed(2500);
        c3.setFiles(new String[]{"newFiles.jpg", "blab.jpg"});

       // System.out.print(c1);
       // System.out.print(c2);
//        System.out.print(c3);
    }
}
