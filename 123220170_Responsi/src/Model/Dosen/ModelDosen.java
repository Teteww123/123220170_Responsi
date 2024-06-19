package Model.Dosen;

public class ModelDosen {
    private Integer id;
    private String nama, email, no_hp;
    
    /*
      Membuat getter dan setter untuk mengambil/mengatur informasi mahasiswa.
      Karena sekarang atribut id, nama, dan nim diubah menjadi private, 
      sehingga atribut2 tersebut tidak dapat diakses secara langsung (Prinsip Enkapsulasi)
    */

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNo_hp() {
        return no_hp;
    }

    public void setNo_hp(String no_hp) {
        this.no_hp = no_hp;
    }

    

 
}
