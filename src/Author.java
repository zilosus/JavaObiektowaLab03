import java.util.Arrays;

public class Author {
    /*
     *postawowa klasa
     *@param ta klasa pobiera informacje na temat autora
     */

    /*
    *@return oraz zwraca informacje o autorze
     */
    String name;
    String email;
    char gender;
    
    public static void main(String[] args) {
        Author[] autor1 = new Author[1];
        autor1[0] = new Author("Rydz", "rydzu@wp.pl", 'm');
        Author autor2 = new Author("Rydz", "rydzu@wp.pl", 'm');

        Book book = new Book("Książka", autor1, 123.00, 1);
        System.out.println(autor1[0]);
        System.out.println(book);
        autor1[0].setEmail("kozlak");
        System.out.println(autor1[0].getEmail());
        book.setName("Ksionszka o ksionszkach");
        System.out.println(book.getName());
        System.out.println(autor2);
        System.out.println(autor1[0].equals(autor2));
        System.out.println(autor1[0].hashCode());
        System.out.println(autor2.hashCode());

        BookInherit book2 = new BookInherit("Ksionszka", autor1, 123.00);
        book2.setPages(50);
        book2.setQty(3);
        System.out.println(book2 + ", pages: "+ book2.getPages());
    };
    
    public Author(String name, String email, char gender){
        this.name = name;
        this.email = email;
        this.gender = gender;
    }
    
    public String getName(){
        return name;
    }
    
    public String getEmail(){
        return email;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    public char getGender(){
        return gender;
    }
    
    public String toString(){
        return "Author: [name = " + this.name + ", email = " + this.email + ", gender = " + this.gender + "]";
    }
}

class Book{
    String name;
    double price;
    Author[] authors;
    int qty = 0;
    
    public Book(String name, Author[] authors, double price){
        this.name = name;
        this.authors = authors;
        this.price = price;
    }
    
    public Book(String name, Author[] authors, double price, int qty){
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }
    
    public String getName(){
        return name;
    }
    
    public Author[] getAuthors(){
        return authors;
    }
    
    public double getPrice(){
        return price;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setPrice(double price){
        this.price = price;
    }
    
    public int getQty(){
        return qty;
    }
    
    public void setQty(int qty){
        this.qty = qty;
    }
    
    public String toString(){
        return "Book: [name = " + this.name + " " + Arrays.toString(authors) + ", price = " + this.price + ", aty = " + this.qty + "]";
    }
}

class BookInherit extends Book{
    int pages;
    public BookInherit(String name, Author[] authors, double price) {
        super(name, authors, price);
    }
    public void setPages(int pages){ this.pages = pages;}
    public int getPages(){ return pages; }
}