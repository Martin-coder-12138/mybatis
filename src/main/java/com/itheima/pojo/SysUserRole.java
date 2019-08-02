package com.itheima.pojo;

/**
 * Created with IntelliJ IDEA.
 *
 * @version V1.0
 * @author: ZhangZheng
 * @Date: 2019/7/24
 * @Time: 10:57
 * @description
 */
public class SysUserRole {
    private Long userId;
    private Long roleId;

    public SysUserRole() {
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("SysUserRole{");
        sb.append("userId=").append(userId);
        sb.append(", roleId=").append(roleId);
        sb.append('}');
        return sb.toString();
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }
}
