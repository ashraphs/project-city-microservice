package com.std.city.citymasterdataservice.entities;

import javax.persistence.Column;

public class SalaryDetailEntity {

    @Column(name = "salary_detal_id", nullable = false)
    private Long sdID;

    @Column(name = "sale_entry_id", nullable = false)
    private Long seID;

    @Column(name = "employee_name", nullable = false)
    private String employeeName;

    @Column(name = "employee_id", nullable = false)
    private String employeeID;

    @Column(name = "salary_detail_month", nullable = false)
    private String sdMonth;

    @Column(name = "deduction", nullable = false)
    private double deduction;

    @Column(name = "actual_paid", nullable = false)
    private double actualPaid;
}
