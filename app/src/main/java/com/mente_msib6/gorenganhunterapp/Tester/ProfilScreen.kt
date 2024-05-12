package com.mente_msib6.gorenganhunterapp.Tester

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
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
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.mente_msib6.gorenganhunterapp.R

@Composable
fun ProfilScreen() {

    val backgroundColor = Color(android.graphics.Color.parseColor("#74B77E"))


    Image(
        painterResource(R.drawable.profilhamdan),
        contentDescription = "Profil",
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .size(120.dp)
            .offset(x = 18.dp,y = 17.dp)
            .clip(CircleShape)

    )
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start,
            modifier = Modifier
                .padding(5.dp)
                .border(width = 1.dp, color = Color.Black,)
                .width(380.dp)
                .heightIn(700.dp)
                .size(215.dp)
                .fillMaxWidth()
        ) {
            Spacer(modifier = Modifier.width(16.dp))
            Column(modifier = Modifier
                .padding(4.dp)
                .offset(x = 130.dp,y = -330.dp)
            )
            {
                Text(text = "Nama: Hamdan Syaputra",
                    fontSize = 15.sp,
                    fontWeight = FontWeight.SemiBold,
                    modifier = Modifier
                        .offset(y = 80.dp),
                )
                Text(text = "Jurusan: Teknik Informatika",
                    fontSize = 15.sp,
                    fontWeight = FontWeight.SemiBold,
                    modifier = Modifier
                        .offset(y = 80.dp),
                )
                Text(
                    text = "Email: hamdansyaputra02@gmail.com",
                    style = MaterialTheme.typography.titleSmall,
                    fontSize = 12.sp,
                    fontWeight = FontWeight.SemiBold,
                    modifier = Modifier
                        .offset(y = 80.dp)


                )
                Text(text = "Asal Peguruan Tinggi : Sekolah Tinggi Teknologi Indonesia",
                    fontSize = 12.sp,
                    fontWeight = FontWeight.SemiBold,
                    modifier = Modifier
                        .offset(x = -135.dp,y = 165.dp),
                )
            }


    }

    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Start,
        modifier = Modifier
            .padding(5.dp)
            .border(width = 1.dp, color = Color.Black,)
            .width(380.dp)
            .heightIn(200.dp)
            .size(215.dp)
            .fillMaxWidth()
    ) {
        Spacer(modifier = Modifier.width(16.dp))
        Column(modifier = Modifier
            .padding(4.dp)
            .offset(y = 150.dp)
        )
        {

            Text(text = "About Me",
                fontSize = 15.sp,
                fontWeight = FontWeight.SemiBold,
                modifier = Modifier
                    .offset(y = 40.dp),
            )
            Text(
                text = "assalamualaikum warahmatullahi wabarakatuh nama saya hamdan sayaputra " +
                        "dari peguruan tinggi Sekolah Teknik Infromatika.  Yosahhhh semoga lulus dari Msib ini " +
                        "Mohon Bantuan Nya kak",
                style = MaterialTheme.typography.titleSmall,
                fontSize = 12.sp,
                fontWeight = FontWeight.SemiBold,
                modifier = Modifier
                    .offset(y = 80.dp)


            )
        }


    }
}