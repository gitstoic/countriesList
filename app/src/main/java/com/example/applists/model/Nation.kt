package com.example.applists.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Nation (
    @StringRes val stringResourceId: Int,
    @DrawableRes val imageResourceId: Int)
