package com.jupiter.ts.model;

public class Brigade {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ts_dd.id
     *
     * @mbg.generated Wed Oct 30 15:28:56 GMT+08:00 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ts_dd.dd_name
     *
     * @mbg.generated Wed Oct 30 15:28:56 GMT+08:00 2019
     */
    private String ddName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ts_dd.dd_create
     *
     * @mbg.generated Wed Oct 30 15:28:56 GMT+08:00 2019
     */
    private Long ddCreate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ts_dd.dd_modified
     *
     * @mbg.generated Wed Oct 30 15:28:56 GMT+08:00 2019
     */
    private Long ddModified;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ts_dd.id
     *
     * @return the value of ts_dd.id
     *
     * @mbg.generated Wed Oct 30 15:28:56 GMT+08:00 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ts_dd.id
     *
     * @param id the value for ts_dd.id
     *
     * @mbg.generated Wed Oct 30 15:28:56 GMT+08:00 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ts_dd.dd_name
     *
     * @return the value of ts_dd.dd_name
     *
     * @mbg.generated Wed Oct 30 15:28:56 GMT+08:00 2019
     */
    public String getDdName() {
        return ddName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ts_dd.dd_name
     *
     * @param ddName the value for ts_dd.dd_name
     *
     * @mbg.generated Wed Oct 30 15:28:56 GMT+08:00 2019
     */
    public void setDdName(String ddName) {
        this.ddName = ddName == null ? null : ddName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ts_dd.dd_create
     *
     * @return the value of ts_dd.dd_create
     *
     * @mbg.generated Wed Oct 30 15:28:56 GMT+08:00 2019
     */
    public Long getDdCreate() {
        return ddCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ts_dd.dd_create
     *
     * @param ddCreate the value for ts_dd.dd_create
     *
     * @mbg.generated Wed Oct 30 15:28:56 GMT+08:00 2019
     */
    public void setDdCreate(Long ddCreate) {
        this.ddCreate = ddCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ts_dd.dd_modified
     *
     * @return the value of ts_dd.dd_modified
     *
     * @mbg.generated Wed Oct 30 15:28:56 GMT+08:00 2019
     */
    public Long getDdModified() {
        return ddModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ts_dd.dd_modified
     *
     * @param ddModified the value for ts_dd.dd_modified
     *
     * @mbg.generated Wed Oct 30 15:28:56 GMT+08:00 2019
     */
    public void setDdModified(Long ddModified) {
        this.ddModified = ddModified;
    }
}