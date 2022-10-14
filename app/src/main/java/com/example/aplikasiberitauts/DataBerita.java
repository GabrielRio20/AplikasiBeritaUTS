package com.example.aplikasiberitauts;

import java.util.ArrayList;

public class DataBerita {

    //Game
    private static int[] pictureGame = {
            R.drawable.game1_a_plague_tale,
            R.drawable.game2_miles,
            R.drawable.game3_windah_rahmat,
            R.drawable.game4_ow2,
            R.drawable.game5_harbor_valo,
            R.drawable.game6_space_unbound,
            R.drawable.game7_fifa23
    };

    private static String[] titleGame = {
            "A Plague Tale: Requiem Hampir Rilis",
            "Spiderman: Miles Morales akan Masuk PC!!",
            "Windah Basudara mengundang Rahmat, si Bocil Okky Livestream Bersama",
            "Overwatch 2 Gratis, Fans: 'Finally!'",
            "Agen Controller Terbaru Valorant: Harbor!",
            "Masalah Selesai, A Space for the Unbound versi Konsol Ganti Publisher!",
            "FIFA 23 Jadi Rilis Tersukses di Sepanjang Sejarah FIFA"
    };

    private static String[] authorGame = {
            "Geming Geek",
            "The Lazy Banget",
            "Top Gaming",
            "Jago E-Sports",
            "VCGamers",
            "JagatPlay",
            "JagatPlay"
    };

    private static String[] contentGame = {
            "Akhirnya! Setelah penantian kurang lebih 3 tahun, sekuel dari A Plague Tale: Innocence, yaitu A Plague Tale: Requiem akan dirilis.\n" +
            "Kabarnya, game ini akan dirilis pada 18 Oktober 2022 ini. \nGame yang mengangkat cerita tentang wabah Black Plague ini, akan kembali " +
            "meceritakan perjalanan sepasang kakak beradik, yaitu Amicia dan Hugo, untuk berpetualang di dunia penuh tikus yang menjadi sumber" +
            "masalah dari wabah black plague ini.\n" +
            "Game ini rencananya akan dirilis hanya di Current Gen Console, yaitu PS5, XBOX Series X dan S. Selain itu juga akan dirilis di PC dan" +
            "Nintendo Switch. Untuk versi Nintendo Switch, akan dirilis dalam versi Cloud.",

            "Setelah menunggu selama kurang lebih 2 tahun, akhirnya pengguna PC bisa memainkan Spiderman: Miles Morales.\n" +
            "Bersetting waktu beberapa tahun setelah game pertamanya, yaitu Marvel's Spiderman, game ini menceritakan tentang Miles Morales," +
            " sahabat Peter Parker yang memiliki kekuatan laba-laba juga setelah digigit laba-laba radioaktif. \nGame ini berfokus pada Miles Morales yang" +
            " kini bertugas menjaga kota New York dari berbagai ancaman musuh Spiderman di saat kepergian Peter Parker untuk berlibur bersama Mary Jane.\n" +
            "Untuk kelanjutannya, langsung mainkan saja Marvel's Spiderman: Miles Morales yang akan dirilis pada 18 November 2022 nanti pada PC melalui" +
            " Steam dan Epic Games Store. Atau anda dapat melakukan Pre-Order mulai dari sekarang",

            "Sejak videonya yang viral sejak beberapa bulan lalu, Rahmat, seorang bocah dari Makassar yang lebih dikenal dengan sebutan 'OkkyBoy'," +
            " akhirnya menarik perhatian seorang Youtuber terkenal dari Indonesia, yaitu Windah Basudara.\n" +
            "Youtuber yang terkenal dengan sebutan 'Bapak Bocil Kematian' ini bekerjasama dengan pihak Beasiswa Sepuluh Ribu untuk menggalang dana bagi" +
            " pendidikan Rahmat dan seluruh anak di Indonesia yang kurang beruntung lainnya.\n" +
            "Sesi livestream dilakukan di channel Youtube Windah Basudara yang dilakukan selama kurang lebih 3 jam ini berhasil menghasilkan nominal donasi" +
            " sebesar kurang lebih 300 juta rupiah.",

            "Sejak tahun 2016 lalu, Overwatch telah menjadi salah satu game bergenre FPS yang sangat keren dan digemari banyak orang. Bahkan game ini berhasil" +
            " menjadi Game of the Year pada tahun 2016. Namun sayangnya game ini berbaya, sehingga kurang populer khususnya di Indonesia. Sehingga, lama kelamaan," +
            " player dari game ini pun semakin menurun dari tahun ke tahun. Ditambah dengan dirilisnya game Valorant pada tahun 2020 lalu.\n" +
            "Namun ternyata game ini mengejutkan para fans terkait rencana perilisan game Overwatch 2 ini. Dan kabar baiknya game ini aka Free to Play. Namun sayangnya," +
            " perilisan Overwatch 2 ini dibarengi dengan dimatikannya server dari Overwatch pertama.\n" +
            "Perilisan Overwatch 2 ini mendapat reaksi beragam dari para fans, karena jika dilihat dengan sekilas, Overwatch 2 tidak membawa peningkatan grafis yang signifikan," +
            " selain itu, game ini hanya menambah 3 hero baru dari game sebelumnya, sehingga terkesan game ini hanya seperti expansion atau big update dari Overwatch 1.\n" +
            "Meskipun begitu, mimin tetap senang kok dengan hadirnya game Overwatch 2 ini, apalagi gratis, jadi bisa deh mabar sama temen kalo pas gabut gitu :)",

            "Valorant akhirnya merilis agen dengan role controller setelah lebih dari satu tahun rilisnya Astra sebagai agen controller terakhir Valorant." +
            " Agen Valorant terbaru kali ini bernama Harbor, agen yang berasal dari India. Melalui trailer dan teaser yang telah Riot Games rilis, " +
            " agen satu ini memiliki skill atau ability yang fokus terhadap elemen air.\n" +
            "Saat ini, Valorant memiliki total 19 agen yang memiliki role berbeda-beda. Terdapat 6 Duelist, 4 Sentinel, 4 Controller, dan 5 Initiator." +
            " Menurut video trailer resmi dari Valorant, Harbor mendapatkan artefak yang kemudian memberikannya kekuatan elemen air.\n" +
            "Harbor adalah agen dengan nama Varun yang mencuri artefak penting dan misterius dari REALM. Menurut win.gg, agen ini mampu membuat dinding air" +
            " yang bisa menghentikan peluru.\n" +
            "Varun Batra merupakan buronan dari REALM yang bersembunyi dengan artefak tersebut. Selain itu, Fade juga sudah mengungkapkan identitas Harbor" +
            " dan mungkin akan dikejar oleh REALM. Ia mampu mengendalikan elemen air berkat artefak penting yang ia dapatkan dan menggunakan artefak tersebut\n" +
            " untuk kabur dari REALM sebagai buronan.",

            "Anda yang mengikuti berita game, terutama yang datang dari developer lokal, sepertinya sudah memahami apa yang terjadi dengan game terbaru" +
            " racikan Mojiken Studio dan Toge Productions – A Space for the Unbound.\n" +
            "Versi konsol game yang sangat diantisipasi ini mengalami masalah rilis setelah konflik dengan publisher yang dibuka ke ruang umum. Toge Productions merasa " +
            " dicurangi oleh PQube di kala itu untuk masalah pendanaan selama proses pengembangan yang kemudian membuat versi konsol-nya terkatung-katung. Untungnya," +
            " masalah ini resmi selesai. A Space for the Unbound versi konsol kini punya publisher baru.\n" +
            "Setelah pembicaraan belakang layar antara Toge Productions, Mojiken Studio, dan PQube, dan Chorus Worldwide, A Space for the Unbound versi konsol dipastikan" +
            " akan memiliki publisher baru. Ia kini akan berdiri di bawah bendera Chorus Worldwide yang akan menangani rilis semua versi konsol secara global, sementara" +
            " Toge Productions akan bertanggung jawab penuh untuk versi PC.",

            "Di atas kertas, merilis sebuah game yang bisa dibilang tak punya perubahan peraturan permainan yang signifikan di dunia nyata memang terdengar seperti" +
            " sebuah tugas yang mudah terasa tak relevan. Namun nyatanya, EA Sports berhasil melakukan tugas yang fantastis dengan seri FIFA tiap tahunnya dengan beragam" +
            " fitur baru dan implementasi gameplay yang disebut-sebut mampu mendorong level realisme-nya ke tingkat yang baru. Seri yang akan berganti nama tahun depan" +
            " karena masalah lisensi ini terus menuai kesuksesan, termasuk untuk sang seri teranyar – FIFA 23.\n" +
            "EA dengan bangga mengumumkan bahwa FIFA 23 menjadi rilis FIFA" +
            " tersukses di sepanjang sejarah franchise yang sudah eksis selama puluhan tahun ini. FIFA 23 disebut-sebut berhasil mencatatkan pemain hingga 10,3 juta lintas" +
            " platform. Walaupun EA tak berbagi banyak alasan mengapa seri tahun ini begitu sukses, namun fakta bahwa konten Piala Dunia juga akan tersedia sepertinya ikut" +
            " berkontribusi besar. Sayangnya, tidak ada detail soal platform mana yang menjadi yang teramai dan perbedaan persentase antara versi fisik dan digital yang terjual."
    };

