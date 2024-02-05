package com.example.nellamaster.Camera

import android.Manifest
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.google.accompanist.permissions.ExperimentalPermissionsApi
import com.google.accompanist.permissions.PermissionState
import com.google.accompanist.permissions.isGranted
import com.google.accompanist.permissions.rememberPermissionState

@OptIn(ExperimentalPermissionsApi::class)
@Composable
fun MainScreenNoAR(navController: NavController) {
    val cameraPermissionState: PermissionState = rememberPermissionState(permission = Manifest.permission.CAMERA)

    MainContentNoAR(
        hasPermission = cameraPermissionState.status.isGranted,
        onRequestPermission = cameraPermissionState::launchPermissionRequest,
        navController
    )

}

@Composable
fun MainContentNoAR(
    hasPermission: Boolean,
    onRequestPermission: () -> Unit,
    navController: NavController
) {
    if(hasPermission) {
        CameraScreenNoAR(navController)
    } else {
        NoPermissionScreen(
            onRequestPermission = onRequestPermission
        )
    }
}