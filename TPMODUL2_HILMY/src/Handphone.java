public class Handphone extends Perangkat{
    protected boolean fingerprint;

    Handphone(String drive, int ram, float processor, boolean fingerprint){
        super(drive, ram, processor);
        this.fingerprint = fingerprint;
    }

    public void informasi(){
        if(this.fingerprint != true){
            System.out.println("Handphone ini memiliki drive tipe "+drive+" dengan ram sebesar "+ram+" GB dan processor secepat "+processor+"Ghz. Selain itu handphone ini TIDAK memiliki Fingerprint");
        }
        else{
            System.out.println("Handphone ini memiliki drive tipe "+drive+" dengan ram sebesar "+ram+" GB dan processor secepat "+processor+"Ghz. Selain itu handphone ini memiliki Fingerprint");
        }
    }

    void telfon(int no_handphone){
        System.out.println("Handphone berhasil menyambung telepon ke No "+no_handphone);
    }

    void kirimSMS(int no_handphone){
        System.out.println("Handphone berhasil mengirim SMS ke No "+no_handphone);
    }

    void kirimSMS(int no_handphone1, int no_handphone2){
        System.out.println("Handphone berhasil mengirim SMS ke No "+no_handphone1+" dan ke "+no_handphone2);
    }
}
