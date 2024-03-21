package com.crud_api.hibernate_crud.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@AllArgsConstructor
//@NoArgsConstructor
//@Data
public class Status {
    public boolean status;
   public Status(boolean status){
       this.status=status;
   }
}
