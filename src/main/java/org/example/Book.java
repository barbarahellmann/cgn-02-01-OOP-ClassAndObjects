package org.example;

public class Book {

    String title;
    int pages;
    String author;
    String coverColor;
    String isbn;


    //Constructor für alle Werte -> AllArgsConstructor
    public Book(String titleA, int pagesA, String authorA, String coverColorA, String isbnA){
        this.title = titleA;
        this.pages = pagesA;
        this.author= authorA;
        this.coverColor = coverColorA;
        this.isbn = isbnA;
    }

    //Default Constructor -> NoArgsConstructor
    public Book(){
    }
}
