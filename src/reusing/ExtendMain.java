/*
2015-10-15 下午9:32:12
*/
package reusing;

import java.util.ArrayList;

import test.OldMan;

/*	
 * 	方法的签名：方法的标识符，包括方法名与参数列表，但是不包括方法的返回类型
 * 	静态方法可以被继承！，但是不能被重写！！，因为静态方法是静态绑定，在类装载的时候已经绑定到类的引用上了，不能运行时绑定，因此不能被重写
 * 	其他例子：类OldMan
 */

public class ExtendMain {
	public static void main(String[] args) {
	}
	static int func(){
		System.out.println("ExtendMain.func()");
		return 0;
	}
	public void fun(){
		
	}
}

class SubClass extends ExtendMain{
	public static void main(String[] args) {
		ExtendMain.main(args);	
		func();					//被继承的父类的静态方法
		OldMan om = new OldMan();//静态方法，静态绑定的例子
	}
	@Override
	public void fun() {
		func();					//父类的静态方法可以被调用到，说明被继承了
	}
}
