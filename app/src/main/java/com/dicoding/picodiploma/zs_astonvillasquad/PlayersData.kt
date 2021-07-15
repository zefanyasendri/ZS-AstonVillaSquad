package com.dicoding.picodiploma.zs_astonvillasquad

object PlayersData {
    private val playerNames = arrayOf(
        "Emiliano Martinez",
        "Matty Cash",
        "Tyrone Mings",
        "Matt Targett",
        "Douglas Luiz",
        "John McGin",
        "Ross Barkley",
        "Jack Grealish",
        "Bertrand Traore",
        "Wesley Moraes")

    private val playerDetails = arrayOf(
        "Seorang kiper dengan nomor punggung 26 yang berusia 28 tahun. Lahir pada 2 September 1992 di Mar del Plata, Argentina. Kiper yang memiliki tinggi 195 cm ini pindah ke Aston Villa dari Arsenal pada tahun 2020 dengan harga 20 juta Euro.",
        "Seorang rightback dengan nomor punggung 2 yang berusia 23 tahun. Lahir pada 7 Agustus, 1997 di Slough, Inggris. Bek yang memiliki tinggi 185 cm ini pindah ke Aston Villa dari Nottingham Forest pada tahun 2014.",
        "Seorang centerback dengan nomor punggung 5 yang berusia 28 tahun. Lahir pada 13 Maret 1993 di Bath, Inggris. Bek yang memiliki tinggi 195 cm ini pindah ke Aston Villa dari Bournemouth pada tahun 2019 dengan status pinjaman.",
        "Seorang leftback dengan nomor punggung 18 yang berusia 25 tahun. Lahir pada 18 September 1995 di Eastleigh, Inggris. Bek yang memiliki tinggi 183 cm ini pindah ke Aston Villa dari Southampton pada tahun 2029 saat Villa promosi ke EPL.",
        "Seorang defensive midfielder dengan nomor punggung 6 yang berusia 23 tahun. Lahir pada 9 Mei 1998 di Rio de Janeiro, Brazil. Gelandang yang memiliki tinggi 178 cm ini pindah ke Aston Villa dari Man City pada tahun 2019 setelah kontraknya tidak diperpanjang City.",
        "Seorang midfielder dengan nomor punggung 7 yang berusia 26 tahun. Lahir pada 18 Oktober 1994 di Glasgow, Skotlandia. Gelandang yang memiliki tinggi 178 cm ini pindah ke Aston Villa dari Hibernian FC pada tahun 2019 dengan durasi kontrak 5 tahun.",
        "Seorang attacking midfielder dengan nomor punggung 20 yang berusia 27 tahun. Lahir pada 5 Desember 1993 di Liverpool, Inggris. Gelandang yang memiliki tinggi 185 cm ini dipinjamkan ke Aston Villa dari Chelsea pada tahun 2020.",
        "Seorang left wing forward dengan nomor punggung 10 yang berusia 25 tahun. Lahir pada 10 September 1995 di Birmingham, Inggris. Sayap kiri yang memiliki tinggi 180 cm ini pindah ke Aston Villa dari Notts County pada usia 6 tahun.",
        "Seorang right wing forward dengan nomor punggung 15 yang berusia 25 tahun. Lahir pada 6 September 1995 di Bobo-Dioulasso, Burkina Faso. Sayap kanan yang memiliki tinggi 181 cm ini pindah ke Aston Villa dari Olympique Lyon pada tahun 2020 dengan harga 17 juta Euro.",
        "Seorang center forward dengan nomor punggung 9 yang berusia 24 tahun. Lahir pada 24 November 1996 di Juiz de Fora, Brazil. Striker yang memiliki tinggi 191 cm ini pindah ke Aston Villa dari Club Brugge pada tahun 2019 dengan harga 22 juta Euro.")

    private val playersImages = intArrayOf(
        R.drawable.emiliano_martinez,
        R.drawable.matty_cash,
        R.drawable.tyrone_mings,
        R.drawable.matt_target,
        R.drawable.douglas_luiz,
        R.drawable.john_mcgin,
        R.drawable.ross_barkley,
        R.drawable.jack_grealish,
        R.drawable.bertrand_traore,
        R.drawable.wesley_moraes)

    val listData: ArrayList<Player>
        get() {
            val list = arrayListOf<Player>()
            for (position in playerNames.indices) {
                val player = Player()
                player.name = playerNames[position]
                player.detail = playerDetails[position]
                player.photo = playersImages[position]
                list.add(player)
            }
            return list
        }
}