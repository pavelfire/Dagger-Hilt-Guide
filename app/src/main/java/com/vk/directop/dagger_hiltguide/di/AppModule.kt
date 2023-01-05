package com.vk.directop.dagger_hiltguide.di

import android.app.Application
import com.vk.directop.dagger_hiltguide.data.remote.MyApi
import com.vk.directop.dagger_hiltguide.data.repository.MyRepositoryImpl
import com.vk.directop.dagger_hiltguide.domain.repository.MyRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Named
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideMyApi(): MyApi {
        return Retrofit.Builder()
            .baseUrl("https://test.com")
            .build()
            .create(MyApi::class.java)
    }

    @Provides
    @Singleton
    @Named("hello1")
    fun providesString1() = "Hello 1"

    @Provides
    @Singleton
    @Named("hello2")
    fun providesString2() = "Hello 2"
}