package org.stekl0.lessons.lesson_3

fun getInfo(
    surname: String,
    name: String,
    patronymic: String,
    age: Int,
): String = "ФИО: $surname $name $patronymic, возраст: $age"

fun main() {
    var surname = "Андреева"
    var name = "Татьяна"
    var patronymic = "Сергеевна"
    var age = 20

    println(getInfo(surname, name, patronymic, age))

    age = 22
    surname = "Сидорова"
    println(getInfo(surname, name, patronymic, age))
}
