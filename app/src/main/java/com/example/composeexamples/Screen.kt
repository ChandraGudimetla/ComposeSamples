package com.example.composeexamples

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun BlogCategory(img: Int, title: String, subtitle: String) {
    Card(
        elevation = CardDefaults.cardElevation(12.dp),
        modifier = Modifier
            .padding(18.dp)
            .fillMaxWidth()
            .height(200.dp)
    ) {
        Row(modifier = Modifier.padding(top = 25.dp)) {
            Image(
                painter = painterResource(id = img), contentDescription = "",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(150.dp)
                    .padding(8.dp)
                    .clip(CircleShape)

            )

            Column(modifier = Modifier
                .padding(20.dp)
            ) {
                Text(text = title, fontSize = 22.sp, fontWeight = FontWeight.ExtraBold)
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    text = subtitle,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewBlogCategory(){
//    Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
//        getCategoryList().map {item ->
//            BlogCategory(img = item.img, title = item.title, subtitle = item.subtitle)
//        }
//    }

    LazyColumn{
        items(getCategoryList()){item ->
            BlogCategory(img = item.img, title = item.title , subtitle = item.subtitle)
        }
    }


}

data class Category(val img: Int, val title: String, val subtitle: String)

fun getCategoryList(): MutableList<Category>{
    val list = mutableListOf<Category>()
    list.add(Category(R.drawable.test, "DevOps", "Learn Docker"))
    list.add(Category(R.drawable.test, "IOS", "Learn IOS"))
    list.add(Category(R.drawable.test, "UI", "Learn UI"))
    list.add(Category(R.drawable.test, "DevOps", "Learn Docker"))
    list.add(Category(R.drawable.test, "IOS", "Learn IOS"))
    list.add(Category(R.drawable.test, "UI", "Learn UI"))
    list.add(Category(R.drawable.test, "System Architecture", "Learn System design"))
    list.add(Category(R.drawable.test, "Retrofit", "Learn Retrofit"))
    list.add(Category(R.drawable.test, "DevOps", "Learn Docker"))
    list.add(Category(R.drawable.test, "DevOps", "Learn Docker"))
    list.add(Category(R.drawable.test, "IOS", "Learn IOS"))
    list.add(Category(R.drawable.test, "UI", "Learn UI"))
    list.add(Category(R.drawable.test, "DevOps", "Learn Docker"))
    list.add(Category(R.drawable.test, "IOS", "Learn IOS"))
    list.add(Category(R.drawable.test, "UI", "Learn UI"))
    list.add(Category(R.drawable.test, "System Architecture", "Learn System design"))
    list.add(Category(R.drawable.test, "Retrofit", "Learn Retrofit"))
    list.add(Category(R.drawable.test, "DevOps", "Learn Docker"))

    return list
}