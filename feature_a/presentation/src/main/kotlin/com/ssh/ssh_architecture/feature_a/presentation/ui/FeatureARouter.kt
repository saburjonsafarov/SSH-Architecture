package com.ssh.ssh_architecture.feature_a.presentation.ui

import com.ssh.ssh_architecture.feature_a.presentation.vm.FeatureAViewModel

@Composable
internal fun FeatureAScreen(modifier: Modifier = Modifier, featureAViewModel: FeatureAViewModel) {

    val state = featureAViewModel.featureAState

    LaunchedEffect(Unit) {
        featureAViewModel.doSomething()
    }

    FeatureAScreen(
        modifier = modifier,
        featureAModel = state,
        onSmeButtonClicked = { featureAViewModel.doSomething() })
}