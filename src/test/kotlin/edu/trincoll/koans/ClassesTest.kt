package edu.trincoll.koans

import edu.trincoll.koans.solutions.Num
import edu.trincoll.koans.solutions.RationalNumber
import edu.trincoll.koans.solutions.Sum
import edu.trincoll.koans.solutions.comparePeople
import edu.trincoll.koans.solutions.eval
import edu.trincoll.koans.solutions.evalSmartCasts
import edu.trincoll.koans.solutions.getPeople
import edu.trincoll.koans.solutions.r
import edu.trincoll.koans.solutions.useDifferentRandomClasses
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class ClassesTest {
    @Test
    fun testListOfPeople() {
        assertEquals("[Person(name=Alice, age=29), Person(name=Bob, age=31)]", getPeople().toString())
    }

    @Test
    fun testComparePeople() {
<<<<<<< HEAD
        assertTrue(comparePeople())
=======
        assertTrue(
            comparePeople(),
            "'comparePeople' function should return true")
>>>>>>> upstream/main
    }

    @Test
    fun testNum() {
        assertEquals(2, evalSmartCasts(Num(2)))
    }

    @Test
    fun testSum() {
        assertEquals(3, evalSmartCasts(Sum(Num(2), Num(1))))
    }

    @Test
    fun testRecursion() {
        assertEquals(6, evalSmartCasts(Sum(Sum(Num(1), Num(2)), Num(3))))
    }

    @Test
    fun testNumSealed() {
        assertEquals(2, eval(Num(2)))
    }

    @Test
    fun testSumSealed() {
        assertEquals(3, eval(Sum(Num(2), Num(1))))
    }

    @Test
    fun testRecursionSealed() {
        assertEquals(6, eval(Sum(Sum(Num(1), Num(2)), Num(3))))
    }

    @Test
    fun testRandom() {
        val string = useDifferentRandomClasses()
        assertTrue(setOf('0', '1').any { it in string })
    }

    @Test
    fun testIntExtension() {
<<<<<<< HEAD
        assertEquals(RationalNumber(4, 1), 4.r())
=======
        assertEquals(
            RationalNumber(4, 1), 4.r(),
            "Rational number creation error: ")
>>>>>>> upstream/main
    }

    @Test
    fun testPairExtension() {
<<<<<<< HEAD
        assertEquals(RationalNumber(2, 3), Pair(2, 3).r())
=======
        assertEquals(
            RationalNumber(2, 3), Pair(2, 3).r(),
            "Rational number creation error: ")
>>>>>>> upstream/main
    }
}
