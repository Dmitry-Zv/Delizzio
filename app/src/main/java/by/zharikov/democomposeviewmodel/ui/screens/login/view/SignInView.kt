package by.zharikov.democomposeviewmodel.ui.screens.login.view

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import by.zharikov.democomposeviewmodel.R
import by.zharikov.democomposeviewmodel.ui.components.DTextField
import by.zharikov.democomposeviewmodel.ui.screens.login.models.LoginViewState

@Composable
fun SignInView(
    viewState: LoginViewState,
    onTextFieldChanged: (String) -> Unit
) {

    Column() {


        DTextField(
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp),
            value = viewState.emailValue,
            placeHolder = stringResource(id = R.string.email_hint),
            onValueChange = onTextFieldChanged
        )
    }
}