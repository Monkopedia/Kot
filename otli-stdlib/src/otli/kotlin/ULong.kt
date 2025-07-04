/*
 * Copyright 2010-2024 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

// Auto-generated file. DO NOT EDIT!
// Generated by: org.jetbrains.kotlin.generators.builtins.unsigned.UnsignedTypeGenerator

package kotlin


@SinceKotlin("1.5")
public value class ULong @kotlin.internal.IntrinsicConstEvaluation @PublishedApi internal constructor(@PublishedApi internal val data: Long) : Comparable<ULong> {

    public companion object {
        /**
         * A constant holding the minimum value an instance of ULong can have.
         */
        public const val MIN_VALUE: ULong = ULong(0)

        /**
         * A constant holding the maximum value an instance of ULong can have.
         */
        public const val MAX_VALUE: ULong = ULong(-1)

        /**
         * The number of bytes used to represent an instance of ULong in a binary form.
         */
        public const val SIZE_BYTES: Int = 8

        /**
         * The number of bits used to represent an instance of ULong in a binary form.
         */
        public const val SIZE_BITS: Int = 64
    }

    /**
     * Compares this value with the specified value for order.
     * Returns zero if this value is equal to the specified other value, a negative number if it's less than other,
     * or a positive number if it's greater than other.
     */
    @kotlin.internal.InlineOnly
    public inline operator fun compareTo(other: UByte): Int = this.compareTo(other.toULong())

    /**
     * Compares this value with the specified value for order.
     * Returns zero if this value is equal to the specified other value, a negative number if it's less than other,
     * or a positive number if it's greater than other.
     */
    @kotlin.internal.InlineOnly
    public inline operator fun compareTo(other: UShort): Int = this.compareTo(other.toULong())

    /**
     * Compares this value with the specified value for order.
     * Returns zero if this value is equal to the specified other value, a negative number if it's less than other,
     * or a positive number if it's greater than other.
     */
    @kotlin.internal.InlineOnly
    public inline operator fun compareTo(other: UInt): Int = this.compareTo(other.toULong())

    /**
     * Compares this value with the specified value for order.
     * Returns zero if this value is equal to the specified other value, a negative number if it's less than other,
     * or a positive number if it's greater than other.
     */
    @kotlin.internal.InlineOnly
    @Suppress("OVERRIDE_BY_INLINE")
    public override inline operator fun compareTo(other: ULong): Int = error("Stub")

    /** Adds the other value to this value. */
    @kotlin.internal.InlineOnly
    public inline operator fun plus(other: UByte): ULong = this.plus(other.toULong())
    /** Adds the other value to this value. */
    @kotlin.internal.InlineOnly
    public inline operator fun plus(other: UShort): ULong = this.plus(other.toULong())
    /** Adds the other value to this value. */
    @kotlin.internal.InlineOnly
    public inline operator fun plus(other: UInt): ULong = this.plus(other.toULong())
    /** Adds the other value to this value. */
    @kotlin.internal.InlineOnly
    public inline operator fun plus(other: ULong): ULong = ULong(this.data.plus(other.data))

    /** Subtracts the other value from this value. */
    @kotlin.internal.InlineOnly
    public inline operator fun minus(other: UByte): ULong = this.minus(other.toULong())
    /** Subtracts the other value from this value. */
    @kotlin.internal.InlineOnly
    public inline operator fun minus(other: UShort): ULong = this.minus(other.toULong())
    /** Subtracts the other value from this value. */
    @kotlin.internal.InlineOnly
    public inline operator fun minus(other: UInt): ULong = this.minus(other.toULong())
    /** Subtracts the other value from this value. */
    @kotlin.internal.InlineOnly
    public inline operator fun minus(other: ULong): ULong = ULong(this.data.minus(other.data))

    /** Multiplies this value by the other value. */
    @kotlin.internal.InlineOnly
    public inline operator fun times(other: UByte): ULong = this.times(other.toULong())
    /** Multiplies this value by the other value. */
    @kotlin.internal.InlineOnly
    public inline operator fun times(other: UShort): ULong = this.times(other.toULong())
    /** Multiplies this value by the other value. */
    @kotlin.internal.InlineOnly
    public inline operator fun times(other: UInt): ULong = this.times(other.toULong())
    /** Multiplies this value by the other value. */
    @kotlin.internal.InlineOnly
    public inline operator fun times(other: ULong): ULong = ULong(this.data.times(other.data))

    /** Divides this value by the other value, truncating the result to an integer that is closer to zero. */
    @kotlin.internal.InlineOnly
    public inline operator fun div(other: UByte): ULong = this.div(other.toULong())
    /** Divides this value by the other value, truncating the result to an integer that is closer to zero. */
    @kotlin.internal.InlineOnly
    public inline operator fun div(other: UShort): ULong = this.div(other.toULong())
    /** Divides this value by the other value, truncating the result to an integer that is closer to zero. */
    @kotlin.internal.InlineOnly
    public inline operator fun div(other: UInt): ULong = this.div(other.toULong())
    /** Divides this value by the other value, truncating the result to an integer that is closer to zero. */
    @kotlin.internal.InlineOnly
    public inline operator fun div(other: ULong): ULong = error("Stub")

    /**
     * Calculates the remainder of truncating division of this value (dividend) by the other value (divisor).
     *
     * The result is always less than the divisor.
     */
    @kotlin.internal.InlineOnly
    public inline operator fun rem(other: UByte): ULong = this.rem(other.toULong())
    /**
     * Calculates the remainder of truncating division of this value (dividend) by the other value (divisor).
     *
     * The result is always less than the divisor.
     */
    @kotlin.internal.InlineOnly
    public inline operator fun rem(other: UShort): ULong = this.rem(other.toULong())
    /**
     * Calculates the remainder of truncating division of this value (dividend) by the other value (divisor).
     *
     * The result is always less than the divisor.
     */
    @kotlin.internal.InlineOnly
    public inline operator fun rem(other: UInt): ULong = this.rem(other.toULong())
    /**
     * Calculates the remainder of truncating division of this value (dividend) by the other value (divisor).
     *
     * The result is always less than the divisor.
     */
    @kotlin.internal.InlineOnly
    public inline operator fun rem(other: ULong): ULong = error("Stub")

    /**
     * Divides this value by the other value, flooring the result to an integer that is closer to negative infinity.
     *
     * For unsigned types, the results of flooring division and truncating division are the same.
     */
    @kotlin.internal.InlineOnly
    public inline fun floorDiv(other: UByte): ULong = this.floorDiv(other.toULong())
    /**
     * Divides this value by the other value, flooring the result to an integer that is closer to negative infinity.
     *
     * For unsigned types, the results of flooring division and truncating division are the same.
     */
    @kotlin.internal.InlineOnly
    public inline fun floorDiv(other: UShort): ULong = this.floorDiv(other.toULong())
    /**
     * Divides this value by the other value, flooring the result to an integer that is closer to negative infinity.
     *
     * For unsigned types, the results of flooring division and truncating division are the same.
     */
    @kotlin.internal.InlineOnly
    public inline fun floorDiv(other: UInt): ULong = this.floorDiv(other.toULong())
    /**
     * Divides this value by the other value, flooring the result to an integer that is closer to negative infinity.
     *
     * For unsigned types, the results of flooring division and truncating division are the same.
     */
    @kotlin.internal.InlineOnly
    public inline fun floorDiv(other: ULong): ULong = div(other)

    /**
     * Calculates the remainder of flooring division of this value (dividend) by the other value (divisor).
     *
     * The result is always less than the divisor.
     *
     * For unsigned types, the remainders of flooring division and truncating division are the same.
     */
    @kotlin.internal.InlineOnly
    public inline fun mod(other: UByte): UByte = this.mod(other.toULong()).toUByte()
    /**
     * Calculates the remainder of flooring division of this value (dividend) by the other value (divisor).
     *
     * The result is always less than the divisor.
     *
     * For unsigned types, the remainders of flooring division and truncating division are the same.
     */
    @kotlin.internal.InlineOnly
    public inline fun mod(other: UShort): UShort = this.mod(other.toULong()).toUShort()
    /**
     * Calculates the remainder of flooring division of this value (dividend) by the other value (divisor).
     *
     * The result is always less than the divisor.
     *
     * For unsigned types, the remainders of flooring division and truncating division are the same.
     */
    @kotlin.internal.InlineOnly
    public inline fun mod(other: UInt): UInt = this.mod(other.toULong()).toUInt()
    /**
     * Calculates the remainder of flooring division of this value (dividend) by the other value (divisor).
     *
     * The result is always less than the divisor.
     *
     * For unsigned types, the remainders of flooring division and truncating division are the same.
     */
    @kotlin.internal.InlineOnly
    public inline fun mod(other: ULong): ULong = rem(other)

    /**
     * Returns this value incremented by one.
     *
     * @sample samples.misc.Builtins.inc
     */
    @kotlin.internal.InlineOnly
    public inline operator fun inc(): ULong = ULong(data.inc())

    /**
     * Returns this value decremented by one.
     *
     * @sample samples.misc.Builtins.dec
     */
    @kotlin.internal.InlineOnly
    public inline operator fun dec(): ULong = ULong(data.dec())

    /** Creates a range from this value to the specified [other] value. */
    @kotlin.internal.InlineOnly
    public inline operator fun rangeTo(other: ULong): ULongRange = ULongRange(this, other)

    /**
     * Creates a range from this value up to but excluding the specified [other] value.
     *
     * If the [other] value is less than or equal to `this` value, then the returned range is empty.
     */
    @SinceKotlin("1.9")
    @kotlin.internal.InlineOnly
    public inline operator fun rangeUntil(other: ULong): ULongRange = this until other

    /**
     * Shifts this value left by the [bitCount] number of bits.
     *
     * Note that only the six lowest-order bits of the [bitCount] are used as the shift distance.
     * The shift distance actually used is therefore always in the range `0..63`.
     */
    @kotlin.internal.InlineOnly
    public inline infix fun shl(bitCount: Int): ULong = ULong(data shl bitCount)

    /**
     * Shifts this value right by the [bitCount] number of bits, filling the leftmost bits with zeros.
     *
     * Note that only the six lowest-order bits of the [bitCount] are used as the shift distance.
     * The shift distance actually used is therefore always in the range `0..63`.
     */
    @kotlin.internal.InlineOnly
    public inline infix fun shr(bitCount: Int): ULong = ULong(data ushr bitCount)

    /** Performs a bitwise AND operation between the two values. */
    @kotlin.internal.InlineOnly
    public inline infix fun and(other: ULong): ULong = ULong(this.data and other.data)
    /** Performs a bitwise OR operation between the two values. */
    @kotlin.internal.InlineOnly
    public inline infix fun or(other: ULong): ULong = ULong(this.data or other.data)
    /** Performs a bitwise XOR operation between the two values. */
    @kotlin.internal.InlineOnly
    public inline infix fun xor(other: ULong): ULong = ULong(this.data xor other.data)
    /** Inverts the bits in this value. */
    @kotlin.internal.InlineOnly
    public inline fun inv(): ULong = ULong(data.inv())

    /**
     * Converts this [ULong] value to [Byte].
     *
     * If this value is less than or equals to [Byte.MAX_VALUE], the resulting `Byte` value represents
     * the same numerical value as this `ULong`.
     *
     * The resulting `Byte` value is represented by the least significant 8 bits of this `ULong` value.
     * Note that the resulting `Byte` value may be negative.
     */
    @kotlin.internal.InlineOnly
    public inline fun toByte(): Byte = data.toByte()
    /**
     * Converts this [ULong] value to [Short].
     *
     * If this value is less than or equals to [Short.MAX_VALUE], the resulting `Short` value represents
     * the same numerical value as this `ULong`.
     *
     * The resulting `Short` value is represented by the least significant 16 bits of this `ULong` value.
     * Note that the resulting `Short` value may be negative.
     */
    @kotlin.internal.InlineOnly
    public inline fun toShort(): Short = data.toShort()
    /**
     * Converts this [ULong] value to [Int].
     *
     * If this value is less than or equals to [Int.MAX_VALUE], the resulting `Int` value represents
     * the same numerical value as this `ULong`.
     *
     * The resulting `Int` value is represented by the least significant 32 bits of this `ULong` value.
     * Note that the resulting `Int` value may be negative.
     */
    @kotlin.internal.InlineOnly
    public inline fun toInt(): Int = data.toInt()
    /**
     * Converts this [ULong] value to [Long].
     *
     * If this value is less than or equals to [Long.MAX_VALUE], the resulting `Long` value represents
     * the same numerical value as this `ULong`. Otherwise the result is negative.
     *
     * The resulting `Long` value has the same binary representation as this `ULong` value.
     */
    @kotlin.internal.InlineOnly
    public inline fun toLong(): Long = data

    /**
     * Converts this [ULong] value to [UByte].
     *
     * If this value is less than or equals to [UByte.MAX_VALUE], the resulting `UByte` value represents
     * the same numerical value as this `ULong`.
     *
     * The resulting `UByte` value is represented by the least significant 8 bits of this `ULong` value.
     */
    @kotlin.internal.InlineOnly
    public inline fun toUByte(): UByte = data.toUByte()
    /**
     * Converts this [ULong] value to [UShort].
     *
     * If this value is less than or equals to [UShort.MAX_VALUE], the resulting `UShort` value represents
     * the same numerical value as this `ULong`.
     *
     * The resulting `UShort` value is represented by the least significant 16 bits of this `ULong` value.
     */
    @kotlin.internal.InlineOnly
    public inline fun toUShort(): UShort = data.toUShort()
    /**
     * Converts this [ULong] value to [UInt].
     *
     * If this value is less than or equals to [UInt.MAX_VALUE], the resulting `UInt` value represents
     * the same numerical value as this `ULong`.
     *
     * The resulting `UInt` value is represented by the least significant 32 bits of this `ULong` value.
     */
    @kotlin.internal.InlineOnly
    public inline fun toUInt(): UInt = data.toUInt()
    /** Returns this value. */
    @kotlin.internal.InlineOnly
    public inline fun toULong(): ULong = this

    /**
     * Converts this [ULong] value to [Float].
     *
     * The resulting value is the closest `Float` to this `ULong` value.
     * In case when this `ULong` value is exactly between two `Float`s,
     * the one with zero at least significant bit of mantissa is selected.
     */
    @kotlin.internal.InlineOnly
    public inline fun toFloat(): Float = error("Stub")
    /**
     * Converts this [ULong] value to [Double].
     *
     * The resulting value is the closest `Double` to this `ULong` value.
     * In case when this `ULong` value is exactly between two `Double`s,
     * the one with zero at least significant bit of mantissa is selected.
     */
    @kotlin.internal.InlineOnly
    public inline fun toDouble(): Double = error("Stub")

    public override fun toString(): String = error("Stub")

}

