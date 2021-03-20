package com.example.affirmations.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes


/*
 * al agregar el prefijo data, indicas que la clase se de tipo datos
 * los que obliga a por lo menos definirle una propiedad
 */
data class Affirmation(
        @StringRes val stringResourceId : Int,
        @DrawableRes val imageResourceId : Int) {
}