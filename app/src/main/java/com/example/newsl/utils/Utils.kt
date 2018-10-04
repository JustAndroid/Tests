package com.example.newsl.utils

/**
 * Created by SVDroid on 10/4/18.
 */
object Utils {

    /**
    * Returns the value of the first argument raised to the power of the second argument.
    * */
    fun pow(a: Float, e: Int): Float {
        if (e == 0) {
            return 1f
        }

        var result = a

        for (i: Int in 1 until Math.abs(e)) {
            result *= a
        }

        return if (e > 0) result else 1 / result
    }

    /**
     * Returns the sum of its arguments.
     * */
    fun add(a: Float, b: Float): Float = a + b
}