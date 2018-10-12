package pracownia.introduction;

import org.apache.log4j.Logger;

public class Main {

    final static Logger a = Logger.getLogger("name");

    public static void main(String [ ] args) {
        System.out.println("Hello World");
        a.info("message");
    }
}