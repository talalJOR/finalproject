package com.dentist.pojo;

import java.util.Map;

import lombok.Data;
@Data
public class Result {
private String status ;
private Map<String,Object> resultMap;
}
