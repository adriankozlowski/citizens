package pl.sdacademy.citizens;

import pl.sdacademy.citizens.model.Animal;
import pl.sdacademy.citizens.model.Person;

import java.text.ParseException;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws ParseException {
        CitizensApplication app = new CitizensApplication();
        List<Person> people = app.process();
        List<Animal> animals = app.processAnimals();


        app.pairPersonAndAnimal(people,animals);
    int i =0;

        for (Person person : people) {
            if(person.getAnimals() != null && person.getAnimals().size() > 0){
                System.out.println(person);
                i++;
            }
        }

        app.write1(people);

//        app.mapLastNameLambda(people);
//        app.writeModifiedEntries(people);
//        app.write1(people);
     }
}
