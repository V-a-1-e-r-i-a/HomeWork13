import java.util.Objects;

public class Book {
    private String name;
    private Author authorName;
    int publicationYear;
    public Book (String name, Author authorName, int publicationYear){
        this.name = name;
        this.authorName = authorName;
        this.publicationYear = publicationYear;
    }
    public String getName(){
        return name;
   }
    public Author getAuthorName(){
        return authorName;
   }
   public int getPublicationYear(){
      return publicationYear;
   }
    public void setPublicationYear(int publicationYear){
        this.publicationYear = publicationYear;
    }

    @Override
    public String toString() {
        return "Произведение: " + name + ", " + publicationYear + " год.";
    }
    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Book book1 = (Book) o;
        return publicationYear == book1.publicationYear && Objects.equals(name,book1.name) && Objects.equals(authorName, book1.authorName);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, authorName, publicationYear);
    }
}
