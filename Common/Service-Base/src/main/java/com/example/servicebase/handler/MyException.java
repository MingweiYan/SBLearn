package com.example.servicebase.handler;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MyException extends RuntimeException{

    @ApiModelProperty(value = "状态码")
    private Integer code;
    private String msg;
}
