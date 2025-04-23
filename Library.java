package oopsProgramming;

class Library {
    private Book[] books;
    private int bookCount;
    private final int capacity;

    public Library() {
        this.capacity = 5;
        this.books = new Book[capacity];
        this.bookCount = 0;
    }

    // Method to add a book to the library
    public void addBook(Book book) {
        if (bookCount < capacity) {
            books[bookCount] = book;
            bookCount++;
            System.out.println("Book added successfully!");
        } else {
            System.out.println("Library is full. Cannot add more books.");
        }
    }

    // Method to remove a book from the library
    public void removeBook(int bookID) {
        int index = findBookIndex(bookID);
        if (index != -1) {
            // Shift books to fill the gap
            for (int i = index; i < bookCount - 1; i++) {
                books[i] = books[i + 1];
            }
            books[bookCount - 1] = null;
            bookCount--;
            System.out.println("Book removed successfully!");
        } else {
            System.out.println("Book not found!");
        }
    }

    // Method to replace a book's details in the library
    public void replaceBook(int bookID, String newTitle, String newAuthor) {
        int index = findBookIndex(bookID);
        if (index != -1) {
            books[index].setTitle(newTitle);
            books[index].setAuthor(newAuthor);
            System.out.println("Book details updated successfully!");
        } else {
            System.out.println("Book not found!");
        }
    }

    // Method to search for a book by ID
    public Book searchBook(int bookID) {
        int index = findBookIndex(bookID);
        if (index != -1) {
            return books[index];
        } else {
            return null;
        }
    }

    // Helper method to find the index of a book by ID
    private int findBookIndex(int bookID) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getBookID() == bookID) {
                return i;
            }
        }
        return -1;
    }

    // Method to display all books in the library
    public void displayBooks() {
        if (bookCount == 0) {
            System.out.println("No books in the library.");
            return;
        }
        
        System.out.println("\nLibrary Books:");
        System.out.println("---------------");
        for (int i = 0; i < bookCount; i++) {
            System.out.println(books[i]);
        }
        System.out.println("---------------");
    }
}
