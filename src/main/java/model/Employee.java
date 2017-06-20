package model;

import java.util.List;
import java.util.Map;
import java.util.Arrays;

/**
 * Created by baiwe on 2017/6/20.
 */
public class Employee {
    private int id;
    private String name;
    private boolean permanent;
    private Address address;
    private long[] phoneNumbers;
    private String role;
    private List<String> cities;
    private Map<String, String> properties;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public boolean isPermanent() {
        return permanent;
    }

    public Address getAddress() {
        return address;
    }

    public long[] getPhoneNumbers() {
        return phoneNumbers;
    }

    public String getRole() {
        return role;
    }

    public List<String> getCities() {
        return cities;
    }

    public Map<String, String> getProperties() {
        return properties;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPermanent(boolean permanent) {
        this.permanent = permanent;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setPhoneNumbers(long[] phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setCities(List<String> cities) {
        this.cities = cities;
    }

    public void setProperties(Map<String, String> properties) {
        this.properties = properties;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("*** Employee Details ***");
        sb.append("ID=" + getId() + "\n");
        sb.append("Name="+getName()+"\n");
        sb.append("Permanent="+isPermanent()+"\n");
        sb.append("Role="+getRole()+"\n");
        sb.append("Phone Numbers="+Arrays.toString(getPhoneNumbers())+"\n");
        sb.append("Address="+getAddress()+"\n");
        sb.append("Cities="+Arrays.toString(getCities().toArray())+"\n");
        sb.append("Properties="+getProperties()+"\n");
        sb.append("*****************************");

        return sb.toString();
    }
}
