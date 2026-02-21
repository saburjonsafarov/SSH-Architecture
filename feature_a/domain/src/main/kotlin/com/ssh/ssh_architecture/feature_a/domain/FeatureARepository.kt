package com.ssh.ssh_architecture.feature_a.domain

import com.ssh.ssh_architecture.feature_a.domain.model.FeatureAModel

interface FeatureARepository {

    suspend fun doSomething(): Result<FeatureAModel>
}