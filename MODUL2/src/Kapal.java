public class Kapal extends TransportasiAir {
    
    String mesin;

    Kapal(int jumlahKursi,int biaya,String mesin){
        super(jumlahKursi, biaya);
        this.mesin = mesin;
    }
    
    void informasi(){
        System.out.println("Transportasi Air jenis Sampan dengan kursi berjumlah "+ jumlahKursi +"ditetapkan dengan biaya sebesar Rp. "+ biaya);
    }

    void berlayar() {
        System.out.println("Transportasi Air jenis Kapal sedang berlayar menggunakan mesin "+ this.mesin +" dengan kecepatan yang tidak stabil");
    }

    void berlayar(int kecepatan) {
        System.out.println("Transportasi Air jenis Kapal sedang berlayar menggunakan mesin "+ this.mesin +" dengan kecepatan yang stabil di kisaran "+ kecepatan +" knot");
    }

    void berlabuh(){
        System.out.println("Transportasi Air jenis Kapal berlabuh di pantai");
    }

}
