package com.mente_msib6.gorenganhunterapp.Tester.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
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
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mente_msib6.gorenganhunterapp.R
import com.mente_msib6.gorenganhunterapp.model.Gorengan
import com.mente_msib6.gorenganhunterapp.model.Penjual
import com.mente_msib6.gorenganhunterapp.ui.theme.GorenganHunterAppTheme

@Composable
fun GorenganItem(
    gorengan: Gorengan,
    modifier: Modifier = Modifier,
    onItemClicked: (Int) -> Unit
) {
    val FontColor = Color(android.graphics.Color.parseColor("#ffffff"))
    val FontColorRev = Color(android.graphics.Color.parseColor("#FF8A08"))
    val BlackInvi = Color(android.graphics.Color.parseColor("#99000000"))
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier.clickable {
            onItemClicked(gorengan.id)
        }
    ) {
        Image(
            painter = painterResource(id = gorengan.photo),
            contentDescription = gorengan.name, modifier = Modifier
                .size(120.dp)
                .offset(x = 0.dp, y = 10.dp,)
                .clip(RoundedCornerShape(5.dp))
                .size(height = 250.dp, width = 190.dp),
              contentScale = ContentScale.Crop
        )
        Column(modifier = Modifier
            .offset(y = -30.dp)
            .height(40.dp)
            .size(120.dp)
            .clip(RoundedCornerShape(5.dp))
            .background(color = BlackInvi)
        ) {
            Text(
                text = gorengan.name,
                style = MaterialTheme.typography.titleMedium,
                overflow = TextOverflow.Ellipsis,
                textAlign = TextAlign.Center,
                color = FontColor,
                modifier = Modifier
                    .width(80.dp)
                    .offset(x = 20.dp)

                ,
                maxLines = 1
            )
            Text(
                text = gorengan.toping,
                overflow = TextOverflow.Ellipsis,
                color = FontColorRev,
                modifier = Modifier
                    .width(80.dp)
                    .offset(x = 70.dp)
                ,
                maxLines = 1
            )

        }


    }
}

@Preview(showBackground = true)
@Composable
private fun MentorItemHorizontalPreview() {
    GorenganHunterAppTheme {
        GorenganItem(
            gorengan = Gorengan(1, "Hamdan Syaputra", "","udang", R.drawable.gorengan1),
            onItemClicked = { gorenganId ->
                println("Gorengan Id : $gorenganId")
            }
        )
    }
}