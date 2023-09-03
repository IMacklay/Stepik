package org;

public class StepikException {

    public static void main(String[] args) {
        System.out.println(getCallerClassAndMethodName());
        anotherMethod();
    }

    private static void anotherMethod() {
        System.out.println(getCallerClassAndMethodName());
        anotherMethod2();
    }

    private static void anotherMethod2() {
        System.out.println(getCallerClassAndMethodName());
    }

    public static String getCallerClassAndMethodName() {
        try {
            StackTraceElement element = new Throwable().getStackTrace()[2];
            return element.getClassName() + "#" + element.getMethodName();
        } catch (IndexOutOfBoundsException e) {
            return null;
        }
    }
}
