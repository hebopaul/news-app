package com.loc.newsapp.presentation.onboarding

import androidx.annotation.DrawableRes
import com.loc.newsapp.R

data class Page(
    val title: String,
    val description: String,
    @DrawableRes val image: Int
)

val pages = listOf(
    Page(
        title = "First Page is always first",
        description = "Sometimes you just have to pass through an onboarding screen... nothing wrong with that.",
        image = R.drawable.onboarding1
    ),
    Page(
        title = "Second Page always comes second, sadly",
        description = "There's nothing wrong with seeing the second page... it might offer some information you want to know about.",
        image = R.drawable.onboarding2
    ),
    Page(
        title = "Then again...",
        description = "Sometimes the second page just makes you angry... so one might take pleasure in showing you a third one.",
        image = R.drawable.onboarding3
    )
)
