/**
 * Copyright (c) 2014-2017, test.com
 * All rights reserved.
 */
package com.nci.admin.enums;

public enum JobType {

    /**
     * Student,学生，学生.
     */
    STUDENT(4, 2, "学生"),

    /**
     * Employee, 工薪族，在职.
     */
    EMPLOYEE(1, 1, "在职"),

    /**
     * Self owned, 个体户，个体.
     */
    SELF_EMPLOLY(3, 3, "个体");


    private int xhcode;


    private int xycode;


    private String name;

    /**
     * Enumeration constructor.
     * @param xhcode xiaoer JobType code.
     * @param xycode Xinyang JobType code.
     * @param name JobType name.
     */
    JobType(final int xhcode, final int xycode, final String name) {
        this.xhcode =xhcode;
        this.xycode = xycode;
        this.name = name;
    }

    /**
     * Get JobType enum by xinyang job code.
     * @param code Job code.
     * @return A {@link JobType} enumeration.
     */
    public static JobType getJobType(final int code) {
        JobType jobType = null;

        return jobType;
    }
}
