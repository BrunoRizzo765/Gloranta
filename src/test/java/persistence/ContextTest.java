package persistence;

import io.github.flbulgarelli.jpa.extras.test.SimplePersistenceTest;
import org.junit.jupiter.api.Test;

import javax.swing.*;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ContextTest implements SimplePersistenceTest {

        @Test
        void contextUp() {
            assertNotNull(entityManager());
        }

        @Test
        void contextUpWithTransaction() throws Exception {

        }

}
