package com.example.classme.model

import java.util.Date
import java.util.UUID

class Atividade {
    val id: Long
    val titulo: String
    val descricao: String
    val materia: Materia
    val quantidadeMoedas: Int
    var dataLimite: Date

    constructor(id: Long, titulo: String, descricao: String, quantidadeMoedas: Int, dataLimite: Date, materia: Materia) {
        this.id = id
        this.titulo = titulo
        this.descricao = descricao
        this.quantidadeMoedas = quantidadeMoedas
        this.dataLimite = dataLimite
        this.materia = materia
    }
}