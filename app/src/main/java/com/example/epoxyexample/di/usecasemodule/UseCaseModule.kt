package com.example.epoxyexample.di.usecasemodule

import com.example.epoxyexample.domain.usecase.ChapterUseCase
import com.example.epoxyexample.domain.usecase.ChapterUseCaseImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
interface UseCaseModule {

    @Binds
    fun bindChapterUseCase(impl: ChapterUseCaseImpl): ChapterUseCase
}