    private static int[] pictureGameAdult = {
            R.drawable.game_adult1_cp2077,
            R.drawable.game_adult2_dead_space,
            R.drawable.game_adult3_tlou1,
            R.drawable.game_adult4_gta6
    };

    private static String[] titleGameAdult = {
            "Ala Edgerunners, Modder Tambahkan Sistem Cyberpsycho di Cyberpunk 2077",
            "Dead Space Remake Rilis Trailer Gameplay Pertama",
            "Review The Last of Us Part I: Lebih Indah, Lebih Emosional!",
            "GTA VI Bocor di Internet, Dipercaya Build Awal!"
    };

    private static String[] authorGameAdult = {
            "JagatPlay",
            "JagatPlay",
            "JagatPlay",
            "JagatPlay"
    };

    private static String[] contentGameAdult = {
            "Apakah Anda sudah menyaksikan Cyberpunk Edgerunners? Anime yang lahir dari tangan dingin Studio TRIGGER tersebut sepertinya berhasil menjalankan tugasnya dengan baik." +
            " Tidak hanya sebagai tontonan anime yang keren dan menyentuh di saat yang sama saja, tetapi juga memberikan pandangan lebih luas soal cara kerja Night City yang" +
            " mungkin tak di-cover oleh Cyberpunk 2077. Yang menarik? Anime ini juga berfokus pada efek augmentasi yang disebut “Cyberpsychosis” yang ternyata juga tak banyak" +
            " dieksplorasi oleh si versi video game. Untungnya, modder bertindak.\n" +
            "Seorang modder bernama djkovrik berhasil menyuntikkan sistem Cyberpsychosis ini ke dalam Cyberpunk 2077. Mod ini akan memperkenalkan resource bernama Humanity" +
            " yang akan berkurang bergantung pada aksi Anda, dari membunuh orang tak berdosa, menggunakan terlalu banyak implants, atau terlalu mengandalkan cyberware murah.\n" +
            "Efek Cyberpsychosis akan muncul bertahap, dari sekadar visual glitch di awal hingga debuff. Begitu Anda tak punya lagi Humanity dan jatuh ke dalam status" +
            " Cyberspsycho? Anda akan menguat, namun visual Anda akan penuh glitch dan para polisi akan berusaha memburu Anda.\n" +
            "Anda yang tertarik untuk menjajal mod ini bisa menuju ke tautan NexusMods untuk langsung memasangnya.",

            "Kualitas tidak selalu berakhir sukses dari sisi penjualan. Jika ada salah satu bukti terkuat dari situasi yang cukup absurd ini, Dead Space sepertinya pantas" +
            " memegang predikat tersebut. Terlepas dari puja-puji untuk kualitasnya sebagai game survival horror yang fantastis di masa lalu, penjualannya ternyata tak seberapa" +
            " besar dibandingkan hype yang ada. Puncaknya berujung pada keputusan EA untuk tidak hanya “mengistirahatkan” game ini untuk waktu yang lama sekaligus berujung" +
            " menutup sang developer – Visceral Games. Siapa yang mengira bahwa game ini akan menemukan jalannya kembali di tahun 2023 mendatang.\n" +
            "Lewat proses remake berbasis Frostbite Engine yang dikerjakan oleh EA Motive, Dead Space Remake akhirnya memperlihakan seberapa signifikan penyempurnaan yang" +
            " ditawarkan via trailer gameplay perdana yang mereka lepas. Seperti yang bisa diprediksi, ia memang terlihat memanjakan mata. Anda tetap akan berperan sebagai" +
            " Isaac Clarke dengan keseraman USG Ishimura sebagai setting utama. Efek ekstra seperti tata cahaya dan kabut akan membuat atmosfer terasa lebih menegangkan," +
            " lebih dengan sistem audio yang baru.",

            "Sony dan kemampuan mereka meracik game-game first party dengan narasi yang kuat memang identitas yang bisa dibilang baru mulai terbangun sejak era Playstation 3." +
            " Salah satu ujung tombaknya tentu saja Naughty Dog yang bergerak dari game sekelas Crash Bandicoot dan Jak & Daxter ke game sekelas Uncharted dan setelahnya," +
            " The Last of Us. Untuk urusan terakhir ini, ia berujung datang dengansebuah produk yang memesona. Tidak ada yang memprediksi bahwa Playstation 3 yang di kala itu" +
            " terhitung sebagai hardware tua bisa menangani game dengan visual sekelas The Last of Us yang sekaligus dirangkai sebuah game survival horror dengan cerita dan" +
            " karakter yang tak kalah dengan film Hollywood sekalipun. Tak heran ia langsung menyabet begitu banyak penghargaan.\n" +
            "Naughty Dog dan Sony juga sepertinya memahami bahwa potensi The Last of Us memang mau tidak mau harus diakui, terpengaruh oleh keterbatasan Playstation 3," +
            " baik dari sisi visual, performa, ataupun beragam elemen yang lain. Ada upaya untuk membawanya ke level  baru lewat The Last of Us: Remastered untuk Playstation 4" +
            " yang setidaknya terasa berada di definisi lebih tinggi lengkap dengan framerate lebih solid. Bertahun-tahun setelahnya, apalagi setelah eksis" +
            " The Last of Us Part II, mereka hendak mendongkrak potensi tersebut ke level yang setidaknya setara. Naughty Dog kemudian berujung terlibat dalam proses remake" +
            " yang mereka resmi namai, The Last of Us Part I untuk Playstation 5.",

            "Sudah bukan rahasia lagi sepertinya bahwa Take Two dan Rockstar saat ini memang tengah mengerjakan GTA VI. Pengenalan resmi memang belum dilakukan, namun beberapa" +
            " informasi dari awal sudah kita dapatkan dari sumber yang bisa dipercaya. Bagaimana ia akan menghadirkan kombinasi karakter utama pria + wanita dengan konsep ala" +
            " Bonnie & Clyde, bagaimana akan ada banyak gedung yang kini bisa dimasuki, dan peta yang kabarnya akan terus diperbesar dan diperbaharui secara berkala. \n" +
            "Namun siapa yang menyangka bahwa internet ternyata juga menemukan cara untuk “mendapatkan” game ini dari awal. Benar sekali, GTA VI bocor di internet!\n" +
            "Datang dari seorang peretas yang diyakini merupakan hacker sama yang membocorkan data Uber sebelumnya, beberapa giga data pengembangan GTA VI dilempar begitu saja" +
            " ke internet. Masih dalam bentuk kasarnya, Anda setidaknya bisa melihat wujud sang karakter utama, gameplay, dialog yang sudah direkam, hingga beberapa gedung" +
            " yang bisa dimasuki. Konten ini kabarnya dicuri dari aplikasi bernama Slack – sejenis Discord untuk kelompok korporat.\n" +
            "Keaslian rangkaian screenshot dan video yang bocor ini sendiri dibuktikan oleh dua hal. Pertama adalah konfirmasi dari jurnalis gaming ternama – Jason Schreier yang" +
            " menyebut bahwa hal ini legit, sekaligus mengomentari soal bagaimana ia akan mempengaruhi proses pengembangan GTA VI saat ini. Besar kemungkinan karyawan tidak akan" +
            " menikmati lagi fleksibilitas untuk bekerja dari rumah. Bukti kedua? Take Two sekarang mulai aktif melakukan DMCA Takedown untuk “membunuh” video-video gameplay yang" +
            " sudah tersebar."
    };

