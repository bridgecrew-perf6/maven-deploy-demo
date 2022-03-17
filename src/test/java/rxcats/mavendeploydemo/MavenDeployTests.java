package rxcats.mavendeploydemo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest(classes = MavenDeployConfig.class)
class MavenDeployTests {

    @Test
    void contextLoads() {
        assertTrue(true);
    }

}
