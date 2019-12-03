package pack.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.test.context.web.WebAppConfiguration;
import org.testng.annotations.Test;
import pack.Service.PlainService;
import pack.config.HibernateConfig;
import pack.config.WebConfig;
import pack.model.Plain;


@ComponentScan(basePackages = "pack")
@ContextConfiguration(classes = {WebConfig.class, HibernateConfig.class})
@WebAppConfiguration
@PropertySource("classpath:db.properties")
@PropertySource(value = "classpath:hibernate.properties")
public class PlainRepoTest extends AbstractTestNGSpringContextTests {

    @Autowired
    PlainService plainService;

    @Test
    public void plainTest() {
        plainService.save(Plain.getSmallPlain());
        plainService.save(Plain.getSmallPlain());
        plainService.save(Plain.getBigPlain());
        plainService.save(Plain.getSmallPlain());
        plainService.save(Plain.getBigPlain());
        plainService.save(Plain.getSmallPlain());
        plainService.save(Plain.getBigPlain());
        plainService.save(Plain.getSmallPlain());
        plainService.save(Plain.getBigPlain());
        plainService.save(Plain.getSmallPlain());
        plainService.save(Plain.getBigPlain());
    }

    @Test
    public void testCapacity() {
        System.out.println(plainService.getCapacity());
    }

    @Test
    public void testCapacity2() {
        System.out.println(plainService.getC_capacity());
    }

    @Test
    public void fcons() {
        for (Plain p : plainService.getByFconsume(2, 16)
        ) {
            System.out.println(p);
        }
    }

    @Test
    public void sortedTest() {
        for (Plain p : plainService.sortedPlains()
        ) {
            System.out.println(p);
        }
    }

}