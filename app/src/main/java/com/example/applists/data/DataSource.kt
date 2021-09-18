package com.example.applists.data

import com.example.applists.R
import com.example.applists.model.Nation

class DataSource {

    fun loadNation() : List<Nation>{
        return listOf<Nation>(
            Nation(R.string.country1, R.drawable.nigeria),
            Nation(R.string.country2, R.drawable.kenya),
            Nation(R.string.country3, R.drawable.ghana),
            Nation(R.string.country4, R.drawable.gambia),
            Nation(R.string.country5, R.drawable.tanzania),
            Nation(R.string.country6, R.drawable.morocco),
            Nation(R.string.country7, R.drawable.libya),
            Nation(R.string.country8, R.drawable.ethiopia),
            Nation(R.string.country9, R.drawable.egypt),
            Nation(R.string.country10, R.drawable.angola),
            Nation(R.string.country11, R.drawable.botswana),
            Nation(R.string.country12, R.drawable.mozambique),
            Nation(R.string.country13, R.drawable.madagascar),
            Nation(R.string.country14, R.drawable.algeria),
            Nation(R.string.country15, R.drawable.cameroon),
            Nation(R.string.country16, R.drawable.malawi),
            Nation(R.string.country17, R.drawable.uganda),
            Nation(R.string.country18, R.drawable.benin)

                )
    }
}