    static ArrayList<Berita> showBeritaGame(){
        ArrayList<Berita> list = new ArrayList<>();
        for (int i = 0; i < titleGame.length; i++){
            Berita berita = new Berita();
            berita.setImage(pictureGame[i]);
            berita.setTitle(titleGame[i]);
            berita.setAuthor(authorGame[i]);
            berita.setContent(contentGame[i]);
            list.add(berita);
        }
        return list;
    }

    static ArrayList<Berita> showBeritaGameAdult(){
        ArrayList<Berita> list = new ArrayList<>();
        for (int i = 0; i < titleGameAdult.length; i++){
            Berita berita = new Berita();
            berita.setImage(pictureGameAdult[i]);
            berita.setTitle(titleGameAdult[i]);
            berita.setAuthor(authorGameAdult[i]);
            berita.setContent(contentGameAdult[i]);
            list.add(berita);
        }
        return list;
    }


    //Film
    private static int[] pictureFilm = {
            R.drawable.film1_inkursi,
            R.drawable.film2_blackpanther,
            R.drawable.film3_antman,
            R.drawable.film4_dune
    };

    private static String[] titleFilm = {
            "3 Peristiwa di MCU yang Diduga Menciptakan Inkursi",
            "Sinopsis Singkat Black Panther 2 Bikin Penasaran Pecinta Marvel",
            "Prediksi yang Terjadi di Ant-Man and the Wasp: Quantumania",
            "Jadwal Tayang Dune: Part 2 Berubah Lagi, Jadi 3 November 2023"
    };

    private static String[] authorFilm = {
            "SindoNews",
            "Liputan6",
            "IDN Times",
            "CNN Indonesia"
    };

