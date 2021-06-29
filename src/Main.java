import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Variables
        int mat, fizik, kimya, turkce, tarih, muzik;

        //Scanner nesne
        Scanner inp = new Scanner(System.in);

        //Kullanıcı değerleri

        System.out.print("Matematik Notunuz : ");
        mat = inp.nextInt();
        System.out.print("fizik  Notunuz : ");
        fizik = inp.nextInt();
        System.out.print("kimya Notunuz : ");
        kimya = inp.nextInt();
        System.out.print("turkce Notunuz : ");
        turkce = inp.nextInt();
        System.out.print("tarih  Notunuz : ");
        tarih = inp.nextInt();
        System.out.print("Muzik Notunuz : ");
        muzik = inp.nextInt();

        int toplam = mat + fizik + kimya + turkce + tarih + muzik;
        double sonuc = toplam / 6.0;

        System.out.println("Ortalamanız : "+sonuc);

        if (sonuc>60)
            System.out.println("Sınıfı Geçti");
        else
            System.out.println("Sınıfta Kaldı");

    }
}
