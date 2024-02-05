package com.example.nellamaster.Camera

import android.Manifest
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.google.accompanist.permissions.ExperimentalPermissionsApi
import com.google.accompanist.permissions.PermissionState
import com.google.accompanist.permissions.isGranted
import com.google.accompanist.permissions.rememberPermissionState


@OptIn(ExperimentalPermissionsApi::class)
@Composable
fun MainScreen(navController: NavController) {
    val cameraPermissionState: PermissionState = rememberPermissionState(permission = Manifest.permission.CAMERA)

    MainContent(
        hasPermission = cameraPermissionState.status.isGranted,
        onRequestPermission = cameraPermissionState::launchPermissionRequest,
        navController
    )

}

@Composable
fun MainContent(
    hasPermission: Boolean,
    onRequestPermission: () -> Unit,
    navController: NavController
) {
    if(hasPermission) {
        CameraScreen(navController)
    } else {
        NoPermissionScreen(
            onRequestPermission = onRequestPermission
        )
    }
}

@Preview
@Composable
fun Preview_MainContent() {
    MainContent(
        hasPermission = true,
        onRequestPermission = {},
        navController = rememberNavController()
    )
}