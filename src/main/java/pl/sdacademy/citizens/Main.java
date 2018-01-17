package pl.sdacademy.citizens;

import pl.sdacademy.citizens.model.Person;

import java.text.ParseException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws ParseException {
        CitizensApplication app = new CitizensApplication();
        List<Person> people = app.process();
        app.writeModifiedEntries(people);
        app.write3(people);
    }
}