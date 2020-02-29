package pracownia.introduction;

import org.apache.log4j.Logger;

public class HelloWorld {
    public static void main(String [ ] args) {
        Logger log = Logger.getLogger("name");
        System.out.println("Hello World");
        log.info("message");
    }
}