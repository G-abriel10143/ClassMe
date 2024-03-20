package com.example.classme.database.repository

import com.example.classme.model.ArquivoAtividade

val arquivoUm = ArquivoAtividade(1L, 1L, "Arquivo_generico.pdf")
val arquivoDois = ArquivoAtividade(2L, 2L,"Arquivo_generico_dois.pdf")

fun getArquivosAtividades(): List<ArquivoAtividade> {
    return listOf(
        arquivoUm,
        arquivoDois,
    )
}