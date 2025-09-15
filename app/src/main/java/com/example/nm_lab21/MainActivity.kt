package com.example.nm_lab21

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.nm_lab21.ui.theme.NM_lab21Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            NM_lab21Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    DemoScreen(Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun DemoScreen(modifier: Modifier = Modifier) {
    val mymodifier = modifier
        .border(width = 2.dp, color = Color.Red)
        .padding(all = 10.dp)
    Text(
        "Hello Compose",
        mymodifier,
        fontSize = 40.sp,
        fontWeight = FontWeight.Bold
    )
}

@Composable
fun CustomImage(image: Int, modifier: Modifier) {
    Image(
        painter = painterResource(image),
        contentDescription = null,
        modifier
    )
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    NM_lab21Theme {
        DemoScreen()
    }
}