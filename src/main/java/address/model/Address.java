package address.model;

public class Address {

    private final long id;
    private final String key;
    private final String street;
    private final String place;
    private final String zip;

    public Address(long id, String key, String street, String place, String zip) {
        this.id = id;
        this.key = key;
        this.street = street;
        this.place = place;
        this.zip = zip;
    }


    public long getId() {
        return id;
    }

    public String getKey() {
        return key;
    }

    public String getStreet() {
        return street;
    }

    public String getPlace() {
        return place;
    }

    public String getZip() {
        return zip;
    }
}
