package sk.kosickaakademia.lenart.homework;

import java.io.IOException;

public class Main {
    public static void main(String[] args)  {
        Repair read = new Repair();
        read.repairTextFile("resource/git.txt");
    }
}
