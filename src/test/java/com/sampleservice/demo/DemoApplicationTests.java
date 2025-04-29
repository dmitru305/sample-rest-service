package com.sampleservice.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Test
    public void contextLoads() {
        // Verify that the application context loads successfully
        org.junit.Assert.assertNotNull(org.springframework.context.ApplicationContextRunner.currentApplicationContext());
    }

    @Test
    public void testMainMethod() {
        // Mock the behavior of SpringApplication.run for testing purposes
        org.mockito.Mockito.mockStatic(org.springframework.boot.SpringApplication.class, mock -> {
            mock.when(() -> org.springframework.boot.SpringApplication.run(org.mockito.ArgumentMatchers.eq(com.sampleservice.demo.DemoApplication.class), org.mockito.ArgumentMatchers.any(String[].class))).thenReturn(org.mockito.Mockito.mock(org.springframework.context.ConfigurableApplicationContext.class));
            com.sampleservice.demo.DemoApplication.main(new String[] {});
            return mock;
        }).close();
    }
}