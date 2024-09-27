package com.campusdual.classroom;

import java.util.ArrayList;
import java.util.List;

public class Exercise20 {

    public static List<Person> getPeopleList() {
        List<Person> peopleList = new ArrayList<>();

        // Añadir objetos de tipo Person y sus subclases
        peopleList.add(new Person("John", "Smith"));
        peopleList.add(new Teacher("María", "Montessori", "Educación"));
        peopleList.add(new PoliceOfficer("Jake", "Peralta", "B-99"));
        peopleList.add(new Doctor("Gregory", "House", "Nefrología e infectología"));

        return peopleList;
    }


    public static void showPeopleDetails(List<Person> peopleList) {
        for (Person person : peopleList) {
            person.getDetails();
        }
    }

    public static void main(String[] args) {

        List<Person> peopleList = getPeopleList();


        showPeopleDetails(peopleList);
    }



}
