package com.example.ouca.android

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ouca.CuriosityViewModel
import com.example.ouca.HistoricCuriosity

@Composable
fun CuriosityView(curiosityViewModel: CuriosityViewModel) {
    val CurrentCuriosity by counterViewModel.count.collectAsState()

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.padding(16.dp)
    ) {
        Text(
            text = "${CurrentCuriosity.name}",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = "Latitude: ${CurrentCuriosity.latitude}",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = "Longitude: ${CurrentCuriosity.longitude}",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold
        )
//        Spacer(modifier = Modifier.height(16.dp))
//        Button(
//            onClick = { curiosityViewModel() },
//            colors = ButtonDefaults.buttonColors(backgroundColor = Color.hsl(hue, 1F,0.5F)),
//            modifier = Modifier.width(200.dp)
//        ) {
//            Text(text = "Randomize", color = Color.hsl(0F, 0F, light))
//        }
    }
}