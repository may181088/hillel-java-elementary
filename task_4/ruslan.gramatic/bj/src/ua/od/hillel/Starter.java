package ua.od.hillel;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @author ruslan.gramatic
 */
public class Starter {
    /**
     *
     * @param args
     * @throws Exception
     * example:  ua.od.hillel.ClassName:methodName param1 param2 param3;
     */
    public static void main(String[] args) throws Exception {
        String[] target = args[0].split(":");
        Class<?> clazz = Class.forName(target[0]);
        Object instance = clazz.newInstance();
        Method method = instance.getClass().getMethod(target[1], String[].class);
        System.out.format("Invoking: %s.%s(%s)", clazz.getName(), method.getName(), String.join(", ", Arrays.copyOfRange(args, 1, args.length)));

        switch (args.length) {
            case 2:
                method.invoke(instance, args[1]);
                break;
            case 3:
                method.invoke(instance, args[1], args[2]);
                break;
            case 4:
                method.invoke(instance, args[1], args[2], args[3]);
                break;
            case 5:
                method.invoke(instance, args[1], args[2], args[3], args[4]);
                break;
            case 6:
                method.invoke(instance, args[1], args[2], args[3], args[4], args[5]);
                break;
        }
    }
}
