import java.util.*;

public class Main {

    public static void main(String[] args) {

        Comparator<Human> comparator = (o1, o2) -> {
            return o1.getId().compareTo(o2.getId());
        };

        TreeSet<Human> Population = new TreeSet<Human>(comparator);

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

        Population.forEach(humanAge -> humanAge.toString());
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
