package com.example.epoxyexample.data.remote.api

import android.content.Context
import com.apollographql.apollo3.ApolloClient
import com.example.epoxyexample.data.remote.models.reponse.CharactersDto
import com.example.epoxyexample.utils.common.Resource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class ChapterApiImpl(
    private val context: Context,
    private val apolloClient: ApolloClient
) : ChapterApi {
    override fun getChapterList(page: Int): Flow<Resource<List<CharactersDto>>> = flow {
        try {
        } catch (ex: Exception) {
        }
    }

    override fun getChapter(id: String): Flow<Resource<CharactersDto>> = flow {
    }

}