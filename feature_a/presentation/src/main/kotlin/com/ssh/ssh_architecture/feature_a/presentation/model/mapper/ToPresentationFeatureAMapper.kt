package com.ssh.ssh_architecture.feature_a.presentation.model.mapper

import com.ssh.ssh_architecture.feature_a.presentation.model.FeatureAModel


private typealias FeatureAApiModel = com.ssh.ssh_architecture.feature_a.api.model.FeatureAModel

internal fun FeatureAApiModel.mapToPresentation(): FeatureAModel {
    return FeatureAModel(message = message, additionalInfo = additionalInfo)
}