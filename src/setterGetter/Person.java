package setterGetter;

import java.util.Objects;

public class Person {
    private String name;
    private String email;
    private String password;
    private String address;
    private String phone;
    private String city;
    private String state;
    private int age;

    // contructor
    Person(String name, String email, String password, String address, String phone, String city, String state, int age) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.address = address;
        this.phone = phone;
        this.city = city;
        this.state = state;
        this.age = age;
    }

    // getter
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
    return password;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public int getAge() {
        return age;
    }
    //setter
    public void setName(String name) {
        this.name = name;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPassword(String password) {
        String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{8,}$";
        if (Objects.equals(password, "")) {
            System.out.println("Password empty");
        } else if (password.matches(regex)) {
            this.password = password;
        } else
            System.out.println( "invalid password");
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public void setState(String state) {
        this.state = state;
    }
    public void setAge(int age) {
        if (age < 15 || age >= 120) {
            System.out.println("Invalid age");
        } else
            this.age = age;
    }

    }

