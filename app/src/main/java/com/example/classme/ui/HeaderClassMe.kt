package com.example.classme.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.classme.R

@Composable
fun HeaderClassMe() {
    Row(
        modifier = Modifier
            .height(48.dp)
            .fillMaxWidth()
            .padding(horizontal = 16.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Icon(
            imageVector = Icons.Default.Menu,
            contentDescription = "Menu",
            tint = colorResource(id = R.color.classme_blue)
        )

        Text(
            text ="ClassMe",
            color = colorResource(id = R.color.classme_blue),
            fontWeight = FontWeight.SemiBold,
            fontSize = 20.sp
        )

        Box(
            modifier = Modifier
                .clip(shape = RoundedCornerShape(50))
                .border(width = 2.dp, color = colorResource(id = R.color.classme_blue), shape = CircleShape)
                .size(30.dp)
                .background(colorResource(id = R.color.classme_darkGray))
                .padding(3.dp)
        ) {
            Icon(
                imageVector = Icons.Default.Person,
                contentDescription = "Menu",
                tint = colorResource(id = R.color.classme_blue)
            )
        }
    }
}