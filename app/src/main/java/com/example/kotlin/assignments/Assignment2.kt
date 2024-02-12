package com.example.kotlin.assignments


import java.math.BigInteger

class Assignment2 {
    //---------- Convert kilometers to miles ----------

    fun Question1(km: Double): Double {
        return km * 0.621
    }

    //---------- Rectangle area calculation ----------

    fun Question2(length: Double, width: Double): Double {
        return length * width
    }

    //---------- Factorial calculation of number ----------

    //Int : It works if the number is less than 12, but it doesn't work if the number is greater than 12
    //Long : It works if the number is less than 20, but it doesn't work if the number is greater than 20
    /* fun Question3(number: Int): Int {
        var factorial = 1
        for (i in 1..number) {
            factorial *= i
        }
        return factorial
    }
    */

    /*
    fun Question3(number: Int): Long {
        var factorial : Long = 1
        for (i in 1..number) {
            factorial *= i
        }
        return factorial
    }*/

    //Where the number is greater than 20
    fun Question3(number: Int): BigInteger {
        var factorial = BigInteger.ONE
        for (i in 1..number) {
            factorial *= BigInteger.valueOf(i.toLong())
        }
        return factorial
    }

    //---------- Finding how many 'e' letters are in a word ----------

    fun Question4(word: String,letter: Char): Int {
        var count = 0
        for (i in word) {
            if (i == letter.lowercaseChar() || i == letter.uppercaseChar()) {
                count++
            }
        }
        return count
        //return word.count { it: Char -> it.equals(letter, ignoreCase = true) }
    }

    //---------- Finding the sum of the interior angles of a polygon ----------

    fun Question5(numOfSides: Int): Int {
        require(numOfSides >= 3) { "A polygon must have at least 3 sides." }
        return (numOfSides - 2) * 180
    }

    //---------- Salary calculation based on the number of days worked ----------

    fun Question6(daysWorked: Int): Int {
        require(daysWorked >= 0) { "Days worked cannot be negative." }
        val workHours = daysWorked * 8
        val regularHours = minOf(workHours, 150)
        val overtimeHours = maxOf(workHours - 150, 0)

        val regularPay = regularHours * 40
        val overtimePay = overtimeHours * 80
        return regularPay + overtimePay
    }

    //---------- Parking fee calculation according to the given time ----------

    fun Question7(hoursParked: Int): Int {
        require(hoursParked >= 0) { "Hours parked cannot be negative." }
        val initialFee = 50
        val hourlyRate = 10

        return if (hoursParked <= 1) {
            initialFee
        } else {
            initialFee + (hoursParked - 1) * hourlyRate
        }
    }
}