package com.getmobileltd.recycler_kotlin

/**
 * Created by themavencoder on 22,March,2019
 */
data class Model(var name: String)

object SampleContent {

    val names = listOf<Model>(
        Model("Ifeoluwa"),
        Model("Labake"),
        Model("Tobiloba"),
        Model("Tolulope"),
        Model("Adejumo"),
        Model("Ifeoluwa"),
        Model("Labake"),
        Model("Tobiloba"),
        Model("Tolulope"),
        Model("Adejumo")
        )

}