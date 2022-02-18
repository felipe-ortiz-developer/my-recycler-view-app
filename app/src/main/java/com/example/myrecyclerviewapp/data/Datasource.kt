package com.example.myrecyclerviewapp.data

import com.example.myrecyclerviewapp.R
import com.example.myrecyclerviewapp.model.Afirmaciones

class Datasource {
    fun loadingData(): List<Afirmaciones> {
        return listOf<Afirmaciones>(
            Afirmaciones(R.string.affirmation1, R.drawable.image1),
            Afirmaciones(R.string.affirmation2, R.drawable.image2),
            Afirmaciones(R.string.affirmation3, R.drawable.image3),
            Afirmaciones(R.string.affirmation4, R.drawable.image4),
            Afirmaciones(R.string.affirmation5, R.drawable.image5),
            Afirmaciones(R.string.affirmation6, R.drawable.image6),
            Afirmaciones(R.string.affirmation7, R.drawable.image7),
            Afirmaciones(R.string.affirmation8, R.drawable.image8),
            Afirmaciones(R.string.affirmation9, R.drawable.image9),
            Afirmaciones(R.string.affirmation10, R.drawable.image10)
        )
    }
}