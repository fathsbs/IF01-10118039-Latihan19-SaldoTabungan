
import java.text.DecimalFormat;

/*
 * NAMA              : FATAHILLAH SATRIA BIMA SENO
 * KELAS             : IF-01
 * NIM               : 10118039
 * DESKRIPSI PROGRAM : Program yang dapat menampilkan saldo perbulan    
 */
public class SaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i, Saldo;

        DecimalFormat satuan = new DecimalFormat();

        i = 1;
        Saldo = 2500000;
        while (i < 7) {
            Saldo += (Saldo * 0.15);
            System.out.println("Saldo di bulan ke-" + i + " Rp." + satuan.format(Saldo));
            i++;
        }
    }

}
