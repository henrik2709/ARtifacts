package com.example.nellamaster.Base

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.nellamaster.R
import com.example.nellamaster.ui.theme.Metropolis

@Composable
fun BottomBar() {
    Box() {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(130.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.icons_men_1),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxSize(),
                alignment = Alignment.BottomCenter
            )
            Row(
                modifier = Modifier
                    .fillMaxSize(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxHeight(),
                    contentAlignment = Alignment.Center
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxHeight(),
                        verticalArrangement = Arrangement.Top
                    ) {
                        Spacer(modifier = Modifier.height(24.dp))
                        Icon(
                            painter = painterResource(id = R.drawable.icons_home_petrol),
                            contentDescription = null,
                            tint = colorResource(id = R.color.teal),
                            modifier = Modifier
                                .size(41.dp)
                                .padding(start = 0.dp, top = 0.dp, bottom = 0.dp)
                        )
                        Spacer(modifier = Modifier.height(20.dp))
                        Text(
                            text = "HOME",
                            fontFamily = Metropolis,
                            fontSize = 10.sp,
                            color = colorResource(id = R.color.teal),
                            modifier = Modifier
                                .width(41.dp),
                            textAlign = TextAlign.Center
                        )
                    }
                }
                Spacer(modifier = Modifier.width(59.dp))
                Box(
                    modifier = Modifier
                        .fillMaxHeight(),
                    contentAlignment = Alignment.Center
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxHeight(),
                        verticalArrangement = Arrangement.Top
                    ) {
                        Spacer(modifier = Modifier.height(54.dp))
                        Icon(
                            painter = painterResource(id = R.drawable.icons_scan_petrol),
                            contentDescription = null,
                            tint = colorResource(id = R.color.teal),
                            modifier = Modifier
                                .size(41.dp)
                                .padding(start = 0.dp, top = 0.dp)
                        )
                        Spacer(modifier = Modifier.height(4.dp))
                        Text(
                            text = "SCAN",
                            fontFamily = Metropolis,
                            fontSize = 10.sp,
                            color = colorResource(id = R.color.teal),
                            modifier = Modifier
                                .width(41.dp),
                            textAlign = TextAlign.Center
                        )
                    }
                }
                Spacer(modifier = Modifier.width(59.dp))
                Box(
                    modifier = Modifier
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxHeight(),
                        verticalArrangement = Arrangement.Top
                    ) {
                        Spacer(modifier = Modifier.height(54.dp))
                        Icon(
                            painter = painterResource(id = R.drawable.icons_hilfe_petrol),
                            contentDescription = null,
                            tint = colorResource(id = R.color.teal),
                            modifier = Modifier
                                .size(41.dp)
                                .padding(start = 0.dp, top = 0.dp)
                        )
                        Spacer(modifier = Modifier.height(4.dp))
                        Text(
                            text = "HELP",
                            fontFamily = Metropolis,
                            fontSize = 10.sp,
                            color = colorResource(id = R.color.teal),
                            modifier = Modifier
                                .width(41.dp),
                            textAlign = TextAlign.Center
                        )
                    }
                }
            }
        }
    }
}

@Preview
@Composable
fun BottomBarPreview() {
    BottomBar()
}