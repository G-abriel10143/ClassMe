package com.example.classme.screens

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.classme.database.repository.getMaterias
import com.example.classme.ui.CardMateria

@Composable
fun ListagemMateriasScreen(navController: NavController) {
    val materias = getMaterias();

    return LazyColumn(
        modifier = Modifier.padding(horizontal = 16.dp)
    ) {
        items(materias) {
            Spacer(modifier = Modifier.height(12.dp))
            CardMateria(materia = it, navController)
            Spacer(modifier = Modifier.height(12.dp))
        }
    }
}