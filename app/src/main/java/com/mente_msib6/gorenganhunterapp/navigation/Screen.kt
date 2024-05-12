package com.mente_msib6.gorenganhunterapp.navigation

sealed class Screen (val route: String, val title: String){
    data object Home : Screen("Home","Home")
    data object List: Screen("List","List")
    data object Profil: Screen("Profil","Profil")
    data object Detail: Screen("detail","Detail")
    data object DetailPenjual: Screen("detailPenjual","DetailPenjual")
    companion object {
        fun LocationRoute(route: String?): Screen {
            return when (route) {
                Home.route -> Home
                List.route -> List
                Profil.route -> Profil
                Detail.route -> Detail
                DetailPenjual.route -> DetailPenjual
                else -> {
                    if (route?.startsWith("detail/") == true){
                        Detail
                    }
                    else if (route?.startsWith("detailPenjual/") == true){
                        DetailPenjual
                    } else {
                        throw IllegalArgumentException("no")
                    }
                }

            }
        }
    }
}