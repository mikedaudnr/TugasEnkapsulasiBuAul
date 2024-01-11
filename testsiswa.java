public class testsiswa {
    public static void main(String[] args) {
    
    encapsiswa siswa = new encapsiswa();
    siswa.setName("Agus");
    siswa.setAge(20);
    siswa.setAddress("Malang");

       System.out.println("nama:" + siswa.getName() + "alamat:" + siswa.getAddress()+ "berumur:" +siswa.getAge() + "tahun");
    }
}