    private static String[] contentFilm = {
            "1. Perjalanan Steve Rogers ke Masa Lalu\n" +
            "Petunjuk pertama multiverse di Earth-616 muncul di Avengers: Endgame saat Avengers meminjam Batu Keabadian dari masa lalu. Steve Rogers" +
            " kemudian kembali ke masa lalu untuk mengembalikan Batu itu dan menghindari membuat cabang lini masa. Tapi, keputusannya untuk tinggal di" +
            " masa lalu dan hidup bersama Peggy Carter melawan prinsip itu. Pertanyaan bagaimana Steve bisa kembali ke masa sekarang masih belum terjawab." +
            " Tidak ada penjelasan yang masuk akal yang tidak melanggar peraturan multiverse yang dibangun di Endgame, Loki, atau Doctor Strange in" +
            " the Multiverse of Madness. Ini bisa segera menjadi masalah.\n"+ "\n" +
            "2. Gamora 2014 di Masa Kini\n" +
            "Karakter lain dari perjalanan waktu Avengers: Endgame yang berubah menjadi penjahat multiverse adalah varian Gamora yang datang bersama Thanos" +
            " dari 2014. Seperti Steve Rogers, Gamora melanggar peraturan perjalanan waktu Endgame dengan tinggal di lini masa yang bukan miliknya." +
            " Tapi, dalam kasusnya, dia datang dari masa lalu dan tinggal di masa sekarang. Nasib Gamora setelah Endgame tidak diketahui. Tapi, keberadaannya" +
            " di semesta utama MCU bisa melepaskan inkursi, kalau setiap lini masa benar-benar tidak kompatibel satu sama lain.\n"+ "\n" +
            "3. Penggunaan Darkhold di Multiverse of Madness\n" +
            "Kekhawatiran terbesar Illuminati di Doctor Strange in the Multiverse of Madness adalah risiko inkursi karena Doctor Strange menggunakan Darkhold." +
            " Menurut mereka, Doctor Strange di realitas mereka menggunakan Darkhold untuk Dreamwalk ke varian multiverse, yang memicu inkursi. Yang mereka abaikan" +
            " adalah Wanda Maximoff sudah menyelewengkan Darkhold di semesta 616. Ini membuat Doctor Strange kemudian menggunakan Darkhold untuk ber-Dreamwalk dalam" +
            " bentuk mayat membusuk Defender Strange.\n",

            "Dalam film Black Panther 2 ini, Wakanda Forever memberikan tampilan terbaik dengan kehadiran aktor baru. Tapi masih belum jelas siapa Black Panther" +
            " yang baru meskipun Anda dapat menebak dengan cukup baik.\n"+
            "Dalam trailer pertama Black Panther 2 cukup menarik emosi penonton memberi rasa penasaran. Namor, Raja Talocan, datang ke permukaan dunia dan menyerang" +
            " Wakanda ketika bangsa sedang berkabung dan pada titik terlemahnya.\n" +
            "Sementara itu, Riri Williams (Dominique Thorne), seorang penemu muda, membuat baju zirah yang sangat mirip dengan baju besi Iron Man. Jadi mereka yang" +
            " khawatir bahwa penampilan Ironheart hanyalah lelucon dalam film ini dapat yakin.\n" +
            "Sepertinya dia sedang memainkan peran bagian yang cukup besar. Black Panther Wakanda Forever ini rencananya akan dirilis pada 11 November 2022.",

            "1. Penjelajahan Quantum Realm akan menjadi fokus dalam Ant-Man and the Wasp: Quantumania\n" +
            "Dari sekian banyak dimensi dalam multiverse Marvel, Quantum Realm adalah salah satu yang paling menarik untuk dibahas. Seperti yang kita tahu, dimensi" +
            " yang satu ini mempunyai peran yang besar dalam sejumlah peristiwa di film MCU, seperti Doctor Strange (2016), Ant-Man and the Wasp (2018)," +
            " hingga Avengers: Endgame (2019).\n" +
            "Namun, hingga kini, belum ada film MCU yang benar-benar mengeksplorasi isi dari Quantum Realm. Nah, Ant-Man and the Wasp: Quantumania bisa menjadi" +
            " kesempatan yang baik bagi MCU untuk memperkenalkan dimensi tersebut kepada para penggemar.\n"+ "\n" +
            "2. Kang the Conqueror dan MODOK bakal menjadi villain.\n" +
            "Ngomongin soal footage yang bocor, ada tiga penampakan karakter yang mencuri perhatian para fans. Pertama, karakter misterius yang diperankan oleh Bill Murray," +
            " aktor senior Hollywood yang terkenal lewat aktingnya dalam Ghostbusters (1984).\n" +
            "Karakter tersebut tampak memiliki masa lalu yang belum terselesaikan dengan Janet van Dyne. Apakah berkaitan dengan hilangnya Janet di Quantum Realm selama 30" +
            " tahun?\n" +
            "Kedua, penampakan MODOK yang alih-alih berbentuk human-cyborg seperti dalam komik, malah terlihat seperti robot berkepala besar. Banyak fans berspekulasi kalau" +
            " karakter yang dibawakan Bill Murray adalah sosok di balik MODOK.\n" +
            "Terakhir, ada Kang the Conqueror yang diperankan oleh Jonathan Majors. Sebelumnya, Majors memerankan varian lain dari Kang, yakni He Who Remains, kreator dari" +
            " Time Variance Authority (TVA), dalam Loki (2021).\n"+ "\n" +
            "3. Dampak Ant-Man and the Wasp: Quantumania terhadap Avengers: The Kang Dynasty\n" +
            "Kemunculan Kang the Conqueror dalam Ant-Man and the Wasp: Quantumania membuat fans mengaitkannya dengan salah satu film Phase 6 MCU, Avengers: The Kang Dynasty (2025)." +
            " Jika kamu perhatikan, sebelum footage berakhir, Kang menawarkan perjanjian pada Ant-Man.\n" +
            "Demi menyelamatkan Cassie, Ant-Man harus membantu Kang menemukan sebuah benda yang dicuri darinya. Dengan nada mengancam, Kang pun mengatakan kalau ia pernah" +
            " meledakkan varian Avengers dalam realitas alternatif yang telah ia taklukkan.",

            "Jadwal tayang film Dune: Part 2 dimajukan dua minggu lebih cepat dari rencana. Film dari Warner Bros. itu akan rilis pada 3 November 2023.\n" +
            "Sebelumnya, Dune: Part 2 tersebut direncanakan untuk rilis pada 17 November 2023.\n" +
            "Dune: Part 2 akan mengisi slot kosong yang sebelumnya diisi oleh film Marvel Cinematic Universe (MCU) baru yang berjudul Blade." +
            " Sekuel itu sebelumnya bakal tayang bersamaan dengan prekuel Hunger Games, yaitu The Ballad of Songbirds and Snakes.\n" +
            "Film garapan sutradara Denis Vileneuve itu sudah mulai menjalani proses syuting pada Juli lalu. Proses produksi Dune: Part 2 dijalani di empat negara," +
            " yaitu Budapest, Abu Dhabi, Yordania, dan Italia.\n" +
            "Timothée Chalamet, Rebecca Ferguson, Zendaya, Josh Brolin, Stellan Skarsgård, Javier Bardem, dan Dave Bautista turut kembali untuk berperan dalam Dune: Part 2."

    };

    private static int[] pictureFilmAdult = {
            R.drawable.film_adult1_ww,
            R.drawable.film_adult2_ww2,
            R.drawable.film_adult3_smile,
            R.drawable.film_adult4_halloween,
            R.drawable.film_adult5_penguin
    };

    private static String[] titleFilmAdult = {
            "Review Werewolf by Night, Marvel Makin Serius Bikin Horor",
            "Produser Werewolf by Night Jawab Kemungkinan Tampil Bareng Moon Knight",
            "Review Film: Smile",
            "Sinopsis Halloween Ends, Akhir Pertarungan Laurie vs Michael",
            "Colin Farrell Bocorkan Episode Pertama Serial The Penguin"
    };

