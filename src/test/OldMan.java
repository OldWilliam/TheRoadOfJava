/*
2015-10-16 ����9:26:01
*/
package test;

import java.util.Scanner;

/*
 * 	��̬�����Ǿ�̬�󶨣�ǰ�ڰ󶨣�
 */
public class OldMan {
	 public static void main(String[] args) 
	    { 
		 Scanner in = new Scanner(System.in);
	        Fu s = new Zi(); 
	        System.out.println(s.age() + ", " + s.name()); 
	        Zi z = new Zi();
	        System.out.println(z.age() + ", " + z.name());
	      } 
}
class Fu
{ 
     static String age() //��̬��Ա����
     { 
        return " I am a old man"; 
     } 
   String name() 
     { 
        return "LaoZi"; 
      } 
   } 
class Zi extends Fu 
{ 
      static String age() 
     { 
       return "I am a young man"; 
   } 
   String name() //��Ա����
      { 
      return "ErZi"; 
     } 
} 
