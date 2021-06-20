package com.chick.myapplication

import android.R
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.chick.myapplication.ui.theme.ChickappTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ChickappTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    Greeting("div bangalore")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
/*
    Column(
    modifier = Modifier
        .background(Color.Green),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "Hello1 $name!");
        Text(text = "city is delhi");
    }
*/

    Row(
        modifier = Modifier
            .fillMaxSize(1f)
            .background(Color.Green)

        ,
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column(
            modifier = Modifier.border(3.dp,Color.Red)
                .padding(50.dp)
        ) {
            Text(text = "Hello2 1 $name!");
            Text(text = "city is jaipur");
        }


    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ChickappTheme {
        Greeting("Android")
    }
}