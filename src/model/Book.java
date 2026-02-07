package model;
public class Book{
    private int id;
    private String name;
    private String author;
    private boolean status;

    public Book(int id, String name, String author, boolean status){
        this.id = id;
        this.name = name;
        this.author = author;
        this.status = false;
    }

    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getAuthor(){
        return author;
    }
    public boolean isStatus(){
        return status;
    }
}