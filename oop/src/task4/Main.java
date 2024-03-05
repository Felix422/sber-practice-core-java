package task4;

public class Main {
    public static void main(String[] args){
        Author a1 = new Author("Анна Ахматова","F","Akhmatova@yandex.ru");
        Book b1 = new Book("Собрание сочинений", a1);

        System.out.println("Книга 1:");
        b1.tooString();

        Author a2 = new Author("test","test","test");
        Book b2 = new Book("Test", a2);

        a2.setName("William Shakespeare");
        a2.setSex("M");
        a2.setEmail("Shakespeare@gmail.com");
        b2.setName("Comedies & Tragedies");
        b2.setAuthor(a2);


        System.out.println("\nКнига 2:");
        b2.tooString();

        a1.setName(a2.getName());
        a1.setSex(a2.getSex());
        a1.setEmail(a2.getEmail());
        b1.setName(b2.getName());
        b1.setAuthor(b2.getAuthor());

        System.out.println("\nКнига 1 после замены:");
        b1.tooString();
    }
}
