package com.example.composeexamples

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Favorite
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
fun NotificationCounter(count: Int, increment: () -> Int) {
    Column(verticalArrangement = Arrangement.Center) {
        Text(text = "You have sent ${count} notifications")
        Button(modifier = Modifier.padding(start = 20.dp), onClick = {
            Log.d("Chandra", "Button Clicked")
            increment()
        }) {
            Text(text = "Send notification")
        }
    }
}

@Composable
fun MessageCard(value: Int) {
    Card(elevation = CardDefaults.cardElevation(2.dp)) {
        Row(Modifier.padding(8.dp),
            verticalAlignment = Alignment.CenterVertically) {
            Image(
                imageVector = Icons.Outlined.Favorite,
                contentDescription = "Favroite",
                modifier = Modifier.padding(4.dp)
            )
            Text(text = "Messages sent so far : $value")
        }
    }
}
