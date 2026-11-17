package prac19.inntask;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        InnDb innDB = new InnDb();
        innDB.addInn("1234567890", "Литвинов Глеб Константинович");
        System.out.println("Введите ФИО");
        String name = scanner.nextLine();
        System.out.println("Введите ИНН");
        String inn = scanner.nextLine();
        try{
            innDB.checkClient(inn, name);
            System.out.println("Покупка успешно совершена");
            System.out.println(innDB.getDb());
        } catch (IligalINNException|BadInnException|BadNameException e) {
            System.out.println("Ошибка " + e.getMessage());
        }
    }
}

