package com.example.blazepizza.datasource

import com.example.blazepizza.model.MenuItem


object DataSource {

  val pizzaMenuItems = listOf(
    MenuItem.PizzaItem(
      name = "Cheese and Tomato",
      description = "Classic pizza with tomato and cheese",
      price = 10.99,
      imageResourceId = 1
    ),
    MenuItem.PizzaItem(
      name = "Texas BBQ",
      description = "Spicy pizza with BBQ sauce",
      price = 12.99,
      imageResourceId = 2
    ),
    MenuItem.PizzaItem(
      name = "Veg Supreme",
      description = "Vegetarian pizza with multiple toppings",
      price = 11.99,
      imageResourceId = 3
    ),
    MenuItem.PizzaItem(
      name = "Chicken Feast",
      description = "Pizza with chicken and cheese",
      price = 13.99,
      imageResourceId = 4
    ),
    MenuItem.PizzaItem(
      name = "American Hot",
      description = "Pizza with American hot sauce",
      price = 12.99,
      imageResourceId = 5
    )
  )

  val crustMenuItems = listOf(
    MenuItem.CrustItem(
      name = "Thin",
      description = "Thin crust pizza",
      price = 0.0,
      imageResourceId = 6
    ),
    MenuItem.CrustItem(
      name = "Thick",
      description = "Thick crust pizza",
      price = 2.99,
      imageResourceId = 7
    ),
    MenuItem.CrustItem(
      name = "Stuffed",
      description = "Stuffed crust pizza",
      price = 3.99,
      imageResourceId = 8
    ),
    MenuItem.CrustItem(
      name = "Cheesy",
      description = "Cheesy crust pizza",
      price = 4.99,
      imageResourceId = 9
    )
  )

  val sideDishMenuItems = listOf(
    MenuItem.SideDishItem(
      name = "Onion Rings",
      description = "Crispy onion rings",
      price = 2.99,
      imageResourceId = 10
    ),
    MenuItem.SideDishItem(
      name = "Garlic Bread",
      description = "Fresh garlic bread",
      price = 3.99,
      imageResourceId = 11
    ),
    MenuItem.SideDishItem(
      name = "Mashed Potatoes",
      description = "Mashed potatoes with cheese",
      price = 4.99,
      imageResourceId = 12
    ),
    MenuItem.SideDishItem(
      name = "Sweet Potato Fries",
      description = "Crispy sweet potato fries",
      price = 3.99,
      imageResourceId = 13
    ),
    MenuItem.SideDishItem(
      name = "Cheese Dip",
      description = "Cheese dip with marinara sauce",
      price = 2.99,
      imageResourceId = 14
    )
  )

}
