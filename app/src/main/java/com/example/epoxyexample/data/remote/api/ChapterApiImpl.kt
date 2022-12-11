package com.example.epoxyexample.data.remote.api

import android.content.Context
import com.apollographql.apollo3.ApolloClient
import dagger.hilt.android.qualifiers.ApplicationContext

class ChapterApiImpl(
    private val apollo: ApolloClient,
    @ApplicationContext context: Context
) : ChapterApi {
    
}