package com.ssh.ssh_architecture.feature_a.data

import com.ssh.ssh_architecture.feature_a.data.model.FeatureADTO

interface FeatureAService {
    suspend fun doSomething(): Result<FeatureADTO>
}