/**
 * 
 */
package com.qz.security.core.social.weixin.api;

/**
 * ΢���û���Ϣ
 * 
 * @author yb
 */
public class WeixinUserInfo {
	
	/**
	 * ��ͨ�û��ı�ʶ���Ե�ǰ�������ʺ�Ψһ
	 */
	private String openid;	
	/**
	 * ��ͨ�û��ǳ�
	 */
	private String nickname;
	/**
	 * ����
	 */
	private String language;
	/**
	 * ��ͨ�û��Ա�1Ϊ���ԣ�2ΪŮ��
	 */
	private String sex;
	/**
	 * ��ͨ�û�����������д��ʡ��
	 */
	private String province;
	/**
	 * ��ͨ�û�����������д�ĳ���
	 */
	private String city;
	/**
	 * ���ң����й�ΪCN
	 */
	private String country;
	/**
	 * �û�ͷ�����һ����ֵ����������ͷ���С����0��46��64��96��132��ֵ��ѡ��0����640*640������ͷ�񣩣��û�û��ͷ��ʱ����Ϊ��
	 */
	private String headimgurl;
	/**
	 * �û���Ȩ��Ϣ��json���飬��΢���ֿ��û�Ϊ��chinaunicom��
	 */
	private String[] privilege;
	/**
	 * �û�ͳһ��ʶ�����һ��΢�ſ���ƽ̨�ʺ��µ�Ӧ�ã�ͬһ�û���unionid��Ψһ�ġ�
	 */
	private String unionid;
	
	/**
	 * @return the openid
	 */
	public String getOpenid() {
		return openid;
	}
	/**
	 * @param openid the openid to set
	 */
	public void setOpenid(String openid) {
		this.openid = openid;
	}
	/**
	 * @return the nickname
	 */
	public String getNickname() {
		return nickname;
	}
	/**
	 * @param nickname the nickname to set
	 */
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	/**
	 * @return the sex
	 */
	public String getSex() {
		return sex;
	}
	/**
	 * @param sex the sex to set
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}
	/**
	 * @return the province
	 */
	public String getProvince() {
		return province;
	}
	/**
	 * @param province the province to set
	 */
	public void setProvince(String province) {
		this.province = province;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}
	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}
	/**
	 * @return the headimgurl
	 */
	public String getHeadimgurl() {
		return headimgurl;
	}
	/**
	 * @param headimgurl the headimgurl to set
	 */
	public void setHeadimgurl(String headimgurl) {
		this.headimgurl = headimgurl;
	}
	/**
	 * @return the privilege
	 */
	public String[] getPrivilege() {
		return privilege;
	}
	/**
	 * @param privilege the privilege to set
	 */
	public void setPrivilege(String[] privilege) {
		this.privilege = privilege;
	}
	/**
	 * @return the unionid
	 */
	public String getUnionid() {
		return unionid;
	}
	/**
	 * @param unionid the unionid to set
	 */
	public void setUnionid(String unionid) {
		this.unionid = unionid;
	}
	/**
	 * @return the language
	 */
	public String getLanguage() {
		return language;
	}
	/**
	 * @param language the language to set
	 */
	public void setLanguage(String language) {
		this.language = language;
	}

}