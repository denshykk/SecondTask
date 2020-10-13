public final class Human {
    private String firstName;
    private String lastName;
    private int age;
    private Gender yourGender;
    private Integer Id;


    public Human(String firstName, String lastName, int age, Gender yourGender, Integer Id) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.yourGender = yourGender;
        this.Id = Id;
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

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    @Override
    public String toString() {
        return "Human" +
                " firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", yourGender=" + yourGender;
    }
}
