package org.example;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class ControllerTest {

  @LocalServerPort
  private int port;

  @Autowired
  private TestRestTemplate restTemplate;

  @Test
  @DisplayName("Should add")
  public void add() {
    ResponseEntity<String> result = restTemplate.getForEntity("http://localhost:{port}/test/add?a=2&b=2", String.class, port);

    assertThat(result.getBody()).isEqualTo("a + b: 4");
  }

  @Test
  @DisplayName("Should subtract")
  public void subtract() {
    ResponseEntity<String> result = restTemplate.getForEntity("http://localhost:{port}/test/subtract?a=2&b=2", String.class, port);

    assertThat(result.getBody()).isEqualTo("a - b: 0");
  }

  @Test
  @DisplayName("Should multiply")
  public void multiply() {
    ResponseEntity<String> result = restTemplate.getForEntity("http://localhost:{port}/test/multiply?a=2&b=2", String.class, port);

    assertThat(result.getBody()).isEqualTo("a * b: 4");
  }

  @Test
  @DisplayName("Should divide")
  public void divide() {
    ResponseEntity<String> result = restTemplate.getForEntity("http://localhost:{port}/test/divide?a=2&b=2", String.class, port);

    assertThat(result.getBody()).isEqualTo("a / b: 1.00");
  }
}