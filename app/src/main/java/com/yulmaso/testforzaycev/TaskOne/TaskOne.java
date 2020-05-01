package com.yulmaso.testforzaycev.TaskOne;

/**
 * Created by Plotnikov Alexey on 30/04/2020.
 *
 * Unit-тест для запуска - ZaycevUnitTest.taskOne_isCorrect()
 */
public class TaskOne {
    public static void main() {
        User tester = new User(7, new Vacancy("Developer"));
        System.out.println(tester.getId());
        System.out.println(tester.getVacancy().getPosition());
    }
}

class User {
    private long id;
    private Vacancy vacancy;

    public User(long id, Vacancy vacancy) {
        this.id = id;
        this.vacancy = vacancy;
    }

    long getId() {
        return id;
    }

    public Vacancy getVacancy() {
        return vacancy;
    }
}

class Vacancy {
    private String position;

    public Vacancy(String position) {
        this.position = position;
    }

    String getPosition() {
        return position;
    }
}
