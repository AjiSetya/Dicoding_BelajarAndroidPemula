package com.blogspot.blogsetyaaji.marvelhero;

import java.util.ArrayList;

class MarvelData {
    private static String[][] data = new String[][]{
            {
                    "Iron Man",
                    "Tony Stark atau Iron-Man menjadi karakter superhero pertama yang diperkenalkan dalam timeline Marvel's Cinematic Universe. Ia merupakan seorang jenius, billionaire, playboy dan pengusaha sukses. Ia mengembangkan teknologi armor senjata dan kemudian dikenal sebagai Iron Man.\n" +
                            "\n" +
                            "Stark dikenal sebagai sosok yang arogan, eksentrik dan ambisius. Kemampuannya untuk terbang dan menembakkan laser dalam kostum Iron Man sangat berguna dalam pertempuran jarak jauh. Ia juga sempat terlibat perseteruan dengan Captain America.\n" +
                            "\n" +
                            "From <https://www.infoakurat.com/2018/06/daftar-superhero-anggota-avengers.html>",
                    "https://images-na.ssl-images-amazon.com/images/I/91qvAndeVYL.jpg"
            },
            {
                    "Captain Amerika",
                    "Steve Rogers atau dikenal sebagai Captain America merupakan anggota Avengers pertama. Dalam timeline MCU, ia merupakan veteran Perang Dunia II dan menjadi superhero pertama hasil eksperimen. Ia sempat terjebak dalam es dan membeku selama hampir 70 tahun sebelum kembali terbangun di era modern.\n" +
                            "\n" +
                            "Captain America dikenal sebagai superhero dengan kecepatan dan kekuatan super. Ia mengandalkan shield/pelindung sebagai senjatanya, baik dalam bertahan atau menyerang. Leadership dari Steve Rogers juga sangat baik dalam memimpin sebuah tim.\n" +
                            "\n" +
                            "From <https://www.infoakurat.com/2018/06/daftar-superhero-anggota-avengers.html>",
                    "https://is1-ssl.mzstatic.com/image/thumb/Video128/v4/af/71/c1/af71c18f-61a0-27e5-6dd0-bb0b78a9ba62/pr_source.lsr/268x0w.png"
            },
            {
                    "The Hulk",
                    "Bruce Banner merupakan dokter dan ilmuwan jenius yang bisa berubah menjadi monster hijau raksasa karena pengaruh radiasi sinar gamma. Ia bisa berubah menjadi Hulk saat marah. Kekuatannya sebagai Hulk sangatlah besar dan menyeramkan.\n" +
                            "\n" +
                            "Belakangan Banner mengalami kesulitan untuk berubah menjadi Hulk. Konflik keduanya menjadi salah satu plot cerita dalam MCU. Pada film solo The Incredibles Hulk, peran Bruce Banner diperankan oleh aktor Edward Norton.\n" +
                            "\n" +
                            "From <https://www.infoakurat.com/2018/06/daftar-superhero-anggota-avengers.html> ",
                    "https://vignette.wikia.nocookie.net/readyplayerone/images/6/6f/Hulk.jpg/revision/latest?cb=20180516101040"
            },
            {
                    "Thor",
                    "Thor merupakan dewa Asgaard, anak dari Odin serta saudara dari Loki dan Hela. Ia menjadi penerus tahta raja Asgaard. Ia bergabung dengan Avengers saat saudaranya, Loki, berupaya untuk menghancurkan pasukan Bumi.\n" +
                            "\n" +
                            "Thor mengandalkan senjata palu bernama Mjolnir, meski belakangan palu tersebut sudah hancur. Kini Thor memegang senjata kapak Stormbreaker. Thor dianggap sebagai anggota Avengers yang paling kuat.\n" +
                            "\n" +
                            "From <https://www.infoakurat.com/2018/06/daftar-superhero-anggota-avengers.html>",
                    "https://images-na.ssl-images-amazon.com/images/I/515eDtHmzML.jpg"
            },
            {
                    "Black Widow",
                    "Natasha Romanoff, lebih dikenal dengan nama aliasnya, Black Widow, merupakan mata-mata dan pembunuh berbakat yang merupakan anggota S.H.I.E.L.D. Ia dikenal memiliki kemampuan mata-mata, espionase, penyamaran, pengelabuan, penyelundupan, skill senjata dan teknologi serta kemampuan bertarung akrobatik.\n" +
                            "\n" +
                            "Bersama dengan Hawkeye, Black Widow menjadi 1 dari 2 'manusia biasa' tanpa kekuatan super yang bergabung dengan Avengers.\n" +
                            "\n" +
                            "From <https://www.infoakurat.com/2018/06/daftar-superhero-anggota-avengers.html>",
                    "https://images-na.ssl-images-amazon.com/images/I/91%2BiqOflvPL._SY606_.jpg"
            },
            {
                    "Clint Barton",
                    "James Rhodes merupakan kolonel militer Amerika Serikat dan teman dekat Tony Stark. Ia diberi armor khusus oleh Stark dan sering membantu Stark saat menghadapi musuh. Rhodes kemudian memilih kode nama War Machine.\n" +
                            "Ia resmi menjadi anggota Avengers setelah pertarungan Sokovia. Rhodes dikenal sebagai sidekick Iron-Man yang berdedikasi dan memiliki idealisme.\n" +
                            "\n" +
                            "From <https://www.infoakurat.com/2018/06/daftar-superhero-anggota-avengers.html>",
                    "https://vignette4.wikia.nocookie.net/ironman/images/a/af/Photo%28706%29.JPG/revision/latest?cb=20130922104711"
            },
            {
                    "Falcon",
                    "Sam Wilson merupakan veteran militer Angkatan Udara. Ia kemudian berteman dengan Captain America. Wilson menggunakan perangkat EXO-7 Falcon, sebuah perangkat teknologi berupa sayap dan senjata. Ia pun menggunakan kode nama Falcon.\n" +
                            "\n" +
                            "Falcon resmi bergabung menjadi anggota Avengers setelah pertarungan Sokovia. Ia dikenal sebagai sidekick dari Captain America.\n" +
                            "\n" +
                            "From <https://www.infoakurat.com/2018/06/daftar-superhero-anggota-avengers.html>",
                    "https://vignette.wikia.nocookie.net/marvelcinematicuniverse/images/4/48/Falcon_AIW_Profile.jpg/revision/latest/scale-to-width-down/310?cb=20180518212822"
            },
            {
                    "Scarlet Witch",
                    "Wanda Maximoff berasal dari Sokovia dan meruapakn saudara kembar dari Pietro Maximoff. Ia mendapat kekuatan super dari eksperimen HYDRA yang dipimpin oleh Wolfgang von Strucker dengan menggunakan kekuatan scepter Loki dan kemudian dikenal dengan nama Scarlet Witch.\n" +
                            "Meski masih muda, ia menjadi salah satu karakter Avengers terkuat. Kemampuannya meliputi telekinetik, manipulasi energi dan pikiran.\n" +
                            "\n" +
                            "From <https://www.infoakurat.com/2018/06/daftar-superhero-anggota-avengers.html>",
                    "https://hips.hearstapps.com/digitalspyuk.cdnds.net/18/14/1522871752-aif8.jpg?resize=480:*"
            },
            {
                    "Vision",
                    "Vision merupakan artificial intelligence yang terbentuk lewat energi dari Mind Stone yang ada pada scepter Loki yang merupakan hasil eksperimen dari Tony Stark dan Bruce Banner dengan bantuan Dr. Helen Cho.\n" +
                            "\n" +
                            "Statusnya sebagai A.I. atau robot, namun mulai memiliki perasaan untuk memahami manusia. Ia bergabung dengan Avengers setelah membantu mengalahkan Ultron pada pertarungan Sokovia.\n" +
                            "\n" +
                            "From <https://www.infoakurat.com/2018/06/daftar-superhero-anggota-avengers.html>",
                    "https://vignette.wikia.nocookie.net/marvelcinematicuniverse/images/2/2f/Vision_AIW_Profile.jpg/revision/latest/scale-to-width-down/2000?cb=20180518212532"
            },
            {
                    "Doctor Stranger",
                    "Dr. Stephen Strange merupakan seorang dokter bedah ternama yang karena kecelakaan parah harus kehilangan pekerjannya. Ia kemudian mendapat kemampuan sebagai penyihir hebat sebagai anggota Masters of the Mystic Arts setelah dilatih The Ancient One di Kamar-Taj.\n" +
                            "\n" +
                            "Doctor Strange bukanlah anggota resmi Avengers, namun ia berhubungan baik dengan beberapa anggotanya dan membantu mereka dalam beberapa pertarungan.\n" +
                            "\n" +
                            "From <https://www.infoakurat.com/2018/06/daftar-superhero-anggota-avengers.html>",
                    "https://hips.hearstapps.com/digitalspyuk.cdnds.net/18/14/1522871679-aif6.jpg?resize=480:*"
            },
            {
                    "Spider Man",
                    "Peter Parker merupakan siswa SMA yang memiliki kekuatan super setelah digigit laba-laba. Ia pun memiliki banyak kemampuan super seperti memanjat gedung, mengeluarkan jaring laba-laba, kekuatan fisik hingga indra yang menjadi lebih peka. Ia pun dikenal dengan alter-egonya Spider-Man.\n" +
                            "\n" +
                            "Parker direkrut oleh Tony Stark untuk membantu Avengers. Ia kemudian dibuatkan kostum Spider-Man yang lebih bagus dan lebih canggih.\n" +
                            "\n" +
                            "From <https://www.infoakurat.com/2018/06/daftar-superhero-anggota-avengers.html> ",
                    "https://hips.hearstapps.com/digitalspyuk.cdnds.net/18/14/1522871602-aif4.jpg?resize=480:*"
            }
    };

    static ArrayList<Marvel> getListData() {
        Marvel marvel;
        ArrayList<Marvel> list = new ArrayList<>();
        for (String[] aData : data) {
            marvel = new Marvel();
            marvel.setName(aData[0]);
            marvel.setDetail(aData[1]);
            marvel.setImage(aData[2]);

            list.add(marvel);
        }

        return list;
    }
}
