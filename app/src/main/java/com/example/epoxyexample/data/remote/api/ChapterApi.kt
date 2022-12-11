package com.example.epoxyexample.data.remote.api

import com.example.epoxyexample.data.remote.models.reponse.CharactersDto
import com.example.epoxyexample.utils.common.Resource
import kotlinx.coroutines.flow.Flow

interface ChapterApi {
    fun getChapterList(page: Int): Flow<Resource<List<CharactersDto>>>
    fun getChapter(id: String): Flow<Resource<CharactersDto>>
}