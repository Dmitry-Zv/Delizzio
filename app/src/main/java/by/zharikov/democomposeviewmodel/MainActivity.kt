package by.zharikov.democomposeviewmodel

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.tooling.preview.Preview
import by.zharikov.democomposeviewmodel.ui.screens.ApplicationScreen
import by.zharikov.democomposeviewmodel.ui.screens.Support
import by.zharikov.democomposeviewmodel.ui.theme.AppTheme
import by.zharikov.democomposeviewmodel.ui.theme.DemoComposeViewModelTheme
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DemoComposeViewModelTheme {

                // A surface container using the 'background' color from the theme
                val systemUiController = rememberSystemUiController()
                val primaryBackground = AppTheme.colors.primaryBackgroundColor
                SideEffect {
                    systemUiController.setSystemBarsColor(
                        color = primaryBackground,
                        darkIcons = true
                    )
                }

                ApplicationScreen()
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    DemoComposeViewModelTheme {
       ApplicationScreen()
    }
}