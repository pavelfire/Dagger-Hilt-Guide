package com.vk.directop.dagger_hiltguide.data.repository

import android.app.Application
import com.vk.directop.dagger_hiltguide.R
import com.vk.directop.dagger_hiltguide.data.remote.MyApi
import com.vk.directop.dagger_hiltguide.domain.repository.MyRepository
import javax.inject.Inject

class MyRepositoryImpl @Inject constructor(
    private val api: MyApi,
    private val appContext: Application
): MyRepository {

    init {
        val appName = appContext.getString(R.string.app_name)
        println("Hello from the repository. The app name is $appName")
    }

    override suspend fun doNetworkCall() {

    }
}