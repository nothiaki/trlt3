package com.github.nothiaki.trtl3_core.shared.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
public class AbsentBucketsException extends RuntimeException {

  public AbsentBucketsException() {
    super("There is no buckets created");
  }

}
