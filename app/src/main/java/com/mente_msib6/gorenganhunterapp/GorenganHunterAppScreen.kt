package com.mente_msib6.gorenganhunterapp

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForwardIos
import androidx.compose.material.icons.filled.AssignmentTurnedIn
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.PersonPin
import androidx.compose.material.icons.filled.Topic
import androidx.compose.material3.AlertDialogDefaults.containerColor
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.BottomAppBarDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.TopAppBarDefaults.topAppBarColors

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Yellow
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.google.ai.client.generativeai.type.content
import com.mente_msib6.gorenganhunterapp.Tester.DetailPenjual
import com.mente_msib6.gorenganhunterapp.Tester.DetailScreen
import com.mente_msib6.gorenganhunterapp.Tester.HomeScreen
import com.mente_msib6.gorenganhunterapp.Tester.ListScreen
import com.mente_msib6.gorenganhunterapp.Tester.ProfilScreen
import com.mente_msib6.gorenganhunterapp.model.Detail
import com.mente_msib6.gorenganhunterapp.navigation.NavigationItem
import com.mente_msib6.gorenganhunterapp.navigation.Screen
import com.mente_msib6.gorenganhunterapp.navigation.Screen.Detail.title


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun GorenganHunterAppScreen(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController()
) {

    val currentRoute = navController.currentBackStackEntryAsState().value?.destination?.route?: Screen.Home.route
    val backgroundColor = Color(android.graphics.Color.parseColor("#E25E3E"))
    val currentScreen = remember(currentRoute) {
        Screen.LocationRoute(currentRoute)
    }

    Scaffold(
        topBar = {
            TopAppBar(
                colors = TopAppBarDefaults.topAppBarColors(containerColor = backgroundColor),
                title = { Text(text = currentScreen.title) },

                actions = {
                    IconButton(onClick = { navController.navigateUp()}) {
                        Icon(
                            imageVector = Icons.Default.ArrowForwardIos, contentDescription = stringResource(
                                id = R.string.arrow_keluar
                            )
                        )
                    }
                }
            )
        },
        bottomBar = {
            NavBaar(navController)
        },
        modifier = modifier
    ) { contentPadding ->

        NavHost(
            navController = navController,
            startDestination = Screen.Home.route,
            modifier = modifier.padding(contentPadding)
        ) {

            composable(Screen.Home.route) {
                HomeScreen(navController)
            }

            composable(Screen.List.route) {
                ListScreen(navController)
            }

            composable(Screen.Profil.route) {
                ProfilScreen()
            }

            composable(
                Screen.Detail.route + "/{gorenganId}",
                arguments =  listOf(navArgument("gorenganId") { type = NavType.IntType })
            ) { navBackStackEntry ->
                DetailScreen(
                    navController = navController,
                    gorengansId = navBackStackEntry.arguments?.getInt("gorenganId")
                )
            }

            composable(
                Screen.DetailPenjual.route + "/{penjualId}",
                arguments = listOf(navArgument("penjualId") { type = NavType.IntType })
            ) { navBackStackEntry ->
                DetailPenjual(
                    navController = navController,
                    penjualsId = navBackStackEntry.arguments?.getInt("penjualId")
                )
            }
        }
    }
}



@Composable
private fun NavBaar(
    navController: NavHostController,
    modifier: Modifier = Modifier
) {
    BottomAppBar(

        modifier = modifier
    ){
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentRoute = navBackStackEntry?.destination?.route

        val navigationItems = listOf(
            NavigationItem(
                title = stringResource(id = R.string.halaman_home),
                icon = Icons.Default.Home,
                screen = Screen.Home
            ),
            NavigationItem(
                title = stringResource(id = R.string.halaman_list),
                icon = Icons.Default.AssignmentTurnedIn,
                screen = Screen.List
            ),
            NavigationItem(
                title = stringResource(id = R.string.halaman_Profil),
                icon = Icons.Default.PersonPin,
                screen = Screen.Profil
            ),
         
        )
        navigationItems.map { item ->
            NavigationBarItem(

                selected = currentRoute == item.screen.route,
                onClick = {
                    navController.navigate(item.screen.route) {
                        popUpTo(navController.graph.findStartDestination().id) {
                            saveState = true
                        }
                        restoreState = true
                        launchSingleTop = true
                    }
                },
                icon = { Icon(imageVector = item.icon, contentDescription = item.title) },
                label = { Text(text = item.title) }
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun GorenganHunterAppPrev() {
    GorenganHunterAppScreen()
}