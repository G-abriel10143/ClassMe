package com.example.classme.ui

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.classme.R
import com.example.classme.model.ArquivoAtividade
import com.example.classme.model.Atividade
import com.example.classme.database.repository.getArquivosAtividades
import com.example.classme.database.repository.getMaterias
import java.text.SimpleDateFormat

@Composable
fun CardAtividade(atividade: Atividade, navController: NavController) {
    val dateFormat = SimpleDateFormat("dd/MM/yyyy")

    return Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp),
        colors = CardDefaults
            .cardColors(containerColor = colorResource(id = R.color.classme_blue)),
        elevation = CardDefaults.cardElevation(1.dp),
        border = BorderStroke(width = 2.dp, color = Color.Black)
    ) {
        Row (
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 12.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = atividade.titulo,
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black,
            )

            Row {
                Icon(
                    imageVector = Icons.Default.ShoppingCart,
                    contentDescription = "Quantidade de moedas",
                    tint = colorResource(id = R.color.classme_darkGray)
                )

                Text(text = atividade.quantidadeMoedas.toString())
            }
        }

        Text(
            text = atividade.descricao,
            fontSize = 14.sp,
            fontWeight = FontWeight.Normal,
            color = Color.Black,
            textAlign = TextAlign.Start,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp)
        )

        Text(
            text = "Data limite: ${dateFormat.format(atividade.dataLimite)}",
            fontSize = 12.sp,
            fontWeight = FontWeight.Normal,
            color = Color.Black,
            textAlign = TextAlign.Start,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 12.dp)
        )

        Button(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            onClick = { navController.navigate("ListagemArquivosAtividade/${atividade.id}") }
        ) {
            Text(text = "Entregar atividade")
        }
    }
}
