public class TransportasiAir {

    int jumlahKursi;
    int biaya;

    TransportasiAir(int jumlahKursi, int biaya){
        this.jumlahKursi = jumlahKursi;
        this.biaya = biaya;
    }

    void informasi(){
        System.out.println("Transportasi Air jenis tidak diketahui dengan kursi berjumlah "+ jumlahKursi +" ditetapkan dengan biaya sebesar Rp. " + biaya);
    }

    void berlayar(){
        System.out.println("Transportasi Air dengan jenis yang tidak diketahui sedang berlayar");
    }

    void berlabuh(){
        System.out.println("Transportasi Air jenis yang tidak diketahui berlabuh di pantai");
    }
    
}
