package com.example.classme

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Divider
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.classme.screens.ListagemArquivosAtividadeScreen
import com.example.classme.screens.ListagemAtividadesScreen
import com.example.classme.screens.ListagemMateriasScreen
import com.example.classme.ui.HeaderClassMe
import com.example.classme.ui.theme.ClassMeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            ClassMeTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = colorResource(id = R.color.classme_darkGray)
                ) {
                    Column {
                        HeaderClassMe()
                        Divider (
                            color = Color.LightGray,
                            modifier = Modifier
                                .height(1.dp)
                                .fillMaxWidth()
                        )

                        val navController = rememberNavController()

                        NavHost(navController = navController, startDestination = "listagemMateriasScreen") {
                            composable(route = "listagemMateriasScreen") {
                                ListagemMateriasScreen(navController)
                            }
                            composable(route = "listagemAtividadesScreen/{materiaId}") {
                                val materiaId: String? = it.arguments?.getString("materiaId", "")
                                ListagemAtividadesScreen(navController, materiaId!!)
                            }
                            composable(route = "listagemArquivosAtividade/{atividadeId}") {
                                val atividadeId: String? = it.arguments?.getString("atividadeId", "")
                                ListagemArquivosAtividadeScreen(navController, atividadeId!!)
                            }
                        }
                    }
                }
            }
        }
    }
}
