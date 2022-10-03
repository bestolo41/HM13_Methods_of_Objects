public class Main {

    public static void main(String[] args) {

//        Author author1 = new Author("Лев", "Толстой");
//        Author author2 = new Author("Лев", "Толстой");
//        Book book1 = new Book("Война и мир", author1, 1988);
//        Book book2 = new Book("Война и мир", author2, 1987);
//        Author author3 = new Author("Александр", "Пушкин");
//        Book book3 = new Book("Капитанская дочка", author3, 2001);
//        Author author4 = new Author("Стивен", "Кинг");
//        Book book4 = new Book("Сияние", author4, 2011);
//        Author author5 = new Author("Джером", "Сэлинджер");
//        Book book5 = new Book("Над пропастью во ржи", author5, 2008);
//
//        Library russianLiterature = new Library(10);
//
//        russianLiterature.addNewBook(book1);
//        russianLiterature.addNewBook(book2);
//        russianLiterature.addNewBook(book3);
//
////        System.out.println("\nРусская литература:\n");
////        russianLiterature.printBooks();
//
//        Library foreignLiterature = new Library(10);
//
//        foreignLiterature.addNewBook(book4);
//        foreignLiterature.addNewBook(book5);
//
////        System.out.println("\nЗарубежная литература:\n");
////        foreignLiterature.printBooks();
//
//        String searchName = "отцы и де";
////        russianLiterature.printInformation(searchName);
//
//        searchName = "над пропастью во ржи";
//        int newYearPublishing = 2000;
//
//        foreignLiterature.changeYearPublishing(searchName, newYearPublishing);
////        foreignLiterature.printInformation(searchName);
//
////        System.out.println(book1.toString());
////        System.out.println(author1.equals(author2));
//        System.out.println(book1.equals(book2));
        System.out.println("Authors:");
        Author stephenKing = new Author("Stephen", "King");
        Author stephenKing2 = new Author("Stephen", "King");
        Author levTolstoy = new Author("Lev", "Tolstoy");
        System.out.println("Author copies equal: " + stephenKing.equals(stephenKing2));
        System.out.println("Author copies equal by hashCode: " + (stephenKing.hashCode() == stephenKing2.hashCode()));
        System.out.println("Authors equal: " + stephenKing.equals(levTolstoy));
        System.out.println("Authors equal by hashCode: " + (stephenKing.hashCode() == levTolstoy.hashCode()));

        System.out.println(stephenKing);
        System.out.println(levTolstoy);

        System.out.println("==============================");

        System.out.println("Books:");
        Book theStand = new Book("The Stand", stephenKing, 1976);
        Book theStand2 = new Book("The Stand", stephenKing, 1976);
        Book warAndPeace = new Book("War and Peace", levTolstoy, 1869);
        System.out.println("Book copies equal: " + theStand.equals(theStand2));
        System.out.println("Book copies equal by hashCode: " + (theStand.hashCode() == theStand2.hashCode()));
        System.out.println("Books equal: " + theStand.equals(warAndPeace));
        System.out.println("Books equal by hashCode: " + (theStand.hashCode() == warAndPeace.hashCode()));
        System.out.println(theStand);
        System.out.println(warAndPeace);

        System.out.println("==============================");

        Library library = new Library(2);
        library.addBook(theStand);
        library.addBook(warAndPeace);
        System.out.println(library);

    }
}