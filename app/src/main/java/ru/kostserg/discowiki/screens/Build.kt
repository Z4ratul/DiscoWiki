package ru.kostserg.discowiki.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Delete
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import ru.kostserg.discowiki.navigation.WikiRoute
import ru.kostserg.discowiki.ui.theme.DiscoWikiTheme

@Composable
fun BuildScreen (navController: NavHostController){
    Column() {
        TopAppBar() {
            IconButton(onClick = { navController.navigate(WikiRoute.Main.route) }) {
                Icon(Icons.Filled.ArrowBack, contentDescription = "Назад")
            }
        }
        Column() {
            Text(
                text = "Attributes",
                modifier = Modifier.fillMaxWidth(1f),
                fontSize = 30.sp,
                textAlign = TextAlign.Center,
                fontFamily = FontFamily.Cursive
            )
            Row(Modifier.padding(vertical = 5.dp)) {
                Icon(Icons.Filled.ArrowBack, contentDescription = "")
                Text(text = "1", fontSize = 10.sp)
                Icon(Icons.Filled.ArrowForward, contentDescription = "")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun prevBuildScreen(){
    DiscoWikiTheme() {
        BuildScreen(navController = rememberNavController())
    }
}