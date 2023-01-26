/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package librarymanagement;

/**
 *
 * @author Acer
 */
public class Buser {
    private String Book_Name,Author_Name;
    private int Book_id,Issue_date,Return_Date,Number_of_Books;
    public Buser(String Book_Name,String Author_Name,int Book_id,int Number_of_Books,int Issue_date,int Return_Date)
    {
        this.Book_Name=Book_Name;
        this.Author_Name=Author_Name;
        this.Book_id=Book_id;
        this.Number_of_Books=Number_of_Books;
        this.Issue_date=Issue_date;
        this.Return_Date=Return_Date;
    }
    public String getBook_Name()
    {
        return Book_Name;
    }
    public String getAuthor_Name()
    {
        return Author_Name;
    }
    public int getBook_id()
    {
        return Book_id;
    }
    public int getNumber_of_book()
    {
        return Number_of_Books;
    }
    public int getIssue_date()
    {
        return Issue_date;
    }
    public int getReturn_date()
    {
        return Return_Date;
    }
}
