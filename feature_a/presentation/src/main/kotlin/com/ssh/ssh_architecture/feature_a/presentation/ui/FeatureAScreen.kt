package com.ssh.ssh_architecture.feature_a.presentation.ui

import com.ssh.ssh_architecture.feature_a.presentation.model.FeatureAModel


@Composable
internal fun FeatureAScreen(
    modifier: Modifier = Modifier,
    featureAModel: FeatureAModel,
    onSmeButtonClicked: () -> Unit
) {
    //...
}

@Preview
@Composable
private fun Preview() {
    FeatureAScreen(
        featureAModel = FeatureAModel(
            message = "Hello World!",
            additionalInfo = "Additional info"
        )
    )
}