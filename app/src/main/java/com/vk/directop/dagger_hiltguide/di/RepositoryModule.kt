package com.vk.directop.dagger_hiltguide.di

import android.app.Application
import com.vk.directop.dagger_hiltguide.data.remote.MyApi
import com.vk.directop.dagger_hiltguide.data.repository.MyRepositoryImpl
import com.vk.directop.dagger_hiltguide.domain.repository.MyRepository
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Named
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindMyRepository(
        myRepositoryImpl: MyRepositoryImpl
    ): MyRepository

}
//
//@Provides
//@Singleton
//fun provideMyRepository(
//    api: MyApi,
//    app: Application,
//    @Named("hello1") hello1: String
//): MyRepository {
//    return MyRepositoryImpl(api, app)
//}
