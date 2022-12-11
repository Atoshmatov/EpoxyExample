package com.example.epoxyexample.data.repositoryImpl

import com.example.epoxyexample.data.remote.api.ChapterApi
import com.example.epoxyexample.data.remote.models.reponse.CharactersDto
import com.example.epoxyexample.domain.repository.ChapterRepository
import com.example.epoxyexample.utils.common.Resource
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class ChapterRepositoryImpl @Inject constructor(
    private val chapterApi: ChapterApi
) : ChapterRepository {
    override fun getCharacterList(): Flow<Resource<List<CharactersDto>>> {
        TODO("Not yet implemented")
    }
}