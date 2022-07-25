package KopyaBaskaYer._03_IfStatement_TernaryOperatorFaDu;

import java.util.Scanner;

public class Q04_JobTitle {

	public static void main(String[] args) {
		/*  TASK :
		 *  Kullanicidan IT alanini bilgisini alarak console'a
		 *  meslegi = qa ==> Quality Analyst
		             dev ==> Developer
					  ba ==> Busines Analyst
				 	  pm ==> Project Manager
		bilgilileri yazdiriniz
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your job title");
		String jobTitle = scan.next();

		if(jobTitle.equals("qa")) {
			System.out.println("qa : Quality Analyst");
		}else if(jobTitle.equals("dev")) {
			System.out.println("dev : Developer");
		}else if(jobTitle.equals("ba")) {
			System.out.println("ba : Business Analyst");
		} else if(jobTitle.equals("pm")) {
			System.out.println("pm : Project Manager");
		} else {
			System.out.println("Please enter a valid job title");
		}

	}

}
