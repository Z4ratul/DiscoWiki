package ru.kostserg.discowiki.screens

import android.content.Intent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
fun Main (navController: NavHostController){
    Column() {
        TopAppBar() {
            Text("Disco Wiki", fontSize = 25.sp)
            Spacer(Modifier.weight(1f,true))
            IconButton(onClick = { }) {
                Icon(Icons.Filled.List, contentDescription = "Билды")
            }
            IconButton(onClick = { /*TODO*/ }) {
                Icon(Icons.Filled.Search, contentDescription = "Поиск")
            }
        }
        Column() {
            Text(text = "Thoughts",modifier = Modifier.fillMaxWidth(1f), fontSize = 30.sp, textAlign = TextAlign.Center, fontFamily = FontFamily.Cursive
            )
            Row() {
                Text(text = "Тут будет картинки и наименования")
                Button(onClick = {}) {
                    Text(text = "Переход в мысли")
                }
            }
            Text(text = "Items",modifier = Modifier.fillMaxWidth(1f), fontSize = 30.sp, textAlign = TextAlign.Center, fontFamily = FontFamily.Cursive
            )
            Row() {
                Text(text = "Тут будет картинки и наименования")
                Button(onClick = {}) {
                    Text(text = "Переход в предмет")
                }
            }

        }
    }
}