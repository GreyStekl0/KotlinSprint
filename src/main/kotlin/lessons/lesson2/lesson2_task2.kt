package org.stekl0.lessons.lesson_2

fun main() {
    val workers = 50
    val trainees = 30

    val workersSalary = 30000
    val traineesSalary = 20000

    val workersFullSalary = workers * workersSalary
    val trainersFullSalary = trainees * traineesSalary
    val fullSalary = workersFullSalary + trainersFullSalary

    val averageSalary = fullSalary / (workers + trainees)
}
