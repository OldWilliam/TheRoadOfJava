/*
2015-10-13 下午8:01:28
 */
package io;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.regex.Pattern;

/*
 * 目录查看器
 */
//class DirFilter implements FilenameFilter {
//	private Pattern pattern;
//
//	public DirFilter(String regex) {
//		pattern = Pattern.compile(regex);
//	}
//
//	@Override
//	public boolean accept(File dir, String name) {
//		return pattern.matcher(name).matches();
//	}
//
//}

public class DirList {

	public static void main(final String[] args) {
		File path = new File(".");
		String[] list;
		if (args.length == 0) {
			list = path.list();
		} else {
			list = path.list(new FilenameFilter() {
				
				@Override
				public boolean accept(File dir, String name) {
					return Pattern.compile(args[0]).matcher(name).matches();
				}
			});
		}
		Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
		for (String dirItem : list) {
			System.out.println(dirItem);
		}
	}
}
