package com.vk.directop.dagger_hiltguide.domain.repository

interface MyRepository {

    suspend fun doNetworkCall()
}