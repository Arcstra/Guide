package com.example.guide.data

import androidx.annotation.StringRes
import com.example.guide.R

data class TopicUIState(
    @StringRes val name: Int = R.string.lorem,
    @StringRes val content: Int = R.string.lorem_ipsum,
    /** Ссылка на изображение и на подпись к ней */
    val images: List<Pair<Int, Int>> = listOf()
)
