package ListExtraPractice;

import java.util.ArrayList;

public class Store {
    private ArrayList<Book> books;

    public Store() {
        this.books=new ArrayList<>();
    }

    public Book getBook(int index){
        Book copy=new Book(this.books.get(index));
        return copy;
    }

    public void setBook(int index,Book book){
        this.books.set(index, new Book(book));
    }

    public void addNewBook(Book newbook){
        this.books.add(new Book(newbook));
    }

    public boolean containss(Book book){
        return this.books.contains(book);
    }


    public void sellBook(String title){
        for(int i=0;i<books.size();i++){
            if(books.get(i).getClass().getName().equals(title)){
                this.books.remove(i);
            }
        }
    }
    
}
