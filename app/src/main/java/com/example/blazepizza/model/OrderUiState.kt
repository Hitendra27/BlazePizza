package com.example.blazepizza.model

data class OrderUiState (
  // Entree Selection
  val entree: MenuItem.EntreeItem? = null,
  val crust: MenuItem.CrustItem? = null,
  val sideDish: MenuItem.SideDishItem? = null,
  val itemTotalPrice: Double = 0.0,
  val orderTax: Double = 0.0,
  val orderTotalPrice: Double = 0.0,
)
