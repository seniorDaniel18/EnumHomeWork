package com.company;

public enum Day {

    MONDAY("Дүйшөмбү күнү техникалык сабак болот"), TUESDAY("Шейшемби күнү практика сабак болот"),
    WEDNESDAY("Шаршемби күнү техникалык сабак болот"), THURSDAY("Бейшемби күнү практика сабак болот"),
    FRIDAY("Жума күнү техникалык сабак болот"), SATURDAY("Ишемби күнү практика сабак болот"),
    SUNDAY("Жекшемби эс алуу күнү");

    String lesson;

    Day(String lesson) {
        this.lesson = lesson;
    }
}