/**
 * Converts this [Byte] value to [ULong].
 *
 * If this value is positive, the resulting `ULong` value represents the same numerical value as this `Byte`.
 *
 * The least significant 8 bits of the resulting `ULong` value are the same as the bits of this `Byte` value,
 * whereas the most significant 56 bits are filled with the sign bit of this value.
 */
@SinceKotlin("1.5")
@kotlin.internal.InlineOnly
public inline fun Byte.toULong(): ULong = ULong(this.toLong())
/**
 * Converts this [Short] value to [ULong].
 *
 * If this value is positive, the resulting `ULong` value represents the same numerical value as this `Short`.
 *
 * The least significant 16 bits of the resulting `ULong` value are the same as the bits of this `Short` value,
 * whereas the most significant 48 bits are filled with the sign bit of this value.
 */
@SinceKotlin("1.5")
@kotlin.internal.InlineOnly
public inline fun Short.toULong(): ULong = ULong(this.toLong())
/**
 * Converts this [Int] value to [ULong].
 *
 * If this value is positive, the resulting `ULong` value represents the same numerical value as this `Int`.
 *
 * The least significant 32 bits of the resulting `ULong` value are the same as the bits of this `Int` value,
 * whereas the most significant 32 bits are filled with the sign bit of this value.
 */
