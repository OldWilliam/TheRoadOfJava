package interfaces;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Random;
import java.util.Scanner;

/*
 * 	适配接口
 * 	以下例子：
 * 		Scanner类的构造器接受的就是一个Readable接口，以使得Scanner不必将其参数限制为某个特定类，
 * 	这样Scanner就可以作用于更多的类型。如果你创建了一个类并且想让Scanner作用于它，那就应该让它成为Readable
 */
public class RandomWords implements Readable{
	private static Random rand = new Random(47);
	private static final char[] capitals =
			"QWERTYUIOPASDFGHJKLZXCVBNM".toCharArray();
	private static final char[] lowers =
			"qwertyuiopasdfghjklzxcvbnm".toCharArray();
	private static final char[] vowels = 
			"aeiou".toCharArray();
	private int count;
	public RandomWords(int count) {
		this.count = count;
	}
	@Override
	public int read(CharBuffer cb) throws IOException {
		// Readable接口中的唯一方法，必须实现
		if (count-- == 0) {
			return -1;		//indicate(表明) end of input
		}
		cb.append(capitals[rand.nextInt(capitals.length)]);
		for (int i = 0; i < 4; i++) {
			cb.append(vowels[rand.nextInt(vowels.length)]);
			cb.append(lowers[rand.nextInt(lowers.length)]);
		}
		cb.append(" ");
		return 10;
	}
	public static void main(String[] args) {
		Scanner s1 = new Scanner(new RandomWords(5));//输出五行十列
		Scanner s = new Scanner(new RandomWords(10));//输出了十行十列
		while (s.hasNext()) {
			System.out.println(s.next());	
		}
	}
}


