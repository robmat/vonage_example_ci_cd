package org.example;

import java.math.BigDecimal;
import java.math.RoundingMode;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/test")
public class Controller {

  @GetMapping(path = "/add")
  public Mono<String> add(@RequestParam("a") int a, @RequestParam("b") int b) {
    return Mono.just("a + b: " + (a + b));
  }

  @GetMapping(path = "/subtract")
  public Mono<String> subtract(@RequestParam("a") int a, @RequestParam("b") int b) {
    return Mono.just("a - b: " + (a - b));
  }

  @GetMapping(path = "/multiply")
  public Mono<String> multiply(@RequestParam("a") int a, @RequestParam("b") int b) {
    return Mono.just("a * b: " + (a * b));
  }

  @GetMapping(path = "/divide")
  public Mono<String> divide(@RequestParam("a") int a, @RequestParam("b") int b) {
    return Mono.just("a / b: " + (BigDecimal.valueOf(a).divide(BigDecimal.valueOf(b), 2, RoundingMode.HALF_UP)));
  }
}
