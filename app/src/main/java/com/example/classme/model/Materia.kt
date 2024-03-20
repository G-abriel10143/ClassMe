package com.example.classme.model

import com.example.classme.database.repository.gerarAtividades
import java.util.Collections
import java.util.UUID

class Materia {
    var id: Long
    var nome: String
    var atividades: List<Atividade> = ArrayList();

    constructor(id: Long, nome: String) {
        this.id = id;
        this.nome = nome;
        this.atividades = gerarAtividades(this)
    }
}