package KopyaBaskaYer.tasksFaDu;

public class T07_RomaRakamlari {
    /*  TASK :
		 	Create a method to convert Roman numerals to numbers
		 	Romen rakamlarını sayılara dönüştürmek için bir method create ediniz
		 	Input:
		 		System.out.println(romanNumbers(805));
		   		System.out.println(fromRomans("DCCCV"));
		   	Output: DCCCV   805


		   		M + [C M] + [X L] + V   ---->   1945
		   		The chars in the brackets are in ascending order.
		   		 Parantez içindeki karakterler artan sıradadır (C-100, M-1000) ---> [C M]=900
		*/
    public static void main(String[] args) {

        System.out.println(convertRomans("MMMDCCXLIX"));

}

    public static int convertRomans(String roman) {
        int total=0;

        for (int i = 1; i < roman.length(); i++) {
            if(valueOf(roman.charAt(i-1))>=valueOf(roman.charAt(i))) {
                // ilgili harf kendinden sonra gelenden buyukse degerini al toplama topla
                total+=valueOf(roman.charAt(i-1));
            } else if(valueOf(roman.charAt(i-1))<valueOf(roman.charAt(i))) {
                // ilgili harf kendinden sonra gelenden kucukse, bir sonrakinden cikararak toplama topla
                total+=(valueOf(roman.charAt(i))-valueOf((roman.charAt(i-1))));
                i++;
            }
        }

        return total;
    }

    // assign the values for each character of Roman numerals
    static int valueOf(char a) {
        if (a == 'I') return 1;
        if (a == 'V') return 5;
        if (a == 'X') return 10;
        if (a == 'L') return 50;
        if (a == 'C') return 100;
        if (a == 'D') return 500;
        if (a == 'M') return 1000;
        return 0;
    }
}
