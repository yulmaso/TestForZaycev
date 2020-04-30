package com.yulmaso.testforzaycev.TaskOne;

/**
 * Created by Plotnikov Alexey on 30/04/2020.
 *
 * Unit-тест для запуска - ZaycevUnitTest
 */
public class TaskOne {
    public static void main() {
        User tester = new User(7, new Vacancy("Developer"));
        System.out.println(tester.getId());
        System.out.println(tester.getVacancy());
    }
}

class User {
    private long id;
    private Vacancy vacancy;

    public User(long id, Vacancy vacancy) {
        this.id = id;
        this.vacancy = vacancy;
    }

    String getVacancy() {
        return vacancy.getVacancy();
    }

    long getId() {
        return id;
    }
}

class Vacancy {
    private String vacancy;

    public Vacancy(String vacancy) {
        this.vacancy = vacancy;
    }

    String getVacancy() {
        return vacancy;
    }
}
