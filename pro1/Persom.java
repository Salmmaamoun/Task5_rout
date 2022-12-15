package pro1;

public class Persom {

    String name;
    String address;

    public Persom(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Persom{" + "name=" + name + ", address=" + address + '}';
    }

}
