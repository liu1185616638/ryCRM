package com.kakarote.crm9.erp.crm.entity.base;

import com.jfinal.plugin.activerecord.IBean;
import com.jfinal.plugin.activerecord.Model;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseCrmCustomer<M extends BaseCrmCustomer<M>> extends Model<M> implements IBean {

	public void setCustomerId(Integer customerId) {
		set("customer_id", customerId);
	}

	public Integer getCustomerId() {
		return getInt("customer_id");
	}

	public void setCustomerName(String customerName) {
		set("customer_name", customerName);
	}

	public String getCustomerName() {
		return getStr("customer_name");
	}

	public void setFollowup(Integer followup) {
		set("followup", followup);
	}

	public Integer getFollowup() {
		return getInt("followup");
	}

	public void setIsLock(Integer isLock) {
		set("is_lock", isLock);
	}

	public Integer getIsLock() {
		return getInt("is_lock");
	}

	public void setNextTime(java.util.Date nextTime) {
		set("next_time", nextTime);
	}

	public java.util.Date getNextTime() {
		return get("next_time");
	}

	public void setDealStatus(String dealStatus) {
		set("deal_status", dealStatus);
	}

	public String getDealStatus() {
		return getStr("deal_status");
	}

	public void setMobile(String mobile){
		set("mobile", mobile);
	}

	public String getMobile(){
		return getStr("mobile");
	}

	public void setTelephone(String telephone){
		set("telephone", telephone);
	}

	public String getTelephone(){
		return getStr("telephone");
	}

	public void setWebsite(String website){
		set("website", website);
	}

	public String getWebsite(){
		return getStr("website");
	}

	public void setRemark(String remark){
		set("remark", remark);
	}

	public String getRemark(){
		return getStr("remark");
	}

	public void setCreateUserId(Integer createUserId) {
		set("create_user_id", createUserId);
	}

	public Integer getCreateUserId() {
		return getInt("create_user_id");
	}

	public void setOwnerUserId(Integer ownerUserId) {
		set("owner_user_id", ownerUserId);
	}

	public Integer getOwnerUserId() {
		return getInt("owner_user_id");
	}

	public void setRoUserId(String roUserId) {
		set("ro_user_id", roUserId);
	}

	public String getRoUserId() {
		return getStr("ro_user_id");
	}

	public void setRwUserId(String rwUserId) {
		set("rw_user_id", rwUserId);
	}

	public String getRwUserId() {
		return getStr("rw_user_id");
	}

	public void setAddress(String address) {
		set("address", address);
	}

	public String getAddress() {
		return getStr("address");
	}

	public void setLocation(String location) {
		set("location", location);
	}

	public String getLocation() {
		return getStr("location");
	}

	public void setDetailAddress(String detailAddress) {
		set("detail_address", detailAddress);
	}

	public String getDetailAddress() {
		return getStr("detail_address");
	}

	public void setLng(String lng) {
		set("lng", lng);
	}

	public String getLng() {
		return getStr("lng");
	}

	public void setLat(String lat) {
		set("lat", lat);
	}

	public String getLat() {
		return getStr("lat");
	}

	public void setCreateTime(java.util.Date createTime) {
		set("create_time", createTime);
	}

	public java.util.Date getCreateTime() {
		return get("create_time");
	}

	public void setUpdateTime(java.util.Date updateTime) {
		set("update_time", updateTime);
	}

	public java.util.Date getUpdateTime() {
		return get("update_time");
	}

	public void setBatchId(String batchId) {
		set("batch_id", batchId);
	}

	public String getBatchId() {
		return getStr("batch_id");
	}
}
