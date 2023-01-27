package by.zharikov.democomposeviewmodel.ui.screens.login.models


enum class LoginSubState {
    SignIn, SignUp, Forgot
}

data class LoginViewState(
    val loginSubState: LoginSubState = LoginSubState.SignIn,
    val emailValue: String = "",
    val passwordValue: String = "",
    val fullName: String = "",
    val rememberMeChecked:Boolean = false,
    val isProgressLogin:Boolean = false
)