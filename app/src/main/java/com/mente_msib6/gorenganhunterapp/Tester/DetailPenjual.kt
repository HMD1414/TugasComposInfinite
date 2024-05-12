package com.mente_msib6.gorenganhunterapp.Tester

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.mente_msib6.gorenganhunterapp.data.IniData
import com.mente_msib6.gorenganhunterapp.model.Penjual



@Composable
fun DetailPenjual(
    modifier: Modifier = Modifier,
    navController: NavController,
    penjualsId: Int?
) {

    val newPenjualList = IniData.ThePenjual.filter { penjual ->
        penjual.id == penjualsId
    }
    Column(
        modifier = modifier
    ) {
        DetailPenjualContent(newPenjualList = newPenjualList)
    }
}

@Composable
private fun DetailPenjualContent(
    newPenjualList: List<Penjual>,
    modifier: Modifier = Modifier
) {

    Column(

    verticalArrangement = Arrangement.SpaceAround,
    modifier = Modifier
        .offset(x = 5.dp, y = 5.dp)
        .border(width = 1.dp, color = Color.Black,)

        .height(400.dp)
        .width(380.dp)
        .size(300.dp)
        .fillMaxWidth()

    ){
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Start,
        modifier = modifier
            .padding(16.dp)

    ) {
        AsyncImage(
            model = ImageRequest.Builder(LocalContext.current)
                .data(data = newPenjualList[0].photo)
                .build(),
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(height = 250.dp, width = 400.dp)
                .clip(RoundedCornerShape(16.dp)),
            contentDescription = "Penjual"
        )

    }
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Start,
        modifier = modifier
            .padding(16.dp)

    ) {
        Spacer(modifier = Modifier.width(16.dp))
        Column(modifier = Modifier
            .offset(x = -20.dp, y = -40.dp)
            .padding(4.dp)) {
            Text(
                text = newPenjualList[0].name,
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = "Call Me: ${newPenjualList[0].no_hp}",
                style = MaterialTheme.typography.titleSmall,
            )

        }
    }


    }
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Start,
        modifier = modifier
            .padding(5.dp)
            .offset(y = 4.dp)
            .border(width = 1.dp, color = Color.Black,)
            .width(380.dp)
            .size(215.dp)
            .fillMaxWidth()
    ) {
        Spacer(modifier = Modifier.width(16.dp))
        Column(modifier = Modifier
            .padding(4.dp)
            .offset(y = -50.dp)
        )
        {
            Text(text = "Review:",
                fontSize = 15.sp,
                fontWeight = FontWeight.SemiBold)
            Text(
                text = "${newPenjualList[0].Review}",
                style = MaterialTheme.typography.titleSmall,
                fontSize = 12.sp,
                fontWeight = FontWeight.Normal,
                modifier = Modifier
                    .offset(y = 10.dp)


            )
        }
    }
}


@Preview(showBackground = true)
@Composable
private fun DetailPenjualContentPreview() {
    DetailPenjualContent(newPenjualList = IniData.ThePenjual)
}