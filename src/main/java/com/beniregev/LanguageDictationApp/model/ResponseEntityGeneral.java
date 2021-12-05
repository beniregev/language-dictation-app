package com.beniregev.LanguageDictationApp.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ResponseEntityGeneral {
    private HttpStatus httpStatus;
    private String httpStatusText;
    private Object result;
}
