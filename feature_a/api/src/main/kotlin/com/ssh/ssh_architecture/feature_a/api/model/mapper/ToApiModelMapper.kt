package com.ssh.ssh_architecture.feature_a.api.model.mapper

import com.ssh.ssh_architecture.feature_a.api.model.FeatureAModel

typealias DomainFeatureAModel = com.ssh.ssh_architecture.feature_a.domain.model.FeatureAModel

internal fun DomainFeatureAModel.toApiModel(): FeatureAModel {
    return FeatureAModel(message = message, additionalInfo = additionalInfo)
}