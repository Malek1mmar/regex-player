package com.malloc.regex.adapters.in.rest;

import com.malloc.regex.application.port.in.MatchRegexUseCase;
import com.malloc.regex.domain.model.RegexRequest;
import com.malloc.regex.domain.model.RegexResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/regex")
public class RegexController {

  private final MatchRegexUseCase matchRegexUseCase;

  public RegexController(MatchRegexUseCase matchRegexUseCase) {
    this.matchRegexUseCase = matchRegexUseCase;
  }

  @PostMapping("/match")
  public ResponseEntity<RegexResponse> match(@RequestBody RegexRequest request) {
    return ResponseEntity.ok(matchRegexUseCase.match(request));
  }
}