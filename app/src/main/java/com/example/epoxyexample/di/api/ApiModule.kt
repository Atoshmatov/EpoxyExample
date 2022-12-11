package com.example.epoxyexample.di.api

import com.example.epoxyexample.data.remote.api.ChapterApi
import com.example.epoxyexample.data.remote.api.ChapterApiImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface ApiModule {
    @Binds
    fun bindChapterApi(impl: ChapterApiImpl): ChapterApi
}