package ru.kostserg.discowiki.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.List
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import ru.kostserg.discowiki.navigation.WikiRoute
import ru.kostserg.discowiki.ui.theme.DiscoWikiTheme

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun AllBuildsScreen (navController: NavHostController){
    Scaffold(
        floatingActionButton = {
            FloatingActionButton(onClick = { navController.navigate(WikiRoute.Build.route) })
            {
                Icon(Icons.Filled.Add, contentDescription = "Новый билд")
            }
        }
    ) {
        Column() {
            TopAppBar() {
                IconButton(onClick = { navController.navigate(WikiRoute.Main.route)}) {
                    Icon(Icons.Filled.ArrowBack, contentDescription = "Назад")
                }
            }
            BuildItem(name = "Build 1", navController = navController)
            BuildItem(name = "Build 2", navController = navController)        }
        }
}
@Composable
fun BuildItem(name:String, navController:NavHostController){
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 10.dp, horizontal = 10.dp)
            .clickable {
                navController.navigate(WikiRoute.Build.route)
            }
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text(text = name,
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,

                )
        }
    }
}
@Preview(showBackground = true)
@Composable
fun prevAllBuildsScreen(){
    DiscoWikiTheme() {
        MainScreen(navController = rememberNavController())
    }
}