    private static String[] authorFilmAdult = {
            "IDN Times",
            "IDN Times",
            "CNN Indonesia",
            "CNN Indonesia",
            "CNN Indonesia"
    };

    private static String[] contentFilmAdult = {
            "Film ini dibintangi oleh Gael Garcia dan Laura Donnelly, yang menjadi dua pemeran utama. Menceritakan tentang sekelompok pemburu monster yang sekali lagi berkumpul" +
            " setelah pemimpin mereka, Ulysses Bloodstone, tewas.\n" +
            "Demi mendapatkan peninggalan dari sang pemimpin, mereka mengikuti sebuah kompetisi memburu monster yang cukup membahayakan nyawa.\n" +
            "Namun di akhir kompetisi, terungkap di antara para pemburu tersebut ada monster yang menyamar menjadi manusia. Siapa dia dan apa yang terjadi setelah ketahuan\n"+ "\n" +
            "Salah satu alasan film ini disebut unik adalah karena pemilihan temanya. Michael Giacchino sebagai sutradara memilih tema film horor klasik era 30-an hingga 40-an." +
            " Jadi jangan heran kalau Werewolf by Night akan tayang dalam format hitam putih.\n" +
            "Horor juga menjadi genre yang baru dikulik oleh Marvel Studios di cerita MCU dalam beberapa tahun belakangan ini. Setidaknya, sentuhan horor juga terasa" +
            " jelas terlihat di film Doctor Strange in Muliverse of Madness (2022).\n" +
            "Kali ini, Giacchino dan kawan-kawan cukup liar, karena berani mengeksplor film horor klasik dengan menampilkan monster-monster seperti khasnya film horor jadul.",

            "Werewolf by Night dirilis sebagai tayangan TV spesial untuk Halloween musim 2022. Dalam film kali ini, Marvel menunjuk Michael Giacchino sebagai sutradaranya.\n" +
            "Ini termasuk keputusan yang mengejutkan. Sebab, Giacchino lebih dikenal sebagai komposer musik untuk film, serial, dan video game, ketimbang sutradara.\n" +
            "Meski begitu, Brian Gay memiliki alasan tersendiri kenapa Giacchino di sini dipercaya duduk di kursi sutradara Werewolf by Night.\n"+ "\n" +
            "Bagi kamu yang belum tahu, Werewolf memiliki keterikatan cerita dengan Moon Knight dalam versi komik. Moon Knight telah dapat serial solonya tersendiri" +
            " dan cukup sukses memukau para fans.\n" +
            "Dengan munculnya Werewolf di jagat MCU pada Halloween musim ini, fans Marvel tentu berharap kedua karakter ini bisa muncul bareng di serial atau film MCU ke depannya.",

            "Smile merupakan tayangan tahun ini yang bisa membuat pencinta film horor sedikit bernostalgia dengan film-film horor lawas, seperti The Ring atau Drag Me To Hell.\n" +
            "Tone warna, plot minim kejutan yang biasanya dipakai film horor 2000-an, dihidupkan kembali dalam film Smile.\n" +
            "Ada adegan-adegan yang saya harapkan bisa diperdalam di pertengahan film atau menjadi plot twist di akhir cerita, tapi Smile memilih tidak mewujudkan angan saya.\n" +
            "Namun, saya sebagai penonton masih sangat bisa menikmati ketidaknyamanan dari teror yang diberikan film berdurasi 115 menit tersebut.\n" +
            "Teror diberikan lewat jump scare dan adegan gore bertubi-tubi. Namun, sebagian besar kengerian tidak ditampilkan lewat keberadaan hantu, setan, atau monster," +
            " melainkan hal-hal keseharian, seperti bunyi telepon.\n" +
            "Penonton semacam diberikan kode bahwa detik-detik jump scare tersebut akan muncul. Namun, jump scare itu malah muncul pada saat yang lain.\n" +
            "Hal itu lah yang kemudian membuat saya sebagai penonton semakin merasa tidak nyaman menantikan jump scare itu muncul.\n" +
            "Tak hanya itu, rasa tidak nyaman tersebut juga diperkuat dengan backsound serta sound effect yang benar-benar mengganggu.\n",

            "Halloween Ends akan menjadi akhir dari perlawanan Laurie Strode terhadap Michael Myers hingga hanya satu dari antara mereka yang akan bertahan.\n" +
            "Film ini mengambil latar empat tahun setelah Halloween Kills yang tayang pada 2021. Laurie Strode (Jamie Lee Curtis) tinggal bersama sang cucu," +
            " Allyson (Andi Matichak).\n" +
            "Hal itu juga dilakukan ketika sedang berusaha menyelesaikan penulisan memoar. Dalam rentang waktu itu, Michael Myers belum terlihat lagi, benar-benar" +
            " menghilang tanpa jejak.\n" +
            "Kondisi tersebut membuat Laurie mengambil keputusan untuk melanjutkan kehidupan dan membebaskan dirinya dari ketakutan dan kemarahan.\n" +
            "Namun, hal itu tak berlangsung lama usai seorang pemuda, Corey Cunningham (Rohan Campbell) dituduh membunuh seorang anak laki-laki yang dia asuh dan jaga.\n" +
            "Tuduhan pembunuhan itu memicu serangkaian kekerasan dan teror yang memaksa Laurie kembali berhadapan dengan kejahatan yang tidak bisa ia kontrol lagi.\n" +
            "Ia benar-benar merasakan Michael Myers kembali, memperhatikannya, dan mengincarnya. Tak hanya itu, Laura merasa kembalinya Michael Myers kali ini berbeda" +
            " karena terasa lebih berbahaya.\n",

            "Colin Farrell membocorkan kisah untuk episode pertama serial The Penguin. Spin-off The Batman (2022) itu akan mengambil latar waktu satu pekan setelah akhir cerita The Batman.\n" +
            "Aktor pemeran Oswald 'Oz' Cobblepot alias Penguin itu mengatakan serial bakal dibuka dengan Gotham masih tergenang air akibat ulah Riddler (Paul Dano) yang meledakkan" +
            " bom hingga tanggul kota.\n" +
            "'Ini dimulai sekitar satu minggu setelah The Batman berakhir, sehingga Gotham masih tergenang air,' kata Farrell, seperti diberitakan Variety pada" +
            " Kamis (12/10).\n" +
            "Aktor berusia 46 tahun itu juga mengaku sangat puas dengan naskah The Penguin yang ditulis Lauren LeFranc. Menurutnya, proyek lepasan dari karakter" +
            " The Batman itu bakal menjadi prospek menarik dalam semesta Gotham.\n" +
            "Farrell juga mengaku begitu mencintai karakter Penguin yang dikenal sebagai salah satu musuh ikonis Bruce Wayne. Ia mengungkapkan keinginan untuk terus" +
            " melakukan yang terbaik demi perannya di The Penguin.\n" +
            "Ia juga menggambarkan episode pertama sebagai tontonan yang tidak biasa tetapi bisa begitu dinikmati.\n"
    };

