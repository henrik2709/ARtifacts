package com.example.nellamaster

import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.ColorRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.nellamaster.ui.theme.NellaMasterTheme

class QuizPage : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NellaMasterTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                }
            }
        }
    }
}

@Composable
fun QuizScreen() {
    //Category of the Question
    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Spacer(modifier = Modifier.size(20.dp))
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(text = "QuestionCategory", fontSize = 20.sp, fontWeight = FontWeight.Bold)
        }
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
        ) {
            Text(text = "Is this the place for the Question, or is it?Is this the place for the Question, or is it?", fontSize = 14.sp)
        }
        Column(
            modifier = Modifier
        ) {
            Image(
                painter = painterResource(id = R.drawable.plakat_design_bauhaus_skaliert),
                contentDescription = null,
                modifier = Modifier
                    .clip(RoundedCornerShape(15.dp))
            )
        }
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(start = 40.dp, end = 40.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(color = colorResource(R.color.light_gray))
                    .clip(RoundedCornerShape(10.dp))
                    .clickable {  },

            ){
                Text(text = "Antwort 1", modifier = Modifier.padding(start = 14.dp, top = 6.dp, bottom = 6.dp))
            }
            Spacer(modifier = Modifier.size(8.dp))
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(color = colorResource(R.color.light_gray))
                    .clip(RoundedCornerShape(10.dp))
                    .clickable {  },

                ){
                Text(text = "Antwort 2", modifier = Modifier.padding(start = 14.dp, top = 6.dp, bottom = 6.dp))
            }
            Spacer(modifier = Modifier.size(8.dp))
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(color = colorResource(R.color.light_gray))
                    .clip(RoundedCornerShape(1.dp))
                    .clickable {  },

                ){
                Text(text = "Antwort 3", modifier = Modifier.padding(start = 14.dp, top = 6.dp, bottom = 6.dp))
            }

        }




    }

}

@Preview(showBackground = true)
@Composable
fun QuizPreview() {
    QuizScreen()
}