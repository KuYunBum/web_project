package com.spring.dto;

import java.util.Date;

public class InbodyDTO {
	private	int userNum;
	private	String userGender;
	private	Date userBirth;
	private	Date inbodyDate;
	private	double height;
	private	double weight;
	private	double skeletalMuscleMass;
	private	double bodyFatMass;
	private	double bodyWater;
	private	double protein;
	private	double muscleMass;
	private	double leanBodyMass;
	private	double minerals;
	private	double BMI;
	private	double waistHipRatio;
	private	double BMR;
	private String bodyShape;
	
	public int getUserNum() {
		return userNum;
	}
	public void setUserNum(int userNum) {
		this.userNum = userNum;
	}
	public String getUserGender() {
		return userGender;
	}
	public void setUserGender(String userGender) {
		this.userGender = userGender;
	}
	public Date getUserBirth() {
		return userBirth;
	}
	public void setUserBirth(Date userBirth) {
		this.userBirth = userBirth;
	}
	public Date getInbodyDate() {
		return inbodyDate;
	}
	public void setInbodyDate(Date inbodyDate) {
		this.inbodyDate = inbodyDate;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getSkeletalMuscleMass() {
		return skeletalMuscleMass;
	}
	public void setSkeletalMuscleMass(double skeletalMuscleMass) {
		this.skeletalMuscleMass = skeletalMuscleMass;
	}
	public double getBodyFatMass() {
		return bodyFatMass;
	}
	public void setBodyFatMass(double bodyFatMass) {
		this.bodyFatMass = bodyFatMass;
	}
	public double getBodyWater() {
		return bodyWater;
	}
	public void setBodyWater(double bodyWater) {
		this.bodyWater = bodyWater;
	}
	public double getProtein() {
		return protein;
	}
	public void setProtein(double protein) {
		this.protein = protein;
	}
	public double getMuscleMass() {
		return muscleMass;
	}
	public void setMuscleMass(double muscleMass) {
		this.muscleMass = muscleMass;
	}
	public double getLeanBodyMass() {
		return leanBodyMass;
	}
	public void setLeanBodyMass(double leanBodyMass) {
		this.leanBodyMass = leanBodyMass;
	}
	public double getMinerals() {
		return minerals;
	}
	public void setMinerals(double minerals) {
		this.minerals = minerals;
	}
	public double getBMI() {
		return BMI;
	}
	public void setBMI(double bMI) {
		BMI = bMI;
	}
	public double getWaistHipRatio() {
		return waistHipRatio;
	}
	public void setWaistHipRatio(double waistHipRatio) {
		this.waistHipRatio = waistHipRatio;
	}
	public double getBMR() {
		return BMR;
	}
	public void setBMR(double bMR) {
		BMR = bMR;
	}
	public String getBodyShape() {
		return bodyShape;
	}
	public void setBodyShape(String bodyShape) {
		this.bodyShape = bodyShape;
	}
	@Override
	public String toString() {
		return "InbodyDTO [userNum=" + userNum + ", userGender=" + userGender + ", userBirth=" + userBirth
				+ ", inbodyDate=" + inbodyDate + ", height=" + height + ", weight=" + weight + ", skeletalMuscleMass="
				+ skeletalMuscleMass + ", bodyFatMass=" + bodyFatMass + ", bodyWater=" + bodyWater + ", protein="
				+ protein + ", muscleMass=" + muscleMass + ", leanBodyMass=" + leanBodyMass + ", minerals=" + minerals
				+ ", BMI=" + BMI + ", waistHipRatio=" + waistHipRatio + ", BMR=" + BMR + ", bodyShape=" + bodyShape
				+ "]";
	}

	
}
