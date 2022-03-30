public class Person {
    /**
     * Person.
     */
    private String name;
    private String address;

    /**
     * Constructor.
     */
    public Person() {
        
    }
    
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    /**
     * Set/get.
     */
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Person[name=" + name + ",address=" + address + "]";
    }
}
