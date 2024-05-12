package com.mente_msib6.gorenganhunterapp.data

import com.mente_msib6.gorenganhunterapp.R
import com.mente_msib6.gorenganhunterapp.model.Gorengan
import com.mente_msib6.gorenganhunterapp.model.Penjual

object IniData {
    val KueGorengan = listOf(
        Gorengan(
            id = 1,
            name = "Bakwan",
            Revgorengan = "bakwan yang super enak ini biasa nya di hidang kan di meja makan bangsawan yang di buat oleh Sang Master Gorengan. dengan aroma iram kas udang yang meyeleber keluar membuat air liur kita menjadi merembes keluar",
            toping = "Udang",
            photo = R.drawable.gorengan1
        ),
        Gorengan(
            id = 2,
            name = "Tahu Jeletot",
            Revgorengan = "Tahu jeletot merupakan camilan tahu yang diisi dengan potongan sayur yang diolah khusus dengan bumbu pedas. Inilah yang menjadi alasan mengapa camilan ini disebut dengan tahu jeletot, rasa pedasnya akan membuat mata terbelalak atau melotot",
            toping = "Original",
            photo = R.drawable.tahujeletot
        ),
        Gorengan(
            id = 3,
            name = "Molen",
            Revgorengan = "Pisang yang dibalut dengan adonan manis begitulah sebutan jajanan khas Indonesia. Orang Indonesia suka membuat makanan penutup dengan pisang dalam berbagai cara, dan ini adalah salah satu jajanan kaki lima mereka yang terkenal.",
            toping = "Varian",
            photo = R.drawable.molen
        ),
        Gorengan(
            id = 4,
            name = "Geblek",
            Revgorengan = "merupakan snek tradisional yang terbuat dari doh tepung ubi kayu dengan bumbu bawang goreng. Bentuknya bulat berwarna putih bersih dan dimasak dengan cara digoreng, berasal dari kulon progo.",
            toping = "Original",
            photo = R.drawable.geblek
        ),
        Gorengan(
            id = 5,
            name = "Gorengan Tempe",
            Revgorengan =
            "Gorengan tempe adalah makanan yang populer di Indonesia. Ini adalah tempe yang dipotong kecil-kecil atau diiris tipis, kemudian digoreng dalam minyak panas hingga kecokelatan dan renyah. ",
            toping = "Original",
            photo = R.drawable.tempe
        ),
        Gorengan(
            id = 6,
            name = "Gorengan Sukun",
            Revgorengan =
            "Gorengan sukun adalah camilan yang terbuat dari sukun yang digoreng. Sukun adalah buah dari pohon sukun, yang juga dikenal sebagai breadfruit dalam bahasa Inggris. Buah sukun ini memiliki daging yang tebal dan kaya nutrisi. Untuk membuat gorengan sukun, daging sukun biasanya dipotong-potong atau diiris tipis, kemudian digoreng dalam minyak panas hingga matang dan renyah. ",
            toping = "Original",
            photo = R.drawable.sukun
        ),
        Gorengan(
            id = 7,
            name = "Gorengan Ubi",
            Revgorengan =
                    "Gorengan ubi adalah camilan yang terbuat dari ubi, biasanya ubi jalar atau ubi kayu, yang dipotong kecil-kecil atau diiris tipis, kemudian digoreng dalam minyak panas hingga matang dan renyah. Proses penggorengan ini membuat tekstur ubi menjadi renyah di luar dan lembut di dalam. ",
            toping = "Varian",
            photo = R.drawable.ubi
        ),
        Gorengan(
            id = 8,
            name = "Gorengan Perkedel Jagung",
            Revgorengan = "Perkedel jagung ini memiliki tekstur renyah di luar dan lembut di dalam, serta rasa manis dari jagung yang tercampur dengan bumbu-bumbu yang digunakan. ",
            toping = "Varian",
            photo = R.drawable.gorengan1
        ),
        Gorengan(
            id = 9,
            name = "Gorengan Pisang",
            Revgorengan = "Gorengan pisang adalah camilan populer yang terbuat dari pisang yang dipotong-potong dan kemudian digoreng dalam minyak panas hingga kecokelatan dan renyah",
            toping = "Varian",
            photo = R.drawable.pisanggoreng
        ),
        Gorengan(
            id = 10,
            name = "Jamur Crispy",
            Revgorengan = "Biasanya, jamur crispy disajikan dengan berbagai macam saus, seperti saus sambal, saus tomat, atau saus tartar, untuk menambahkan cita rasa yang beragam. Camilan ini cukup populer di berbagai restoran, kafe, atau warung makan sebagai alternatif camilan yang lezat dan menyehatkan.",
            toping = "Sosis",
            photo = R.drawable.jamurcrispy
        ),

    )
    val ThePenjual = listOf(
        Penjual(
            id = 1,
            name = "Gerobak Keliling Jekicen",
            no_hp = "083738388838",
            Review =
                    "Sang juru masak gorengan dengan kekuatan hercules yang membuat nya gorengan nya enak iya lah garam sepacial nya yang terbuat dari keringat"
                ,
            photo = R.drawable.jualan1
        ),
        Penjual(
            id = 2,
            name = "Sang Master Gorengan",
            no_hp = "084534324434",
            Review = "Sang Master Gorengan Yang Berdedikasi kan hidup nya hanay untuk menggoreng goerengan denga kulitas terbaik namun iya masih harus mengahsa skill nya sampe kepatas yang tertinggi agar dia di akui ",
            photo = R.drawable.jualan15
        ),
        Penjual(
            id = 3,
            name = "Gorengan Terenak",
            no_hp = "08937283729",
            Review = "seperti judul nya yah itu gorengan terenak, gorengan ini memilki tekstrur wenak sepanjang masa yang memiliki resep yang setara formula kerebi patie ",
            photo = R.drawable.jualan5
        ),
        Penjual(
            id = 4,
            name = "Gorengan Tanpa Pepsisida",
            no_hp = "088374947638",
            Review = "awal mula gorengan inu tercipta yaitu, pada saat petani yang bernama Hafizam salah menuangakan minyak yang ternyata itu pepsisida yang aneh nya rupa nya gorengan ini laku laris terjual karana kata pelangan nya enak tpi selang satuh bulan sang master gorengan pun di tangkap"
                    ,
            photo = R.drawable.jualan7
        ),
        Penjual(
            id = 5,
            name = "Master Penempa Gorengan",
            no_hp = "083673726373",
            Review = "Sang penempa gorengan dengan palu masakan nya yang dapat menempa segala gorengan ter enak sepanajang masa",
            photo = R.drawable.jualan8
        ),
        Penjual(
            id = 6,
            name = "Ahli Kungfu Pergorengan",
            no_hp = "083937848284",
            Review = "dengan ke ahlian nya sebagai master kungfu dia dapa memanipulasi tekanan udara untuk memasak gorengan dengan suhu yang pas dan aneh nya itu bisa memsak tmapa ada nya miyak dan wajan sekalipun",
            photo = R.drawable.jualan9
        ),
        Penjual(
            id = 7,
            name = "Ahli Pengendali Gorengan",
            no_hp = "085348487264",
            Review = "sang ahli kesatria gorengan yang dapat mengendalikan gorengan dari jarak jahu dan ada gosip bawah persediaan sang ahli pengendali gorengan ini ulimitied atau tidak ada habis nya wkwk",
            photo = R.drawable.jualan10
        ),
        Penjual(
            id = 8,
            name = "Master Guru Besar Gorengan",
            no_hp = "082839273927",
            Review = "Master guru besar yang dapat menciptakan atsmofir menjadi minyak,tanah menjadi tepung,keringat menjadi air dan lebih aneh nya lagi sayuran nya bersal kepala",
            photo = R.drawable.jualan2
        ),
        Penjual(
            id = 9,
            name = "Petapa Gorengan",
            no_hp = "082638263748",
            Review = "Petpa gorengan adalah petapa yang memasak gorengan selama 1500th lebih untuk membuat gorangan terenak sedunia",
            photo = R.drawable.jualan11
        ),
        Penjual(
            id = 10,
            name = "Sang Legenda Gorengan",
            no_hp = "0883726738262",
            Review = "(tidak ada kabar karana ini sangatlah legenda)",
            photo = R.drawable.jualan12
        ),

    )
}
