package classes.basics;

class User {
    String name;
    String lastname;
    int age;

    User(String name, String lastname, int age) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
    }

    User(User other) {
        name = other.name;
        lastname = other.lastname;
        age = other.age;
    }

    void introduce() {
        System.out.println("Imie: " + name + ", Nazwisko: " + lastname + ", Wiek: " + age);
    }
}
