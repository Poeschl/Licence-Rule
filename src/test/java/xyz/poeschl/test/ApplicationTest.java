package xyz.poeschl.test;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ApplicationTest {

    @Test
    public void trivialTest() {
        //WHEN
        int a = 42;
        int b = 42;

        //THEN
        int diff = a - b;

        //VERIFY
        assertThat(diff).isZero();
    }
}
