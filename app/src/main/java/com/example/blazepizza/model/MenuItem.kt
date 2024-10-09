package com.example.blazepizza.model

import androidx.annotation.DrawableRes
import java.text.NumberFormat

sealed class MenuItem(
    open val name: String,
    open val description: String,
    open val price: Double,
    @DrawableRes open val imageResourceId: Int,
) {
    /**
     * Getter method for price.
     * Includes formatting.
     */
    data class PizzaItem(
        override val name: String,
        override val description: String,
        override val price: Double,
        override val imageResourceId: Int
    ) : MenuItem(name, description, price, imageResourceId)

    data class CrustItem(
        override val name: String,
        override val description: String,
        override val price: Double,
        override val imageResourceId: Int
    ) : MenuItem(name, description, price, imageResourceId)

    data class SideDishItem(
        override val name: String,
        override val description: String,
        override val price: Double,
        override val imageResourceId: Int
    ) : MenuItem(name, description, price, imageResourceId)

    /**
     * Getter method for price.
     * Includes formatting.
     */
    fun getFormattedPrice(): String = NumberFormat.getCurrencyInstance().format(price)
}