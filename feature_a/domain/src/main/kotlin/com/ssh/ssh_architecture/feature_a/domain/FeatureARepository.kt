package com.ssh.ssh_architecture.feature_a.domain

interface FeatureARepository {

    suspend fun doSomething(): Result<Unit>
}