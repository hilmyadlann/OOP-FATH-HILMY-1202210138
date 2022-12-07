public class Sampan extends TransportasiAir{

    int layar;

    Sampan(int jumlahKursi, int biaya,int layar, int jangkar){
        super(jumlahKursi, biaya);
        this.layar = layar;
    }

    void informasi(){
        System.out.println("Transportasi Air jenis Sampan dengan kursi berjumlah "+ jumlahKursi +"ditetapkan dengan biaya sebesar Rp. "+ biaya);
    }

    void berlayar(){
        System.out.println("Transportasi Air jenis Sampan sedang berlayar menggunkan "+ layar +" layar");
    }

    void berlabuh(){
        System.out.println("Transportasi Air jenis Sampan berlabuh di pantai tanpa jangkar");
    }

    void berlabuh(int jangkar){
        System.out.println("Transportasi Air jenis Sampan berlabuh di pantai menggunakan "+ jangkar +" jangkar");
    }




}