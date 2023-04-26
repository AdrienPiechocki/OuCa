package app.myeline.ouca.android
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
import app.myeline.ouca.CounterViewModel

@Composable
fun CounterView(counterViewModel: CounterViewModel) {
    val count by counterViewModel.count.collectAsState()
    val hue by counterViewModel.hue.collectAsState()
    val light by counterViewModel.light.collectAsState()

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.padding(16.dp)
    ) {
        Text(
            text = "Count: $count",
            color = Color.hsl(hue, 1F, 0.5F),
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(16.dp))
        CircularProgressIndicator(
            backgroundColor = Color.LightGray,
            color = Color.hsl(hue, 1F, 0.5F),
            progress = hue/100
        )
        Spacer(modifier = Modifier.height(16.dp))
        Button(
            onClick = { counterViewModel.incrementCount() },
            colors = ButtonDefaults.buttonColors(backgroundColor = Color.hsl(hue, 1F,0.5F)),
            modifier = Modifier.width(200.dp)
        ) {
            Text(text = "Increment", color = Color.hsl(0F, 0F, light))
        }
        Button(
            onClick = { counterViewModel.decrementCount() },
            colors = ButtonDefaults.buttonColors(backgroundColor = Color.hsl(hue, 1F,0.5F)),
            modifier = Modifier.width(200.dp)
        ) {
            Text(text = "Decrement", color = Color.hsl(0F, 0F, light))
        }
        Button(
            onClick = { counterViewModel.resetCount() },
            colors = ButtonDefaults.buttonColors(backgroundColor = Color.hsl(hue, 1F,0.5F)),
            modifier = Modifier.width(200.dp)
        ) {
            Text(text = "Reset", color = Color.hsl(0F, 0F, light))
        }
        Button(
            onClick = { counterViewModel.maxCount() },
            colors = ButtonDefaults.buttonColors(backgroundColor = Color.hsl(hue, 1F,0.5F)),
            modifier = Modifier.width(200.dp)
        ) {
            Text(text = "Maximize", color = Color.hsl(0F, 0F, light))
        }
        Button(
            onClick = { counterViewModel.randomizeCount() },
            colors = ButtonDefaults.buttonColors(backgroundColor = Color.hsl(hue, 1F,0.5F)),
            modifier = Modifier.width(200.dp)
        ) {
            Text(text = "Randomize", color = Color.hsl(0F, 0F, light))
        }
    }
}