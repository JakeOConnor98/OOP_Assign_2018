public class Customer extends LibraryMS {
    private String name;
    private String address;
    private int pps;
    private int phone;

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getPps() {
        return pps;
    }

    public int getPhone(){
        return phone;
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

    public void setPhone(int phone){
        this.phone = phone;
    }

    public Customer(){
        this("No Name", "No Address", 0, 0);
    }

    public Customer(String name, String address, int pps, int phone){
        setName(name);
        setAddress(address);
        setPps(pps);
        setPhone(phone);
    }

    public String toString(){
        return "Name: " + getName() + "Address: " + getAddress() +"\nPPS Number: " + getPps();
    }
}
