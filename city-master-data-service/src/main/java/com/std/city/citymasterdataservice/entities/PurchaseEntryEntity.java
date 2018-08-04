package com.std.city.citymasterdataservice.entities;

import javax.persistence.Column;
import java.util.Date;

public class PurchaseEntryEntity {

    @Column(name = "purchase_entry_id", nullable = false)
    private Long peID;

    @Column(name = "purchase_entry_date", nullable = false)
    private Date pDate;

    @Column(name = "customer", nullable = false)
    private String customer;

    @Column(name = "total", nullable = false)
    private double total;

    @Column(name = "description", nullable = false)
    private String desc;

    @Column(name = "pre_description", nullable = false)
    private String preDesc;
}
