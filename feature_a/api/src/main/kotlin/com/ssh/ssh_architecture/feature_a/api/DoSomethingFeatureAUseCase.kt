package com.ssh.ssh_architecture.feature_a.api

import com.ssh.ssh_architecture.feature_a.domain.FeatureAService

class DoSomethingFeatureAUseCase(val featureAService: FeatureAService) {

    suspend operator fun invoke(): Result<Unit> = featureAService.doSomething()
}