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
        return "Произведение: " + getName() + ", " + getPublicationYear() + " год.";
    }
    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Book name1 = (Book) other;
        return name1.equals(name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, authorName, publicationYear);
    }
}
