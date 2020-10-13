import java.util.*;

public class Main {

    public static void main(String[] args) {

        TreeSet<Human> Population = new TreeSet<Human>(new Comparator<Human>() {
            @Override
            public int compare(Human o1, Human o2) {
                return o1.getId().compareTo(o2.getId());
            }
        });

        Human Alex = new Human("Alex", "Smith", 23, Gender.Male, 1);
        Human Anna = new Human("Anna", "Garcia", 19, Gender.Female, 2);
        Human Emma = new Human("Emma", "Davis", 34, Gender.Transgender, 3);
        Human Samuel = new Human("Samuel", "Brown", 42, Gender.Agender, 4);
        Human Veronica = new Human("Veronica", "Miller", 10, Gender.Other, 5);

        Population.add(Alex);
        Population.add(Anna);
        Population.add(Emma);
        Population.add(Samuel);
        Population.add(Veronica);

        for (Human humanAge : Population)
            humanAge.toString();

        System.out.println(Population);

        TreeSet<String> Planets = new TreeSet<>();
        Planets.add("Mercury");
        Planets.add("Venus");
        Planets.add("Mars");
        Planets.add("Earth");
        Planets.add("Jupiter");
        System.out.println(Planets);

    }
}
