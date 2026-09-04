package com.pdrinyo.thesenaidigitalcard.feature.home.datarepository

import com.pdrinyo.thesenaidigitalcard.feature.home.domain.UsuarioLogado
import com.pdrinyo.thesenaidigitalcard.feature.login.LoginRepository
import kotlinx.coroutines.delay
import kotlin.time.Duration.Companion.milliseconds

class FakeLoginRepositoryImpl : LoginRepository,
    com.pdrinyo.thesenaidigitalcard.feature.home.datarepository.LoginRepository {
    override suspend fun login(
        usuario: String,
        senha: String
    ): Result<UsuarioLogado> {
        delay(1000.milliseconds)

        // Login de Aluno
        if (usuario == "ph" && senha == "Ph2701") {
            return Result.success(
                UsuarioLogado(
                    id = "1",
                    nome = "Ph",
                    curso = "Desenvolvimento de Sistemas",
                    tipo = "aluno",
                    turma = "2DEVEST-B",
                    token = "token-fake-aluno"
                )
            )
        }
        // Login de Professor
        else if (usuario == "prof" && senha == "1234") {
            return Result.success(
                UsuarioLogado(
                    id = "2",
                    nome = "Professor SENAI",
                    tipo = "Professor",
                    curso = "TI",
                    turma = "Geral",
                    token = "token-fake-prof"
                )
            )
        }

        return Result.failure(
            IllegalArgumentException("Usuário ou senha inválidos")
        )
    }
}