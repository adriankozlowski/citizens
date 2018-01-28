package pl.sdacademy.citizens;

import pl.sdacademy.citizens.model.Animal;
import pl.sdacademy.citizens.model.Person;

import java.text.ParseException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws ParseException {
        CitizensApplication app = new CitizensApplication();
        List<Person> people = app.process();
        List<Animal> animals = app.processAnimals();

        for (Animal animal : animals) {
            System.out.println(animal);
        }

//        app.mapLastNameLambda(people);
//        app.writeModifiedEntries(people);
//        app.write1(people);
     }
}
