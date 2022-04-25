package com.TopViecLam.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.Set;

@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

   @Column(unique = true)
   @NotNull
    private String userName;

    @NotNull
   private String password;

   private String avatar;

   private Date createdTime;

   private  Date dateOfBirth;

   private String phoneNumber;

   private String gender;

   private String moreInformation;

   @ManyToMany(fetch = FetchType.EAGER)
    private Set<Role> roles;

   @ManyToOne
    private DanhSachCv danhSachCv;
}
