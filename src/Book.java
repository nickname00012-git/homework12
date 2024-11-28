public class Book {
    private String title;
    private Author author;
    private int yearOfPublication;

    public Book(String title, Author author, int yearOfPublication) {
        this.title = title;
        this.yearOfPublication = yearOfPublication;
        this.author = author;
    }

    public String getTitle() {
        return this.title;
    }

    public int getYearOfPublication() {
        return this.yearOfPublication;
    }

    public Author getAuthor() {
        return this.author;
    }

    public void setYearOfPublication(int year) {
        this.yearOfPublication = year;
    }
}
