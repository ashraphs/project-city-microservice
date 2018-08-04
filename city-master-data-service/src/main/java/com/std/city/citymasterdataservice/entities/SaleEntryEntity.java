package com.std.city.citymasterdataservice.entities;

import javax.persistence.Column;
import java.util.Date;

public class SaleEntryEntity {

    @Column(name = "sale_entry_id")
    private Long seID;

    @Column(name = "sale_date", nullable = false)
    private Date sDate;

    @Column(name = "customer")
    private String customer;

    @Column(name = "total", nullable = false)
    private double total;

    @Column(name = "description", nullable = false)
    private String desc;

    @Column(name = "pre_description", nullable = true)
    private String preDesc;
}
