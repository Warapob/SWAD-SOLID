package com.solid.book;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        BookReader book1 = new BookReader("Tyland", List.of("I", "moved", "here", "recently", "too"));
        book1.printToScreen();
        BookPublisher book2 = new BookPublisher("Tyland", List.of("I", "moved", "here", "recently", "too"));
        book2.printToFile();
    }

}
