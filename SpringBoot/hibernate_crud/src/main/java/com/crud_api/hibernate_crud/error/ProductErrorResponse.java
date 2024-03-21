package com.crud_api.hibernate_crud.error;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductErrorResponse {

    private  int status;
    private  String message;
    private  long timestamp;
}
