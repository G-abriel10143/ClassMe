package com.example.classme.ui

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.classme.R
import com.example.classme.model.Materia

@Composable
fun CardMateria(materia: Materia, navController: NavController) {
    val quantidadeArbitrariaAtividadesEmAberto = Math.round(Math.random() * 10)

    return Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp)
            .clickable { navController.navigate("listagemAtividadesScreen/${materia.id}") },
        colors = CardDefaults
            .cardColors(containerColor = colorResource(id = R.color.classme_blue)),
        elevation = CardDefaults.cardElevation(1.dp),
        border = BorderStroke(width = 2.dp, color = Color.Black)
    ) {
        Text(
            text = materia.nome,
            fontSize = 26.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Black,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 24.dp)
        )

        Text(
            text = "Atividades em aberto: $quantidadeArbitrariaAtividadesEmAberto",
            fontSize = 18.sp,
            fontWeight = FontWeight.Normal,
            color = Color.DarkGray,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 24.dp)
        )
    }
}