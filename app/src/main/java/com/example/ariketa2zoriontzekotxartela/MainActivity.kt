package com.example.ariketa2zoriontzekotxartela

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ariketa2zoriontzekotxartela.ui.theme.Ariketa2ZoriontzekoTxartelaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Ariketa2ZoriontzekoTxartelaTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    ZorionakTestua(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun ZorionakTestua(modifier: Modifier = Modifier) {

    Box(modifier = modifier.fillMaxSize()) {

        val image = painterResource(R.drawable.androidirudia)

        Image(
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.Crop, // Irudiak pantaila osoa betetzeko
            modifier = Modifier.fillMaxSize(),
        )

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(24.dp),
            verticalArrangement = Arrangement.SpaceBetween,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Urte berri on",
                fontSize = 42.sp,
                fontWeight = FontWeight.Bold, //Letra loditu
                textAlign = TextAlign.Center,
                color = Color.Magenta,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 300.dp)
            )

            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text="Ondo pasa oporrak",
                fontSize = 24.sp,
                textAlign = TextAlign.Center,
                color = Color.Blue,
                modifier = Modifier.fillMaxWidth()
            )


        }

    }

}

@Preview(showBackground = true)
@Composable
fun ZorionakTestuaPreview() {
    Ariketa2ZoriontzekoTxartelaTheme {
        ZorionakTestua()
    }
}