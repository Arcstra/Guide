package com.example.guide.ui

import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
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
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
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
            Text(
                text = stringResource(topic.content),
                modifier = Modifier.padding(bottom = dimensionResource(R.dimen.padding_small)),
                style = MaterialTheme.typography.bodyLarge
            )
        }
        items(topic.images) {
            TopicImage(
                image = it.first,
                description = it.second
            )
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
    image: Int,
    @StringRes description: Int,
    modifier: Modifier = Modifier
) {
    Column(modifier) {
        Image(
            painter = painterResource(image),
            contentDescription = stringResource(description),
            modifier = Modifier.fillMaxWidth(),
            contentScale = ContentScale.Crop
        )
        Text(
            text = stringResource(description),
            modifier = Modifier.padding(bottom = dimensionResource(R.dimen.padding_small)),
            style = MaterialTheme.typography.labelLarge
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
            TopicUIState(name = R.string.sub_topic_label_mkt, content = R.string.sub_topic_body_mkt)
        )
    }
}