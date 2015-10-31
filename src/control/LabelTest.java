/*
2015-10-12 下午10:11:35
 */
package control;
/*
 * 	标签label，相当于goto
 */
public class LabelTest {
	public static void main(String[] args) {
		/*	//标签起作用的地方刚迭代语句之前
		 * 	lable1:
		 *  //不要在标签与迭代语句之间加入任何语句
		 * 	outer-iteration{
		 * 		inner-iteration{
		 * 			//...
		 * 			break;(1)
		 * 			//...
		 * 			continue;(2)
		 * 			//...
		 * 			continue label(3)
		 * 			//...
		 * 			break label(4)
		 * 		}
		 * 	}
		 */
		//（3）中断内部与外部循环，回到标签处，继续进行执行迭代语句
		//（4）中断内部与外部循环，回到标签处，但不继续执行迭代语句，实际上完全终止两个迭代
		int i = 0;
		outer://后面只能直接写循环语句，不然报错
			for (; true;) {
				inner://Cant't have statements here
					for(; i < 10; i++){
						System.out.println("i = "+i);
						if(i == 5){
							continue outer;
						}
					}
			}
		//使用label情景，嵌套循环，从内部循环直接跳到最外部
	}
}
