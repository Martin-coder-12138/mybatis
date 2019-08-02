package com.itheima.pojo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @version V1.0
 * @author: ZhangZheng
 * @Date: 2019/7/24
 * @Time: 10:41
 * @description
 */
public class SysUser implements Serializable {
    private Long id;
    private String userName;
    private String userPassword;
    private String userEmail;
    private String userInfo;
    private byte[] headImg;
    private Date createTime;

    public List<SysRole> getRoleList() {
        return roleList;
    }

    public void setRoleList(List<SysRole> roleList) {
        this.roleList = roleList;
    }

    /*用户角色*/
    private List<SysRole> roleList;


    public SysUser() {
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("SysUser{");
        sb.append("id=").append(id);
        sb.append(", userName='").append(userName).append('\'');
        sb.append(", userPassword='").append(userPassword).append('\'');
        sb.append(", userEmail='").append(userEmail).append('\'');
        sb.append(", userInfo='").append(userInfo).append('\'');
        sb.append(", headImg=");
        if (headImg == null) {
            sb.append("null");
        } else {
            sb.append('[');
            for (int i = 0; i < headImg.length; ++i) {
                sb.append(i == 0 ? "" : ", ").append(headImg[i]);
            }
            sb.append(']');
        }
        sb.append(", createTime=").append(createTime);
        sb.append(", roleList=").append(roleList);
        sb.append('}');
        return sb.toString();
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(String userInfo) {
        this.userInfo = userInfo;
    }

    public byte[] getHeadImg() {
        return headImg;
    }

    public void setHeadImg(byte[] headImg) {
        this.headImg = headImg;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
