package com.example.epoxyexample.di.api

import android.content.Context
import com.apollographql.apollo3.ApolloClient
import com.apollographql.apollo3.network.okHttpClient
import com.example.epoxyexample.BuildConfig
import com.example.epoxyexample.data.remote.api.ChapterApi
import com.example.epoxyexample.data.remote.api.ChapterApiImpl
import com.example.epoxyexample.utils.ConstObject
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetWorkModule {

    @[Provides Singleton]
    fun provideHttpClient(): OkHttpClient {
        val okHttp = OkHttpClient().newBuilder().callTimeout(ConstObject.TIMEOUT, TimeUnit.SECONDS)
            .readTimeout(ConstObject.TIMEOUT, TimeUnit.SECONDS)
            .connectTimeout(ConstObject.TIMEOUT, TimeUnit.SECONDS).retryOnConnectionFailure(true)

        if (BuildConfig.DEBUG) {
            okHttp.addInterceptor(HttpLoggingInterceptor().apply {
                level = HttpLoggingInterceptor.Level.BODY
            })
        }
        return okHttp.build()
    }

    @[Provides Singleton]
    fun provideApolloClient(okHttpClient: OkHttpClient): ApolloClient {
        return ApolloClient.Builder().okHttpClient(okHttpClient).serverUrl(ConstObject.BASE_URL)
            .build()
    }

    @[Provides Singleton]
    fun provideChapterApi(
        apolloClient: ApolloClient,
        @ApplicationContext context: Context
    ): ChapterApi {
        return ChapterApiImpl(context = context, apolloClient = apolloClient)
    }
}