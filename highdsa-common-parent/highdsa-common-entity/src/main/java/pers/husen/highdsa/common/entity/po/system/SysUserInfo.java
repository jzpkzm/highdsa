package pers.husen.highdsa.common.entity.po.system;

import java.io.Serializable;
import java.util.Date;

/**
 * @Desc 系统用户信息实体类
 *
 * @Author 何明胜
 *
 * @Created at 2018年3月29日 下午3:35:04
 * 
 * @Version 1.0.4
 */
public class SysUserInfo implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long userId;

	private String userNickName;

	private Date userRegisterDate;

	private String userHeadUrl;

	private Boolean userSex;

	private String userBirthday;

	private String userDesc;

	private Date userLastLoginTime;

	@Override
	public String toString() {
		return "SysUserInfo [userId=" + userId + ", userNickName=" + userNickName + ", userRegisterDate=" + userRegisterDate + ", userHeadUrl=" + userHeadUrl + ", userSex=" + userSex
				+ ", userBirthday=" + userBirthday + ", userDesc=" + userDesc + ", userLastLoginTime=" + userLastLoginTime + "]";
	}

	public SysUserInfo(Long userId, String userNickName, Date userRegisterDate, String userHeadUrl, Boolean userSex, String userBirthday, String userDesc, Date userLastLoginTime) {
		this.userId = userId;
		this.userNickName = userNickName;
		this.userRegisterDate = userRegisterDate;
		this.userHeadUrl = userHeadUrl;
		this.userSex = userSex;
		this.userBirthday = userBirthday;
		this.userDesc = userDesc;
		this.userLastLoginTime = userLastLoginTime;
	}
	
	public SysUserInfo(Long userId, String userNickName, Date userRegisterDate, String userHeadUrl, String userBirthday, String userDesc, Date userLastLoginTime) {
		this.userId = userId;
		this.userNickName = userNickName;
		this.userRegisterDate = userRegisterDate;
		this.userHeadUrl = userHeadUrl;
		this.userBirthday = userBirthday;
		this.userDesc = userDesc;
		this.userLastLoginTime = userLastLoginTime;
	}

	public SysUserInfo() {
		super();
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUserNickName() {
		return userNickName;
	}

	public void setUserNickName(String userNickName) {
		this.userNickName = userNickName == null ? null : userNickName.trim();
	}

	public Date getUserRegisterDate() {
		return userRegisterDate;
	}

	public void setUserRegisterDate(Date userRegisterDate) {
		this.userRegisterDate = userRegisterDate;
	}

	public String getUserHeadUrl() {
		return userHeadUrl;
	}

	public void setUserHeadUrl(String userHeadUrl) {
		this.userHeadUrl = userHeadUrl == null ? null : userHeadUrl.trim();
	}

	public Boolean getUserSex() {
		return userSex;
	}

	public void setUserSex(Boolean userSex) {
		this.userSex = userSex;
	}

	public String getUserBirthday() {
		return userBirthday;
	}

	public void setUserBirthday(String userBirthday) {
		this.userBirthday = userBirthday == null ? null : userBirthday.trim();
	}

	public String getUserDesc() {
		return userDesc;
	}

	public void setUserDesc(String userDesc) {
		this.userDesc = userDesc == null ? null : userDesc.trim();
	}

	public Date getUserLastLoginTime() {
		return userLastLoginTime;
	}

	public void setUserLastLoginTime(Date userLastLoginTime) {
		this.userLastLoginTime = userLastLoginTime;
	}
}