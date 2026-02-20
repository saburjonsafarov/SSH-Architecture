package com.ssh.ssh_architecture.feature_a.domain

interface FeatureAService {
    suspend fun doSomething(): Result<Unit>
}