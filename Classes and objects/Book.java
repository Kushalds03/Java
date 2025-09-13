class Book{
    static int totalNoOfBooks;
    String author;
    String title;
    String isbn;
    boolean isBorrowed;


    static {
        totalNoOfBooks = 0;
    }
    {  // Object initialization 
        totalNoOfBooks++;
    }
    Book(String isbn, String title, String author){
        this.isbn = isbn;
        this.title = title;
        this.author = author;

    }
    Book(String isbn){
        this(isbn, "Unknown","Unknown");
    }

    static int getTotalNoOfBooks() {
        return totalNoOfBooks;
    }

    void borrowBook(){
        if(isBorrowed){
            System.out.println("Book is already borrowed");
        }else{
            this.isBorrowed = true;
            System.out.println("Enjoy  "+this.title);
        }
        
    }
    void returnBook(){
        if(isBorrowed){
            this.isBorrowed = false;
            System.out.println("Hope you enjoyed. Please leave the review");    
        }else{
            System.out.println("The book is already in the lib");
        }

    }
    public static void main(String[] args) {
        Book designOfThings = new Book("1","Design","Author");
        System.out.println(Book.getTotalNoOfBooks());
        Book mybook = new Book("2");
        System.out.println(Book.getTotalNoOfBooks());
        designOfThings.borrowBook();
        mybook.borrowBook();
        System.out.println(Book.totalNoOfBooks);
        designOfThings.returnBook();
        designOfThings.returnBook();
        mybook.returnBook();
    }
}
