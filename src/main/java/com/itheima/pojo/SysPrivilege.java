package com.itheima.pojo;

/**
 * Created with IntelliJ IDEA.
 *
 * @version V1.0
 * @author: ZhangZheng
 * @Date: 2019/7/24
 * @Time: 10:51
 * @description
 */
public class SysPrivilege {
    private long id;
    private String privilegeName;
    private String privilegeUrl;

    public SysPrivilege() {
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("SysPrivilege{");
        sb.append("id=").append(id);
        sb.append(", privilegeName='").append(privilegeName).append('\'');
        sb.append(", privilegeUrl='").append(privilegeUrl).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPrivilegeName() {
        return privilegeName;
    }

    public void setPrivilegeName(String privilegeName) {
        this.privilegeName = privilegeName;
    }

    public String getPrivilegeUrl() {
        return privilegeUrl;
    }

    public void setPrivilegeUrl(String privilegeUrl) {
        this.privilegeUrl = privilegeUrl;
    }
}
