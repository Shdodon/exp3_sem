package ru.sh.g.hw1.controllers;

import com.google.gson.Gson;
import ru.sh.g.hw1.domain.Person;

import java.io.*;

public class App
{
    public static void main( String[] args ) throws IOException {
        Person person = new Person("Ivan", "Ivanov", 44);
        Gson gson = new Gson();
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("person.json"))){
            String personJson = gson.toJson(person);
            System.out.println("Write person to JSON: " + personJson);
            bw.write(personJson);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try(BufferedReader br = new BufferedReader(new FileReader("person.json"))) {
            Person personFromJson = gson.fromJson(br, Person.class);
            System.out.println("Read person from JSON: " + personFromJson);
        }
    }
}
