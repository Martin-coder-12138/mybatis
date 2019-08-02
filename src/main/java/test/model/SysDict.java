package test.model;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table sys_dict
 *
 * @mbg.generated do_not_delete_during_merge Mon Jul 29 17:12:30 CST 2019
 */
public class SysDict {
    /**
     * Database Column Remarks:
     *   主键
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_dict.id
     *
     * @mbg.generated Mon Jul 29 17:12:30 CST 2019
     */
    private Long id;

    /**
     * Database Column Remarks:
     *   类别
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_dict.code
     *
     * @mbg.generated Mon Jul 29 17:12:30 CST 2019
     */
    private String code;

    /**
     * Database Column Remarks:
     *   字典名
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_dict.name
     *
     * @mbg.generated Mon Jul 29 17:12:30 CST 2019
     */
    private String name;

    /**
     * Database Column Remarks:
     *   字典值
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_dict.value
     *
     * @mbg.generated Mon Jul 29 17:12:30 CST 2019
     */
    private String value;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_dict.id
     *
     * @return the value of sys_dict.id
     *
     * @mbg.generated Mon Jul 29 17:12:30 CST 2019
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_dict.id
     *
     * @param id the value for sys_dict.id
     *
     * @mbg.generated Mon Jul 29 17:12:30 CST 2019
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_dict.code
     *
     * @return the value of sys_dict.code
     *
     * @mbg.generated Mon Jul 29 17:12:30 CST 2019
     */
    public String getCode() {
        return code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_dict.code
     *
     * @param code the value for sys_dict.code
     *
     * @mbg.generated Mon Jul 29 17:12:30 CST 2019
     */
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_dict.name
     *
     * @return the value of sys_dict.name
     *
     * @mbg.generated Mon Jul 29 17:12:30 CST 2019
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_dict.name
     *
     * @param name the value for sys_dict.name
     *
     * @mbg.generated Mon Jul 29 17:12:30 CST 2019
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_dict.value
     *
     * @return the value of sys_dict.value
     *
     * @mbg.generated Mon Jul 29 17:12:30 CST 2019
     */
    public String getValue() {
        return value;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_dict.value
     *
     * @param value the value for sys_dict.value
     *
     * @mbg.generated Mon Jul 29 17:12:30 CST 2019
     */
    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
    }
}