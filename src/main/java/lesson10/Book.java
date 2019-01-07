package lesson10;

import java.util.Objects;

public class Book {
    private Integer pages;
    private String bookName;
    private String authorName;
    private String authorsurName;
    private String authorDadName;
public Book(){}

    public Book(Integer pages, String bookName, String authorName, String authorsurName, String authorDadName) {
        this.pages = pages;
        this.bookName = bookName;
        this.authorName = authorName;
        this.authorsurName = authorsurName;
        this.authorDadName = authorDadName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(pages, book.pages) &&
                Objects.equals(bookName, book.bookName) &&
                Objects.equals(authorName, book.authorName) &&
                Objects.equals(authorsurName, book.authorsurName) &&
                Objects.equals(authorDadName, book.authorDadName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pages, bookName, authorName, authorsurName, authorDadName);
    }

    @Override
    public String toString() {
        return "Book{" +
                "pages=" + pages +
                ", bookName='" + bookName + '\'' +
                ", authorName='" + authorName + '\'' +
                ", authorsurName='" + authorsurName + '\'' +
                ", authorDadName='" + authorDadName + '\'' +
                '}';
    }



    public String getBookName() {
        return bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getAuthorsurName() {
        return authorsurName;
    }

    public String getAuthorDadName() {
        return authorDadName;
    }
}
