import groovy.transform.Canonical
import org.springframework.beans.BeansException
import org.springframework.beans.factory.config.BeanPostProcessor
import troubleshooting.by.sherlock.germanspy.tipography.Order
import troubleshooting.by.sherlock.germanspy.tipography.PrintеrStation

import javax.annotation.PostConstruct

beans {
    conversionService ConversionService, 'Bob'
}

@Canonical
class ConversionService implements BeanPostProcessor {
    String name

    @PostConstruct
    def init() {
        println "name: $name"
    }

    @Override
    Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (beanName.contains('printer') || bean.class.name.contains('Printer')) {
            return new PrintеrStation() {
                @Override
                void print(Order order) {
                    println "Hacked you"
                }
            }
        } else {
            bean
        }
    }
}