package com.gachugu.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StaffDTO {
    private Long id;
    private String firstName;
    private String lastName;
    private String department;
    private String position;
    private String biography;
    private String profileImage;
    private String email;
    private String phoneNumber;
    private boolean active;
}
