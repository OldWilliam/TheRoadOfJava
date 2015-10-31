/*
2015-10-15 下午11:22:16
 */
package reusing;

/*
 * 	重载与重写，今天突然忘记区别了，日狗了
 * 
 * 	重载：本类之中（重载的方法之间感觉独立性很强，可以有很多不同，只要参数列表不同就行，只是方法名相同而已，其实互不关联）
 * 	1、必须具有不同的参数列表
 * 	2、可以有不同的返回类型，只要参数列表不同就行
 * 	3、可以有不同的访问修饰符
 * 	4、可以抛出不同的异常	
 * 
 * 	重写：子类中的方法相对与父类而言
 * 	1、参数列表必须完全与被重写的方法名相同，否则就为重载了
 * 	2、返回类型必须一直与被重写的方法的返回类型相同，否则就为重载了(但是参数名列表不同，才是重载)
 * 	3、访问修饰符的限制一定大于被重写的方法（public>protected>default(package)>private）
 * 	4、重写的方法一定不能抛出新的检查异常或比被重写方法申明更加宽泛的检查型异常
 * 	eg：父类的方法申明了一个检查异常IOException，在重写方法就是不能抛出Exception，只能抛出IOException的子类异常，可以抛出非检查异常
 * 	
 * !{重写的方法，访问权限要大于父类的方法，但是检查的异常要小于父类的}
 * 
 *  ps：之所以老是比较重写与重载的区别：1、名字相近 2、在子类中，其实隐含了父类中的方法，重写有可能不小心写成重载
 *  	所以加上@Override比较好，可以提醒你
 */
public class Override_Overloading {

}

class A {

	public void fun() {
	}

	public int fun(int i) {
		return 0;
	}

	public String fun(String s) {
		return s;
	}
	
//	public float fun(int i){
//		
//	}
//	public int fun(){
//		return 1;				//只是返回类型不同不能为重载
//	}
}

class B extends A{
									
	public void fun(float f) {  //这个是重载，因为B类隐式的包含A类的三个fun()方法
	
	}
	@Override					//重写（如果修改了里面的内容，才是真正的重写，现在里面没有改动，只是继承）					
	public int fun(int i) {
		return super.fun(i);	
	}
	public void fun(){			//重写（同上）
		
	}
	
	
}