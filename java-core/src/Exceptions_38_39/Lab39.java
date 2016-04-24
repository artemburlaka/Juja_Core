package Exceptions_38_39;

/**
 * Created by Artem on 20.03.2016.
 */
public class Lab39 {
    public static void twoResource(AutoCloseableFactory factoryA, AutoCloseableFactory factoryB, TryBody body) throws Throwable {

        try {
            AutoCloseable a = factoryA.create();
            try {
                AutoCloseable b = factoryB.create();
                try {
                    body.runBody();
                } catch (Throwable ex) {
                    try {

                        b.close();
//                        try {
//                            a.close();
//                        } catch (Throwable closeEx) {
//
//                            ex.addSuppressed(closeEx);
//
//                        }


                    } catch (Throwable closeEx) {

                        ex.addSuppressed(closeEx);

                    }

                    throw ex;
                }
                try {
                    b.close();
                }  catch (Throwable closeEx) {

                }
                try {
                    a.close();
                } catch (Throwable closeEx) {

                }
            } catch (Throwable ex) {

                try {

                    a.close();

                } catch (Throwable closeEx) {

                    ex.addSuppressed(closeEx);

                }

                throw ex;
            }
        } catch (Throwable ex) {

        }

//        try {
//
//            body.runBody();
//        } catch (Throwable ex) {
//            try {
//
//                b.close();
//
//            } catch (Throwable closeEx) {
//
//                ex.addSuppressed(closeEx);
//
//            }
//
//            throw ex;
//        }
//        b.close();

    }
}

interface AutoCloseableFactory {
    public AutoCloseable create() throws Throwable;
}

interface TryBody {
    public void runBody() throws Throwable;
}