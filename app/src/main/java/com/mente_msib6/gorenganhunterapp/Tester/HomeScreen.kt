package com.mente_msib6.gorenganhunterapp.Tester

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells
import androidx.compose.foundation.lazy.staggeredgrid.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.mente_msib6.gorenganhunterapp.Tester.component.GorenganItem
import com.mente_msib6.gorenganhunterapp.Tester.component.PenjualItem
import com.mente_msib6.gorenganhunterapp.data.IniData
import com.mente_msib6.gorenganhunterapp.model.Gorengan
import com.mente_msib6.gorenganhunterapp.model.Penjual
import com.mente_msib6.gorenganhunterapp.navigation.Screen

@Composable
fun HomeScreen(
    navController: NavController,
    modifier: Modifier = Modifier,
    gorengans: List<Gorengan> = IniData.KueGorengan,
    penjuals: List<Penjual> = IniData.ThePenjual,
) {

    LazyColumn(
        verticalArrangement = Arrangement.spacedBy(8.dp),
        modifier = modifier
    ) {
        item {
            LazyRow(
                contentPadding = PaddingValues(16.dp),
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                modifier = modifier
            ) {
                items(gorengans, key = { it.id }) {
                    GorenganItem(onItemClicked = { gorenganId ->
                        navController.navigate(Screen.Detail.route + "/$gorenganId")
                    }, gorengan = it)
                }
            }
        }

    }

    Text(
        modifier = Modifier
            .offset(x =10.dp,y = 230.dp)
        ,
        text = "List Penjual Gorengan Ter Op" )
    LazyVerticalStaggeredGrid(
        columns = StaggeredGridCells.Adaptive(160.dp),
        verticalItemSpacing = 4.dp,
        horizontalArrangement = Arrangement.spacedBy(4.dp),
        modifier = modifier
            .offset(y = 260.dp)
            .size(400.dp)

    ) {
        items(penjuals, key = { it.id }) {
            PenjualItem(
                onItemClicked = { penjualId ->
                    navController.navigate(Screen.DetailPenjual.route + "/$penjualId")
                }, penjual = it)

        }
    }


}


