package KopyaBaskaYer.JavaProjectsFaDu.P01_FilmTahmin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FilmTahminFaDu {

    static Scanner scan = new Scanner(System.in);
    static List<String> film = new ArrayList<>(Arrays.asList("JOKER", "INCEPTION", "PIYANIST", "GREENMILE", "LEON", "GODFATHER", "JURASSICPARK", "TITANIC"));
    static double score = 0;
    static int countGuess = 0;
    static int movieNameLength = 0;
    static int remain;
    static List<String> enteredLetters = new ArrayList<>();
    static int byebye=0;

    /*
 TASK :
  yukarıdaki film listinde bulunan filmlerden herhangi birisini kullanıcının film ismini  görmeden
  filmin index nosuna göre sectiriniz
  seçilen filmin  ismini filmin harf saysının 2 katı kadar hak tanıyarak tahmin etmesini
  sağlayan method create ediniz...
  Ahanda TRICK...
  kullanıcının sectiği filmin harf sayısını  console yazdırınız.
  kullanıcının sectiği film için tahmin hakkını  console yazdırınız.
  kullanıcının her tahmininde kalan hak sayısını console yazdırınız.
  kullanıcının her tahmininde doğru ve yanlış tahmin  sayısını console yazdırınız.
  kullanıcının kaybedip veya kazandığını ve tahmin etmesi gereken filmin ismini  console yazdırınız.

 */
    public static void main(String[] args) {

        // ADIM:1 Ana giris ekrani ve oyuna baslamak icin bi tusa bastiralim

        System.out.println("******GUESS THE MOVIE NAMES********");
        System.out.println("There are " + film.size() + " movies randomly ordered in this quiz");
        System.out.println("");
        System.out.print("If you are ready, please press any key to continue" +
				"\nIf you want to exit please click \"e\" button : ");
        String anyKey = scan.next();

        if (!anyKey.equals("e")) {
            selectMovie(film);
        } else {
            resultOfGame();
        }

        if(byebye!=5) {
            resultOfGame();
        }
        else {
            byebye();
        }


    } // main sonu


    // Bu method a gelmisse hepsini bilmistir (remain=0) veya deneme sayisi tamamlanmistir.
    private static void resultOfGame() {

        if (remain == 0) {
            System.out.println("******* CONGRATULATIONS ********");
            System.out.println("You won the quiz at " + countGuess + " . try");
            score += (double) movieNameLength * 2 / countGuess * 5; // score oncekinin uzerine eklenerek gidiyor
            System.out.println("Your Score: " + score);
            countGuess = 0;// tahmin giris sayisini sifirliyoruz
            enteredLetters.clear(); // girilmis harflerin listesini sifirliyoruz
        } else {
            System.out.println("******* YOU LOST ********");
            System.out.println("You lost the quiz at " + countGuess + " . try");
            System.out.println("Your Score: " + score);
            countGuess = 0;  // tahmin giris sayisini sifirliyoruz
            enteredLetters.clear(); // girilmis harflerin listesini sifirliyoruz
        }

        System.out.print("Do you want to try next movie? Y /N ");
        String anykey = scan.next();

        if (anykey.equalsIgnoreCase("y")) {
            selectMovie(film);
        } else if (anykey.equalsIgnoreCase("n")){
            byebye();
        }


    }

    private static int byebye() {
        System.out.println("<<<<<<<  Thanks for the good game, BYE BYE  >>>>>>>>>>");
        return 5;
    }


    private static void selectMovie(List<String> film) {

        // ADIM2: random olarak film secelim ve oyuncuya kac karakter oldugunu soyleyelim

        int randomMovieNum = (int) (Math.random() * (film.size() - 0)) + 0;
        String selectedMovieArr[] = (film.get(randomMovieNum)).split("");
        movieNameLength = selectedMovieArr.length;

        System.out.println("This is a Hollywood film and it has  " + selectedMovieArr.length + " characters");
        System.out.println("Not: max guessing attempts : " + selectedMovieArr.length * 2);

        selection(selectedMovieArr);  // burdan harf giris methoduna gecelim

    } //selectmovie sonu


    private static void selection(String[] selectedMovieArr) {

        // ADIM3 : oyuncudan tek tek harf alip kontrol edelim

        String letter = "";  //oyuncunun girecegi harfi burada tanimlayalim
        String guessArr[] = new String[selectedMovieArr.length]; // oyuncu girdikce ici dolacak array
        remain = guessArr.length;
        for (int i = 0; i < selectedMovieArr.length; i++) {
            guessArr[i] = "_"; // ilk olarak icindeki tum karakterleri _ yapiyoruz
        }


        // oyuncudan aldigimiz harf
        while (countGuess < (selectedMovieArr.length) * 2) {

            if (remain == 0) {
                resultOfGame();
                break;
            }

            System.out.print("Pleas enter a letter : ");
            letter = scan.next();
            countGuess++;

            // harfi kontrol icin lettercontrol methoduna gonderelim
            System.out.print(Arrays.toString(lettercontrol(letter, selectedMovieArr, guessArr)));

            System.out.print("\t\t");
            System.out.print(countGuess + "/" + selectedMovieArr.length * 2);
            System.out.println("");


        }
    } // selection sonu


    // girilen harfi kontrol et:
    private static String[] lettercontrol(String letter, String[] selectedMovieArr, String[] guessArr) {

        // ilk olarak girilen harf daha once girilmis mi girilmemis mi kontrol edelim

        if (enteredLetters.contains(letter)) {
            System.out.println("<<< You already tried this letter, Please enter another one >>>");
            countGuess--;
        } else {


            for (int i = 0; i < selectedMovieArr.length; i++) {
                if (selectedMovieArr[i].equalsIgnoreCase(letter)) {
                    guessArr[i] = letter;
                    remain--;
                }
                enteredLetters.add(letter);
            }
        }


        return guessArr;

    } // lettercontrol sonu


}
