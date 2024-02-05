package com.example.nellamaster

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.ColorRes
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material.BottomNavigation
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.filled.Warning
import androidx.compose.material.icons.outlined.Help
import androidx.compose.material.icons.outlined.HelpOutline
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.QrCodeScanner
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Popup
import androidx.navigation.NavController
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.nellamaster.ui.theme.NellaMasterTheme

class BottomNavigationBar : ComponentActivity() {
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
fun BottomNavBar (
    navController: NavController
    ) {
    NavigationBar(
        containerColor = Color.Transparent,
        contentColor = colorResource(id = R.color.teal)
    ) {
        NavigationBarItem(
            icon = { Icon(
                painter = painterResource(id = R.drawable.icons_home_petrol),
                contentDescription = "Home",
                tint = colorResource(id = R.color.teal),
                modifier = Modifier
                    .size(50.dp)
            ) },
            label = { Text(text = "")},
            selected = false,
            onClick = {
                navController.navigate(Screen.HomeScreen.route) {
                    popUpTo(navController.graph.findStartDestination().id)
                }
            },
        )
        NavigationBarItem(
            icon = { Icon(
                painter = painterResource(id = R.drawable.icons_scan_petrol),
                contentDescription = "Scan",
                tint = colorResource(id = R.color.teal),
                modifier = Modifier
                    .size(50.dp)
            ) },
            label = { Text(text = "")},
            selected = false,
            onClick = {
                navController.navigate(Screen.CameraScreenNoAR.route)
            }
        )
        NavigationBarItem(
            icon = { Icon(
                painter = painterResource(id = R.drawable.icons_hilfe_petrol),
                contentDescription = "Help", tint = colorResource(id = R.color.teal),
                modifier = Modifier
                    .size(50.dp)
            ) },
            label = { Text(text = "")},
            selected = false,
            onClick = {
                navController.navigate(Screen.HelpLandingScreen.route) {

                }
            }
        )
    }
}

@Preview(showBackground = true)
@Composable
fun NavBarPrevie() {
    NellaMasterTheme {
        BottomNavBar(navController = rememberNavController())
    }
}

