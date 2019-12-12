package com.leah.math.types

import com.leah.math.arithmetic.gcd

data class Fraction(val numerator: Int, val denominator: Int) {
	val asDouble: Double by lazy {
		numerator.toDouble() / denominator.toDouble()
	}

	val asInt: Int by lazy {
		numerator / denominator
	}

	val remainder: Int by lazy {
		numerator % denominator
	}

	operator fun unaryMinus():Fraction  = create(-numerator, denominator)
	operator fun unaryPlus():Fraction  = this

	operator fun inc():Fraction  = create(numerator+1, denominator)
	operator fun dec():Fraction  = create(numerator-1, denominator)

	operator fun plus(that: Fraction):Fraction =
		if(that.denominator == this.denominator){
			create(that.numerator + this.numerator, this.denominator)
		}else{
			val newNumerator = this.numerator * that.denominator + that.numerator * this.denominator
			val newDenominator = this.denominator * that.denominator
			create(newNumerator, newDenominator)
		}

	operator fun minus(that: Fraction):Fraction  =
		if(that.denominator == this.denominator){
			create(that.numerator - this.numerator, this.denominator)
		}else{
			val newNumerator = this.numerator * that.denominator - that.numerator * this.denominator
			val newDenominator = this.denominator * that.denominator
			create(newNumerator, newDenominator)
		}

	operator fun times(that: Fraction):Fraction  =
		create(this.numerator * that.numerator, this.denominator * that.denominator)

	operator fun div(that: Fraction):Fraction  =
		create(this.numerator * that.denominator, this.denominator * that.numerator)

	companion object {
		fun create(numerator: Int, denominator: Int): Fraction {
			val num = gcd(numerator, denominator)
			val newNumerator = numerator / num
			val newDenominator = denominator / num

			return Fraction(newNumerator, newDenominator)
		}
	}
}
