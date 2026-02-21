package com.ssh.ssh_architecture.feature_a.data.model.mapper

import com.ssh.ssh_architecture.feature_a.data.model.FeatureADTO
import com.ssh.ssh_architecture.feature_a.domain.model.FeatureAModel

internal fun FeatureADTO.toDomainModel(): FeatureAModel {
    return FeatureAModel(message = message, additionalInfo = additionalInfo)
}
