package demo.t.daftarmasjidkotapalu;
import java.util.ArrayList;

public class DataBahasa {
    private static String[] namaBahasa = {
            "MASJID AGUNG DARUSALAM",
            "MASJID JAMI KAMPUNG BARU",
            "MASJID RAYA BAITURRAHIM",
            "MASJID MIFTAHUL JANNAH",
            "MASJID NUR-ILAHI",
            "MASJID AR-RAHMAN",
            "MASJID AL-MUSYAWARAH",
            "MASJID NURUL MUQORROBIN",
            "MASJID AL-IKHLAS",
            "MASJID AN-NAMIRA"
    };

    private static String[] detailBahasa = {
            "Masjid ini berada di Jl. Jaelangkara Kec. Palu Bar., Sulawesi Tengah 94221. Masjid ini masih dalam tahap renovasi pasca bencana. Namun masjid ini mempunyai halaman atau taman yang sangat luas",
            "Masjid ini berada di Jl. H Agus Salim No.25, Kec Palu Bar.,  Sulawesi Tengah 94221. Masjid ini memiliki tempat wudhu berada di belakang masjid, terdapat kuburan di bagian depan masjid jami ini",
            "Masjid ini berada di Jl. Masjid Raya , Kec. Palu Tim. Sulawesi Tengah 94235. Masjid ini memiliki Tempat wudhu terbagi 3 tempat (depa, samping kiri dan kanan),Terdapat Taman Kanan-anak di samping masjid ",
            "Masjid ini berada di Jl. Lasoani, Kec. Mantikulore Sulawesi Tengah 94111. Masjid ini memiliki Tempat Wudhu berada di samping kiri masjid. Terdapat Tempat parkir di depan sebelah kanan masjid.",
            "Masjid ini berada di  Jl. Cendrawasih Tanamodindi, Sulawesi Tengah 94111. Masjid ini masih dalam tahap renovasi atau pembangunan untuk memperluas masjid. ",
            "Masjid ini berada di Jl. Garuda No.21, Sulawesi Tengah 94111. Masjid ini memiliki tempat wudhu masjid ini berada disebelah kanan masjid , masjid ini mempunyai menara yang miring akibat bencana.",
            "Masjid ini berada di Jln Elang IV No 1,  Sulawesi Tengah 94111. masjid ini berada di sebelah kantor partai gerindra dan masji ini tempat wudhu berada di sebelah kiri masjid, dan terdapat taman pengajian.",
            "Masjid ini berada di Jl. Nuri Tanamodindi, , Kota Palu, Sulawesi Tengah 94111. tempat wudhu masjid ini berada di bagian depan masjid dan terpadat taman pengajian  ",
            "Masjid ini berada di Jl. Veteran, Tanamodindi,   Sulawesi Tengah 94111. tempat wudhu masji ini berdapa di samping kanan dan berada di depan masjid, dan masjid ini biasa dijadikan tempat kajian kitab ",
            "Masjid ini berada di  Jl. Lagarutu, Kec.Mantikulore,  Sulawesi Tengah 94118. tempat wudhu masjid ini berada didepan masjid, lokasi masjid ini tempat berada setelah penaikan di jalan lagurutu",
    };

    private static int[] gambarBahasa = {
            R.drawable.masjid_agung,
            R.drawable.masjid_jami,
            R.drawable.masjid_raya,
            R.drawable.masjid_miftahul,
            R.drawable.masjid_nurilahi,
            R.drawable.masjid_arrahman,
            R.drawable.masjid_almusyawarah,
            R.drawable.masid_nurl,
            R.drawable.masjid_alikhlas,
            R.drawable.masjid_annamira
    };

    static ArrayList<Bahasa> getListData() {
        ArrayList<Bahasa> list = new ArrayList<>();
        for (int position = 0; position < namaBahasa.length; position++) {
            Bahasa bahasa = new Bahasa();
            bahasa.setNama_bahasa(namaBahasa[position]);
            bahasa.setDetail_bahasa(detailBahasa[position]);
            bahasa.setPhoto(gambarBahasa[position]);
            list.add(bahasa);
        }
        return list;
    }
}
