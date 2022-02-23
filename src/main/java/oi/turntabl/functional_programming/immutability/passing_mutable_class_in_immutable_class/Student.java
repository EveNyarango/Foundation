package oi.turntabl.functional_programming.immutability.passing_mutable_class_in_immutable_class;

public class Student {
    private final String id;
    private final String name;
    private final Address address;

    public Student(String id, String name,Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return new Address(address);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", address=" + address +
                '}';
    }

    public static void main(String[] args) {
        Address address1 = new Address("Nairobi", "Kenya");

//        confirm if it alters
        Student student = new Student("45", "Kaylla", address1);
        System.out.println(student);
        Address address2 =student.getAddress();
        address2.setCity("Mombasa");
        System.out.println(student);
    }
}
