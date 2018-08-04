package com.std.city.citymasterdataservice.entities;

import javax.persistence.Column;
import java.util.Date;

public class CustomerAccountEntity extends MasterEntity {

    @Column(name = "user_login", nullable = false)
    private String userLogin;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "address", nullable = false)
    private String address;

    @Column(name = "phone_no", nullable = false)
    private int phoneNo;

    @Column(name = "date_of_birth")
    private Date dob;

    @Column(name = "registration_date", nullable = false)
    private Date regDate;
}
