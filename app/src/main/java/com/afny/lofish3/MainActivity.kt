package com.afny.lofish3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageList = listOf<Image>(
            Image(
                R.drawable.ikanmas,
                "Ikan Mas",
                "Ikan mas atau common carp termasuk Ordo Cypriniformes, Familia Cyprinidae. Ikan mas (C. carpio L.) mempunyai empat buah sungut dan bagian belakang jari-jari terakhir sirip dubur pada ikan mas mengeras dan bergerigi. Ikan mas berasal dari Jepang, China, dan diintroduksi ke seluruh dunia sebagai ikan konsumsi. Ikan mas merupakan ikan budidaya tertua yang dapat tumbuh mencapai ukuran panjang 120 cm dengan berat 37,3 kg. Sifat ikan mas adalah omnivora atau pemakan segala, mencari hewan dasar dengan cara mengauk dasar kolam yang menyebabkan air menjadi keruh (Tim Peneliti BRPPU 2008)."
            ),
            Image(
                R.drawable.ikanneontetra,
                "Ikan Neon Tetra",
                "Ikan Neon Tetra sangatlah populer sehingga sangat mudah dijumpai di toko ikan manapun. Para penggemar aquascape sangat menyukai ikan ini karena memiliki bentuk yang kecil serta mempunyai warna yang bagus dan tegas membuat ikan ini menjadi pilihan untuk aquascape. Ikan Neon Tetra merupakan ikan hias air tawar yang termasuk ke dalam family characidae dengan ordo charaformares yang berasal dari perairan Amerika Selatan, tenggara Kolombia, Peru bagian timur, serta Brazil bagian barat. Ikan “neon” tetra memiliki karakteristik warna cerah dengan panjang tubuh sekitar 1 – 3 cm, tergolong kecil dibandingkan dengan jenis ikan hias air tawar lainnya. Selain itu, ikan neon tetra dapat berkembangbiak dengan cepat pada suhu air rata-rata 20-26 derajat celcius sehingga kemungkinan untuk membudidayakan ikan tetra sangat rentan sekali untuk dilakukan. Jenis ikan ini sanat jinak sehingga mudah dipelihara dengan mencampurnya bersama ikan jenis lain dalam satu akuarium. Terdapat banyak sekali jenis tetra yang dapat kalian pelihara dan harganya tidak begitu mahal tentunya."),
            Image(
                R.drawable.ikanoscar,
                "Ikan Oscar",
                "Klasifikasinya Pisces, Familia Ciclhid. Ikan oscar yang merupakan famili cichild beledu ini memiliki bintik yang menyerupai mata besar bertepi di belakang dekat pangkal ekornya yang berfungsi untuk mengecoh predator. Sekali bertelur ikan oscar mampu menghasilkan telur sebanyak 2000 butir. Seperti kebanyakn cichlid , spesies ini merawat dan memelihara anak-anaknya. Ikan oscar merupakan ikan yang memiliki tingkat kecerdasan tinggi. Apabila dipelihara di akuarium maka ikan ini mampu mengenali pemeliharanya. Ikan oskar bereproduksi denga cara bertelur. Pembuahan sendiri secara eksternal bisa terjadi pada ikan hermaphrodit yang akan mengeluarkan telur dan sperma secara simultan.  Makanan ikan oskar adalah ikan kecil dan udang. Merupakan ikan yang hidup di air tawar yang berada di rawa dan danau."),
            Image(
                R.drawable.ikanlohan,
                "Ikan Lohan",
                "Lou Han merupakan salah satu ikan hias yang banyak digemari di Indonesia dan berasal dari keluarga Cichlidae. Siklid merupakan keluarga besar yang terdiri atas ratusan spesies. Perkawinan silang antar Lou Han terbukti menghasilkan Lou Han yang cukup baik kualitasnya dengan ciri-ciri fisik tertentu, yaitu pada aspek warna, rajah dan keindahan bentuk. Salah satu faktor yang berpengaruh terhadap perubahan warna ikan Louhan adalah dengan pemberian pakan buatan di samping faktor genetik ikan tersebut. Dalam pemeliharaan, lohan tidak terlalu sulit dan tidak terlalu mahal terutama pada pemberian makanannya. Selain makanan alami yang mudah didapat (cacing, udang), ikan ini juga menyukai makanan buatan (pelet)."
            ),
            Image(
                R.drawable.clownfish,
                "Ikan Badut",
                "Ikan badut atau biasa disebut dengan ikan Clown/nemo banyak digemari masyarakat terutama dikalangan anak-anak, lantaran karakter ikan badut dalam film yang berjudul \"Finding Nemo\" sangat menarik dan perkasa sehingga kini ikan badut menjadi ikan hias laut yang sangat populer dimasyarakat. Ikan badut merupakan ikan hias air laut yang berwarna oranye cerah, dengan tiga garis putih pada tubuhnya. Tiga garis putih pada ikan badut terdapat pada bagian pada bagian kepala, tengah-tengah badan, dan pangkal ekor. Ukuran maksimal ikan badut bisa mencapai 10 -- 18 cm. Ikan badut terlahir dalam keadaan jantan dan yang akan berubah kelamin menjadi betina adalah yang terbesar dari kelompoknya atau pasangannya (Michael, 2008).\n"
            ),
            Image(
                R.drawable.ikanlemon,
                "Ikan Lemon",
                "Ikan Lemon (L. Leleupi) hidup di perairan tawar. Ikan lemon termasuk ke dalam omnivora, agak pemalu dan mudah beradaptasi dengan segala macam ikan. Ikan lemon dapat hidup secara tunggal maupun berpasangan. Sifat ikan lemon tidak teritorial tetapi akan menjadi agresif terhadap ikan lain yang mirip dalam bentuk tubuh atau warnanya. Ikan lemon dapat hidup dengan baik pada kadar oksigen yang cukup (Saolisa, et al., 2018). Menurut Ela (2013), ikan lemon berasal dari danau Tongayika, Afrika. Pada habitat aslinya hidup pada pH tinggi yaitu sekitar 7,8 sampai 9 dan suhu sekitar 25oC-30oC. Tetapi dengan adanya peranakan, ikan lemon dapat beradaptasi dengan lingkungannya."
            ),
            Image(
                R.drawable.rainbowfish,
                "Ikan Rainbow",
                "Celebes Rainbow (Marosatherina ladigesi) sebelumnya Telmatherina ladigesi,adalah spesies sailfin silverside endemik di Pulau Sulawesi (Celebes) di Indonesia dan hanya ditemukan di dekat kota Maros. Mereka juga dikenal oleh penggemar ikan tropis sebagai Celebes Rainbow Fish, Celebes Sailfish,dan Celebes Sailfin. Celebes Rainbow dapat ditemukan dalam aliran air jernih, lambat mengalir, segar hingga sedikit payau dan muara di daerah dengan kadar oksigen terlarut yang tinggi di mana mereka menghabiskan sebagian besar hari bersembunyi di antara daun tanaman yang memakan serangga, cacing kecil, bahan nabati, dll. Ikan Celebes Rainbow adalah spesies sekolah yang damai, ramping, hampir transparan yang memiliki garis biru yang membentang di sepanjang garis lateral tubuh. Laki-laki lebih besar, berwarna lebih gelap daripada betina, dan memiliki sirip ventral dan dorsal kedua yang lebih memanjang."
            ),
            Image(
                R.drawable.ikandiscus,
                "Ikan Discus",
                "Menurut Ela (2013), ikan lemon berasal dari danau Tongayika, Afrika. Pada habitat aslinya hidup pada pH tinggi yaitu sekitar 7,8 sampai 9 dan suhu sekitar 25oC-30oC. Tetapi dengan adanya peranakan, ikan lemon dapat beradaptasi dengan lingkungannya. Meskipun diskusi ini memiliki perbedaan besar dalam warna dari bentuk liar, mereka kurang beradaptasi dengan kehidupan di akuarium, rentan terhadap penyakit dan membutuhkan perawatan lebih. Selain itu, diskus adalah salah satu jenis ikan akuarium yang paling menuntut, membutuhkan parameter air yang stabil, akuarium besar, makanan yang baik, dan ikan itu sendiri sangat mahal."
            ),

            Image(
                R.drawable.ikanmollylyretail,
                "Ikan Molly",
                "Ikan molly tergolong ikan favorit masyarakat Indonesia, dan lebih familiar dengan sebutan ikan balon. Bernama latin Poecilia Sp, Ikan Molly memiliki fisik kecil nan mungil, serta dibagian perut yang sedikit buncit. Namun, keindahan dan kecantikannya tak perlu diragukan lagi Aqua Friends. Bagi para penghobby ikan hias, molly menjadi salah satu pilihan terbaik untuk melengkapi isi aquarium. Pun juga, ikan Molly ini juga sangat cocok untuk dijadikan ikan aquascape. Ikan ini sebenarnya asli dari Meksiko. Bagi masyarakat disana, ikan ini menjadi salah satu menu makanan konsumsi lho. Berhubung warnanya yang indah dan beragam, lambat laun ikan ini menjadi daftar salah satu jenis ikan hias."
            ),
            Image(
                R.drawable.ikancorydoras,
                "Ikan Cory Doras",
                "Ikan yang memiliki nama latin Corydora ini termasuk ke dalam keluarga Callichthyidae dibawah subfamily Corydoradinae dan berasal dari perairan Amerika Selatan. Ikan ini termasuk ke dalam golongan ikan hias berukuran kecil karena memiliki ukuran tubuh 2,5 cm hingga 12 cm saat usia dewasa. Ada berbagai macam dan jenis ikan corydoras Aqua Friends. Selain bentuk tubuhnya yang unik, ikan ini juga termasuk dalam algae eater. Pada habitat aslinya, ikan ini umum dijumpai pada anak sungai dengan aliran air yang tenang dan tidak deras, perairan berpasir serta terkadang dijumpai pada rawa-rawa sepanjang batas sungai yang mana memiliki air yang dangkal dan cukup jernih. Corydoras merupakan ikan yang mencari makan di permukaan pasir dan di antara kerikil di dasar akuarium. "
            ),
            Image(
                R.drawable.ikanguppy,
                "Ikan Guppy",
                "Gupi, ikan seribu, ikan cere, atau suwadakar (Poecilia reticulata), adalah salah satu spesies ikan hias air tawar yang paling populer di dunia. Karena mudahnya menyesuaikan diri dan beranak-pinak, di banyak tempat di Indonesia ikan ini telah menjadi ikan liar yang memenuhi parit-parit dan selokan. Dalam perdagangan ikan hias dikenal sebagai guppy atau juga millionfish, di berbagai daerah lokal seperti gepi (Btw.), bungkreung (Sd.), cethul atau cithul (Jw.), klataw (Bjn.), dan lain-lain. Ikan guppy merupakan salah satu komoditi ikan hias yang memiliki nilai ekonomis cukup baik. Sirip-sirip ikan ini berwarna-warni yang sangat cantik dan menarik. Guppy memeiliki berbagai variant warna seperti biru, merah, hijau, kuning, maupun kombinasi warna sudah beredar di pasaran. Bentuk ekornya pun menarik, berbentuk mirip kipas, membulat, ataupun melebar. "
            ),
            Image(
                R.drawable.arwana,
                "Ikan Arwana",
                "Ikan Arwana adalah jenis ikan hias yang memiliki banyak sekali nama, yakni ikan naga, ikan payung, sampai sebutan ikan kayangan. Ciri khas ikan arwana ini adalah bentuk tubuhnya yang bisa tumbuh sangat besar dengan sisik yang mengkilat dan membuat tampilannya sangat mewah. Jenis- jenis ikan Arwana yang populer di kalangan pecinta ikan hias antara lain ikan arwana silver, super red, dan Arwana golden red. Ikan arwana pada dasarnya memiliki berbagai nama yang melekat pada dirinya. Salah satu nama ikan arwana yaitu ikan kayangan, ikan siluk, ikan kelasa, dan ikan kalikasi. Perlu anda ketahui bahwa sebenarnya ikan arwana ini adalah satwa yang langka, dan memiliki harga yang cukup mahal."
            ),
            Image(
                R.drawable.redtailcatfish,
                "Ikan Red Tail Cat",
                "Ikan lele redtail, Phractocephalus hemioliopterus,adalah ikan lele pimelodid (long-whiskered). Di Venezuela,itu dikenal sebagai cajaro, dan di Brasil,itu dikenal sebagai pirarara,yang berasal dari kata-kata bahasa Tupi pirá dan arara. Ini adalah satu-satunya spesies yang masih ada dari genus Phractocephalus. Ikan ini umum dalam perdagangan akuarium, walaupun ukuran dewasanya yang besar menjadikannya tidak sesuai untuk semua kecuali akuarium terbesar. Mereka memakan ikan, krustasea dan buah-buahan yang jatuh. Mereka tidak dievaluasi oleh IUCN. Phractocephalus hemioliopterus dapat mencapai sekitar 1,8 m (5 ft 11 in) panjangnya, dan berat sekitar 80 kg (180 lb). Namun, ini sangat jarang, dan sebagian besar tidak mendekati ukuran ini. Mereka rata-rata 3 ft 6 in-4 ft 6 in; 1.1–1.4 m panjangnya. Ikan lele besar berwarna-warni ini memiliki punggung kecoklatan, dengan sisi kuning, dan sirip punggung oranye-merah khas dan sirip kaudal (maka nama umum). Kadang-kadang sirip punggung, panggul dan anal juga merah. Mereka memiliki kepala yang lebar dengan kumis panjang, tubuh hitam gelap dan putih di bawahnya yang memanjang dari mulut ke sirip kaudal."
            ),
            Image(
                R.drawable.ikancupang,
                "Ikan Cupang",
                "Cupang, ikan laga, atau ikan adu siam (Betta sp.) adalah ikan air tawar yang habitat asalnya adalah beberapa negara di Asia Tenggara, antara lain Indonesia, Thailand, Malaysia, Brunei Darussalam, Singapura, Vietnam, dan Indonesia. Ikan ini mempunyai bentuk dan karakter yang unik dan cenderung agresif dalam mempertahankan wilayahnya. Di kalangan penggemar, ikan cupang umumnya terbagi atas tiga golongan, yaitu cupang hias, cupang aduan, dan cupang liar. Di Indonesia terdapat cupang asli, salah satunya adalah Betta channoides yang ditemukan di Pampang, Kalimantan Timur.Ikan cupang adalah salah satu ikan yang kuat bertahan hidup dalam waktu lama sehingga apabila ikan tersebut ditempatkan di wadah dengan volume air sedikit dan tanpa adanya alat sirkulasi udara (aerator), ikan ini masih dapat bertahan hidup."
            ),
            Image(
                R.drawable.manfish,
                "Ikan Manfish",
                "Manfish atau yang dikenal juga dengan istilah ‘Angel fish’ berasal dari perairan Amazon. Manfish (Pterophyllum scalare) tergolong ke dalam famili Cichlidae, mempunyai ciri-ciri morfologis bentuk tubuh pipih dengan tubuh seperti anak panah, memiliki warna dan jenis yang bervariasi, sirip perut dan sirip punggungnya membentang lebar ke arah ekor sehingga tampak sebagai busur, dan pada bagian dadanya terdapat dua buah sirip yang panjangnya menjuntai sampai ke bagian ekor. Beberapa jenis ikan Manfish yang dikenal dan telah berkembang di Indonesia antara lain adalah: Diamond (Berlian), Imperial, Marble, dan Black-White. Ikan manfish dapat dijadikan induk setelah umurnya mencapai 7 bulan dengan ukuran panjang ± 7,5 cm. Induk jantan dicirikan dengan ukuran tubuh yang lebih besar dibandingkan dengan induk betina. Kepala induk jantan terlihat agak besar dengan bagian antara mulut ke sirip punggung berbentuk cembung, serta bentuk badan lebih ramping dibandingkan dengan ikan betina. Sementara induk betina dicirikan oleh ukuran tubuh yang lebih kecil dan bentuk kepalanya yang lebih kecil dengan bagian perut yang lebih besar/gemuk serta terlihat agak menonjol.\n"
            ),
            Image(
                R.drawable.blackghost,
                "Ikan Black Ghost",
                "Ikan Black Ghost memiliki bentuk tubuh yang sangat unik. Cara berenangnya pun berbeda dengan kebanyakan ikan lainnya. Ikan ini merupakan ikan hias yang hidup di air tawar, yang berasal dari daerah Amerika Selatan. Khususnya Venezuela, Ecuador, Columbia, Bolivia, hingga Brazil. Namun, ikan ini sudah banyak dikembangkan oleh berbagai masyarakat di dunia, termasuk Indonesia. Sehingga untuk mendapatkannya pun tidak terlalu sulit Aqua Friends. Dikenal dengan nama Black Ghost, karena warna tubuhnya yang hitam pekat dan juga memiliki sirip bagian bawah yang menyerupai kain tertiup angin. Sehingga dari penampilannya tersebut ikan ini dijuluki dengan nama Black Ghost (Setan Hitam). Selain itu, ada banyak sekali julukan atau nama lain untuk ikan ini. Mulai dari Ikan Bulu Ayam, Ikan Pisau, Ikan Listrik (dipercaya mampu mengeluarkan aliran listrik dari tubuhnya), Ikan Penari Balet, Ikan Bendera dan juga Ikan Setan Hitam."
            ),
        )

        val recyclerView = findViewById<RecyclerView>(R.id._imageRecyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = ImageAdapter(this, imageList){
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)
        }
    }
}