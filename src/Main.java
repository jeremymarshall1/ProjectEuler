/**
 * Created by jeremy on 4/13/16.
 */

class Main {
    public static void main(String[] args) {
        Solution test;
        String className = "";
        Object tests;
        boolean single = false;

        // Check for any command-line arguments
        // 1st - Problem # to run
        // 2nd + - arguments for that problem's class
        // This logic will set the problem to run as well as remove it from the args
        if (args.length > 0) {
            System.out.println("Running PEuler" + args[0] + ": ");
            className = "PEuler" + args[0];
            String[] argsTemp = new String[args.length - 1];
            for (int x  = 0; x < argsTemp.length; x++) {
                argsTemp[x] = args[x+1];
            }
            args = argsTemp;
            single = true;
        }

        try {
            for (int x = 1;; x++){
                // If a command-line argument was passed in, don't iterate through all classes
                if (!single) {
                    className = "PEuler" + x;
                }

                tests = Class.forName(className).newInstance();
                System.out.print(tests.getClass().getName() + ": ");
                tests.getClass().getMethod("solve",String[].class).invoke(tests, new Object[]{args});

                // If a command-line argument was passed in, only do the specified problem
                if (single) {
                    break;
                }

            }
        } catch (Exception err) {
            if (err.getClass().getName() == "java.lang.ClassNotFoundException") {
                System.out.println("There are no more tests");
            } else {
                System.out.println(err);
            }


        }
    }
}


