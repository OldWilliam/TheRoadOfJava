/*
2015-10-13 ����8:59:25
 */
package io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;

/*
 * 	ɨ�������ļ�
 */
public class ScanAllFile {
	public static void main(String[] args) throws IOException {
		File path = new File("F:\\");
		FileWriter fw = new FileWriter(new File("D:\\log.txt"));
		// ArrayList<File> v = new ArrayList<File>();
		LinkedList<File> v = new LinkedList<File>();//ʹ��LinkedList����������Ĺ���
		File[] dirItem = path.listFiles();
		for (File file : dirItem) {
			v.add(file);
		}

		while (!v.isEmpty()) {
			File temp = v.removeLast();
			File[] subFiles = temp.listFiles();
			if (subFiles != null) {
				for (File son : subFiles) {
					if (son.isDirectory()) {
						v.addLast(son);
					} else {
						fw.write(son.getAbsolutePath() + "\n");
						System.out.println(son.getAbsolutePath());
					}
				}
			}
		}
		fw.close();
	}
}
