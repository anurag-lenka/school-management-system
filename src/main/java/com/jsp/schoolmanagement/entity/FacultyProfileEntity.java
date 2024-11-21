package com.jsp.schoolmanagement.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class FacultyProfileEntity {
    @Id
    private Long userId;
    private String photo;
    private String officeHours;

    @ManyToOne
    @JoinColumn(name = "department_id")
    private DepartmentEntity departmentEntity;

    @OneToOne
    @MapsId
    private UserEntity userEntity;

}

