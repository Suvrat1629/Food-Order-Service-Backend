package com.example.response;

import lombok.Data;
import org.springframework.jdbc.core.SqlReturnType;

@Data
public class MessageResponse {

    private String message;
}
