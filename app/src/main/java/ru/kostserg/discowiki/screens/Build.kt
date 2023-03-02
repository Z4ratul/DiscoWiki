package ru.kostserg.discowiki.screens

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import ru.kostserg.discowiki.ui.theme.DiscoWikiTheme

@Composable
fun BuildScreen (navController: NavHostController){
    Text(text = "DADAD")
}

@Preview(showBackground = true)
@Composable
fun prevBuildScreen(){
    DiscoWikiTheme() {
        BuildScreen(navController = rememberNavController())
    }
}