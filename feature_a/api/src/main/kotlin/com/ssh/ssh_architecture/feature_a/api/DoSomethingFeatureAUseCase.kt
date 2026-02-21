package com.ssh.ssh_architecture.feature_a.api

import com.ssh.ssh_architecture.feature_a.api.model.FeatureAModel
import com.ssh.ssh_architecture.feature_a.api.model.mapper.toApiModel
import com.ssh.ssh_architecture.feature_a.domain.FeatureARepository

class DoSomethingFeatureAUseCase(val featureAService: FeatureARepository) {

    suspend operator fun invoke(): Result<FeatureAModel> {
        return featureAService.doSomething().map { model -> model.toApiModel() }
    }
}