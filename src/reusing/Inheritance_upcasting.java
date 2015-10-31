package reusing;
/*
2015-10-16 上午10:52:44
 */
/*
 *  继承与向上转型
 *  若基类某个方法被重写，则导出类在向上转型时，该方法是被重写的
 *  
 *  ！在选择继承还是组合时，问自己我真的需要向上转型吗？？？？
 *  继承会产生向上转型，会有安全问题吗！？
 */
public class Inheritance_upcasting {
	public static void main(String[] args) {
		Frog frog = new Frog();
		Amphibian.show(frog);    //虽然show()的参数为Amphibian类型，但是也可以接受frog类型，向上转型
	}
}

class Amphibian{
	public void swim() {
		System.out.println("swim()");
	}
	public void walk(){
		System.out.println("walk()");
	}
	static void show(Amphibian amphibian){
		amphibian.swim();		//在这里传入了frog同样可以执行这两个方法（向上转型）
		amphibian.walk();
	}
}

class Frog extends Amphibian{
	@Override
	public void swim() {
		super.swim();
		System.out.println("frog jump on the land");//重写swim()后，swim()貌似没有向上转型，此处字符串被输出
	}
}