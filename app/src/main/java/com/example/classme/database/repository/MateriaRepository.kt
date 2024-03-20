package com.example.classme.database.repository

import com.example.classme.model.Materia
import java.util.UUID


val desenvolvimentoAndroidMateria = Materia(1L, "Desenvolvimento Android")
val reactMateria = Materia(2L, "React")
val bancoDeDadosMateria = Materia(3L, "Banco de dados")
val productManagementMateria = Materia(4L, "Product management")

fun getMaterias(): List<Materia> {
    return listOf(
        desenvolvimentoAndroidMateria,
        reactMateria,
        bancoDeDadosMateria,
        productManagementMateria,
    )
}