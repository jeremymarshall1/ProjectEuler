/**
 * Created by jeremy on 4/13/16.
 */

class Main {
    public static void main(String[] args) {
        Solution test;
        String className;

        if (args.length == 0) {
            System.out.println("null args");
        }

        try {
            for (int x = 1;; x++){
                className = "PEuler" + x;
                Object tests = Class.forName(className).newInstance();
                System.out.print(tests.getClass().getName() + ": ");
                tests.getClass().getMethod("solve",String[].class).invoke(tests, new Object[]{args});
            }
        } catch (Exception err) {
            System.out.println(err);
            System.out.println("There are no more tests");
        }
    }
}


