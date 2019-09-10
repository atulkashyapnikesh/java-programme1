package com.atul;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n;
    long l, w, h;
    Scanner sc = new Scanner(System.in);
        l = sc.nextLong();

                n = sc.nextInt();
                for (int i = 1; i <= n; i++) {

                w = sc.nextLong();
                h = sc.nextLong();
                if ((w < l) || (h < l)) {
        System.out.println("UPLOAD ANOTHER");
        } else if ((w == l) && (h == l)) {
        System.out.println("ACCEPTED");
        } else {
        System.out.println("CROP IT");
        }
        }


        }
        }