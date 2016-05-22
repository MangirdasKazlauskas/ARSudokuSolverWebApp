package com.sudoku;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.TestRestTemplate;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(App.class)
@WebIntegrationTest
public class ConnectionsWebIntegrationTest {
    @Test
    public void testConnectionToEasySudokusPage() throws IOException {
        RestTemplate restTemplate = new TestRestTemplate();
        ResponseEntity<String> response = restTemplate.getForEntity("http://localhost:8080/api/v1/easySudokus", String.class);

        assertThat(response.getStatusCode(), equalTo(HttpStatus.OK));
    }
    @Test
    public void testConnectionToMediumSudokusPage() throws IOException {
        RestTemplate restTemplate = new TestRestTemplate();
        ResponseEntity<String> response = restTemplate.getForEntity("http://localhost:8080/api/v1/mediumSudokus", String.class);

        assertThat(response.getStatusCode(), equalTo(HttpStatus.OK));
    }
    @Test
    public void testConnectionToHardSudokusPage() throws IOException {
        RestTemplate restTemplate = new TestRestTemplate();
        ResponseEntity<String> response = restTemplate.getForEntity("http://localhost:8080/api/v1/hardSudokus", String.class);

        assertThat(response.getStatusCode(), equalTo(HttpStatus.OK));
    }
}
