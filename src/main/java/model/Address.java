package model;

/**
 * Created by baiwe on 2017/6/20.
 */
public class Address {
    private String street;
    private String city;
    private int zipcode;

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public int getZipcode() {
        return zipcode;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

    @Override
    public String toString(){
        return getStreet() + ", " + getCity() + ", " + getZipcode();
    }
}
