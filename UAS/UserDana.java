package UAS;

public class UserDana {
    private String username;
    private String password;
    private String pinDana;
    private String nama;
    private int balanceDana;

    UserDana(UAS.Builder builder){
        this.pinDana = builder.pinDana;
        this.nama = builder.nama;
        this.balanceDana = builder.balanceDana;
        this.username = builder.username;
        this.password = builder.password;
    }

    public String getPin() {
        return pinDana;
    }

    public String getNama() {
        return nama;
    }

    public int getBalanceData() {
        return balanceDana;
    }

    public String getUsername(){
        return username;
    }

    public String getPassword(){
        return password;
    }
}
