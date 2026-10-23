package com.example.app

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.ai.document.Document
import org.springframework.ai.embedding.EmbeddingModel
import org.springframework.ai.embedding.EmbeddingRequest
import org.springframework.ai.embedding.EmbeddingResponse
import org.springframework.ai.embedding.EmbeddingOptions
import org.springframework.ai.embedding.BatchingStrategy

@Configuration
class VectorMockConfig {

    /**
     * Provides a minimal placeholder EmbeddingModel bean
     */
    @Bean
    fun embeddingModel(): EmbeddingModel {
        return object : EmbeddingModel {
            
            override fun embed(text: String): FloatArray {
                return floatArrayOf()
            }

            override fun embed(document: Document): FloatArray {
                return floatArrayOf()
            }

            override fun embed(texts: List<String>): List<FloatArray> {
                return emptyList()
            }

            override fun embed(documents: List<Document>, options: EmbeddingOptions?, batchingStrategy: BatchingStrategy): List<FloatArray> {
                return emptyList()
            }

            override fun call(request: EmbeddingRequest): EmbeddingResponse {
                return EmbeddingResponse(emptyList())
            }
        }
    }
}
