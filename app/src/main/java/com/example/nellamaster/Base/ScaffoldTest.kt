package com.example.nellamaster.Base

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.nellamaster.R

@Composable
fun Test() {
    Column {
        Text(text = "Moin")
        Text(text = "Moin")
        Text(text = "Moin")
        Text(text = "Moin")
        Image(painter = painterResource(id = R.drawable.asien_skaliert), contentDescription = null)
    }
}

@Preview
@Composable
fun TestPreview() {
    BottomBarScaffold(Test())
}