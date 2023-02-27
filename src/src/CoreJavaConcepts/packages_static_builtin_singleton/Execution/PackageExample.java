package CoreJavaConcepts.packages_static_builtin_singleton.Execution;
import CoreJavaConcepts.packages_static_builtin_singleton.utils.*;

import java.util.*;

public class PackageExample {
    public static void main(String[] args) {
        StringUtils su = new StringUtils();
        Scanner sc = new Scanner(System.in);

        String ordinary_string = sc.next();

        su.reverse(ordinary_string);

    }
}
