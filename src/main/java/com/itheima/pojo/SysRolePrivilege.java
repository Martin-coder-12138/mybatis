package com.itheima.pojo;

/**
 * Created with IntelliJ IDEA.
 *
 * @version V1.0
 * @author: ZhangZheng
 * @Date: 2019/7/24
 * @Time: 10:55
 * @description
 */
public class SysRolePrivilege {
    private Long roleId;
    private Long privilegeId;

    public SysRolePrivilege() {

    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("SysRolePrivilege{");
        sb.append("roleId=").append(roleId);
        sb.append(", privilegeId=").append(privilegeId);
        sb.append('}');
        return sb.toString();
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public Long getPrivilegeId() {
        return privilegeId;
    }

    public void setPrivilegeId(Long privilegeId) {
        this.privilegeId = privilegeId;
    }
}
