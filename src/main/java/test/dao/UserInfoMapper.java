package test.dao;

import java.util.List;
import test.model.UserInfo;

public interface UserInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user info
     *
     * @mbg.generated Mon Jul 29 17:12:30 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user info
     *
     * @mbg.generated Mon Jul 29 17:12:30 CST 2019
     */
    int insert(UserInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user info
     *
     * @mbg.generated Mon Jul 29 17:12:30 CST 2019
     */
    List<UserInfo> selectAll();
}