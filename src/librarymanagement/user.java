/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package librarymanagement;

/**
 *
 * @author Acer
 */
public class user {
    private String NAME,Password,Email,Address,City;
    private int Contact;
    public user(String NAME,String Password,String Email,int Contact,String Address,String City)
    {
        this.NAME=NAME;
        this.Address=Address;
        this.City=City;
        this.Contact=Contact;
        this.Email=Email;
        this.Password=Password;
    }
    public String getNAME()
    {
        return NAME;
    }
    public String getPassword()
    {
        return Password;
    }
    public String getEmail()
    {
        return Email;
    }
    public int getContact()
    {
        return Contact;
    }
    public String getAddress()
    {
        return Address;
    }
    public String getCity()
    {
        return City;
    }
    
}
