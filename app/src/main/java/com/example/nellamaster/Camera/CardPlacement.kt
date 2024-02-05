package com.example.nellamaster.Camera

import android.os.Build
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import coil.ImageLoader
import coil.compose.rememberAsyncImagePainter
import coil.decode.GifDecoder
import coil.decode.ImageDecoderDecoder
import coil.request.ImageRequest
import coil.size.Scale
import coil.size.Size
import com.example.nellamaster.Camera.AI.Classification
import com.example.nellamaster.R
import com.example.nellamaster.Screen
import com.example.nellamaster.ui.theme.Gopher

@Composable
fun CardPlacement(
    isEmpty: Boolean,
    classifications: List<Classification>,
    navController: NavController
) {
    val context = LocalContext.current
    var recognizedCard = false
    val imageLoader = ImageLoader.Builder(context = context)
        .components {
            if (Build.VERSION.SDK_INT >= 28) {
                add(ImageDecoderDecoder.Factory())
            }else{
                add(GifDecoder.Factory())
            }
        }
        .build()
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(50.dp))
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(70.dp)
        ) {
            if (isEmpty) {
                Text(
                    text = "Platziere die Karte im markierten Bereich!",
                    fontFamily = Gopher,
                    fontSize = 25.sp,
                    color = Color.White,
                    textAlign = TextAlign.Center
                )
                recognizedCard = false
            } else {
                Text(
                    text = "Karte erkannt!",
                    fontFamily = Gopher,
                    fontSize = 25.sp,
                    textAlign = TextAlign.Center,
                    color = Color.White,
                    modifier = Modifier
                        .fillMaxWidth()
                )
                recognizedCard = true
            }
        }
        Spacer(modifier = Modifier.height(50.dp))
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .aspectRatio(1f / 1.5f)
                .border(2.dp, color = colorResource(id = R.color.teal), shape = RoundedCornerShape(10))
        ) {
            var animationId: Int
            if(recognizedCard) {
                /*
                when(classifications[0].index) {
                    0 -> navController.navigate(Screen.AsienScreen.route)
                    1 -> navController.navigate(Screen.BarockScreen.route)
                    2 -> navController.navigate(Screen.BauhausScreen.route)
                    3 -> navController.navigate(Screen.GotikScreen.route)
                    4 -> navController.navigate(Screen.JugenstilScreen.route)
                    5 -> navController.navigate(Screen.ModerneScreen.route)
                    6 -> navController.navigate(Screen.OrientScreen.route)
                    7 -> navController.navigate(Screen.PostmoderneSceen.route)
                    else -> navController.navigate(Screen.RomScreen.route)
                }

                 */

                when(classifications[0].index) {
                    0 -> animationId = R.drawable.ani_asien_optimized
                    1 -> animationId = R.drawable.ani_barock_optimized
                    2 -> animationId = R.drawable.ani_bauhaus
                    3 -> animationId = R.drawable.ani_gotik_optimized
                    4 -> animationId = R.drawable.ani_jugendstil
                    5 -> animationId = R.drawable.ani_moderne_optimized
                    6 -> animationId = R.drawable.ani_orient_optimized
                    7 -> animationId = R.drawable.ani_postmoderne_optimized
                    else -> animationId = R.drawable.ani_rom
                }
                Image(
                    painter = rememberAsyncImagePainter(
                        ImageRequest.Builder(context).data(data = animationId).apply(block = {
                            size(Size.ORIGINAL)
                            scale(Scale.FIT)
                        }).build(), imageLoader = imageLoader
                    ),
                    contentDescription = null,
                    contentScale = ContentScale.FillBounds,
                    modifier = Modifier
                        .clip(RoundedCornerShape(10))
                        .fillMaxSize()
                )


            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CardPlacementPreview() {

}