    static ArrayList<Berita> showBeritaFilm(){
        ArrayList<Berita> list = new ArrayList<>();
        for (int i = 0; i < titleFilm.length; i++){
            Berita berita = new Berita();
            berita.setImage(pictureFilm[i]);
            berita.setTitle(titleFilm[i]);
            berita.setAuthor(authorFilm[i]);
            berita.setContent(contentFilm[i]);
            list.add(berita);
        }
        return list;
    }

    static ArrayList<Berita> showBeritaFilmAdult(){
        ArrayList<Berita> list = new ArrayList<>();
        for (int i = 0; i < titleFilmAdult.length; i++){
            Berita berita = new Berita();
            berita.setImage(pictureFilmAdult[i]);
            berita.setTitle(titleFilmAdult[i]);
            berita.setAuthor(authorFilmAdult[i]);
            berita.setContent(contentFilmAdult[i]);
            list.add(berita);
        }
        return list;
    }


    //Gadget
    private static int[] pictureGadget = {
            R.drawable.gadget1_iphone14,
            R.drawable.gadget2_ip14pro,
            R.drawable.gadget3_crash,
            R.drawable.gadget4_acer,
            R.drawable.gadget5_mediatek,
            R.drawable.gadget6_pixel7,
            R.drawable.gadget7_videopoco
    };

    private static String[] titleGadget = {
            "Penjualan iPhone 14 Plus Suram, Apple Siap-siap Pangkas Produksi",
            "Harga Produksi iPhone 14 Pro Max Pecahkan Rekor, Berapa?",
            "Fitur pada iPhone 14 Ini Justru Aktif saat Pengguna Naik Roller Coaster",
            "Acer Luncurkan Swift 3 OLED dan Swift Edge di Indonesia, Ini Harganya!",
            "MediaTek Luncurkan Dimensity 1080, Punya Dukungan Kamera 200 MP",
            "Ini Daya Tarik Pixel 7 dan Pixel 7 Pro yang Baru Dirilis Google",
            "Video Musik U DA BEST Digarap Hanya Pakai POCO F4 GT"
    };

    private static String[] authorGadget = {
            "Detik",
            "Detik",
            "Detik",
            "DroidLime",
            "DroidLime",
            "DroidLime",
            "DroidLime"
    };

