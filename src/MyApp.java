
public class MyApp {
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
        Author author01 = new Author("Николай", "Кривошеев");
        Author author02 = new Author("Виктор", "Пылин");
        Book book01 = new Book("Первая книга", author01, 2020);
        Book book02 = new Book("Вторая книга", author02, 2022);

        System.out.println("Книга 01");
        System.out.println("Название: " + book01.getTitle());
        System.out.println ("Автор: " + book01.getAuthor().getFirstName() + " " + book01.getAuthor().getLastName());
        System.out.println ("Год издания: " + book01.getYearOfPublication());

        printSeparator();
        System.out.println("Книга 02");
        System.out.println("Название: " + book02.getTitle());
        System.out.println ("Автор: " + book02.getAuthor().getFirstName() + " " + book02.getAuthor().getLastName());
        System.out.println ("Год издания: " + book02.getYearOfPublication());

        printSeparator();

        book02.setYearOfPublication(2021);
        System.out.println("Год издания книги 02 (исправленный): " + book02.getYearOfPublication());

/*
        // Task 2

        taskN += 1;
        printTaskHeading(taskN);

        printSeparator();

        // Task 3

        taskN += 1;
        printTaskHeading(taskN);

        printSeparator();
*/
    }


    public static void printSeparator() {
        System.out.println();
        System.out.println("-----------");
        System.out.println();
    }

    public static void printTaskHeading(int taskNumber) {
        System.out.println("Task " + taskNumber + ".");
        System.out.println("=======");
        System.out.println();
    }
}

