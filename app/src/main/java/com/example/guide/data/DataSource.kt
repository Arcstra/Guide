package com.example.guide.data

import com.example.guide.R


val topic: List<Pair<Int, List<TopicUIState>>> = listOf(
    /** Список тем по физике */
    Pair(
        R.string.physics,
        listOf(
            TopicUIState(content = R.string.lorem_ipsum_more, images = listOf(Pair(R.drawable.c7f390645e1ba7ba0338173f304152ce_big, R.string.physics))),
            TopicUIState(),
            TopicUIState(),
            TopicUIState(),
            TopicUIState(),
            TopicUIState(),
            TopicUIState(),
            TopicUIState(),
            TopicUIState(),
        )
    ),
    /** Список тем по математике */
    Pair(
        R.string.mathematics,
        listOf(
            TopicUIState(),
            TopicUIState(),
            TopicUIState(),
            TopicUIState(),
            TopicUIState(),
            TopicUIState(),
            TopicUIState(),
            TopicUIState(),
            TopicUIState(),
            TopicUIState(),
        )
    )
)