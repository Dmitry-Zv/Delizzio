package by.zharikov.democomposeviewmodel.ui.screens.login

import androidx.lifecycle.ViewModel
import by.zharikov.democomposeviewmodel.common.EventHandler
import by.zharikov.democomposeviewmodel.ui.screens.login.models.LoginEvent
import by.zharikov.democomposeviewmodel.ui.screens.login.models.LoginSubState
import by.zharikov.democomposeviewmodel.ui.screens.login.models.LoginViewState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor() : ViewModel(), EventHandler<LoginEvent> {

    private val _viewState = MutableStateFlow(LoginViewState())
    val viewState = _viewState.asStateFlow()

    override fun obtainEvent(event: LoginEvent) {
        when (event) {
            LoginEvent.SignInClicked -> performSignIn()
            LoginEvent.SignUpClicked -> performSignUp()
            is LoginEvent.EmailChanged -> emailChanged(event.value)
        }
    }

    private fun emailChanged(value: String) {
        _viewState.value = _viewState.value.copy(emailValue = value)
    }

    private fun performSignUp() {
        _viewState.value = _viewState.value.copy(loginSubState = LoginSubState.SignUp)
    }

    private fun performSignIn() {
        _viewState.value = _viewState.value.copy(loginSubState = LoginSubState.SignIn)
    }
}