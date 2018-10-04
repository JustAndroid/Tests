package com.example.newsl.unittests

import com.example.newsl.unittests.presenter.MainPresenter
import org.junit.Assert
import org.junit.Test

class FirstTests{
    @Test
    fun testAddMainPresenter() {
        val actual = MainPresenter().add(2, 2)
        val expected = 4
        Assert.assertEquals(actual, expected)
    }

    @Test
    fun testPowMainPresenter() {
        val actual = MainPresenter().pow(2f, 3)
        val expected = 8
        Assert.assertEquals(actual, expected)
    }
}