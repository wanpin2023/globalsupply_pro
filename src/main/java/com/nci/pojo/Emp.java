package com.nci.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * employee entity class
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Emp {
   private Integer id;
   private String username;
   private String password;
   private String name;
   private Short gender; //gender , 1 male, 2 female
   private String image;
   private Short job;
   private LocalDate entryDate;
   private Integer deptId;
   private LocalDateTime createTime;
   private LocalDateTime updateTime;
}