@SinceKotlin("1.5")
@kotlin.internal.InlineOnly
public inline fun Int.toULong(): ULong = ULong(this.toLong())
/**
 * Converts this [Long] value to [ULong].
 *
 * If this value is positive, the resulting `ULong` value represents the same numerical value as this `Long`.
 *
 * The resulting `ULong` value has the same binary representation as this `Long` value.
 */
@SinceKotlin("1.5")
@kotlin.internal.InlineOnly
public inline fun Long.toULong(): ULong = ULong(this)

/**
 * Converts this [Float] value to [ULong].
 *
 * The fractional part, if any, is rounded down towards zero.
 * Returns zero if this `Float` value is negative or `NaN`, [ULong.MAX_VALUE] if it's bigger than `ULong.MAX_VALUE`.
 */
@SinceKotlin("1.5")
@kotlin.internal.InlineOnly
public inline fun Float.toULong(): ULong = error("Stub")
/**
 * Converts this [Double] value to [ULong].
 *
 * The fractional part, if any, is rounded down towards zero.
 * Returns zero if this `Double` value is negative or `NaN`, [ULong.MAX_VALUE] if it's bigger than `ULong.MAX_VALUE`.
 */
@SinceKotlin("1.5")
@kotlin.internal.InlineOnly
public inline fun Double.toULong(): ULong = error("Stub")
