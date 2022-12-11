package com.example.epoxyexample.di.repositryModule

import com.example.epoxyexample.data.repositoryImpl.ChapterRepositoryImpl
import com.example.epoxyexample.domain.repository.ChapterRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
interface RepositoryModule {

    @[Binds Singleton]
    fun bindChapterRepository(impl: ChapterRepositoryImpl): ChapterRepository
}