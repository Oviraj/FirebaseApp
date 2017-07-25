package ingeniumbd.com.firebaseapp;

public class User {

    private String name;
    private String country;
    private double weight;
    private String email;


    public User(){}
    public User(String n, String c, double w, String e){
        this.name=n;
        this.country=c;
        this.weight=w;
        this.email=e;

    }
    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public double getWeight() {
        return weight;
    }

    public String getEmail() {
        return email;
    }



    @Override
    public String toString() {
        return name +" "+ country +" " +weight+" " +email;
    }
}
