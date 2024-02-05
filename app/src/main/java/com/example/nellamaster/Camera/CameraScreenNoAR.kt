package com.example.nellamaster.Camera

import android.annotation.SuppressLint
import androidx.camera.view.CameraController
import androidx.camera.view.LifecycleCameraController
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalLifecycleOwner
import androidx.core.content.ContextCompat
import androidx.navigation.NavController
import com.example.nellamaster.Camera.AI.CardImageAnalyzer
import com.example.nellamaster.Camera.AI.Classification
import com.example.nellamaster.Camera.AI.data.TfliteCardClassifier

@Composable
fun CameraScreenNoAR(
    navController: NavController
) {
    CameraContentNoAR(navController = navController)
}

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun CameraContentNoAR(navController: NavController) {

    val context = LocalContext.current
    val lifecycleOwner = LocalLifecycleOwner.current

    var classifications by remember {
        mutableStateOf(emptyList<Classification>())
    }
    val analyzer = remember {
        CardImageAnalyzer(
            classifier = TfliteCardClassifier(
                context = context
            ),
            onResults = {
                classifications = it
            }
        )
    }
    val cameraController = remember {
        LifecycleCameraController(context).apply {
            setEnabledUseCases(CameraController.IMAGE_ANALYSIS)
            setImageAnalysisAnalyzer(
                ContextCompat.getMainExecutor(context),
                analyzer
            )
        }
    }

    var isEmpty = classifications.isEmpty()

    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        CameraPreview(cameraController, Modifier.fillMaxSize())

        Column(
            modifier = Modifier
                .fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            CardPlacementNoAR(isEmpty, classifications, navController = navController)

        }
    }
}