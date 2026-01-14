package com.xworkz.parkingApp.dto;

import lombok.*;

@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class VehicleDto {

    private String name;
    private String surname;
    private String email;
    private String phoneNumber;
    private String vehicleNumber;

}
