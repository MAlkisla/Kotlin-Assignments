package com.example.kotlin.assignments

fun main(){
    val h2 = Assignment2()

    val km = 5.0
    val mile = h2.Question1(km)
    println("$km kilometers equals $mile miles.")

    val length = 5.0
    val width = 3.0
    val area = h2.Question2(length, width)
    println("The area of the rectangle with length $length and width $width is $area.")

    val number = 12
    val factorial = h2.Question3(number)
    println("The factorial of $number is $factorial.")

    val word = "EveEveEve"
    val count = h2.Question4(word,'e')
    println("The word \"$word\" contains $count occurrences of the letter 'e'.")

    val numOfSides = 6
    val sumOfAngles = h2.Question5(numOfSides)
    println("The sum of interior angles of a polygon with $numOfSides sides is $sumOfAngles degrees.")

    val daysWorked = 15
    val salary = h2.Question6(daysWorked)
    println("The salary for working $daysWorked days is $salary ₺.")

    val hoursParked = 3
    val fee = h2.Question7(hoursParked)
    println("The parking fee for parking $hoursParked hours is $fee ₺.")
}