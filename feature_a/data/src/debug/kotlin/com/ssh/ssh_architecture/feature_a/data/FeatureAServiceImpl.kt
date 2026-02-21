package com.ssh.ssh_architecture.feature_a.data

import com.ssh.ssh_architecture.feature_a.data.model.FeatureADTO

class FeatureAServiceImpl : FeatureAService {

    override suspend fun doSomething(): Result<FeatureADTO> = Result
        .success(value = FeatureADTO(message = "Hello World!", additionalInfo = "Additional info"))
}