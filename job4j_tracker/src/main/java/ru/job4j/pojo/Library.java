package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("To Kill a Mockingbird", 500);
        Book book2 = new Book("1984", 383);
        Book book3 = new Book("The Great Gatsby", 200);
        Book book4 = new Book("Clean code", 1000);
        Book[] books = new Book[4];
        books[0] = book1;
        books[1] = book2;
        books[2] = book3;
        books[3] = book4;
        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            System.out.println(book.getBookName() + " - " + book.getBookpage());
        }
        System.out.println();
        System.out.println("Swap book 0 to 3 : ");
        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;
        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            System.out.println(book.getBookName() + " - " + book.getBookpage());
        }
        System.out.println();
        System.out.println("Shown only book.name = Clean code : ");
        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            if ("Clean code".equals(book.getBookName())) { {
                System.out.println(book.getBookName() + " - " + book.getBookpage());
            }
        }
    }
}
}
