package denemeler001;

import javax.swing.*; // bu import, Java'da aray�z i�in kullan?lan bir k�t�phane

import java.awt.*; // konumland?rma �zellikerini i�erisinde bulund?ran k�t�phane
import java.awt.event.ActionEvent; // al?nan hareketleri nas?l vedam edecekse y�nlendirecek olan k�t�phane
import java.awt.event.ActionListener; // hareketleri alg?layacak k�t�phane

public class C01_Form {

    public static void main(String[] args) {

        JFrame frame = new JFrame(); //ekranda bir pencere g�stermek i�in kullanaca??m?z
                                     // JFrame class'?n? kullanan bir obje olu?turuyoruz

        frame.setSize(600,600); // ekrande a�?lacak olan pencerenin width ve height lerini belirledik

        frame.setLocationRelativeTo(null); // a�?lan bencerenin yerle?eme ayarlad?n? se�ebilece?imiz method
                                           // biz null diyerek default aralar?n? se�mi? olduk

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // masa�st�nde a�?lan mencerenin kapatma ayarlar?n?
                                                              // default olarak tan?mlanm?? i?lemlerden exit olan? se�tik(pencereyi kapatabiliyoruz)
        //DO_NOTHING_ON_CLOSE => a�?lan pencere a?a?? (g�rev �ubu?una alabiliyoruz ama kapatam?yoruz)
        //HIDE_ON_CLOSE => a�?lan pencereyi masa�st�nde kapat?k gibi g�r�yoruz ama arka planda �al???yor
        //DISPOSE_ON_CLOSE => a�?lan pencereyi �rnekte kulland???m?z y�ntem gibi kapat?yot?yor ama fark?n? anlayamad?m


            JPanel panel = new JPanel(); // penceremize ekleyece?imiz button ve textfield nesnelerinin konumlar?n? ayarlayaca??m?z
                                         // conteiner class olan JPanel s?n?f?n? kulland?k

                JTextField textField = new JTextField(20); //textField nesnemizi olu?turduk
                panel.add(textField); // olu?turdu?umuz textfield nesnesini konumland?rmada kullanaca??m?z panel objesi i�erisine ekledik.

                JButton button = new JButton("Button"); // button nesnemizi olu?turduk
                panel.add(button); // olu?turdu?umuz button nesnesini konumland?rmada kullanaca??m?z panel objesi i�erisine ekledik.

                button.addActionListener(new ActionListener() { // button nesnesine bas?ld???ndan haberdar olabilmek i�in ActionListener() methodu ekliyoruz
                    @Override
                    public void actionPerformed(ActionEvent event) { // yap?lan hereketin nas?l devam etmesini istiyorsak onu y�netmek i�in
                                                                     // actionPerformed methodunu kuland?k
                        System.out.println(textField.getText());// eylemde testfield nesnesi i�ine girilen i�eri?i console'a yazd?rd?k.
                    }
                });


            frame.add(panel, BorderLayout.CENTER); // panel isimli nesnemizi frame nesnemize konum �zelliklerini yazarak ekledik.


        frame.setVisible(true); // olu?turdu?umuz pencerenin g�r�n�rli?ini ayarlad???m?z method
                                // biz true yaparak ekranda g�r�nmesini sa?lad?k
    }
}