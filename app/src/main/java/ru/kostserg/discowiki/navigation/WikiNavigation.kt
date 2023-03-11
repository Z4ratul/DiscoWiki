package ru.kostserg.discowiki.navigation

import  androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import ru.kostserg.discowiki.screens.*

sealed class WikiRoute(val route: String){
    object Main: WikiRoute("MainScreen")
    object Thought: WikiRoute("ThoughtScreen")
    object Item: WikiRoute("ItemScreen")
    object AllBuilds: WikiRoute("AllBuildsScreen")
    object Build: WikiRoute("BuildScreen")
}

@Composable
fun WikiNavigation(){
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = WikiRoute.Main.route){
        composable(WikiRoute.Main.route){ MainScreen(navController)}
        composable(WikiRoute.Thought.route){ ThoughtScreen(navController)}
        composable(WikiRoute.Item.route){ ItemScreen(navController)}
        composable(WikiRoute.AllBuilds.route){ AllBuildsScreen(navController)}
        composable(WikiRoute.Build.route){ BuildScreen(navController)}

    }
}