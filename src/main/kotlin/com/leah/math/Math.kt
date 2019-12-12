package com.leah.math

import com.leah.math.types.Fraction

fun main(){
	val fraction = Fraction.create(3,4)
	println("hello")
	println(fraction == Fraction.create(4,3))
}
