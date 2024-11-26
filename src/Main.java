import javax.lang.model.SourceVersion;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        // Heading
        System.out.println();
        System.out.println();
        System.out.println("<<<<  Homework 12 (Classes and Methods) >>>>");
        System.out.println();


        int taskN = 0;

        // Task 1

        taskN += 1;
        printTaskHeading(taskN);
        int year = 2021;
        if (year <= 1584) {
            System.out.println("В это время ещё не определяли, является ли год високосным. ");
        } else if (isYearLeap(year)) {
            System.out.println(year + " - високосный год.");
        } else {
            System.out.println(year + " - не високосный год.");
        }
        printSeparator();


        // Task 2

        taskN += 1;
        printTaskHeading(taskN);
        int clientOS = 0;
        int clientDeviceYear = 2024;
        checkDevice(clientOS, clientDeviceYear);
        printSeparator();

        // Task 3

        taskN += 1;
        printTaskHeading(taskN);
        int deliveryDistance = 95;
        checkDistance(deliveryDistance);
        printSeparator();
    }

    public static void printSeparator() {
        System.out.println();
        System.out.println("-----------");
        System.out.println();
//        System.out.println("+++++++++++");
    }

    public static void printTaskHeading(int taskNumber) {
        System.out.println("Task " + taskNumber + ".");
        System.out.println("=======");
        System.out.println();
//        System.out.println("-> " + issueCount);
    }

    public static boolean isYearLeap(int year) {
        boolean leap = false;
        if (year % 400 == 0) {
            leap = true;
        } else if (year % 100 == 0) {
            leap = false;
        } else if (year % 4 == 0) {
            leap = true;
        }
        return leap;
    }
    public static void checkDevice(int clientOS, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        if (clientOS == 0 && clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear >= currentYear) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear >= currentYear) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static void checkDistance(int deliveryDistance) {
        if (deliveryDistance > 100) {
            System.out.println("Свыше 100 км доставка не осуществляется.");
        } else if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: 1");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней: 2");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: 3");
        }
    }
}

