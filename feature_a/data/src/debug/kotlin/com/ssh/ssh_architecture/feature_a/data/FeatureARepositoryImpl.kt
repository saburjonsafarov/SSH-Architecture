package com.ssh.ssh_architecture.feature_a.data

import com.ssh.ssh_architecture.feature_a.data.model.mapper.toDomainModel
import com.ssh.ssh_architecture.feature_a.domain.FeatureARepository
import com.ssh.ssh_architecture.feature_a.domain.model.FeatureAModel

internal class FeatureARepositoryImpl(private val featureAService: FeatureAService) :
    FeatureARepository {

    override suspend fun doSomething(): Result<FeatureAModel> = featureAService
        .doSomething()
        .map { model -> model.toDomainModel() }
}