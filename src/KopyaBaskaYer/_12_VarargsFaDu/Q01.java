package KopyaBaskaYer._12_VarargsFaDu;

public class Q01 {
    public static void main(String[] args) {
        //  verilen Stringleri birlestiren concat isimli bir method olusturunuz
        // input : "m", "e", "r", "v", "e";
        // output : merve

        String str1="m", str2="e", str3="r", str4="v", str5="e";

        concat(str1,str2,str3,str4,str5);


    }

    private static void concat(String... str ) {
        String birlesmis="";
        for (String each:str
             ) {
            birlesmis+=each;
        }

        System.out.println(birlesmis);
    }


}

