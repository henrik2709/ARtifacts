package com.example.nellamaster.Camera

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Camera
import androidx.compose.material.icons.outlined.Camera
import androidx.compose.material.icons.outlined.PhotoCamera
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.nellamaster.R
import com.example.nellamaster.ui.theme.IvyOra
import com.example.nellamaster.ui.theme.Metropolis

@Composable
fun NoPermissionScreen(
    onRequestPermission: () -> Unit
) {
    NoPermissionContent (
        onRequestPermission = onRequestPermission
    )
}

@Composable
fun NoPermissionContent(
    onRequestPermission: () -> Unit
) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.bild_xd_ar),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .height(400.dp)
        )
        Text(
            text = "Die App benötigt die Berechtigung zur Nutzung der Kamera um die volle Funktionalität zu gewärleisten.",
            fontFamily = IvyOra,
            fontSize = 30.sp,
            color = colorResource(id = R.color.salmon),
            modifier = Modifier
                .padding(start = 16.dp, end = 16.dp)
        )
        Spacer(modifier = Modifier.height(20.dp))
        Button(
            onClick = onRequestPermission,
            shape = RoundedCornerShape(10),
        colors = ButtonDefaults.buttonColors(colorResource(id = R.color.teal)),
            modifier = Modifier
                .width(300.dp)
                .height(50.dp)
        ) {
            Icon(
                imageVector = Icons.Outlined.PhotoCamera,
                contentDescription = "Camera",
                tint = colorResource(id = R.color.white),
                modifier = Modifier
                    .size(30.dp)
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(
                text = "Berechtigung geben",
                fontFamily = Metropolis,
                fontSize = 20.sp,
                color = colorResource(id = R.color.white),

            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Preview_NoPermissionContent() {
    NoPermissionContent(
        onRequestPermission = {}
    )
}