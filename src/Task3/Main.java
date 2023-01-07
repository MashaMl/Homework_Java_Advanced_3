package Task3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) {
        String str = "Розбити цей рядок на 2 підрядки рівної довжині та вивести на екран кожну речення з нового рядка.";
        int half = str.length()/2;
        String str1 = str.substring(0, half);
        String str2 = str.substring(half);
        System.out.println(str1);
        System.out.println(str2);

    }
}
