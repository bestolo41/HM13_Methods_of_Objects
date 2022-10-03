import java.time.LocalDate;

public class Book {
    private String name;
    private Author author;
    private int yearPublishing;

    public Book(String name, Author author, int yearPublishing) {
        this.name = name;
        this.author = author;
        this.yearPublishing = yearPublishing;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public int getYearPublishing() {
        return yearPublishing;
    }

    public void setYearPublishing(int yearPublishing) {
        if (yearPublishing > 1950 && yearPublishing <= LocalDate.now().getYear()) {
            this.yearPublishing = yearPublishing;
        } else {
            System.out.println("Некорректный год публикации");
        }
    }

    @Override
    public String toString() {
        return "Book: " + getName() + " by " + getAuthor() + ": " + getYearPublishing();
    }

    @Override
    public boolean equals(Object obj) {
        if (this.hashCode() != obj.hashCode() || obj == null || getClass() != obj.getClass()) return false;
        if (this == obj) return true;

        Book otherBook = (Book) obj;
        if (this.name.equals(otherBook.name) && this.yearPublishing == otherBook.yearPublishing) {
            return this.author.equals(otherBook.author);
        } else return false;
    }

    @Override
    public int hashCode() {
        return name.hashCode() + author.hashCode() + yearPublishing;
    }
}
