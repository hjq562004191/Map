import com.map.utils.PhoneUtil;

import java.util.Scanner;

public class TestRest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String code = scanner.nextLine();
        boolean f = PhoneUtil.judgeCodeIsTrue(code,"13772122697");
    }
}
