package com.example.myapplication2

import android.os.Bundle
import android.view.inputmethod.TextAttribute
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication2.ui.theme.MyApplication2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplication2Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    val image = painterResource(id = R.drawable.fon3)
    Image(painter =image , contentDescription = null,
        modifier = Modifier,
       contentScale =  ContentScale.Crop)

    Column(horizontalAlignment = Alignment.Start) {
        Spacer(Modifier.height(20.dp))
        Text(
            text = "Привет! Готова?",
            textAlign = TextAlign.Left,
            fontSize = 20.sp,
            modifier = Modifier
                .padding(10.dp)
                .background(color = colorResource(id = R.color.Gainsboro))
                .padding(10.dp)
        )
        Text(
            text = "20:15",
            color = Color.Gray,
            modifier = Modifier
                .padding(10.dp)
        )
    }

    Column(horizontalAlignment = Alignment.End) {
        Spacer(Modifier.height(110.dp))
        Text(
            text = "Всегда готова!",
            fontSize = 20.sp,
            modifier = Modifier
                .padding(10.dp)
                .background(color = colorResource(id = R.color.NavajoWhite))
                .padding(10.dp)

        )
        Text(
            text = "20:16",
            color = Color.Gray,
            modifier = Modifier
                .padding(10.dp)
        )
    }
        Column(horizontalAlignment = Alignment.Start) {
            Spacer(Modifier.height(200.dp))
            Text(
                text = "Ну вот и прекрасно",
                fontSize = 20.sp,
                modifier = Modifier
                    .padding(10.dp)
                    .background(color = colorResource(id = R.color.Gainsboro))
                    .padding(10.dp)
            )

            Text(
                text = "Ты на концерт собираешься?",
                fontSize = 20.sp,
                modifier = Modifier
                    .padding(10.dp)
                    .background(color = colorResource(id = R.color.Gainsboro))
                    .padding(10.dp)
            )
            Text(
                text = "20:17",
                color = Color.Gray,
                modifier = Modifier
                    .padding(10.dp)
            )
        }
    Column(horizontalAlignment = Alignment.End) {
      Spacer(Modifier.height(360.dp))
        Text(
            text= "Да! Жду не дождусь",
            fontSize = 20.sp,
            modifier = Modifier
                .padding(10.dp)
                .background(color = colorResource(id = R.color.NavajoWhite))
                .padding(10.dp)
        )
        Text(
            text = "20:18",
            color = Color.Gray,
            modifier = Modifier
                .padding(10.dp)
        )
    }
    Column(horizontalAlignment = Alignment.Start) {
        Spacer(Modifier.height(450.dp))
        Text(
            text= "Все тогда,до встречи!",
            fontSize = 20.sp,
            modifier = Modifier
                .padding(10.dp)
                .background(color = colorResource(id = R.color.Gainsboro))
                .padding(10.dp)
        )
        Text(
            text = "20:19",
            color = Color.Gray,
            modifier = Modifier
                .padding(10.dp)
        )
    }
    Column(horizontalAlignment = Alignment.End) {
        Spacer(Modifier.height(540.dp))
        Text(
            text= "Угу!",
            fontSize = 20.sp,
            modifier = Modifier
                .padding(10.dp)
                .background(color = colorResource(id = R.color.NavajoWhite))
                .padding(10.dp)
        )
        Text(
            text = "20:20",
            color = Color.Gray,
            modifier = Modifier
                .padding(10.dp)
        )
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyApplication2Theme {
        Greeting("Android")
    }
}