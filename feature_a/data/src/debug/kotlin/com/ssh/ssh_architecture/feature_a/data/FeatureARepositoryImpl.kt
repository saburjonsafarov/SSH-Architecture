package com.ssh.ssh_architecture.feature_a.data

import com.ssh.ssh_architecture.feature_a.domain.FeatureARepository

class FeatureARepositoryImpl : FeatureARepository {

    override suspend fun doSomething(): Result<Unit> = Result.success(value = Unit)
}