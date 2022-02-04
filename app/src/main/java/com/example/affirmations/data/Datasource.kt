package com.example.affirmations.data

import com.example.affirmations.R
import com.example.affirmations.model.Affirmation

class Datasource {

    public fun loadListString() : ArrayList<Affirmation> {
        return arrayListOf(
            Affirmation(R.string.affirmation1, R.drawable.reikland),
            Affirmation(R.string.affirmation2, R.drawable.middleland),
            Affirmation(R.string.affirmation3, R.drawable.kislev),
            Affirmation(R.string.affirmation4, R.drawable.couronne),
            Affirmation(R.string.affirmation5, R.drawable.bordelaux),
            Affirmation(R.string.affirmation6, R.drawable.carcassonne),
            Affirmation(R.string.affirmation7, R.drawable.mon_256),
            Affirmation(R.string.affirmation8, R.drawable.knayzex),
        )
    }
}