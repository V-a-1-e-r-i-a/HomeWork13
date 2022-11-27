 public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Лев", "Толстой");
        Author author2 = new Author("Михаил", "Булгаков");
        Book book1 = new Book("Война и мир", author1, 1867);
        Book book2 = new Book("Мастер и Маргарита", author2, 1967);
        book2.setPublicationYear(2019);
        System.out.println(author1 + "; " + book1);
        System.out.println(author2 + "; " + book2);

        System.out.println(author1.equals(author2));
        System.out.println(author1.hashCode());
    }
}