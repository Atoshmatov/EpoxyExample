package com.example.epoxyexample.domain.repository

import com.example.epoxyexample.data.remote.models.reponse.CharactersDto
import com.example.epoxyexample.utils.common.Resource
import kotlinx.coroutines.flow.Flow

interface ChapterRepository {
    fun getCharacterList(): Flow<Resource<List<CharactersDto>>>
}