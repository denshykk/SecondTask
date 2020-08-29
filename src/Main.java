import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        TreeSet<Human> Population = new TreeSet<Human>();

        Human Alex = new Human("Alex", "Smith", 23, Human.Gender.Male);
        Human Anna = new Human("Anna", "Garcia", 19, Human.Gender.Female);
        Human Emma = new Human("Emma", "Davis", 34, Human.Gender.Transgender);
        Human Samuel = new Human("Samuel", "Brown", 42, Human.Gender.Agender);
        Human Veronica = new Human("Veronica", "Miller", 10, Human.Gender.Other);

        Population.add(Alex);
        Population.add(Anna);
        Population.add(Emma);
        Population.add(Samuel);
        Population.add(Veronica);

        for (Human humanAge : Population)
            humanAge.displayInfo();

        TreeSet<String> Planets = new TreeSet<>();
        Planets.add("Mercury");
        Planets.add("Venus");
        Planets.add("Mars");
        Planets.add("Earth");
        Planets.add("Jupiter");
        System.out.println(Planets);

    }
}
