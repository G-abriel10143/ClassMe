package com.example.classme.screens

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.classme.database.repository.getMaterias
import com.example.classme.ui.CardAtividade

@Composable
fun ListagemAtividadesScreen(navController: NavController, materiaId: String) {
    if(materiaId.isEmpty()) {
        return Text(text = "Ocorreu um erro!")
    }

    var materiaEncontrada = getMaterias().find { materia -> materia.id.toString() == materiaId }
        ?: return Text(text = "Ocorreu um erro ao buscar as atividades dessa matéria")

    return LazyColumn(
        modifier = Modifier.padding(horizontal = 16.dp)
    ) {
        items(materiaEncontrada.atividades) {
            Spacer(modifier = Modifier.height(12.dp))
            CardAtividade(atividade = it, navController)
            Spacer(modifier = Modifier.height(12.dp))
        }
    }
}