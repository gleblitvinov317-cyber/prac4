package prac21.task4;

import java.io.File;
import java.util.Scanner;

public class CatalogRider {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите путь к файлу");
        String path = sc.nextLine().trim();
        File file = new File(path);
        File[] files = file.listFiles();
        if (files == null){
            throw new IllegalArgumentException("Путь к файлу указан неверно.");
        }
        String[] names = new String[files.length];
        for (int i = 0; i < files.length; i++){
            names[i] = files[i].getName();
        }
        for (int i = 0; i < names.length && i < 5; i++){
            System.out.print(names[i] + " ");
        }
    }
}
