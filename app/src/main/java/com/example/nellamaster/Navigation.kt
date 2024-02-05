package com.example.nellamaster

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import androidx.navigation.compose.rememberNavController
import com.example.nellamaster.Camera.CameraPreview
import com.example.nellamaster.Camera.CameraScreen
import com.example.nellamaster.Camera.MainScreen
import com.example.nellamaster.Camera.MainScreenNoAR
import com.example.nellamaster.FullScreens.AsienFullScreenBuilder
import com.example.nellamaster.FullScreens.BarockFullScreenBuilder
import com.example.nellamaster.FullScreens.BauhausFullScreenBuilder
import com.example.nellamaster.FullScreens.GotikFullScreenBuilder
import com.example.nellamaster.FullScreens.JugendstilFullScreenBuilder
import com.example.nellamaster.FullScreens.ModerneFullScreenBuilder
import com.example.nellamaster.FullScreens.OrientFullScreenBuilder
import com.example.nellamaster.FullScreens.PostmoderneFullScreenBuilder
import com.example.nellamaster.FullScreens.RomFullScreenBuilder
import com.example.nellamaster.HelpScreens.AboutScreen
import com.example.nellamaster.HelpScreens.HelpAppNutzunScreenBuilder
import com.example.nellamaster.HelpScreens.HelpLandingScreenBuilder
import com.example.nellamaster.HelpScreens.NavigationHelp1
import com.example.nellamaster.HelpScreens.NavigationHelp2
import com.example.nellamaster.HelpScreens.NavigationHelp3
import com.example.nellamaster.HelpScreens.TechnischerSupportBuilder
import com.example.nellamaster.QuizScreens.QuizBauhausBuilder
import com.example.nellamaster.QuizScreens.QuizCompleted
import com.example.nellamaster.QuizScreens.QuizJapanBuilder
import com.example.nellamaster.QuizScreens.QuizJugendstilBuilder
import com.example.nellamaster.QuizScreens.QuizSelectorBuilder
import com.example.nellamaster.QuizScreens.RightAnswerScreenBuilder
import com.example.nellamaster.QuizScreens.WrongAnswerScreen
import com.example.nellamaster.welcomeScreens.ReadyToGoScreenBuilder
import com.example.nellamaster.welcomeScreens.WelcomeScreen2Builder
import com.example.nellamaster.welcomeScreens.WelcomeScreen3Builder
import com.example.nellamaster.welcomeScreens.WelcomeScreen4Builder
import com.example.nellamaster.welcomeScreens.WelcomeScreenBuilder

