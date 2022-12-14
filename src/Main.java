import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //task №1
        System.out.println("Задача №1");
        int year = LocalDate.now().getYear();
        yearCheck (year);
    }

    //task №1
    public static void yearCheck (int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }
}