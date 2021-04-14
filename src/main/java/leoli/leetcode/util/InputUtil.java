package leoli.leetcode.util;

import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class InputUtil {


    public static Integer[] readLine2IntArr() {

        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        if (StringUtils.isBlank(line)) {
            return new Integer[0];
        }

        String[] split = line.split(",");
        Integer[] ret = new Integer[split.length];
        for (int i = 0; i < split.length; i++) {
            String trim = split[i].trim();
            ret[i] = ("".equals(trim) || "null".equals(trim)) ? null : Integer.valueOf(split[i].trim());
        }
        return ret;

    }

}
