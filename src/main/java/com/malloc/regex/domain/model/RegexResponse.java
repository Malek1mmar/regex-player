package com.malloc.regex.domain.model;

import java.util.List;

public record RegexResponse(boolean matched, List<String> matches) {}
