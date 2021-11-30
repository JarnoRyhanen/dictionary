package com.home.dictionary.feature_dictionary.domain.model

import com.home.dictionary.feature_dictionary.data.remote.dto.DefinitionDto
import com.home.dictionary.feature_dictionary.domain.model.Meaning

data class Meaning(
    val definitions: List<Definition>,
    val partOfSpeech: String
)

