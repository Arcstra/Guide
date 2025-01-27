package com.example.guide

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.guide.ui.ListTopicScreen
import com.example.guide.ui.OneTopicScreen
import com.example.guide.ui.TopicViewModel

enum class GuideScreen {
    ListTopic,
    OneTopic
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun GuideAppBar(modifier: Modifier = Modifier) {
    TopAppBar(
        title = {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center
            ) {
                Text(
                    text = stringResource(R.string.app_name),
                    style = MaterialTheme.typography.displayLarge
                )
            }
        },
        modifier = modifier
    )
}

@Composable
fun GuideApp(
    viewModel: TopicViewModel = viewModel(),
    navController: NavHostController = rememberNavController()
) {
    Scaffold(
        topBar = { GuideAppBar() }
    )
    { innerPadding ->
        val uiState by viewModel.uiState.collectAsState()

        NavHost(
            navController = navController,
            startDestination = GuideScreen.ListTopic.name,
            modifier = Modifier.padding(innerPadding)
        ) {
            composable(route = GuideScreen.ListTopic.name) {
                ListTopicScreen(
                    showOneTopic = { topic ->
                        viewModel.setAllInfo(topic)
                        navController.navigate(GuideScreen.OneTopic.name)
                    }
                )
            }
            composable(route = GuideScreen.OneTopic.name) {
                OneTopicScreen(
                    backListTopic = { navController.navigate(GuideScreen.ListTopic.name) },
                    topic = uiState
                )
            }
        }
    }
}