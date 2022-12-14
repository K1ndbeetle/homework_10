import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //task №1
        System.out.println("Задача №1");
        int year = LocalDate.now().getYear();
        yearCheck (year);
        System.out.println();

        //task №2
        System.out.println("Задача №2");
        int clientOS = 0;
        int clientDeviceYear = 2015;
        checkOS (clientOS, clientDeviceYear);
        System.out.println();

        //task №3
        System.out.println("Задача №3");
        int deliveryDistance = 95;
        distanceCalculation (deliveryDistance);
        System.out.println();
    }

    //task №1
    public static void yearCheck (int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    //task №2
    public static void checkOS (int clientOS, int clientDeviceYear) {
         if (clientOS == 0 && clientDeviceYear >= 2015) {
             System.out.println("Установите версию приложения для iOS по ссылке");
         } else if (clientOS == 0 && clientDeviceYear < 2015) {
             System.out.println("Установите облегченную версию приложения для iOS по ссылке");
         }
         if (clientOS == 1 && clientDeviceYear >= 2015) {
             System.out.println("Установите версию приложения для Android по ссылке");
         } else if (clientOS == 1 && clientDeviceYear < 2015) {
             System.out.println("Установите облегченную версию приложения для Android по ссылке");
         }
         if (clientOS < 0 || clientOS > 2) {
             System.out.println("У вас неизвестная версия ОС");
         }
    }

    //task №3
    public static void distanceCalculation (int deliveryDistance) {
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: 1");
        }
        if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("Потребуется дней: 2");
        }
        if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: 3");
        }
    }
}