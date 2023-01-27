package by.zharikov.democomposeviewmodel.ui.screens.login

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.navigation.NavController
import by.zharikov.democomposeviewmodel.navigation.NavigationTree
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(navController: NavController){
    Text(text = "Splash Screen")
    LaunchedEffect(key1 = Unit){
        delay(3000L)
        navController.navigate(NavigationTree.Login.name)
    }

}