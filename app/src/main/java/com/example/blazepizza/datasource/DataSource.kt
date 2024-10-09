package com.example.blazepizza.datasource

import com.example.blazepizza.R
import com.example.blazepizza.model.MenuItem


object DataSource {

  val pizzaMenuItems = listOf(
    MenuItem.PizzaItem(
      name = "Original Cheese & Tomato",
      description = "Classic pizza with tomato and cheese",
      price = 10.99,
      imageResourceId = R.drawable.originalcheesetomato
    ),
    MenuItem.PizzaItem(
      name = "Texas BBQ",
      description = "Spicy pizza with BBQ sauce",
      price = 12.99,
      imageResourceId = R.drawable.texasbbq
    ),
    MenuItem.PizzaItem(
      name = "Veg Supreme",
      description = "Vegetarian pizza with multiple toppings",
      price = 11.99,
      imageResourceId = R.drawable.vegisupreme
    ),
    MenuItem.PizzaItem(
      name = "Chicken Feast",
      description = "Pizza with chicken and cheese",
      price = 13.99,
      imageResourceId = R.drawable.chickenfeast
    ),
    MenuItem.PizzaItem(
      name = "American Hot",
      description = "Pizza with American hot sauce",
      price = 12.99,
      imageResourceId = R.drawable.americanhot
    )
  )

  val crustMenuItems = listOf(
    MenuItem.CrustItem(
      name = "Classic Crust",
      description = "Classic fresh dough crust",
      price = 0.0,
      imageResourceId = R.drawable.classiccrust
    ),
    MenuItem.CrustItem(
      name = "Italian Style",
      description = "Famous Italian style crust",
      price = 2.99,
      imageResourceId = R.drawable.italianstyle
    ),
    MenuItem.CrustItem(
      name = "Stuffed",
      description = "Stuffed crust",
      price = 3.99,
      imageResourceId = R.drawable.stuffedcrust
    ),
    MenuItem.CrustItem(
      name = "Thin & Crispy ",
      description = "Thin & Crispy crust",
      price = 0.0,
      imageResourceId = R.drawable.thinandcrispy
    )
  )

  val sideDishMenuItems = listOf(
    MenuItem.SideDishItem(
      name = " Korean BBQ Chicken Wings",
      description = "Crispy korean style bbq chicken wings",
      price = 6.99,
      imageResourceId = R.drawable.koreanbbqwings
    ),
    MenuItem.SideDishItem(
      name = "Garlic Bread",
      description = "Fresh garlic bread",
      price = 3.99,
      imageResourceId = R.drawable.garlicbread
    ),
    MenuItem.SideDishItem(
      name = "Chcken Kickers",
      description = "Fried Chicken with red coating and garlic butter sauce",
      price = 4.99,
      imageResourceId = R.drawable.chickenkickers
    ),
    MenuItem.SideDishItem(
      name = "Loaded Fries",
      description = "Crispy sweet potato fries",
      price = 3.99,
      imageResourceId = R.drawable.loadedfries
    ),
    MenuItem.SideDishItem(
      name = "Chicken Strippers",
      description = "Fried Chicken breast strips",
      price = 8.99,
      imageResourceId = R.drawable.chickenstrippers
    )
  )
}
