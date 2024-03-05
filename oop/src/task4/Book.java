package task4;

public class Book {
    String name;
    Author author;

    public Book(String name, Author author) {
        this.name = name;
        this.author = author;

    }

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public void setAuthor(Author a) {
        author = a;
    }

    public Author getAuthor() {
        return author;
    }

    public void tooString() {
        System.out.println("Название: " + name);
        System.out.println("Автор: " + author.name + ", " + author.sex + ", " + author.email);
    }
}
