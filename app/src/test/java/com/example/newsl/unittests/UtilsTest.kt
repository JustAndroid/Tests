package com.example.newsl.unittests

import com.example.newsl.utils.Utils
import org.junit.Assert
import org.junit.Test

/**
 * Created by SVDroid on 10/4/18.
 */
class UtilsTest {
    @Test
    fun testAddWithTwoZeroValuesArgs() {
        val actual = Utils.add(0f, 0f)
        val expected = 0f

        Assert.assertEquals(actual, expected)
    }

    @Test
    fun testAddWithFirstZeroValueArgAndSecondNegativeValueArg() {
        val actual = Utils.add(0f, -15f)
        val expected = -15f

        Assert.assertEquals(actual, expected)
    }

    @Test
    fun testAddWithFirstNegativeValueArgAndSecondNegativeValueArg() {
        val actual = Utils.add(-10f, -15f)
        val expected = -25f

        Assert.assertEquals(actual, expected)
    }

    @Test
    fun testAddWithFirstPositiveValueArgAndPositiveValueArg() {
        val actual = Utils.add(10f, 15f)
        val expected = 25f

        Assert.assertEquals(actual, expected)
    }

    @Test
    fun testAddForSomeValue() {
        val actual = Utils.add(14f, 15f)
        val expected = 29f

        Assert.assertEquals(actual, expected)
    }

    @Test
    fun testPowForSomeValue() {
        val actual = Utils.pow(15f, 3)
        val expected = 3375f

        Assert.assertEquals(actual, expected)
    }

    @Test
    fun testPowForZeroValueOfExponent() {
        val actual = Utils.pow(15f, 0)
        val expected = 1f

        Assert.assertEquals(actual, expected)
    }

    @Test
    fun testPowForNegativeValueAndNonZeroValueOfExponent() {
        val actual = Utils.pow(-15f, 3)
        val expected = -3375f

        Assert.assertEquals(actual, expected)
    }

    @Test
    fun testPowForZeroValueAndNonZeroValueOfExponent() {
        val actual = Utils.pow(0f, 3)
        val expected = 0f

        Assert.assertEquals(actual, expected)
    }

    @Test
    fun testPowForNonZeroValueAndTheFirsValueOfExponent() {
        val actual = Utils.pow(10f, 1)
        val expected = 10f

        Assert.assertEquals(actual, expected)
    }

    @Test
    fun testPowForNegativeValueAndZeroValueOfExponent() {
        val actual = Utils.pow(-10f, 0)
        val expected = 1f

        Assert.assertEquals(actual, expected)
    }

    @Test
    fun testPowForZeroValueAndZeroValueOfExponent() {
        val actual = Utils.pow(0f, 0)
        val expected = 1f

        Assert.assertEquals(actual, expected)
    }

    @Test
    fun testPowForZeroValueAndNegativeValueOfExponent() {
        val actual = Utils.pow(0f, -10)
        val expected = Float.POSITIVE_INFINITY

        Assert.assertEquals(actual, expected)
    }

    @Test
    fun testPowForPositiveValueAndNegativeValueOfExponent() {
        val actual = Utils.pow(10f, -3)
        val expected = 1 / 1000f

        Assert.assertEquals(actual, expected)
    }
}