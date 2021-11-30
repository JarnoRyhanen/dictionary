package com.home.dictionary.feature_dictionary.domain.repository

import com.home.dictionary.core.util.Resource
import com.home.dictionary.feature_dictionary.domain.model.WordInfo
import kotlinx.coroutines.flow.Flow

interface WordInfoRepository {

    fun getWordInfo(word: String): Flow<Resource<List<WordInfo>>>
}