package com.example.dubbo.userserviceprivoder.bean.u1190Kol;


import java.io.Serializable;

/**
 * 家游助力KOL
 */
public class U1190KolDBO implements Serializable {
    /**
     * 流水ID
     */
    private String puk = null;

    /**
     * 姓名
     */
    private String userName = null;

    /**
     * 性别
     */
    private String sex = null;

    /**
     * 头像
     */
    private String headPic = null;

    /**
     * 空间照片
     */
    private String qzonePic = null;

    /**
     * 微信号
     */
    private String wxNumber = null;

    /**
     * 地址
     */
    private String address = null;

    /**
     * 年龄
     */
    private String age = null;

    /**
     * 手机号
     */
    private String phoneNumber = null;

    /**
     * 个人简介
     */
    private String personalSynopsis = null;

    /**
     * 个性签名
     */
    private String sign = null;

    /**
     * 爱好
     */
    private String hobby = null;

    /**
     * 所属社区
     */
    private String affiliatedCommunity = null;

    /**
     * 等级
     */
    private String grade = null;

    /**
     * 职务
     */
    private String post = null;

    /**
     * 头衔
     */
    private String title = null;

    /**
     * 推荐人
     */
    private String recommender = null;

    /**
     * 来源
     */
    private String fromType = null;

    /**
     * 标签
     */
    private String tag = null;

    /**
     * 免费会员名额
     */
    private String membershipNum = null;

    /**
     * 已使用会员名额
     */
    private String membershipNumUsed = null;

    /**
     * 审核状态
     */
    private String examineState = null;

    public U1190KolDBO(String puk, String userName, String sex, String headPic, String qzonePic, String wxNumber, String address, String age, String phoneNumber, String personalSynopsis, String sign, String hobby, String affiliatedCommunity, String grade, String post, String title, String recommender, String fromType, String tag, String membershipNum, String membershipNumUsed, String examineState) {
        this.puk = puk;
        this.userName = userName;
        this.sex = sex;
        this.headPic = headPic;
        this.qzonePic = qzonePic;
        this.wxNumber = wxNumber;
        this.address = address;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.personalSynopsis = personalSynopsis;
        this.sign = sign;
        this.hobby = hobby;
        this.affiliatedCommunity = affiliatedCommunity;
        this.grade = grade;
        this.post = post;
        this.title = title;
        this.recommender = recommender;
        this.fromType = fromType;
        this.tag = tag;
        this.membershipNum = membershipNum;
        this.membershipNumUsed = membershipNumUsed;
        this.examineState = examineState;
    }

    public U1190KolDBO() {
    }

    public String getPuk() {
        return puk;
    }

    public void setPuk(String puk) {
        this.puk = puk;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getHeadPic() {
        return headPic;
    }

    public void setHeadPic(String headPic) {
        this.headPic = headPic;
    }

    public String getQzonePic() {
        return qzonePic;
    }

    public void setQzonePic(String qzonePic) {
        this.qzonePic = qzonePic;
    }

    public String getWxNumber() {
        return wxNumber;
    }

    public void setWxNumber(String wxNumber) {
        this.wxNumber = wxNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPersonalSynopsis() {
        return personalSynopsis;
    }

    public void setPersonalSynopsis(String personalSynopsis) {
        this.personalSynopsis = personalSynopsis;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String getAffiliatedCommunity() {
        return affiliatedCommunity;
    }

    public void setAffiliatedCommunity(String affiliatedCommunity) {
        this.affiliatedCommunity = affiliatedCommunity;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getRecommender() {
        return recommender;
    }

    public void setRecommender(String recommender) {
        this.recommender = recommender;
    }

    public String getFromType() {
        return fromType;
    }

    public void setFromType(String fromType) {
        this.fromType = fromType;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getMembershipNum() {
        return membershipNum;
    }

    public void setMembershipNum(String membershipNum) {
        this.membershipNum = membershipNum;
    }

    public String getMembershipNumUsed() {
        return membershipNumUsed;
    }

    public void setMembershipNumUsed(String membershipNumUsed) {
        this.membershipNumUsed = membershipNumUsed;
    }

    public String getExamineState() {
        return examineState;
    }

    public void setExamineState(String examineState) {
        this.examineState = examineState;
    }


    @Override
    public String toString() {
        return "U1190KolDBO{" +
                "puk='" + puk + '\'' +
                ", userName='" + userName + '\'' +
                ", sex='" + sex + '\'' +
                ", headPic='" + headPic + '\'' +
                ", qzonePic='" + qzonePic + '\'' +
                ", wxNumber='" + wxNumber + '\'' +
                ", address='" + address + '\'' +
                ", age='" + age + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", personalSynopsis='" + personalSynopsis + '\'' +
                ", sign='" + sign + '\'' +
                ", hobby='" + hobby + '\'' +
                ", affiliatedCommunity='" + affiliatedCommunity + '\'' +
                ", grade='" + grade + '\'' +
                ", post='" + post + '\'' +
                ", title='" + title + '\'' +
                ", recommender='" + recommender + '\'' +
                ", fromType='" + fromType + '\'' +
                ", tag='" + tag + '\'' +
                ", membershipNum='" + membershipNum + '\'' +
                ", membershipNumUsed='" + membershipNumUsed + '\'' +
                ", examineState='" + examineState + '\'' +
                '}';
    }
}
