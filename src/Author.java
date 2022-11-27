import java.util.Objects;

public class Author {
    private String authorName;
    private String authorSurname;
    public Author (String authorName, String authorSurname){
        this.authorName = authorName;
        this.authorSurname = authorSurname;
    }
    public String getAuthorName(){
        return authorName;
    }
    public String getAuthorSurname(){
        return authorSurname;
    }

    @Override
    public String toString() {
        return "Автор: " + getAuthorName() + " " + getAuthorName();
    }
    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Author authorName1 = (Author) other;
        return authorName1.equals(authorName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorName, authorSurname);
    }
}
