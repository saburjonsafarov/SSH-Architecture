package com.ssh.ssh_architecture.feature_a.presentation

import androidx.lifecycle.ViewModel
import com.ssh.ssh_architecture.feature_a.api.DoSomethingFeatureAUseCase

internal class FeatureAViewModel constructor(
    private val doSomethingFeatureAUseCase: DoSomethingFeatureAUseCase,
) : ViewModel() {
    suspend fun doSomething() = doSomethingFeatureAUseCase.invoke()
}