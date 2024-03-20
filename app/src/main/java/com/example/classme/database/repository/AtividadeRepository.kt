package com.example.classme.database.repository

import com.example.classme.model.Atividade
import com.example.classme.model.Materia
import java.util.Date
import java.util.UUID


fun gerarAtividades(materia: Materia): List<Atividade> {
    return listOf(
        Atividade(1, "Atividade um", "Uma atividade genérica, como outra qualquer", 15, Date(), materia),
        Atividade(2, "Atividade dois", "Uma atividade genérica, como outra qualquer", 12, Date(), materia),
        Atividade(3, "Atividade três", "Uma atividade genérica, como outra qualquer", 5, Date(), materia),
        Atividade(4, "Atividade quatro", "Uma atividade genérica, como outra qualquer", 23, Date(), materia),
    )
}