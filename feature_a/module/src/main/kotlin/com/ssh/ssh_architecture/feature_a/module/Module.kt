package com.ssh.ssh_architecture.feature_a.module

import com.ssh.ssh_architecture.feature_a.api.DoSomethingFeatureAUseCase
import com.ssh.ssh_architecture.feature_a.data.FeatureAService
import com.ssh.ssh_architecture.feature_a.data.FeatureAServiceImpl

object Module {

    fun createFeatureAService(): FeatureAService = FeatureAServiceImpl()

    fun createDoSomethingForFeatureA(featureAService: FeatureAService): DoSomethingFeatureAUseCase {
        return DoSomethingFeatureAUseCase(featureAService)
    }
}