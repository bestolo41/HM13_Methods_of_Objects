public class Author {
    private String name;
    private String surname;

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
    @Override
    public String toString() {
        return "Author: " + getName() + " " + getSurname();
    }

    @Override
    public boolean equals(Object obj) {
        if (this.hashCode() != obj.hashCode()) return false;
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Author otherAuthor = (Author) obj;
        if (this.name.equals(otherAuthor.name)) {
            return this.surname.equals(otherAuthor.surname);
        } else return false;
    }

    @Override
    public int hashCode() {
        return name.hashCode() + surname.hashCode();
    }
}
