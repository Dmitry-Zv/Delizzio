package by.zharikov.democomposeviewmodel.ui.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import by.zharikov.democomposeviewmodel.ui.theme.AppTheme
import by.zharikov.democomposeviewmodel.ui.theme.DemoComposeViewModelTheme

@Composable
fun DTextField(
    value: String,
    placeHolder: String,
    onValueChange: (String) -> Unit,
    modifier: Modifier = Modifier
) {

    TextField(modifier = modifier, value = value, onValueChange = onValueChange, placeholder = {
        Text(
            modifier = Modifier.padding(start = 9.22.dp),
            text = placeHolder,
            style = TextStyle(
                color = AppTheme.colors.hintTextColor,
                fontSize = 11.93.sp

            )
        )
    }, shape = RoundedCornerShape(10.dp),
        colors = TextFieldDefaults.textFieldColors(
            backgroundColor = AppTheme.colors.secondaryBackground.copy(
                alpha = 0.3f
            ),
            textColor = AppTheme.colors.primaryTextColor,
            disabledIndicatorColor = AppTheme.colors.primaryBackgroundColor,
            errorIndicatorColor = AppTheme.colors.primaryBackgroundColor,
            focusedIndicatorColor = AppTheme.colors.primaryBackgroundColor,
            unfocusedIndicatorColor = AppTheme.colors.primaryBackgroundColor
        )

    )

}


@Preview
@Composable
fun DTextFieldPreview() {
    DemoComposeViewModelTheme() {
        DTextField("", "Dmitry", modifier = Modifier.fillMaxWidth(), onValueChange = {

        })
    }

}