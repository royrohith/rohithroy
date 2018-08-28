package third;

import java.util.Iterator;
import java.util.LinkedList;

public class Book {

    String name;
    float price;
    String author;

    public Book(String name, float price, String author) {
        this.name = name;
        this.price = price;
        this.author = author;
    }

    public static void main(String[] args) {

        LinkedList<Book> book=new LinkedList<>();

        Book b1=new Book("BookA",124.04f,"A");
        Book b2=new Book("BookB",456.67f,"B");
        Book b3=new Book("BookC",3456.67f,"C");

        book.add(b1);
        book.add(b2);
        book.add(b3);

        Iterator itr=book.iterator();

        while (itr.hasNext())
        {
            Book obj= (Book) itr.next();
            System.out.println("Book name is"+obj.name+" Book price"+obj.price+" Book author"+obj.author);
        }

        for (Book obj:book)
        {
            if (book.contains(b2))
            {
                b2.name="BookChange";
                b2.author="New";
                b2.price=89.9f;
            }
        }

        Iterator itr1=book.iterator();
        while (itr1.hasNext())
        {
            Book obj= (Book) itr1.next();
            System.out.println("Book name is"+obj.name+" Book price"+obj.price+" Book author"+obj.author);
        }
    }
}
