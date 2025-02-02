package com.example.guide.ui

import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ExpandLess
import androidx.compose.material.icons.filled.ExpandMore
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.guide.R
import com.example.guide.data.TopicUIState
import com.example.guide.data.topic
import com.example.guide.ui.theme.GuideTheme

@Composable
fun ListTopicScreen(
    showOneTopic: (TopicUIState) -> Unit,
    modifier: Modifier = Modifier
) {
    val topicSomeSubjects = topic

    LazyColumn(modifier = modifier) {
        items(topicSomeSubjects) {
            ListSubjectTopic(
                showOneTopic = showOneTopic,
                topicOneSubject = it,
                modifier = Modifier.padding(dimensionResource(R.dimen.padding_small))
            )
        }
    }
}

@Composable
fun ListSubjectTopic(
    showOneTopic: (TopicUIState) -> Unit,
    topicOneSubject: Pair<Int, List<Pair<Int, List<TopicUIState>>>>,
    modifier: Modifier = Modifier
) {
    var expanded by remember { mutableStateOf(true) }
    Column(
        modifier = modifier.animateContentSize(
            animationSpec = spring(
                dampingRatio = Spring.DampingRatioNoBouncy,
                stiffness = Spring.StiffnessMedium
            )
        )
    ) {
        Button(
            onClick = { expanded = !expanded },
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = dimensionResource(R.dimen.padding_small)),
            colors = ButtonDefaults.buttonColors(
                containerColor = MaterialTheme.colorScheme.primaryContainer,
                contentColor = MaterialTheme.colorScheme.onPrimaryContainer
            )
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = stringResource(topicOneSubject.first),
                    style = MaterialTheme.typography.headlineLarge
                )
                Spacer(Modifier.weight(1f))
                Icon(
                    imageVector = if (expanded) Icons.Filled.ExpandLess else Icons.Filled.ExpandMore,
                    contentDescription = stringResource(R.string.expand_button_content_description)
                )
            }
        }
        if (expanded) {
            ListTopic(
                showOneTopic = showOneTopic,
                listTopic = topicOneSubject.second
            )
        }
    }
}

@Composable
fun ListTopic(
    showOneTopic: (TopicUIState) -> Unit,
    listTopic: List<Pair<Int, List<TopicUIState>>>,
    modifier: Modifier = Modifier
) {
    Column(modifier) {
        listTopic.forEach {
            ItemTopic(
                showOneTopic = showOneTopic,
                itemTopic = it,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = dimensionResource(R.dimen.padding_medium))
            )
        }
    }
}

@Composable
fun ItemTopic(
    showOneTopic: (TopicUIState) -> Unit,
    itemTopic: Pair<Int, List<TopicUIState>>,
    modifier: Modifier = Modifier
) {
    var expanded by remember { mutableStateOf(false) }
    Column(
        modifier = modifier.animateContentSize(
            animationSpec = spring(
                dampingRatio = Spring.DampingRatioNoBouncy,
                stiffness = Spring.StiffnessMedium
            )
        )
    ) {
        Button(
            onClick = { expanded = !expanded },
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = dimensionResource(R.dimen.padding_small)),
            colors = ButtonDefaults.buttonColors(
                containerColor = MaterialTheme.colorScheme.secondaryContainer,
                contentColor = MaterialTheme.colorScheme.onSecondaryContainer
            )
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = stringResource(itemTopic.first),
                    modifier = Modifier.weight(1f, fill = true),
                    style = MaterialTheme.typography.headlineMedium
                )
                Icon(
                    imageVector = if (expanded) Icons.Filled.ExpandLess else Icons.Filled.ExpandMore,
                    contentDescription = stringResource(R.string.expand_button_content_description)
                )
            }
        }
        if (expanded) {
            ListSubTopic(
                showOneTopic = showOneTopic,
                listTopic = itemTopic.second
            )
        }
    }
}

@Composable
fun ListSubTopic(
    showOneTopic: (TopicUIState) -> Unit,
    listTopic: List<TopicUIState>,
    modifier: Modifier = Modifier
) {
    Column(modifier) {
        listTopic.forEach {
            ItemSubTopic(
                showOneTopic = showOneTopic,
                itemTopic = it,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = dimensionResource(R.dimen.padding_medium))
            )
        }
    }
}

@Composable
fun ItemSubTopic(
    showOneTopic: (TopicUIState) -> Unit,
    itemTopic: TopicUIState,
    modifier: Modifier = Modifier
) {
    Button(
        onClick = { showOneTopic(itemTopic) },
        modifier = modifier.padding(bottom = dimensionResource(R.dimen.padding_small)),
        shape = MaterialTheme.shapes.small,
        colors = ButtonDefaults.buttonColors(
            containerColor = MaterialTheme.colorScheme.tertiaryContainer,
            contentColor = MaterialTheme.colorScheme.onTertiaryContainer
        )
    ) {
        Text(
            text = stringResource(itemTopic.name),
            style = MaterialTheme.typography.headlineSmall
        )
    }
}

@Preview
@Composable
fun ListPreview() {
    GuideTheme {
        ListTopicScreen({})
    }
}
