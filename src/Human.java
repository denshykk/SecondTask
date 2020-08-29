public class Human implements Comparable<Human> {
    String firstName;
    String lastName;
    int age;


    @Override
    public int compareTo(Human humanAge) {
        if (this.age == humanAge.getAge())
            return 0;
        else if (this.age > humanAge.getAge())
            return 1;
        else return -1;
    }


    public enum Gender {
        Male, Female, Transgender, Agender, Other
    }

    public Gender yourGender;

    public Human(String firstName, String lastName, int age, Gender yourGender) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.yourGender = yourGender;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.firstName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge() {
        this.age = age;
    }

    public Gender getYourGender() {
        return yourGender;
    }

    public void setYourGender() {
        this.yourGender = yourGender;
    }

    public void displayInfo() {
        System.out.println("Name: " + getFirstName() + " Last Name: " + getLastName() + " Age: " + getAge() + " Gender: " + getYourGender());
    }
}
