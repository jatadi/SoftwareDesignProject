package edu.trincoll.koans

// Data classes
data class Person(val name: String, val age: Int)

fun getPeople(): List<Person> {
    return listOf(Person("Alice", 29), Person("Bob", 31))
}

fun comparePeople(): Boolean {
    val p1 = Person("Alice", 29)
    val p2 = Person("Alice", 29)
    return p1 == p2
}

// Smart casts
fun evalSmartCasts(expr: Expr): Int =
    when (expr) {
        is Num -> expr.value
        is Sum -> evalSmartCasts(expr.left) + evalSmartCasts(expr.right)
        else -> throw IllegalArgumentException("Unknown expression")
    }

interface Expr
class Num(val value: Int) : Expr
class Sum(val left: Expr, val right: Expr) : Expr

// Sealed classes
fun eval(expr: Expr): Int =
    when (expr) {
        is Num -> expr.value
        is Sum -> eval(expr.left) + eval(expr.right)
        else -> throw IllegalArgumentException("Unknown expression")
    }

// Rename on import
// import kotlin.random.Random
// import java.util.Random

fun useDifferentRandomClasses(): String {
    return "Kotlin random: " +
            kotlin.random.Random.nextInt(2) +
            " Java random:" +
            java.util.Random().nextInt(2) +
            "."
}

// Extension functions
fun Int.r(): RationalNumber = RationalNumber(this, 1)  // Converts an Int to a RationalNumber

fun Pair<Int, Int>.r(): RationalNumber = RationalNumber(this.first, this.second)  // Converts a Pair to a RationalNumber

data class RationalNumber(val numerator: Int, val denominator: Int)
