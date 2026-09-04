package com.pdrinyo.thesenaidigitalcard.feature.unidadecurricular.presentation

sealed interface LoginUIEvent {
    data class OnUsuarioChange(val value: String) : LoginUIEvent
    data class OnSenhaChange(val value: String) : LoginUIEvent
    data object OnEntrarClick : LoginUIEvent
    data object OnNavegacaoRealizada : LoginUIEvent // Nome corrigido (CamelCase)
}