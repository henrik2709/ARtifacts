package com.example.nellamaster.Additional

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Circle
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.nellamaster.R

@Composable
fun PageCounterBuilder(
    current: Int,

) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(20.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        Icon(
            imageVector = Icons.Filled.Circle,
            contentDescription = null,
            tint = if (current == 1) colorResource(id = R.color.salmon) else colorResource(id = R.color.teal),
            modifier = Modifier
                .size(20.dp)
                .padding(start = 4.dp, end = 4.dp)
        )
        Icon(
            imageVector = Icons.Filled.Circle,
            contentDescription = null,
            tint = if (current == 2) colorResource(id = R.color.salmon) else colorResource(id = R.color.teal),
            modifier = Modifier
                .size(20.dp)
                .padding(start = 4.dp, end = 4.dp)
        )
        Icon(
            imageVector = Icons.Filled.Circle,
            contentDescription = null,
            tint = if (current == 3) colorResource(id = R.color.salmon) else colorResource(id = R.color.teal),
            modifier = Modifier
                .size(20.dp)
                .padding(start = 4.dp, end = 4.dp)
        )
        Icon(
            imageVector = Icons.Filled.Circle,
            contentDescription = null,
            tint = if (current == 4) colorResource(id = R.color.salmon) else colorResource(id = R.color.teal),
            modifier = Modifier
                .size(20.dp)
                .padding(start = 4.dp, end = 4.dp)
        )
        Icon(
            imageVector = Icons.Filled.Circle,
            contentDescription = null,
            tint = if (current == 5) colorResource(id = R.color.salmon) else colorResource(id = R.color.teal),
            modifier = Modifier
                .size(20.dp)
                .padding(start = 4.dp, end = 4.dp)
        )
    }
}

@Composable
fun PageShortCounterBuilder(
    current: Int,

    ) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(20.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        Icon(
            imageVector = Icons.Filled.Circle,
            contentDescription = null,
            tint = if (current == 1) colorResource(id = R.color.salmon) else colorResource(id = R.color.teal),
            modifier = Modifier
                .size(20.dp)
                .padding(start = 4.dp, end = 4.dp)
        )
        Icon(
            imageVector = Icons.Filled.Circle,
            contentDescription = null,
            tint = if (current == 2) colorResource(id = R.color.salmon) else colorResource(id = R.color.teal),
            modifier = Modifier
                .size(20.dp)
                .padding(start = 4.dp, end = 4.dp)
        )
        Icon(
            imageVector = Icons.Filled.Circle,
            contentDescription = null,
            tint = if (current == 3) colorResource(id = R.color.salmon) else colorResource(id = R.color.teal),
            modifier = Modifier
                .size(20.dp)
                .padding(start = 4.dp, end = 4.dp)
        )
    }
}




@Preview(showBackground = true)
@Composable
fun PageCounterPreview() {
    PageShortCounterBuilder(2)
}