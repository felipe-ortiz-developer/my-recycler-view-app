package com.example.myrecyclerviewapp.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Afirmaciones(
    @StringRes val stringRecursoId: Int,
    @DrawableRes val imageResourceId: Int)
{
}