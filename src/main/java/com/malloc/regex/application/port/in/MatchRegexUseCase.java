package com.malloc.regex.application.port.in;

import com.malloc.regex.domain.model.RegexRequest;
import com.malloc.regex.domain.model.RegexResponse;

public interface MatchRegexUseCase {
  RegexResponse match(RegexRequest request);
}