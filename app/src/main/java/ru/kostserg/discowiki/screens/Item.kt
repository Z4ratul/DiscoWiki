package ru.kostserg.discowiki.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import ru.kostserg.discowiki.navigation.WikiRoute
import ru.kostserg.discowiki.ui.theme.DiscoWikiTheme

@Composable
fun ItemScreen (navController: NavHostController){
    Column() {
        TopAppBar() {
            IconButton(onClick = { navController.navigate(WikiRoute.Main.route)}) {
                Icon(Icons.Filled.ArrowBack, contentDescription = "Назад")
            }
        }
        Column() {
            Text(text = "Name", Modifier.fillMaxWidth(1f), fontSize = 30.sp, textAlign = TextAlign.Center)
            Text(text = "Тут будет картинка",
                Modifier.fillMaxWidth(1f), fontSize = 30.sp, textAlign = TextAlign.Center)
            Text(text = "Type: ", fontSize = 20.sp)
            Text(text = "Bonuses: ", fontSize = 20.sp)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun prevItemScreen(){
    DiscoWikiTheme() {
        ItemScreen(navController = rememberNavController())
    }
}