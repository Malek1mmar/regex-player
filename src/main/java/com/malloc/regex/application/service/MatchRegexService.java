package com.malloc.regex.application.service;

import com.malloc.regex.application.port.in.MatchRegexUseCase;
import com.malloc.regex.domain.model.RegexRequest;
import com.malloc.regex.domain.model.RegexResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.springframework.stereotype.Service;

@Service
public class MatchRegexService implements MatchRegexUseCase {

  @Override
  public RegexResponse match(RegexRequest request) {
    Pattern pattern = Pattern.compile(request.regex());
    Matcher matcher = pattern.matcher(request.input());

    List<String> matches = new ArrayList<>();
    boolean found = false;

    while (matcher.find()) {
      found = true;
      matches.add(matcher.group());
    }

    return new RegexResponse(found, matches);
  }
}