class LibraryBooks {
    public static void main(String[] args) {
        Book[] books = { new Book("T1", "A1", "I1"), new Book("T2", "A2", "I2") };
        for (Book b : books) System.out.println(b.title);
    }
}
