package com.pdrinyo.thesenaidigitalcard.feature.home.datarepository

import android.R
import com.pdrinyo.thesenaidigitalcard.feature.home.domain.UsuarioLogado
import kotlinx.coroutines.delay
import kotlin.time.Duration.Companion.milliseconds

class FakeLoginRepositoryImpl : LoginRepository {
    override suspend fun login(
        usuario: String,
        senha: String
    ): Result<UsuarioLogado> {
        delay(1500.milliseconds)

        return if (usuario == "aluno" && senha == "123") {
            Result.success(
                value = UsuarioLogado(
                    id = "1",
                    nome = "Ph",
                    curso = "Desenvolvimento de Sistemas",
                    turma = "2DEVEST-B",
                    token = "token-fake-para-aula"
                )
            )
        } else {
            Result.failure(
                exception = IllegalArgumentException("Usuário ou senha inválidos")
            )
        }
    }
}