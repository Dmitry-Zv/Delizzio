package by.zharikov.democomposeviewmodel.ui.screens

import android.window.SplashScreen
import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import by.zharikov.democomposeviewmodel.navigation.NavigationTree
import by.zharikov.democomposeviewmodel.ui.screens.login.LoginScreen
import by.zharikov.democomposeviewmodel.ui.screens.login.LoginViewModel
import by.zharikov.democomposeviewmodel.ui.screens.login.SplashScreen

@Composable
fun ApplicationScreen(){
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = NavigationTree.Splash.name ){
        composable(NavigationTree.Splash.name){
            SplashScreen(navController = navController)
        }
        composable(NavigationTree.Login.name){
            val loginViewModel = hiltViewModel<LoginViewModel>()
            LoginScreen(loginViewModel = loginViewModel)
        }
        composable(NavigationTree.Main.name){

        }
    }
}