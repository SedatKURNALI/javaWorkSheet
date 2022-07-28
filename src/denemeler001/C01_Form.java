package denemeler001;

import javax.swing.*; // bu import, Java'da arayüz için kullan?lan bir kütüphane

import java.awt.*; // konumland?rma özellikerini içerisinde bulund?ran kütüphane
import java.awt.event.ActionEvent; // al?nan hareketleri nas?l vedam edecekse yönlendirecek olan kütüphane
import java.awt.event.ActionListener; // hareketleri alg?layacak kütüphane

public class C01_Form {

    public static void main(String[] args) {

        JFrame frame = new JFrame(); //ekranda bir pencere göstermek için kullanaca??m?z
                                     // JFrame class'?n? kullanan bir obje olu?turuyoruz

        frame.setSize(600,600); // ekrande aç?lacak olan pencerenin width ve height lerini belirledik

        frame.setLocationRelativeTo(null); // aç?lan bencerenin yerle?eme ayarlad?n? seçebilece?imiz method
                                           // biz null diyerek default aralar?n? seçmi? olduk

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // masaüstünde aç?lan mencerenin kapatma ayarlar?n?
                                                              // default olarak tan?mlanm?? i?lemlerden exit olan? seçtik(pencereyi kapatabiliyoruz)
        //DO_NOTHING_ON_CLOSE => aç?lan pencere a?a?? (görev çubu?una alabiliyoruz ama kapatam?yoruz)
        //HIDE_ON_CLOSE => aç?lan pencereyi masaüstünde kapat?k gibi görüyoruz ama arka planda çal???yor
        //DISPOSE_ON_CLOSE => aç?lan pencereyi örnekte kulland???m?z yöntem gibi kapat?yot?yor ama fark?n? anlayamad?m


            JPanel panel = new JPanel(); // penceremize ekleyece?imiz button ve textfield nesnelerinin konumlar?n? ayarlayaca??m?z
                                         // conteiner class olan JPanel s?n?f?n? kulland?k

                JTextField textField = new JTextField(20); //textField nesnemizi olu?turduk
                panel.add(textField); // olu?turdu?umuz textfield nesnesini konumland?rmada kullanaca??m?z panel objesi içerisine ekledik.

                JButton button = new JButton("Button"); // button nesnemizi olu?turduk
                panel.add(button); // olu?turdu?umuz button nesnesini konumland?rmada kullanaca??m?z panel objesi içerisine ekledik.

                button.addActionListener(new ActionListener() { // button nesnesine bas?ld???ndan haberdar olabilmek için ActionListener() methodu ekliyoruz
                    @Override
                    public void actionPerformed(ActionEvent event) { // yap?lan hereketin nas?l devam etmesini istiyorsak onu yönetmek için
                                                                     // actionPerformed methodunu kuland?k
                        System.out.println(textField.getText());// eylemde testfield nesnesi içine girilen içeri?i console'a yazd?rd?k.
                    }
                });


            frame.add(panel, BorderLayout.CENTER); // panel isimli nesnemizi frame nesnemize konum özelliklerini yazarak ekledik.


        frame.setVisible(true); // olu?turdu?umuz pencerenin görünürli?ini ayarlad???m?z method
                                // biz true yaparak ekranda görünmesini sa?lad?k
    }
}