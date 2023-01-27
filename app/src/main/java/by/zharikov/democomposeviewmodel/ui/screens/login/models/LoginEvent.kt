package by.zharikov.democomposeviewmodel.ui.screens.login.models

sealed class LoginEvent{
    object SignUpClicked:LoginEvent()
    object SignInClicked:LoginEvent()
    data class EmailChanged(var value:String): LoginEvent()

}
