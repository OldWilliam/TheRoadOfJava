/*
2015-11-28 下午4:44:14
*/
package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


class Snow{};
class Powder extends Snow{};
class Light extends Powder{};
class Heavy extends Powder{};
class Crusty extends Snow{};
class Slush extends Snow{};
public class AsListInterface {
	public static void main(String[] args) {
		List<Snow> snow1 = Arrays.asList(new Crusty(), new Slush(), new Powder());
//		List<Snow> snow2 = Arrays.asList(new Light(), new Heavy());
		/*
		 * 编译器报错，需要把List<snow>改为List<Powder>
		 */
		List<Snow> snow3 = new ArrayList<Snow>();
		Collections.addAll(snow3, new Light(), new Heavy());
	}
}
