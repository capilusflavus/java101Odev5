package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       int r , a;
       double pi=3.14, toplam;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dairenin Yarı Çapını Giriniz : ");
        r=scanner.nextInt();
        System.out.print("Dairenin  Merkez Açısını giriniz : ");
        a=scanner.nextInt();
        toplam = (pi*(r*r)*a)/360;
        System.out.println("Daire Dilim Alanı = "+ toplam);



    }
}
