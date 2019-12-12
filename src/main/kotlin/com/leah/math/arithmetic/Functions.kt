package com.leah.math.arithmetic

fun gcd(a: Int, b: Int): Int =
	if (b == 0) a
	else gcd(b, a % b)

fun lcm(a: Int, b: Int): Int =
	(a * b) / gcd(a,b)