    private static String[] contentGadget = {
            "Penjualan perdana iPhone 14 Plus baru saja dibuka pekan lalu. Sayangnya, varian baru di lini iPhone 14 ini sepertinya tidak mendapat sambutan hangat" +
            " dari fanboy Apple karena penjualannya dilaporkan lesu.\n" +
            "Laporan dari DigiTimes mengklaim penjualan iPhone 14 dan iPhone 14 Plus tidak sesuai harapan dan kalah saing dari iPhone 14 Pro dan iPhone 14 Pro Max" +
            " yang mendapat sambutan antusias.\n" +
            "Sumber yang berbicara kepada DigiTimes mengatakan jika penjualan iPhone 14 dan iPhone 14 Plus tetap datar dalam waktu dekat, maka Apple akan memangkas" +
            " pesanan komponen pada paruh kedua bulan Oktober.\n"+
            "Jika pesanan komponen yang dipangkas Apple lebih signifikan dari perkiraan, maka total pengiriman iPhone 14 series hingga akhir tahun ini akan jauh" +
            " lebih rendah dibandingkan iPhone 13 series pada periode yang sama.\n" +
            "Apple memang tidak mengonfirmasi berapa banyak unit iPhone 14 series yang diproduksi tahun ini. Peneliti memperkirakan Apple akan memproduksi 90 juta" +
            " unit iPhone baru pada paruh kedua tahun 2022, tapi kemungkinan bisa turun jadi 80 juta unit karena permintaan yang seret, seperti dikutip dari MacRumors," +
            " Jumat (14/10/2022).\n" +
            "Laporan DigiTimes ini senada dengan beberapa laporan lainnya yang mengindikasikan penjualan iPhone 14 dan iPhone 14 Plus tidak berhasil memenuhi ekspektasi" +
            " Apple.\n",

            "iPhone 14 Pro Max merupakan varian termahal di lini iPhone 14. Harga produksinya pun jadi lebih mahal sampai memecahkan rekor, berapa?\n" +
            "Nikkei Asia, bersama perusahaan riset Fomalhaut Techno Solutions, menganalisis biaya produksi iPhone 14, iPhone 14 Pro, dan iPhone 14 Pro Max." +
            " Mereka menemukan biaya produksi iPhone 14 series naik 20% dibandingkan generasi sebelumnya.\n" +
            "Khusus iPhone 14 Pro Max, Fomalhaut memperkirakan harga produksinya mencapai USD 501 atau sekitar Rp 7,6 juta. Harga produksi iPhone 14 Pro Max tercatat" +
            " USD 60 lebih tinggi ketimbang harga produksi iPhone 13 Pro Max yang diluncurkan tahun lalu.\n"+
            "Angka ini juga memecahkan rekor harga produksi iPhone varian Pro Max. Biasanya, harga produksi iPhone varian tertinggi ini berada di kisaran USD 400" +
            " sampai USD 450 sejak varian ini diluncurkan pada tahun 2018.\n" +
            "iPhone 14 Pro Max sendiri dijual dengan harga USD 1.099 (Rp 16 jutaan) di Amerika Serikat. Harganya tidak berubah sejak varian Pro Max pertama," +
            " yang membuat Nikkei berasumsi margin laba Apple berkurang karena biaya produksi yang semakin tinggi.\n",

            "Fitur Crash Detection pada iPhone 14 series yang bisa menghubungi layanan gawat darurat saat kecelakaan mobil malah aktif saat pengguna naik roller coaster" +
            " di taman bermain. Menurut laporan dari Wall Street Journal pada Minggu (8/10), setidaknya ada 6 panggilan darurat dari taman King Island di Cincinnati, AS.",

            "Di pasar Indonesia, Acer tidak pernah berhenti untuk menggelontorkan perangkat terbarunya. Ya! Acer terus membuktikan inovasinya itu dengan tujuan untuk menjawab" +
            " kebutuhan konsumen di Indonesia akan laptop berdesain ringkas yang memudahkan mobilitas.\n" +
            "Tak hanya itu, laptop terbaru yang dihadirkan juga memiliki kemampuan yang bisa diandalkan untuk beragam aktivitas. Untuk itu, Acer menghadirkan rangkaian produk" +
            " laptop tipis sesuai dengan kampanye “I Go with Swift”. Rangkaian laptop tersebut adalah Swift Edge dan Swift 3 OLED.\n" +
            "Keduanya telah didukung dengan layar OLED yang kaya warna dan aman untuk mata. Acer Swift Edge merupakan laptop 16 inci teringan di dunia dengan bobot 1,1 Kg," +
            " sehingga cocok untuk mendukung aktivitas pekerja yang memiliki mobilitas tinggi (I Work with Swift).\n" +
            "Acer Swift 3 OLED telah tersedia di Indonesia dan dibanderol mulai dari harga Rp13.499.000 untuk varian Intel® Core™ i5. Sementara, bagi konsumen yang tertarik dengan" +
            " laptop ini dan ditenagai Intel® Core™ i7, Acer menjualnya dengan harga Rp16.499.000.",

            "MediaTek kembali membuat kejutan di tahun ini dengan meluncurkan chipset baru yang  mereka beri nama dengan sebutan Dimensity 1080. Chipset 6 nm yang diproduksi" +
            " oleh TSMC ini adalah penerus Dimensity 920, yang memulai debutnya pada tahun lalu.\n" +
            "Sekadar mengingatkan kalian, Dimensity 920 telah digunakan di beberapa perangkat yang punya nama begitu populer di mata para penggemar gadget, seperti seri" +
            " Xiaomi Mi 11i (Redmi Note 11 Pro/Pro+ edisi Cina), realme 9 Pro+, vivo V23 5G, dan Infinix Zero Ultra 5G.\n" +
            "Sekarang, mari kita cari tahu apa saja keuggulan atau daya tarik dari Dimensity 1080? Pertama, chipset ini memiliki dua inti Cortex-A78 dengan clock speed hingga" +
            " 2,6 GHz dan enam inti Cortex-A55 yang bisa bekerja hingga 2 GHz. SoC ini juga sudah dibekali GPU Mali-G68 MC4.\n" +
            "Ya! Punya dukungan seperti yang telah disebutkan di atas, cukup pantas rasanya jika MediaTek mengklaim bahwa chipset barunya itu dirancang untuk memberi daya" +
            " pada smartphone 5G kelas menengah. SoC ini juga hadir dengan dukungan untuk RAM LPDDR5 dan penyimpanan UFS 3.1.\n" +
            "Sementara itu, bagi kalian yang penasaran dengan berkenaan kemampuan kamera, SoC ini dapat mendukung sensor hingga 200 MP tanpa shutter lag. Selain itu," +
            " chipset ini juga membawa dukungan untuk video dengan format 4K HDR dan konkurensi quad-camera.\n" +
            "MediaTek juga menegaskan bahwa smartphone yang ditenagai SoC ini dapat memiliki layar dengan resolusi hingga FullHD+ 120Hz. Sementara itu, terkait dengan" +
            " konektivitas, Dimensity 1080 telah mendukung WiFi 6, Bluetooth 5.2, dan dual 5G dengan dual standby.",

            "Google Pixel 7 Pro\n" +
            "Pixel 7 Pro adalah smartphone terbaik dari Google untuk 12 bulan ke depan atau lebih dan memiliki bakat unggulan. Ya! Smartphone ini diracik oleh Google dengan" +
            " layar yang memiliki refresh rate tajam dan tinggi, sensor kamera besar, kombo lensa wide/ultra-wide/tele.\n" +
            "Selain itu, versi Pro ini juga memiliki tampilan yang khas, fitur keamanan dan janji dukungan perangkat lunak yang lama. Perbedaan dari Pro tahun lalu" +
            " tidak banyak. Semuanya menggunakan chipset Tensor G2 yang baru dan kamera telefoto yang diperbarui.\n"+ "\n" +
            "Google Pixel 7\n" +
            "Pixel 7 jauh lebih murah daripada model Pro dan juga terasa lebih kecil. Tidak sekecil 6a yang lebih murah, tetapi sekecil Pixel premium. Seperti Pro," +
            " smartphone ini juga menggunakan chipset Tensor G2 sebagai motor penggeraknya (6a menggunakan chip Tensor asli).\n" +
            "Untuk RAM, Google hanya menyediakan pilihan 8 GB, yang dipadukan dengan pilihan penyimpanan internal 128 GB dan 256 GB. Seperti model sebelumnya," +
            " Pixel 7 dan 7 Pro dijamin akan menerima 3 pembaruan OS utama (mengubahnya ke v16) dan 5 tahun patch keamanan.",

            "Dalam pembuatan video musik U DA BEST oleh Basboi tersebut, semua perekaman adegan hanya menggunakan POCO F4 GT. Rodagenic sebagai Director of Photography" +
            " dan inisiator video musik ini mempercayakan F4 GT sebagai alat utama yang akan merefleksikan hasil gambar dan video dari musik yang bergenre Hip-Hop/RnB ini.\n" +
            "Terbukti dari hasil video musiknya, kualitas yang diberikan oleh smartphone flagship tersebut mampu menyaingi kualitas video yang dibuat dengan kamera profesional." +
            " Hal tersebut bisa terjadi karena POCO F4 GT didukung oleh kamera yang begitu mumpuni.\n" +
            "Seperti yang kita tahu, POCO F4 GT dilengkapi kamera utama 64 MP dengan sensor Sony IMX686. Selain itu, ada juga lensa ultra-wide 8 MP dan lensa makro 2 MP." +
            " Sementara, di bagian depan ada kamera 20 MP yang dilengkapi sensor Sony IMX596.\n" +
            "Selain itu, POCO F4 GT juga menjadi smartphone incaran pengguna karena diperkuat salah satu chipset terkencang saat ini, Snapdragon 8 Gen 1 dari Qualcomm," +
            " serta dilengkapi dengan L1+R1 Trigger, dan itu jadi yang pertama di smartphone POCO. Tak ketinggalan 120Watt Hypercharge in-box.\n" +
            "Single U DA BEST dari Basboi yang juga menggandeng duet DJ koplo kondang, Feel Koplo. Ini semakin merefleksikan jati diri Basboi sebagai seorang anak muda" +
            " Indonesia yang dikepung dan diterpa referensi serta pengaruh dari luar negeri, tetapi tetap bisa menunjukkan jati diri aslinya sebagai orang Indonesia."
    };



