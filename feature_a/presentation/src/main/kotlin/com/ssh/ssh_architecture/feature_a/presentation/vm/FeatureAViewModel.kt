package com.ssh.ssh_architecture.feature_a.presentation.vm

import androidx.lifecycle.ViewModel
import com.ssh.ssh_architecture.feature_a.api.DoSomethingFeatureAUseCase
import com.ssh.ssh_architecture.feature_a.presentation.model.FeatureAModel
import com.ssh.ssh_architecture.feature_a.presentation.model.mapper.mapToPresentation

internal class FeatureAViewModel constructor(
    private val doSomethingFeatureAUseCase: DoSomethingFeatureAUseCase,
) : ViewModel() {

    var featureAState by mutableStateOf<FeatureAModel>(value = FeatureAModel(message = "Loading..."))
        private set

    fun doSomething() {

        viewModelScope.launch {
            val model = doSomethingFeatureAUseCase
                .invoke()
                .map { model -> model.mapToPresentation() }
                .getOrElse {
                    FeatureAModel(message = "Something went wrong", additionalInfo = it.message)
                }

            featureAState = model
        }
    }
}