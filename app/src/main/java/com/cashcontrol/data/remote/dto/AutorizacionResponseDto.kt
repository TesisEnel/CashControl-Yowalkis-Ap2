package com.cashcontrol.data.remote.dto

import com.squareup.moshi.Json

data class AutorizacionResponseDto(
    @Json(name = "token")
    val token: String,
    @Json(name = "usuario")
    val usuario: UsuarioDto
)
