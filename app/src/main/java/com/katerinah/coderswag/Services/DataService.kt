package com.katerinah.coderswag.Services

import com.katerinah.coderswag.Models.Category
import com.katerinah.coderswag.Models.Product

object DataService {
    val categories = listOf(
        Category("Shirts", "shirtimage"),
        Category("Hoodies", "hoodieimage"),
        Category("Hats", "hatimage"),
        Category("Digital", "digitalgoodsimage")
    )

    val hats = listOf(
        Product("Graphic Beanie", "$18", "hat1"),
        Product("Ball Cap", "$22", "hat2"),
        Product("Light Logo Ball Cap", "$21", "hat3"),
        Product("Rimmed Ball Cap", "$22", "hat4")
    )

    val hoodies = listOf(
        Product("Black Logo Hoodie", "$25", "hoodie1"),
        Product("Red Logo Hoodie", "$25", "hoodie2"),
        Product("Grey Graphic Hoodie", "$23", "hoodie3"),
        Product("Black Graphic Hoodie", "$22", "hoodie4")
    )

    val shirts = listOf(
        Product("Black Logo Tee", "$15", "shirt1"),
        Product("White Retro Tee", "$17", "shirt2"),
        Product("Red Logo Tee", "$15", "shirt3"),
        Product("Grey Graphic Tee", "$17", "shirt4"),
        Product("Kickflap Studios Graphic Tee", "$15", "shirt5")
    )
}