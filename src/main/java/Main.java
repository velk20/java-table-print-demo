/*
 * Main.java
 *
 * created at 2024-02-02 by a.mladenov <a.mladenov@seeburger.com>
 *
 * Copyright (c) SEEBURGER AG, Germany. All Rights Reserved.
 */

import pl.mjaron.etudes.Table;
import pl.mjaron.etudes.table.RenderContext;
import pl.mjaron.etudes.table.VerticalAlign;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static pl.mjaron.etudes.table.RenderContext.col;


public class Main
{
    public static void main(String[] args)
    {
        List<Book> books = new ArrayList<>();
        books.add(new Book(UUID.randomUUID().toString(), "Harry dajhsaj jdlkasjdkl jaskldjalskj dlkasj lkdajslk djaskss dsa d asd asd asd a", 500, "Marry"));
        books.add(new Book(UUID.randomUUID().toString(), "Harry1", 50, "Marry1"));
        books.add(new Book(UUID.randomUUID().toString(), "Harry2", 400, "Marry2"));
        books.add(new Book(UUID.randomUUID().toString(), "Harry3", 200, "Marry3"));

        Table.render(books, Book.class)
                .markdown()
                .withColumns(
                        col("bookId","BOOK ID")
                                .col("title","TITLE")
                                .col("pages", "PAGES")
                                .col("author","AUTHOR")
                )
                .withEscaper(null)
                .withAlignedColumnWidths()
                .withLineBreakCRLF()
                .withAlign(VerticalAlign.Left)
                // Where to save the table.
//                .toFile("target/sample.csv")
                // By default, the System.out is used, which can be specified as:
                // .to(System.out)
                .run()
        ;

//        System.out.println("-----------------------------------------------------------------------------");
//        System.out.printf("%-10s %-35s %-10s %-10s", "BOOK ID", "TITLE", "PAGES", "AUTHOR");
//        System.out.println();
//        System.out.println("-----------------------------------------------------------------------------");
//        for(Book book: books){
//            System.out.format("%-10s %-35s %-10d %-10s",
//                              book.getBookId(), book.getTitle(), book.getPages(), book.getAuthor());
//            System.out.println();
//        }
//        System.out.println("-----------------------------------------------------------------------------");
    }
}
