public class MainApp {
    public static void main(String[] args) throws Exception {
        System.out.println("");
        Perangkat perangkat = new Perangkat("gets",10,9);
        perangkat.informasi();
        System.out.println("");

        Handphone handphone = new Handphone("Qualcomm", 8, 2, true);
        handphone.informasi();
        handphone.telfon(902321123);
        handphone.kirimSMS(213221);
        handphone.kirimSMS(231312, 66343);
        System.out.println("");

        Laptop laptop = new Laptop("Intel i17 Gen 12", 32, 4, false);
        laptop.informasi();
        laptop.bukagame("CSGO");
        laptop.kirimEmail("hilmyadlanghifari@gmail.com");
        laptop.kirimEmail("Hilmyadlann@gmail.com", "adlannghifari@gmail.com");
        System.out.println("");
    }
}
