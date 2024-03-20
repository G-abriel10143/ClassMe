package com.example.classme.model

class ArquivoAtividade {
    val id: Long
    val atividadeId: Long
    val nome: String

    constructor(id: Long, atividadeId: Long, nome: String) {
        this.id = id
        this.atividadeId = atividadeId
        this.nome = nome
    }
}