package com.example.composeexamples

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composeexamples.ui.theme.ComposeExamplesTheme
import kotlin.random.Random

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeExamplesTheme {
                val count: MutableState<Int> = rememberSaveable { mutableIntStateOf(0) }

                Column(verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.fillMaxSize()) {
                    NotificationCounter(count.value) { count.value++ }
                    MessageCard(count.value)
                }

            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun TextFieldPreview() {
    val state = remember {
        mutableStateOf("")
    }
    TextField(
        modifier = Modifier.padding(40.dp),
        value = state.value,
        onValueChange = {
            state.value = it
        },
        label = { Text(text = "Enter your name") })
}

@Composable
fun UISamples(modifier: Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(top = 20.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ) {
        Text(text = "A", fontSize = 24.sp)
        Text(text = "B", fontSize = 24.sp)

        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            Button(onClick = { /*TODO*/ }) {
                Text(text = "Button 1")
            }
            Button(onClick = { /*TODO*/ }) {
                Text(text = "Button 2")
            }
            Button(onClick = { /*TODO*/ }) {
                Text(text = "Button 3")
            }
        }

        Box(contentAlignment = Alignment.Center) {
            Image(
                painter = painterResource(id = R.drawable.ic_launcher_background),
                contentDescription = "Dummy"
            )
            Image(
                painter = painterResource(id = R.drawable.ic_launcher_foreground),
                contentDescription = "Dummy"
            )
        }
    }
}

@Composable
fun SampleTextUI() {
    Text(
        text = "Hello", color = Color.White, modifier = Modifier
            .size(200.dp)
            .background(Color.Blue)
            .padding(36.dp)
            .border(4.dp, color = Color.Green)
            .clip(RectangleShape)
            .background(Color.Red)
            .clickable { }
    )
}

@Composable
fun ImageComposable() {
    Image(
        painter = painterResource(id = R.drawable.test),
        contentDescription = "",
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .size(150.dp)
            .clip(CircleShape)
            .border(0.dp, color = Color.Black)
    )
}

@Composable
fun RecomposableFunctionTest() {
    val state = remember { mutableStateOf(1) }
    Log.d("Chandra", "Initial Composition")
    Button(onClick = { state.value = Random.nextInt(1, 100) }) {
        Log.d("Chandra", "Should be executed only during the recomposition")
        Text(text = state.value.toString())
    }
}