    private static int[] pictureGadgetAdult = {
            R.drawable.gadget_adult1_garmin,
            R.drawable.gadget_adult2_pixeltablet,
            R.drawable.gadget_adult3_sony
    };

    private static String[] titleGadgetAdult = {
            "Yuk! Mengenal Body Battery di Smartwatch Garmin",
            "Punya Dock, Pixel Tablet Bisa Diubah Jadi Smart Screen",
            "Filmmaker Bakal Dimajakan dengan Kehadiran Sony FX30"
    };

    private static String[] authorGadgetAdult = {
            "DroidLime",
            "DroidLime",
            "DroidLime"
    };

    private static String[] contentGadgetAdult = {
            "Seringkali, tubuh mengirimkan beberapa sinyal kepada kita. Terkadang kita tidak menyadarinya sampai tubuh kita menyerah dan jatuh sakit. Terkadang kita" +
            " mengabaikan sinyal dan mendongkraknya dengan minuman berkafein atau berenergi, padahal sebenarnya tubuh butuh istirahat.\n" +
            "Melihat hal itu, Garmin ingin penggunanya lebih sadar akan tubuhnya. Karena itu, Garmin selalu konsisten menghadirkan jam tangan pintar dengan fitur kebugaran" +
            " dan kesehatan yang lengkap. Salah satu fitur canggih yang dimiliki smartwatch Garmin adalah Body Battery.\n" +
            "Ya! Fitur ini dapat melacak tingkat energi dalam tubuh melalui jam tangan pintar Garmin. Body Battery adalah fitur yang mengkombinasikan variabilitas detak jantung," +
            " stres, dan aktivitas untuk memperkirakan cadangan energi yang pengguna miliki sepanjang hari.\n" +
            "Daya tarik lainnya, fitur ini juga dapat merekam dan menampilkan angka dari 1 – 100 yang mewakili tingkat energi dari pengguna. Semakin tinggi angkanya," +
            " semakin banyak energi yang dimiliki pengguna untuk menyelesaikan beragam tugas dan aktivitas sepanjang hari.\n" +
            "Sementara jika angkanya lebih rendah mungkin menunjukkan sudah waktunya untuk menghemat energi. Body Battery biasanya menunjukkan angka paling tinggi setelah" +
            " bangun dari tidur malam yang nyenyak. Angkanya akan terus berkurang secara alami saat pengguna menjalankan aktivitas sehari-hari.",

            "Google secara resmi telah meluncurkan smartphone barunya, Pixel 7 dan Pixel 7 Pro. Tetapi, selain smartphone, Google juga memberikan “teaser” yang tak kalah menarik" +
            " untuk kalian tahu. Ya! Itu adalah Pixel Tablet, yang sebelumnya pada bulan Mei lalu kita juga sudah mendengarnya.\n" +
            "Sebelumnya, juga tak sedikit penggemar gadget yang meragukan bahwa tablet racikan Google tersebut akan tiba di tahun 2023 nanti. Namun, raksasa teknologi yang" +
            " berbasis di Mountain View, Amerika Serikat itu telah berbagi beberapa detail mengenai Pixel Tablet.\n" +
            "Dikatakan bahwa Pixel Tablet akan memiliki “Charging Speaker Dock”. Ini pada dasarnya akan membuatnya lebih mirip dengan smart screen portabel saat dipasang" +
            " di dock, karena akan punya dukungan Google Assistant, dan dapat digunakan dalam mode handsfree.\n" +
            "Juga diyakini, melalui Pixel Tablet ini pengguna dapat mengontrol perangkat pintar yang ada di rumah. Sementara itu, Google melalui presentasinya juga menegaskan" +
            " bahwa tablet ini dapat mengubah sesuatu yang ada di atas laci pengguna menjadi bagian yang saling terintegrasi.\n" +
            "Hal lainnya yang juga bisa mencuri perhatian dari banyak mata para penggemar gadget adalah material dan sentuhan akhir yang dibuat begitu premium. Pixel Tablet ini" +
            " punya sudut yang membulat dan dibuat begitu halus, yang menjadikannya bagian yang tidak salah lagi dari keluarga Pixel.",

            "Sony mengumumkan tambahan terbaru dari rangkaian Cinema Line yang prestise, yaitu kamera FX30 (model ILME-FX30). FX30 terbaru ini merupakan kamera sinema ringkas" +
            " 4K Super 35 yang menawarkan berbagai fitur profesional dari Cinema Line.\n" +
            "Ya! Di dalam kamera FX30 ini pengguna bisa menemukan Dual Base ISO, mode pengambilan gambar Log dan user-imported LUTs (Look Up Tables). Tak hanya itu, FX30 juga" +
            " ditawarkan dengan harga yang menarik sehingga cocok untuk banyak calon filmmaker, videografer, dan content creator.\n" +
            "Selain memperkenalkan kamera FX30 terbaru, Sony juga mengumumkan dua kartu memori CFexpress Type A terbaru, CEA-G320T dan CEA-G640T. Kedua kartu memori ini adalah" +
            " kartu berkapasitas besar yang mendukung performa kecepatan tinggi, baik dalam membaca maupun menulis.\n" +
            "Seperti dikatakan Koji Sekiguchi, President Director PT Sony Indonesia bahwa FX30 terbaru ini cocok bagi siapa saja yang ingin memulai membuat film." +
            " Kamera ini dilengkapi banyak fitur profesional dari kamera kelas atas Sony, sehingga cocok untuk para para filmmaker, videografer dan content creator."
    };


    static ArrayList<Berita> showBeritaGadget(){
        ArrayList<Berita> list = new ArrayList<>();
        for (int i = 0; i < titleGadget.length; i++){
            Berita berita = new Berita();
            berita.setImage(pictureGadget[i]);
            berita.setTitle(titleGadget[i]);
            berita.setAuthor(authorGadget[i]);
            berita.setContent(contentGadget[i]);
            list.add(berita);
        }
        return list;
    }

    static ArrayList<Berita> showBeritaGadgetAdult(){
        ArrayList<Berita> list = new ArrayList<>();
        for (int i = 0; i < titleGadgetAdult.length; i++){
            Berita berita = new Berita();
            berita.setImage(pictureGadgetAdult[i]);
            berita.setTitle(titleGadgetAdult[i]);
            berita.setAuthor(authorGadgetAdult[i]);
            berita.setContent(contentGadgetAdult[i]);
            list.add(berita);
        }
        return list;
    }


}
