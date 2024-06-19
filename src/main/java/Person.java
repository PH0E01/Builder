import javax.lang.model.element.Name;
import java.util.Objects;
import java.util.OptionalInt;

public class Person {

    protected final String name;
    protected final String surname;
    protected int age;
    protected String address;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public boolean hasAge() {
        if (age < 0) {
            return false;
        } else return true;
    }

    public boolean hasAddress() {
        if (address != null && !address.isEmpty()) {
            return true;
        } else return false;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public OptionalInt getAge() {

        return age > 0 ? OptionalInt.of(age) : OptionalInt.empty();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void happyBirthday() {
        age++;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\n Surname: " + surname + "\n Address: " + address + "\n Age: " + age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, address, age);
    }

    public PersonBuilder newChildBuilder() {
        return new PersonBuilder().setSurname(surname);
    }
}