@Composable
fun Navigation() {

    val navController = rememberNavController()

    NavHost(navController = navController,startDestination = Screen.WelcomeScreen1.route) {
        composable(route = Screen.WelcomeScreen1.route) {
            WelcomeScreenBuilder (
                onNavigateToWelcomScreen2 = {navController.navigate(Screen.WelcomeScreen2.route)}
            )
        }
        composable(route = Screen.WelcomeScreen2.route) {
            WelcomeScreen2Builder(
                onNavigateToWelcomeScreen3 = {navController.navigate(Screen.WelcomeScreen3.route)}
            )
        }
        composable(route = Screen.WelcomeScreen3.route) {
            WelcomeScreen3Builder(
                onNavigateToWelcomeScreen4 = {navController.navigate(Screen.WelcomeScreen4.route)}
            )
        }
        composable(route = Screen.WelcomeScreen4.route) {
            WelcomeScreen4Builder(
                onNavigateToReadyToGoScreen = {navController.navigate(Screen.ReadyToGoScreen.route)}
            )
        }
        composable(route = Screen.ReadyToGoScreen.route) {
            ReadyToGoScreenBuilder(
                onNavigationToCategorySelection = {navController.navigate("mainApp")},
                onNavigationToHelpLandingScreen = {navController.navigate("help")}
            )
        }

        //The navGraph of the MainApp
        navigation(startDestination = Screen.HomeScreen.route, route = "mainApp") {
            composable(route = Screen.HomeScreen.route) {
                CategorySelectionMaker(
                    navController = navController,
                    onNavigateToKunstHandwerk = {navController.navigate("subKunHan")},
                    onNavigateToArchitectureInterior = {navController.navigate("subArcInt")},
                    onNavigateToGrafikdesignPrint = {navController.navigate("subGraPri")},
                    onNavigateToQuizSelector = {navController.navigate("quiz")}
                )
            }
            
            //SubCategory for Architectur and Interior Styles
            navigation(startDestination = Screen.ArchitectureInterior.route, route = "subArcInt") {
                composable(route = Screen.ArchitectureInterior.route) {
                    CategoryMaker(navController = navController)
                }
                navigation(startDestination = Screen.GotikScreen.route, route = "stilGotik") {
                    composable(route = Screen.GotikScreen.route) {
                        GotikSubKategorie(
                            navController = navController,
                            onNavigateToFullScreen = {navController.navigate(Screen.FullScreenGotik.route)}
                        )
                    }
                    composable(route = Screen.FullScreenGotik.route) {
                        GotikFullScreenBuilder(navController = navController)
                    }
                }
                navigation(startDestination = Screen.BarockScreen.route, route = "stilBarock") {
                    composable(route = Screen.BarockScreen.route) {
                        BarockSubKategorie(
                            navController = navController,
                            onNavigateToFullScreen = {navController.navigate(Screen.FullScreenBarock.route) }
                        )
                    }
                    composable(route = Screen.FullScreenBarock.route) {
                        BarockFullScreenBuilder(
                            navController = navController,
                        )
                    }
                }
                navigation(startDestination = Screen.BauhausScreen.route, route = "stilBauhaus") {
                    composable(route = Screen.BauhausScreen.route) {
                        BauhausSubKategorie(
                            navController = navController,
                            onNavigateToFullScreen = {navController.navigate(Screen.FullScreenBauhaus.route)}
                        )
                    }
                    composable(route = Screen.FullScreenBauhaus.route) {
                        BauhausFullScreenBuilder(navController = navController)
                    }
                } 
            }


            //NavGraph for SubCategory Kunst/Handwerk
            navigation(startDestination = Screen.KunstHandwerk.route, route = "subKunHan") {
                composable(route = Screen.KunstHandwerk.route) {
                    CategoryKunstHandwerkMaker(navController = navController)
                }
                navigation(startDestination = Screen.AsienScreen.route, route = "stilAsien") {
                    composable(route = Screen.AsienScreen.route) {
                        AsienSubKategorie(
                            navController = navController,
                            onNavigateToFullScreen = {navController.navigate(Screen.FullScreenAsien.route)}
                        )
                    }
                    composable(route = Screen.FullScreenAsien.route) {
                        AsienFullScreenBuilder(navController = navController)
                    }
                }
                navigation(startDestination = Screen.OrientScreen.route, route = "stilOrient") {
                    composable(route = Screen.OrientScreen.route) {
                        OrientSubKategorie(
                            navController = navController,
                            onNavigateToFullScreen = {navController.navigate(Screen.FullScreenOrient.route)}
                        )
                    }
                    composable(route = Screen.FullScreenOrient.route) {
                        OrientFullScreenBuilder(navController = navController)
                    }
                }
                navigation(startDestination = Screen.RomScreen.route, route = "stilGriechischRömisch") {
                    composable(route = Screen.RomScreen.route) {
                        RomGriSubKategorie(
                            navController = navController,
                            onNavigateToFullScreen = {navController.navigate(Screen.FullScreenRom.route)}
                        )
                    }
                    composable(route = Screen.FullScreenRom.route) {
                        RomFullScreenBuilder(navController = navController)
                    }
                }
            }

            //NavGraph for SubCategory Grafikdesign/Print
            navigation(startDestination = Screen.GrafikdesignPrint.route, route = "subGraPri") {
                composable(route = Screen.GrafikdesignPrint.route) {
                    CategoryGrafikdesignPrintMaker(navController = navController)
                }
                navigation(startDestination = Screen.JugenstilScreen.route, route = "stilJugendstil") {
                    composable(route = Screen.JugenstilScreen.route) {
                        JugendstilSubKategorie(
                            navController = navController,
                            onNavigateToFullScreen = {navController.navigate(Screen.FullScreenJugendstil.route)}
                        )
                    }
                    composable(route = Screen.FullScreenJugendstil.route) {
                        JugendstilFullScreenBuilder(navController = navController)
                    }
                }
                navigation(startDestination = Screen.PostmoderneSceen.route, route = "stilPostmoderne") {
                    composable(route = Screen.PostmoderneSceen.route) {
                        PostModerneSubKategorie(
                            navController = navController,
                            onNavigateToFullScreen = {navController.navigate(Screen.FullScreenPostmoderne.route)}
                        )
                    }
                    composable(route = Screen.FullScreenPostmoderne.route) {
                        PostmoderneFullScreenBuilder(navController = navController)
                    }
                }
                navigation(startDestination = Screen.ModerneScreen.route, route = "stilModerne") {
                    composable(route = Screen.ModerneScreen.route) {
                        ModerneSubKategorie(
                            navController = navController,
                            onNavigateToFullScreen = {navController.navigate(Screen.FullScreenModerne.route)}
                        )
                    }
                    composable(route = Screen.FullScreenModerne.route) {
                        ModerneFullScreenBuilder(navController = navController)
                    }
                }
            }


        }

        //The NavGraph for the help section
        navigation(startDestination = Screen.HelpLandingScreen.route, route = "help") {
            composable(route = Screen.HelpLandingScreen.route) {
                HelpLandingScreenBuilder(
                    navController = navController,
                    onNavigateToTechSupport = {navController.navigate(Screen.TechnicalSupportScreen.route)},
                    onNavigateToAboutScreen = {navController.navigate(Screen.AboutScreen.route)},
                    onNavigateToAppNutzung = {navController.navigate(Screen.HelpAppNutzungScreen.route)}
                )
            }
            composable(route = Screen.TechnicalSupportScreen.route) {
                TechnischerSupportBuilder(navController = navController)
            }
            composable(route = Screen.AboutScreen.route) {
                AboutScreen(navController = navController)
            }
            navigation(startDestination = Screen.HelpAppNutzungScreen.route, route = "helpAppnutzung") {
                composable(route = Screen.HelpAppNutzungScreen.route) {
                    HelpAppNutzunScreenBuilder(
                        navController = navController,
                        onNavigateToNavigationHelp = {navController.navigate(Screen.NavigationHelp1Screen.route)},
                        onNavigateToWelcomScreens = {navController.navigate(Screen.WelcomeScreen1.route) {popUpTo(navController.graph.findStartDestination().id)} }
                    )
                }
                composable(route = Screen.NavigationHelp1Screen.route) {
                    NavigationHelp1(
                        navController = navController,
                        onNavigateToNext = {navController.navigate(Screen.NavigationHelp2Screen.route)}
                    )
                }
                composable(route = Screen.NavigationHelp2Screen.route) {
                    NavigationHelp2(
                        navController = navController,
                        onNavigateToNext = {navController.navigate(Screen.NavigationHelp3Screen.route)}
                    )
                }
                composable(route = Screen.NavigationHelp3Screen.route) {
                    NavigationHelp3(
                        navController = navController,
                        onNavigateToNext = {navController.navigate(Screen.HelpLandingScreen.route) {popUpTo(Screen.HelpLandingScreen.route)} }
                    )
                }
            }
        }

        //The NavGraph for the camera section
        navigation(startDestination = Screen.CameraMainScreen.route, route = "camera") {
            composable(route = Screen.CameraMainScreen.route) {
                MainScreen(navController = navController)
            }
        }
        
        navigation(startDestination = Screen.CameraScreenNoAR.route, route = "cameraNoAR") {
            composable(route = Screen.CameraScreenNoAR.route) {
                MainScreenNoAR(navController = navController)
            }
        }
        
        //The NavGraph for the quiz section
        navigation(startDestination = Screen.QuizSelectorScreen.route, route = "quiz") {
            composable(Screen.QuizSelectorScreen.route) {
                QuizSelectorBuilder(
                    navController = navController,
                    onNavigationToQuizJugendstil = {navController.navigate(Screen.QuizJugendstilScreen.route)},
                    onNavigationToQuizBauhaus = {navController.navigate(Screen.QuizBauhausScreen.route)},
                    onNavigationToQuizJapan = {navController.navigate(Screen.QuizJapanScreen.route)}
                )
            }
            navigation(startDestination = Screen.QuizJugendstilScreen.route, route = "quizJugend") {
                composable(Screen.QuizJugendstilScreen.route) {
                    QuizJugendstilBuilder(
                        navController = navController,
                        onRightAnswerSelected = {navController.navigate("quizJapan")},
                        onWrongAnswer = {navController.navigate(Screen.WrongAnswerScreenJugend.route)}
                    )
                }
                composable(Screen.WrongAnswerScreenJugend.route) {
                    WrongAnswerScreen(
                        navController = navController,
                        onNavigateToNextQuestion = {navController.navigate(Screen.QuizJapanScreen.route)}
                    )
                }
            }
            navigation(startDestination = Screen.QuizJapanScreen.route, route = "quizJapan") {
                composable(Screen.QuizJapanScreen.route) {
                    QuizJapanBuilder(
                        navController = navController,
                        onRightAnswerSelected = {navController.navigate("quizBauhaus")},
                        onWrongAnswer = {navController.navigate(Screen.WrongAnswerScreenAsien.route)}
                    )
                }
                composable(Screen.WrongAnswerScreenAsien.route) {
                    WrongAnswerScreen(
                        navController = navController,
                        onNavigateToNextQuestion = {navController.navigate(Screen.QuizBauhausScreen.route)}
                    )
                }
            }
            navigation(startDestination = Screen.QuizBauhausScreen.route, route ="quizBauhaus") {
                composable(Screen.QuizBauhausScreen.route) {
                    QuizBauhausBuilder(
                        navController = navController,
                        onRightAnswerSelected = {navController.navigate("quizCorrect")},
                        onWrongAnswer = {navController.navigate(Screen.WrongAnswerScreenBauhaus.route)}
                    )
                }
                composable(Screen.WrongAnswerScreenBauhaus.route) {
                    WrongAnswerScreen(
                        navController = navController,
                        onNavigateToNextQuestion = {navController.navigate(Screen.QuizCompletedScreen.route)}
                    )
                }
            }
            navigation(startDestination = Screen.QuizCompletedScreen.route, route = "quizCorrect") {
                composable(Screen.QuizCompletedScreen.route) {
                    QuizCompleted(navController = navController)
                }
            }
        }
    }
}