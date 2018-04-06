package troubleshooting.by.sherlock.germanspy.tipography;

import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component
public class PrintеrStation {
    public void print(Order order) {

        for (int i = 0; i < order.getAmount(); i++) {
            System.out.println("************************");
            System.out.println(order.getTitle());
            System.out.println(order.getBody());
            System.out.println("************************");
        }
    }
}
