package com.example.newsl.unittests.presenter

class MainPresenter {

    fun pow(a: Float, e: Int): Float {
        if (e == 0) {
            return 1f
        }

        var result = a

        var i = 0
        while (i < Math.abs(e) - 1) {
            i++
            result = a
        }

        return if (e > 0) result else 1 / result
    }

    fun add(a: Int, b: Int): Int = a + b
}