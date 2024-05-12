package com.mente_msib6.gorenganhunterapp.Tester.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mente_msib6.gorenganhunterapp.R
import com.mente_msib6.gorenganhunterapp.model.Penjual
import com.mente_msib6.gorenganhunterapp.ui.theme.GorenganHunterAppTheme

@Composable
fun PenjualItem(
    penjual: Penjual,
    modifier: Modifier = Modifier,
    onItemClicked: (Int) -> Unit
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier.clickable {
            onItemClicked(penjual.id)
        }
    ) {
        val BlackInvi = Color(android.graphics.Color.parseColor("#99000000"))
        Image(
            painter = painterResource(id = penjual.photo),
            contentDescription = penjual.name, modifier = Modifier
                .offset(x = 0.dp,y = 10.dp,)
                .clip(RoundedCornerShape(16.dp))
                .size(height = 250.dp, width = 190.dp),
                 contentScale = ContentScale.Crop
        )
        Text(
            modifier = Modifier
                .offset(y = -100.dp)
                .clip(RoundedCornerShape(10.dp))
                .width(191.dp)
                .size(110.dp)
                .background(BlackInvi)
            ,
            text = penjual.name,
            style = MaterialTheme.typography.titleMedium,
            overflow = TextOverflow.Ellipsis,
            color = Color.White,
            textAlign = TextAlign.Center,
            maxLines = 1
        )
        Text(
            text = penjual.Review,
            overflow = TextOverflow.Ellipsis,
            color = Color.White,
            fontSize = 12.sp,
            fontWeight = FontWeight.SemiBold,
            modifier = Modifier
                .width(80.dp)
                .offset(x = -50.dp,y = -130.dp)
            ,

            maxLines = 1
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun PenjualItemHorizontalPreview() {
    GorenganHunterAppTheme {
        PenjualItem(
            penjual = Penjual(1, "Hamdan Syaputra", "", "",R.drawable.jualan1),
            onItemClicked = { penjualId ->
                println("Penjual Id : $penjualId")
            }
        )
    }
}