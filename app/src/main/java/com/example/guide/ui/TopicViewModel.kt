package com.example.guide.ui

import androidx.lifecycle.ViewModel
import com.example.guide.data.TopicUIState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class TopicViewModel: ViewModel() {
    private val _uiState = MutableStateFlow(TopicUIState(content = null))
    val uiState: StateFlow<TopicUIState> = _uiState.asStateFlow()

    fun setAllInfo(topic: TopicUIState) {
        _uiState.value = topic
    }
}