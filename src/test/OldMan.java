/*
2015-10-16 下午9:26:01
*/
package test;
/*
 * 	静态方法是静态绑定，前期绑定，
 */
public class OldMan {
	 public static void main(String[] args) 
	    { 
	        Fu s = new Zi(); 
	        System.out.println(s.age() + ", " + s.name()); 
	        Zi z = new Zi();
	        System.out.println(z.age() + ", " + z.name());
	      } 
}
class Fu
{ 
     static String age() //静态成员函数
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
   String name() //成员函数
      { 
      return "ErZi"; 
     } 
} 
