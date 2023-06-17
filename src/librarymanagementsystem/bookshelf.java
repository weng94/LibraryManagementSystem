package librarymanagementsystem;

import java.util.Objects;
/**
 *
 * @author cindy
 */
public final class bookshelf {
    private String Title="NoTitle";
    private String ISBN="NoISBN";
    private String Type="NoType";
    private String Author="NoAuthor";
    private String Publisher="NoPublisher";
    private String Number="NoNumber";
    private String Place="NoPlace";
    private String Status="NoStatus";
    private String Time="NoTime";
    private String People="NoPeople";
    private String Search="NoSearch";
    
    public bookshelf(String Title,String ISBN,String Type,String Author,String Publisher,String Number,String Place,String Status,String Time,String People){
        setTitle(Title);
        setISBN(ISBN);
        setType(Type);
        setAuthor(Author);
        setPublisher(Publisher);
        setNumber(Number);
        setPlace(Place);
        setStatus(Status);
        setTime(Time);
        setPeople(People);
    }
    public bookshelf(String Search){
        setSearch(Search);
    }
    public void setTitle(String title){
        Title=title;
    }
    public String getTitle(){
        return Title;
    }
    public void setISBN(String isbn){
        ISBN=isbn;
    }
    public String getISBN(){
        return ISBN;
    }
    public void setType(String type){
        Type=type;
    }
    public String getType(){
        return Type;
    }
    public void setAuthor(String author){
        Author=author;
    }
    public String getAuthor(){
        return Author;
    }
    public void setPublisher(String publisher){
        Publisher=publisher;
    }
    public String getPublisher(){
        return Publisher;
    }
    public void setNumber(String number){
        Number=number;
    }
    public String getNumber(){
        return Number;
    }
    public void setPlace(String place){
        Place=place;
    }
    public String getPlace(){
        return Place;
    }
    public void setStatus(String status){
        Status=status;
    }
    public String getStatus(){
        return Status;
    }
    public void setTime(String time){
        Time=time;
    }
    public String getTime(){
        return Time;
    }
    public void setPeople(String people){
        People=people;
    }
    public String getPeople(){
        return People;
    }
    public void setSearch(String search){
        Search=search;
    }
    @Override
    public String toString(){
        return "Title: "+getTitle()+" | Author: "+getAuthor()+" | ISBN: "+getISBN()+" | Publisher: "+getPublisher()+" | Type: "+getType()+" | Number: "+getNumber()+" | Palce: "+getPlace()+" | Status: "+getStatus()+" | Return Date: "+getTime()+" | Number of Resevation: "+getPeople();
    }
    @Override
    public boolean equals(Object o){
        if(!(o instanceof bookshelf)){
            return false;
        }
        else{
            bookshelf obj=(bookshelf) o;
            if(Search.equals(obj.getTitle())){
                return true;
            }
            else if(Search.equals(obj.getISBN())){
                return true;
            }
            else if(Search.equals(obj.getType())){
                return true;
            }
            else if(Search.equals(obj.getAuthor())){
                return true;
            }
            else if(Search.equals(obj.getPublisher())){
                return true;
            }
            else{
                return false;
            }
        }
    }
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + Objects.hashCode(this.Title);
        hash = 71 * hash + Objects.hashCode(this.ISBN);
        hash = 71 * hash + Objects.hashCode(this.Type);
        hash = 71 * hash + Objects.hashCode(this.Author);
        hash = 71 * hash + Objects.hashCode(this.Publisher);
        hash = 71 * hash + Objects.hashCode(this.Search);
        return hash;
    }
}
