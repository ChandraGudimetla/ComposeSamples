package com.example.composeexamples

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun ListViewItem(imgId: Int, name: String, occupation: String) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(200.dp)
            .padding(20.dp), shape = RoundedCornerShape(20.dp)
    ) {

        Row(modifier = Modifier.padding(20.dp)) {
            Image(
                painter = painterResource(id = imgId),
                contentDescription = "Image",
                Modifier.background(Color.Black),
                contentScale = ContentScale.FillHeight
            )

            Column(modifier = Modifier.padding(20.dp)) {
                Text(text = name)
                Text(text = occupation)
            }

        }



    }
}

@Preview(showBackground = true)
@Composable
fun PreviewListViewItem() {
    ListViewItem(R.drawable.ic_launcher_foreground, "Chandu", "Mobile Engineer")
}
