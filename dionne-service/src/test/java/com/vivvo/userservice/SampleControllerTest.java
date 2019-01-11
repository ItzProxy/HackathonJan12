package com.vivvo.userservice;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.StreamUtils;

import javax.ws.rs.ClientErrorException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UncheckedIOException;
import java.nio.charset.StandardCharsets;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)
@Sql(scripts = "classpath:teardown.sql", executionPhase = Sql.ExecutionPhase.AFTER_TEST_METHOD)
public class SampleControllerTest {

    @Autowired
    private TestRestTemplate testRestTemplate;

    @LocalServerPort
    private int port;

    private SampleClient sampleClient;

    @Before
    public void before() {
        sampleClient = new SampleClient();
        sampleClient.setBaseUri("http://localhost:" + port);
    }

    @Test
    public void testCreateAndSearch_shouldSucceed() {
        String hello = "hello";
        testRestTemplate.postForLocation("/api/v1/users", hello);

        SampleDto[] users = testRestTemplate.getForObject("/api/v1/users", SampleDto[].class);
        //asserts here
    }

    private Map<String, String> unwrapClientException(ClientErrorException exception) {
        try {
            InputStream inputStream = (InputStream) exception.getResponse().getEntity();
            String string = StreamUtils.copyToString(inputStream, StandardCharsets.UTF_8);
            return new ObjectMapper().readValue(string, new TypeReference<Map<String, String>>(){});
        }catch(IOException e) {
            throw new UncheckedIOException(e);
        }
    }





}
