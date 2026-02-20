package com.ssh.ssh_architecture.feature_a.module

import com.ssh.ssh_architecture.feature_a.api.DoSomethingFeatureAUseCase
import com.ssh.ssh_architecture.feature_a.data.FeatureARepositoryImpl
import com.ssh.ssh_architecture.feature_a.data.FeatureAServiceImpl
import com.ssh.ssh_architecture.feature_a.domain.FeatureARepository
import com.ssh.ssh_architecture.feature_a.domain.FeatureAService

object Module {

    fun createFeatureARepository(): FeatureARepository = FeatureARepositoryImpl()

    fun createFeatureAService(featureARepository: FeatureARepository): FeatureAService {
        return FeatureAServiceImpl(featureARepository)
    }

    fun createDoSomethingForFeatureA(featureAService: FeatureAService): DoSomethingFeatureAUseCase {
        return DoSomethingFeatureAUseCase(featureAService)
    }
}