package com.example.herb_teas

object TeaData {
    private val teaName = arrayOf(
        "Chamomile Tea",
        "Peppermint Tea",
        "Ginger Tea",
        "Hibiscus Tea",
        "Echinacea Tea",
        "Rooibos Tea",
        "Sage Tea",
        "Lemon Balm Tea",
        "Rose Hip Tea",
        "PassionFlower Tea"
    )

    private val detailTea = arrayOf(
        "Teh Chamomile merupakan sebuah teh yang berasal dari bunga Chamomile dan sering digunakan sebagai salah satu jenis pengobatan jangka panjang. Banyak orang memilih teh jenis ini karena bebas kafein dan memilik rasa yang sedikit manis. " +
                "\nTeh Chamomile sendiri terkenal karena efek menenangkannya yang sering digunakan sebagai obat penidur dan mampu mengurangi rasa depresi serta meningkatkan kualitas tidur",
        "Teh Peppermint merupakan salah satu teh herbal yang sangat digemari oleh banyak orang, hal tersebut dikarenakan sifat bebas kalori dan kafeinnya. Selain itu, beberapa penelitian menemukan bahwa minyak pada daun peppermint dapat memberikan beberapa manfaat kesehatan" + "" +
                "\nDiantaranya mampu meringankan sakit kepala, melegakan nafas dan memiliki komponen yang bersifat anti-bacterial",
        "Teh Ginger (Jahe) merupakan teh yang dibuat dengan cara meng-infused jahe kering atau fresh ke dalam air panas selama beberapa menit. selain efeknya yang menghangatkan dan rasa sedikit pedas, teh jahe juga memiliki beberapa manfaat untuk kesehatan" + "" +
                "\nDiantaranya dapat membantu menurunkan tekanan darah tinggi, meringankan sakit kepala, sebagai anti-inflamatory dan kaya akan antioxidant",
        "Teh Hibiscus merupakan teh yang terbuat dari kembang sepatu yang dikeringkan dan berwarna merah tua serta memiliki rasa manis dan asam" + "" +
                "\nselain itu terdapat manfaat kesehatan yang dapat diperoleh dari teh Hibiscus ini, diantaranya membantu menurunkan tekanan darah tinggi dan kolesterol, membantu mengatasi peradangan dan meningkatkan kesehatan organ hati",
        "Teh Echinacea merupakan jenis teh yang sangat terkenal akan khasiatnya dalam mengatasi demam, banyak penelitian telah membuktikan bahwa teh ini dapat meningkatkan sistem imun yang dapat membamtu tubuh untuk melawan virus dan penyakit",
        "Teh Rooibos merupakan jenis teh yang berasal dari Afrika Selatan, dibuat dari daun tanaman Rooibos. berdasarkan penelitian, para ahli menyatakan bahwa teh ini dapat membantu menjaga kesehatan tulang dan juga dapat mencegah penyakit jantung",
        "Teh Sage merupakan yang teh yang dibuat dengan cara meng-infused daun sage kering dengan air panas. Teh Sage terkenal karena aroma dan juga beberapa manfaatnya dalam kesehatan terutama dalam mencegah dan mengobati penyakit jantung",
        "Teh Lemon balm merupakan jenis teh yang terbuat dari tanaman lemon balm, sejenis lemon dan memiliki aroma terapi yang menenangkan. Selain itu teh ini memiliki khasiat untuk meringankan dan menghindari penyakit stroke dan juga penyakit jantung",
        "Teh Rose Hip merupakan teh yang terbuat dari buah tanaman mawar. buah dari tanaman mawar ini tinggi akan Vitamin C dan anti-inflamatory, sehingga bagus untuk menjaga kesehatan dan imun tubuh dari penyakit dan virus. ",
        "Teh Passionflower merupakan teh yang dibuat dari daun, batang dan bunga dari tanaman passionflower. Berbagai penelitian telah membuktikan bahwa teh ini dapat meringankan gangguan kecemasan dan meningkatkan kualitas tidur"
    )

    private val imageTea = intArrayOf(
        R.drawable.chamomile_tea,
        R.drawable.pepermint_tea,
        R.drawable.ginger_tea,
        R.drawable.hibiscus_tea,
        R.drawable.echinacea_tea,
        R.drawable.rooibos_tea,
        R.drawable.sage_tea,
        R.drawable.lemon_tea,
        R.drawable.rose_tea,
        R.drawable.passionflower_tea
    )

    val listOfTea: ArrayList<Teas>
        get() {
            val list = arrayListOf<Teas>()
            for (p in teaName.indices){
                val tea = Teas()
                tea.name = teaName[p]
                tea.detail = detailTea[p]
                tea.img = imageTea[p]
                list.add(tea)
            }
            return list
        }


}