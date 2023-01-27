package by.zharikov.democomposeviewmodel.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import by.zharikov.democomposeviewmodel.ui.theme.AppTheme

@Composable
fun Support(name: String, onSupportClick: () -> Unit) {
    Scaffold {
        Column(modifier = Modifier.padding(it)) {
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(80.dp)
                    .padding(top = 20.dp, start = 8.dp, end = 8.dp)
                    .clickable {
                        onSupportClick()
                    },
                backgroundColor = AppTheme.colors.secondaryBackground,
                elevation = 2.dp,
                shape = MaterialTheme.shapes.large
            ) {
                Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                    Text(
                        text = name,

                        style = TextStyle(
                            fontSize = 25.sp,
                            fontWeight = FontWeight.Medium,
                            color = AppTheme.colors.headerTextColor
                        ),
                        textAlign = TextAlign.Center
                    )
                }
            }
        }

    }

}