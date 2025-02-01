package com.example.guide.ui

import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.guide.R
import com.example.guide.data.TopicUIState
import com.example.guide.ui.theme.GuideTheme

@Composable
fun OneTopicScreen(
    backListTopic: () -> Unit,
    topic: TopicUIState,
    modifier: Modifier = Modifier
) {
    LazyColumn(
        modifier = modifier.padding(
            start = dimensionResource(R.dimen.padding_medium),
            end = dimensionResource(R.dimen.padding_medium)
        ),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        item {
            Text(
                text = stringResource(topic.name),
                modifier = Modifier.padding(bottom = dimensionResource(R.dimen.padding_small)),
                style = MaterialTheme.typography.headlineLarge,
                textAlign = TextAlign.Center
            )
        }
        if (topic.content != null) {
            item {
                Text(
                    text = stringResource(topic.content),
                    modifier = Modifier.padding(bottom = dimensionResource(R.dimen.padding_small)),
                    style = MaterialTheme.typography.bodyLarge
                )
            }
        }
        item {
            Column {
                topic.images.forEach {
                    TopicImage(
                        idImage = it.first,
                        description = it.second
                    )
                }
            }
        }
        if (topic.under != null) {
            item {
                Text(
                    text = stringResource(topic.under),
                    modifier = Modifier.padding(bottom = dimensionResource(R.dimen.padding_small)),
                    style = MaterialTheme.typography.bodyLarge
                )
            }
        }
        item {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.End
            ) {
                BackButton(onClick = backListTopic)
            }
        }
    }
}

@Composable
fun TopicImage(
    idImage: Int,
    @StringRes description: Int?,
    modifier: Modifier = Modifier
) {
    val configuration = LocalConfiguration.current
    val screenWidth = configuration.screenWidthDp

    val image = painterResource(id = idImage) // Загружаем изображение
    val intrinsicSize = image.intrinsicSize

    // Рассчитываем новый размер
    val finalWidth = (intrinsicSize.width * minOf(1.0f, 1.0f * screenWidth / intrinsicSize.width))
    val finalHeight = (intrinsicSize.height * minOf(1.0f, 1.0f * screenWidth / intrinsicSize.width))

    Column(modifier) {
        if (description != null)
            Text(
                text = stringResource(description),
                modifier = Modifier.padding(bottom = dimensionResource(R.dimen.padding_small)),
                style = MaterialTheme.typography.bodyLarge
            )
        Image(
            painter = image,
            contentDescription = if (description != null) stringResource(description) else null,
            modifier = Modifier
                .size(finalWidth.dp, finalHeight.dp)
                .padding(bottom = dimensionResource(R.dimen.padding_small)),
            alignment = Alignment.TopStart,
            contentScale = ContentScale.Fit
        )
    }
}

@Composable
fun BackButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Button(
        onClick = onClick,
        modifier = modifier,
        colors = ButtonDefaults.buttonColors(
            containerColor = MaterialTheme.colorScheme.secondaryContainer,
            contentColor = MaterialTheme.colorScheme.onSecondaryContainer
        )
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = stringResource(R.string.back),
                style = MaterialTheme.typography.labelLarge
            )
            Icon(
                imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                contentDescription = stringResource(R.string.back_button_content_description)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewOneTopic() {
    GuideTheme {
        OneTopicScreen(
            {},
            TopicUIState(name = R.string.sub_topic_label_osn_yravn_mkt, content = R.string.sub_topic_body_osn_yravn_mkt,
                images = listOf(
                    Pair(R.drawable.osn_yravn_mkt, R.string.description_image_osn_yravn_mkt),
                    Pair(R.drawable.sred_kvadr_scor, R.string.description_image_sred_kvadr_scor),
                    Pair(R.drawable.konz, R.string.description_image_konz),
                    Pair(R.drawable.sred_davl_gaz, R.string.description_image_sred_davl_gaz)
                )
            )
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewOneTopic1() {
    GuideTheme {
        OneTopicScreen(
            {},
            TopicUIState(name = R.string.sub_topic_label_graph_izoprocess, content = null,
                images = listOf(
                    Pair(R.drawable.graph_izoprocess, R.string.description_image_graph_izoprocess)
                )
            )
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewOneTopic2() {
    GuideTheme {
        OneTopicScreen(
            {},
            TopicUIState(name = R.string.sub_topic_label_term_2, content = null,
                images = listOf(
                    Pair(R.drawable.term_10, R.string.description_image_term_10)
                )
            )
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewOneTopic3() {
    GuideTheme {
        OneTopicScreen(
            {},
            TopicUIState(name = R.string.sub_topic_label_term_5, content = null,
                images = listOf(
                    Pair(R.drawable.term_16, R.string.description_image_term_16),
                    Pair(R.drawable.term_17, R.string.description_image_term_17),
                    Pair(R.drawable.term_18, R.string.description_image_term_18)
                )
            )
        )
    }
}