package W6_prototype;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void demo() {
        Book multiGenreBook1 = new Book("title1", "author name", new ArrayList<>(Arrays.asList("fantasy", "romance", "horror")), 2021);

        Book horrorBook = new Book("horrorbook", "author name", "horror", 2023);
        Book romanceBook = new Book("romancebook", "author name", "romance", 2021);
        Book horrorBook2 = new Book("horrorbook", "author name", "horror", 2021);
        Recommendation rec = new Recommendation("horror fans", new ArrayList<>(Arrays.asList(horrorBook, horrorBook2)));
        System.out.println(rec);

        rec.setTargetAudience("author name fans");
        rec.addBook(romanceBook);
        rec.addBook(multiGenreBook1);
        System.out.println(rec);
    }

    public static void main(String[] args) {
        boolean running = true;
        Scanner sc = new Scanner(System.in);

        new Recommendation("horror fans", new ArrayList<>(Arrays.asList(new Book("horrorbook", "author name", "horror", 2021), new Book("romanceHorrorBook", "author name", "horror", 2021))));

        while (running) {
            System.out.println("Welcome to Prototype demo!");
            System.out.println("[1] See All Books");
            System.out.println("[2] See All Recommendation List");
            System.out.println("[3] Add new book");
            System.out.println("[4] Make new Recommendation List");
            int choice = sc.nextInt();

            switch(choice){
                case 1:
                    Book.getAllBooks().forEach(System.out::println);
                    break;
                default:
                    running = false;
                    break;
            }
        }
    }
}
