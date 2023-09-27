package OOP27_09;

// If a class have an entity reference, it is known as Aggregation.
// Aggregation represents HAS-A relationship.

// Why use Aggregation?
//  For code reusability, when there is no is-a relationship.
//  Inheritance should be used only if the relationship is-a is maintained throughout the lifetime of the objects involved;
//  otherwise, aggregation is the best choice

public class Aggregation {
    public static void main(String[] args) {
        System.out.println("Aggregation");
        System.out.println("");
        Address address1 = new Address("gzb","UP","india");
        Address address2 = new Address("gno","UP","india");

        Emp e1 = new Emp(111,"Varun",address1);
        Emp e2 = new Emp(112,"Arun",address2);

        e1.display();
        e2.display();
    }
}

class Address {
    String city,state,country;

    public Address(String city, String state, String country) {
        this.city = city;
        this.state = state;
        this.country = country;
    }

}
class Emp {
    int id;
    String name;
    Address address; // <-->

    public Emp(int id, String name,Address address) {
        this.id = id;
        this.name = name;
        this.address=address;
    }

    void display(){
        System.out.println(id+" "+name);
        System.out.println(address.city+" "+address.state+" "+address.country);
    }
}