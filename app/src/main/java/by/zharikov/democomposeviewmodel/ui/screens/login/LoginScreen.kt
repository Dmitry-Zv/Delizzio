package by.zharikov.democomposeviewmodel.ui.screens.login

import android.widget.Space
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import by.zharikov.democomposeviewmodel.R
import by.zharikov.democomposeviewmodel.ui.screens.login.models.LoginEvent
import by.zharikov.democomposeviewmodel.ui.screens.login.models.LoginSubState
import by.zharikov.democomposeviewmodel.ui.screens.login.view.ForgotView
import by.zharikov.democomposeviewmodel.ui.screens.login.view.SignInView
import by.zharikov.democomposeviewmodel.ui.screens.login.view.SignUpView
import by.zharikov.democomposeviewmodel.ui.theme.AppTheme

@Composable
fun LoginScreen(loginViewModel: LoginViewModel) {
    val viewState by loginViewModel.viewState.collectAsState()

    with(viewState) {
        LazyColumn(contentPadding = PaddingValues(horizontal = 16.dp)) {
            item {
                Text(
                    modifier = Modifier.padding(top = 32.dp),
                    text = when (loginSubState) {
                        LoginSubState.SignIn -> stringResource(id = R.string.sign_in_title)
                        LoginSubState.SignUp -> stringResource(id = R.string.sign_up_title)
                        LoginSubState.Forgot -> stringResource(id = R.string.forget_password_title)
                    },
                    style = TextStyle(
                        color = AppTheme.colors.headerTextColor,
                        fontWeight = FontWeight.Bold,
                        fontSize = 50.sp
                    )
                )
            }

            item {
                Row(
                    Modifier
                        .fillMaxWidth()
                        .padding(top = 17.dp)
                ) {
                    Text(
                        text = when (loginSubState) {
                            LoginSubState.SignIn -> stringResource(id = R.string.sign_in_subtitle)
                            LoginSubState.SignUp -> stringResource(id = R.string.sign_up_subtitle)
                            LoginSubState.Forgot -> stringResource(id = R.string.forget_password_subtitle)
                        },
                        style = TextStyle(
                            color = AppTheme.colors.primaryTextColor
                        )
                    )
                    Spacer(modifier = Modifier.padding(start = 4.dp))
                    if (loginSubState != LoginSubState.Forgot)
                        Text(
                            modifier = Modifier.clickable {

                                when (loginSubState) {
                                    LoginSubState.SignIn -> loginViewModel.obtainEvent(event = LoginEvent.SignUpClicked)
                                    LoginSubState.SignUp -> loginViewModel.obtainEvent(event = LoginEvent.SignInClicked)
                                    else -> {}
                                }
                            },
                            text = when (loginSubState) {
                                LoginSubState.SignIn -> stringResource(id = R.string.sign_in_action)
                                LoginSubState.SignUp -> stringResource(id = R.string.sign_up_action)
                                else -> ""
                            },
                            style = TextStyle(
                                color = AppTheme.colors.actionTextColor,
                                fontWeight = FontWeight.Medium
                            )
                        )
                }

            }
            item {
                when(loginSubState){
                    LoginSubState.SignIn -> SignInView(
                        viewState = this@with
                    ){
                       loginViewModel.obtainEvent(LoginEvent.EmailChanged(value = it))
                    }
                    LoginSubState.SignUp -> SignUpView()
                    LoginSubState.Forgot -> ForgotView()
                }
            }

        }

    }
}