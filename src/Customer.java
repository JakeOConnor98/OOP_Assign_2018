public class Customer extends LibraryMS {
    private String name;
    private String address;
    private int pps;

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getPps() {
        return pps;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPps(int pps) {
        this.pps = pps;
    }

    public Customer(){
        this("No Name", "No Address", 0);
    }

    public Customer(String name, String address, int pps){
        setName(name);
        setAddress(address);
        setPps(pps);
    }

    public String toString(){
        return "Name: " + getName() + "Address: " + getAddress() +"\nPPS Number: " + getPps();
    }
}
