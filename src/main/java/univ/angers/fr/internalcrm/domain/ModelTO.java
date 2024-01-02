package univ.angers.fr.internalcrm.domain;

import java.time.LocalDateTime;

public class ModelTO {
    private String firstName;
    private String lastName;
    private double annualRevenue;
    private String phone;
    private String street;
    private String postalCode;
    private String city;
    private String country;
    private LocalDateTime creationDate;
    private String company;
    private String state;
    public ModelTO(String firstName,String lastName,double annualRevenue,String phone,String street,String postalCode,
    String city,String country,LocalDateTime creationDate,String company,String state){
        this.firstName = firstName;
        this.lastName = lastName;
        this.annualRevenue = annualRevenue;
        this.phone = phone;
        this.street = street;
        this.postalCode = postalCode;
        this.city = city;
        this.country = country;
        this.creationDate = creationDate;
        this.company = company;
        this.state = state;
    }
    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public double getAnnualRevenue(){
        return this.annualRevenue;
    }
    public String getPhone(){
        return this.phone;
    }
    public String getStreet(){
        return this.street;
    }
    public String getPostalCode(){
        return this.postalCode;
    }
    public String getCity(){
        return this.city;
    }
    public String getCountry(){
        return this.country;
    }
    public LocalDateTime getCreationDate(){
        return this.creationDate;
    }
    public String getCompany(){
        return this.company;
    }
    public String getState(){
        return this.state;
    }
}
