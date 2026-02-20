package com.ssh.ssh_architecture.feature_a.data

import com.ssh.ssh_architecture.feature_a.domain.FeatureARepository
import com.ssh.ssh_architecture.feature_a.domain.FeatureAService

class FeatureAServiceImpl(private val featureARepository: FeatureARepository) : FeatureAService {

    override suspend fun doSomething(): Result<Unit> = featureARepository.doSomething()
}