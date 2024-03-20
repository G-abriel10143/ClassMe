package com.example.classme.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.classme.database.repository.getArquivosAtividades
import com.example.classme.database.repository.getMaterias
import com.example.classme.ui.CardArquivoAtividade

@Composable
fun ListagemArquivosAtividadeScreen(navController: NavController, atividadeId: String) {
    if(atividadeId.isEmpty()) {
        return Text(text = "Ocorreu um erro!")
    }

    return Column {
        Button(
            modifier = Modifier
                .fillMaxWidth()
                .padding(24.dp),
            onClick = { /* TODO */ }
        ) {
            Text(text = "Enviar arquivo")
        }

        LazyColumn(
            modifier = Modifier.padding(horizontal = 16.dp)
        ) {
            val arquivos = getArquivosAtividades()
            items(arquivos) {
                CardArquivoAtividade(arquivoAtividade = it)
            }
        }
    }
}