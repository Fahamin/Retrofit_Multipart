package com.ffahim.retrofit_multipart.model


data class UploadResponse(
    val error: Boolean,
    val message: String,
    val image: String
)