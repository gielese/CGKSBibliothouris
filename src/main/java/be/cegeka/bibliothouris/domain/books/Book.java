package be.cegeka.bibliothouris.domain.books;

import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

/**
 * Created by davids on 25/01/2017.
 */
public class Book {

    private final String name;
    private final long ISBN;

    public Book(String name, long ISBN) {
        this.name = name;
        this.ISBN = ISBN;
    }

    public String getName() {
        return name;
    }

    public long getISBN() {
        return ISBN;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        if (ISBN != book.ISBN) return false;
        return name != null ? name.equals(book.name) : book.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (int) (ISBN ^ (ISBN >>> 32));
        return result;
    }
}
