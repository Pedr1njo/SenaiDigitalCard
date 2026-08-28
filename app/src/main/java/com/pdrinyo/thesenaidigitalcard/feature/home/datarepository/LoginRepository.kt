package com.pdrinyo.thesenaidigitalcard.feature.home.datarepository

import com.pdrinyo.thesenaidigitalcard.feature.home.domain.UsuarioLogado

interface LoginRepository {
    suspend fun login(usuario: String, senha: String):Result<UsuarioLogado>
}