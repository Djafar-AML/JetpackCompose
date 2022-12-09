package com.example.jetpackcompose.ui.home

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpackcompose.ui.theme.JetpackComposeTheme

@Composable
fun HomeScreen() {

    val context = LocalContext.current

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(32.dp))
        Button(onClick = {showToast(context, "hi!")}) {
            Text(text = "Hi me!")
        }

    }
}

fun showToast(_context: Context, toastText: String) {
    Toast.makeText(_context, toastText, Toast.LENGTH_SHORT).show()
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview() {

    JetpackComposeTheme {
        Column(
            modifier = Modifier.fillMaxSize(),
            Arrangement.Center,
            Alignment.CenterHorizontally,
        ) {
            HomeScreen()
        }
    }
}
