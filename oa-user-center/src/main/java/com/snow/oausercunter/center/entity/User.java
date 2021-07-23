package com.snow.oausercunter.center.entity;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "users")
public class User {
    @Id
    private Integer id;

    /**
     * 角色id，非后台权限管理中的角色。关联roles.id
     */
    //@Column(name = "role_id")
    private Integer roleId;

    /**
     * 是否是邻汇吧员工标识，1：邻汇吧员工 0：非邻汇吧员工
     */
    //@Column(name = "is_linhui")
    private Byte isLinhui;

    private String tag;

    /**
     * 用户真实姓名
     */
    private String name;

    /**
     * 用户名，注册账号时填的用户名。
     */
    private String username;

    /**
     * 所属企业，用户在企业认证后，认证的企业名称会自动同步到此字段
     */
    private String company;

    /**
     * 产品名称
     */
    private String product;

    /**
     * 微信登录后的唯一标识
     */
    //@Column(name = "wechat_openid")
    private String wechatOpenid;

    /**
     * 手机号
     */
    private String mobile;

    /**
     * 邮箱
     */
    private String email;

    private String password;

    //@Column(name = "remember_token")
    private String rememberToken;

    private Integer comfirmed;

    //@Column(name = "created_at")
    private Date createdAt;

    //@Column(name = "updated_at")
    private Date updatedAt;

    //@Column(name = "deleted_at")
    private Date deletedAt;

    /**
     * 所在省份，关联provinces.id
     */
    //@Column(name = "province_id")
    private Integer provinceId;

    /**
     * 所属城市，关联cities.id
     */
    //@Column(name = "city_id")
    private Integer cityId;

    /**
     * 所属区域，关联districts.id
     */
    //@Column(name = "district_id")
    private Integer districtId;

    /**
     * 用户地址
     */
    private String address;

    //@Column(name = "community_id")
    private Integer communityId;

    //@Column(name = "api_updated_at")
    private Date apiUpdatedAt;

    private String apikey;

    private Integer location;

    /**
     * m_relation中的id,默认合作方式为:4合作
     */
    //@Column(name = "relation_id")
    private Integer relationId;

    /**
     * 自己邀请码
     */
    //@Column(name = "invite_code")
    private String inviteCode;

    /**
     * 默认收货地址ID
     */
    //@Column(name = "default_consignee_addresses_id")
    private Integer defaultConsigneeAddressesId;

    /**
     * 邀请者的邀请码
     */
    //@Column(name = "inviter_code")
    private String inviterCode;

    /**
     * 行业ID
     */
    //@Column(name = "industry_id")
    private Integer industryId;

    /**
     * 来源ID
     */
    //@Column(name = "source_id")
    private Integer sourceId;

    /**
     * 用户测评
     */
    private String comment;

    /**
     * 跟进人
     */
    //@Column(name = "followed_by")
    private Integer followedBy;

    /**
     * 消费积分数
     */
    //@Column(name = "consumption_point")
    private Integer consumptionPoint;

    /**
     * 注册方式
     */
    private String channel;

    /**
     * 总收入
     */
    private BigDecimal income;

    /**
     * 单量
     */
    //@Column(name = "count_of_order")
    private Integer countOfOrder;

    /**
     * 钉钉用户id
     */
    //@Column(name = "ding_user_id")
    private String dingUserId;

    /**
     * 用户头像
     */
    private String avatar;

    /**
     * 公司推广方式ID
     */
    //@Column(name = "spread_way_id")
    private Short spreadWayId;

    /**
     * 微信用户企业唯一标识
     */
    //@Column(name = "wechat_unionid")
    private String wechatUnionid;

    /**
     * 微信生成带参数的二维码时产生的ticket(https://mp.weixin.qq.com/wiki?t=resource/res_main&id=mp1443433542&token=&lang=zh_CN)
     */
    //@Column(name = "wechat_ticket")
    private String wechatTicket;

    /**
     * 预约签约状态
     */
    //@Column(name = "appointment_sign_status")
    private Byte appointmentSignStatus;

    /**
     * 用户来源的URL
     */
    //@Column(name = "url_from")
    private String urlFrom;

    /**
     * 地推频率,见m_pushing_frequency_levels表
     */
    //@Column(name = "pushing_frequency_level_id")
    private Integer pushingFrequencyLevelId;

    /**
     * 申请签约时间
     */
    //@Column(name = "appointment_sign_at")
    private Date appointmentSignAt;

    /**
     * 需求面积
     */
    //@Column(name = "demand_area")
    private BigDecimal demandArea;

    /**
     * 公司能接受的最低价格（单位：元）
     */
    //@Column(name = "acceptable_minimum_price")
    private BigDecimal acceptableMinimumPrice;

    /**
     * 公司能接受的最高价格（单位：元）
     */
    //@Column(name = "acceptable_maximum_price")
    private BigDecimal acceptableMaximumPrice;

    /**
     * 特征描述
     */
    //@Column(name = "feature_description")
    private String featureDescription;

    /**
     * 成长值
     */
    //@Column(name = "growth_value")
    private Integer growthValue;

    /**
     * 会员等级ID
     */
    //@Column(name = "membership_level_id")
    private Byte membershipLevelId;

    /**
     * 用户会员等级更新时间
     */
    //@Column(name = "grading_at")
    private Date gradingAt;

    /**
     * 营业执照的URL
     */
    //@Column(name = "cert_url")
    private String certUrl;

    /**
     * 场地意向其他需求
     */
    //@Column(name = "other_requirement")
    private String otherRequirement;

    /**
     * 场地意目标人群性别倾向(0:不限，1:男性，2:女性)
     */
    //@Column(name = "gender_tendency")
    private Integer genderTendency;

    /**
     * 场地意向需求最大面积（单位：米，精确到小数点后两位）
     */
    //@Column(name = "demand_max_area")
    private BigDecimal demandMaxArea;

    /**
     * 用户最后一次上线时间
     */
    //@Column(name = "last_online")
    private Date lastOnline;

    /**
     * QQ互联返回的id
     */
    //@Column(name = "qq_login_id")
    private String qqLoginId;

    /**
     * 下单须知 ：0/未标记  1/已标记
     */
    //@Column(name = "ordering_noticed")
    private Byte orderingNoticed;

    /**
     * 是否接受公众号消息提醒:1接受 0不接受
     */
    //@Column(name = "accept_wechat_notice")
    private Byte acceptWechatNotice;

    /**
     * 用户最近下单时间
     */
    //@Column(name = "last_order")
    private Date lastOrder;

    /**
     * 最后登录时间(与最后一条登录记录时间一致)
     */
    //@Column(name = "last_login_time")
    private Date lastLoginTime;

    /**
     * 用户最近售出时间
     */
    //@Column(name = "last_sold")
    private Date lastSold;

    /**
     * 用户最近发布资源时间
     */
    //@Column(name = "last_push")
    private Date lastPush;

    /**
     * 用户成交的单量
     */
    //@Column(name = "order_count")
    private Integer orderCount;

    /**
     * 用户成交的交易额
     */
    //@Column(name = "sale_amount")
    private BigDecimal saleAmount;

    /**
     * 是否邮箱验证(0:否,1:是)
     */
    private Byte verified;

    /**
     * 邮件发送时间
     */
    //@Column(name = "email_at")
    private Date emailAt;

    /**
     * 邮箱注册后，是否发放优惠券
     */
    //@Column(name = "is_coupon")
    private Byte isCoupon;

    /**
     * 通过订单数
     */
    //@Column(name = "approved_order")
    private Integer approvedOrder;

    /**
     * 拒绝订单数
     */
    //@Column(name = "rejected_order")
    private Integer rejectedOrder;

    /**
     * 创建场地数
     */
    private Integer site;

    /**
     * 创建展位数
     */
    private Integer booth;

    /**
     * 创建供给数
     */
    private Integer supply;

    /**
     * 活跃天数
     */
    private Integer active;

    /**
     * 优质供应商 1：月结  2：非月结
     */
    private Byte excellent;

    /**
     * 供应商自主审核的订单数
     */
    //@Column(name = "approved_order_count")
    private Integer approvedOrderCount;

    /**
     * 是否订阅邮箱推送 0：否  1：是
     */
    //@Column(name = "is_subscribe")
    private Byte isSubscribe;

    /**
     * 用户首次成交订单的时间
     */
    //@Column(name = "first_order_at")
    private Date firstOrderAt;

    /**
     * 15年的交易额
     */
    //@Column(name = "year_15_amount")
    private BigDecimal year15Amount;

    /**
     * 16年的交易额
     */
    //@Column(name = "year_16_amount")
    private BigDecimal year16Amount;

    /**
     * 17年的交易额
     */
    //@Column(name = "year_17_amount")
    private BigDecimal year17Amount;

    /**
     * 18年的交易额
     */
    //@Column(name = "year_18_amount")
    private BigDecimal year18Amount;

    /**
     * 19年的交易额
     */
    //@Column(name = "year_19_amount")
    private BigDecimal year19Amount;

    /**
     * 20年的交易额
     */
    //@Column(name = "year_20_amount")
    private BigDecimal year20Amount;

    /**
     * 是否隐藏用户页面上的金额（1是）
     */
    //@Column(name = "is_hide_money")
    private Byte isHideMoney;

    /**
     * EBooking小程序的openid
     */
    //@Column(name = "ebooking_openid")
    private String ebookingOpenid;

    /**
     * 近30天用户已成交大订单数
     */
    //@Column(name = "monthly_order_count")
    private Integer monthlyOrderCount;

    /**
     * 近30天用户成交场次
     */
    //@Column(name = "monthly_community_times")
    private Integer monthlyCommunityTimes;

    /**
     * 近6个月用户购买场次
     */
    //@Column(name = "half_year_community_times")
    private Integer halfYearCommunityTimes;

    /**
     * 近30天用户自主发布场地数
     */
    //@Column(name = "monthly_community_count")
    private Integer monthlyCommunityCount;

    /**
     * 近30天用户自主审核订单数
     */
    //@Column(name = "monthly_approved_on_self")
    private Integer monthlyApprovedOnSelf;

    /**
     * 近30天用户活跃天数
     */
    //@Column(name = "monthly_activity_days")
    private Integer monthlyActivityDays;

    /**
     * 近90天用户活跃天数
     */
    //@Column(name = "quarter_activity_days")
    private Integer quarterActivityDays;

    /**
     * 近30天用户累计交易额
     */
    //@Column(name = "monthly_sales_amount")
    private BigDecimal monthlySalesAmount;

    /**
     * 用户成交的总交易额
     */
    //@Column(name = "sales_amount")
    private BigDecimal salesAmount;

    /**
     * 用户成交且审核通过的总单量（主订单）
     */
    //@Column(name = "field_order_count")
    private Integer fieldOrderCount;

    /**
     * 企点
     */
    //@Column(name = "biz_point")
    private Integer bizPoint;

    /**
     * 已使用的企点数量
     */
    //@Column(name = "point_used")
    private Integer pointUsed;

    /**
     * 充值的企点数量
     */
    //@Column(name = "point_charge")
    private Integer pointCharge;

    /**
     * 是否是location用户  1：是  0：否
     */
    //@Column(name = "is_location")
    private Byte isLocation;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取角色id，非后台权限管理中的角色。关联roles.id
     *
     * @return role_id - 角色id，非后台权限管理中的角色。关联roles.id
     */
    public Integer getRoleId() {
        return roleId;
    }

    /**
     * 设置角色id，非后台权限管理中的角色。关联roles.id
     *
     * @param roleId 角色id，非后台权限管理中的角色。关联roles.id
     */
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    /**
     * 获取是否是邻汇吧员工标识，1：邻汇吧员工 0：非邻汇吧员工
     *
     * @return is_linhui - 是否是邻汇吧员工标识，1：邻汇吧员工 0：非邻汇吧员工
     */
    public Byte getIsLinhui() {
        return isLinhui;
    }

    /**
     * 设置是否是邻汇吧员工标识，1：邻汇吧员工 0：非邻汇吧员工
     *
     * @param isLinhui 是否是邻汇吧员工标识，1：邻汇吧员工 0：非邻汇吧员工
     */
    public void setIsLinhui(Byte isLinhui) {
        this.isLinhui = isLinhui;
    }

    /**
     * @return tag
     */
    public String getTag() {
        return tag;
    }

    /**
     * @param tag
     */
    public void setTag(String tag) {
        this.tag = tag == null ? null : tag.trim();
    }

    /**
     * 获取用户真实姓名
     *
     * @return name - 用户真实姓名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置用户真实姓名
     *
     * @param name 用户真实姓名
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取用户名，注册账号时填的用户名。
     *
     * @return username - 用户名，注册账号时填的用户名。
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置用户名，注册账号时填的用户名。
     *
     * @param username 用户名，注册账号时填的用户名。
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * 获取所属企业，用户在企业认证后，认证的企业名称会自动同步到此字段
     *
     * @return company - 所属企业，用户在企业认证后，认证的企业名称会自动同步到此字段
     */
    public String getCompany() {
        return company;
    }

    /**
     * 设置所属企业，用户在企业认证后，认证的企业名称会自动同步到此字段
     *
     * @param company 所属企业，用户在企业认证后，认证的企业名称会自动同步到此字段
     */
    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }

    /**
     * 获取产品名称
     *
     * @return product - 产品名称
     */
    public String getProduct() {
        return product;
    }

    /**
     * 设置产品名称
     *
     * @param product 产品名称
     */
    public void setProduct(String product) {
        this.product = product == null ? null : product.trim();
    }

    /**
     * 获取微信登录后的唯一标识
     *
     * @return wechat_openid - 微信登录后的唯一标识
     */
    public String getWechatOpenid() {
        return wechatOpenid;
    }

    /**
     * 设置微信登录后的唯一标识
     *
     * @param wechatOpenid 微信登录后的唯一标识
     */
    public void setWechatOpenid(String wechatOpenid) {
        this.wechatOpenid = wechatOpenid == null ? null : wechatOpenid.trim();
    }

    /**
     * 获取手机号
     *
     * @return mobile - 手机号
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * 设置手机号
     *
     * @param mobile 手机号
     */
    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    /**
     * 获取邮箱
     *
     * @return email - 邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置邮箱
     *
     * @param email 邮箱
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * @return remember_token
     */
    public String getRememberToken() {
        return rememberToken;
    }

    /**
     * @param rememberToken
     */
    public void setRememberToken(String rememberToken) {
        this.rememberToken = rememberToken == null ? null : rememberToken.trim();
    }

    /**
     * @return comfirmed
     */
    public Integer getComfirmed() {
        return comfirmed;
    }

    /**
     * @param comfirmed
     */
    public void setComfirmed(Integer comfirmed) {
        this.comfirmed = comfirmed;
    }

    /**
     * @return created_at
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * @param createdAt
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * @return updated_at
     */
    public Date getUpdatedAt() {
        return updatedAt;
    }

    /**
     * @param updatedAt
     */
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * @return deleted_at
     */
    public Date getDeletedAt() {
        return deletedAt;
    }

    /**
     * @param deletedAt
     */
    public void setDeletedAt(Date deletedAt) {
        this.deletedAt = deletedAt;
    }

    /**
     * 获取所在省份，关联provinces.id
     *
     * @return province_id - 所在省份，关联provinces.id
     */
    public Integer getProvinceId() {
        return provinceId;
    }

    /**
     * 设置所在省份，关联provinces.id
     *
     * @param provinceId 所在省份，关联provinces.id
     */
    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }

    /**
     * 获取所属城市，关联cities.id
     *
     * @return city_id - 所属城市，关联cities.id
     */
    public Integer getCityId() {
        return cityId;
    }

    /**
     * 设置所属城市，关联cities.id
     *
     * @param cityId 所属城市，关联cities.id
     */
    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    /**
     * 获取所属区域，关联districts.id
     *
     * @return district_id - 所属区域，关联districts.id
     */
    public Integer getDistrictId() {
        return districtId;
    }

    /**
     * 设置所属区域，关联districts.id
     *
     * @param districtId 所属区域，关联districts.id
     */
    public void setDistrictId(Integer districtId) {
        this.districtId = districtId;
    }

    /**
     * 获取用户地址
     *
     * @return address - 用户地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置用户地址
     *
     * @param address 用户地址
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * @return community_id
     */
    public Integer getCommunityId() {
        return communityId;
    }

    /**
     * @param communityId
     */
    public void setCommunityId(Integer communityId) {
        this.communityId = communityId;
    }

    /**
     * @return api_updated_at
     */
    public Date getApiUpdatedAt() {
        return apiUpdatedAt;
    }

    /**
     * @param apiUpdatedAt
     */
    public void setApiUpdatedAt(Date apiUpdatedAt) {
        this.apiUpdatedAt = apiUpdatedAt;
    }

    /**
     * @return apikey
     */
    public String getApikey() {
        return apikey;
    }

    /**
     * @param apikey
     */
    public void setApikey(String apikey) {
        this.apikey = apikey == null ? null : apikey.trim();
    }

    /**
     * @return location
     */
    public Integer getLocation() {
        return location;
    }

    /**
     * @param location
     */
    public void setLocation(Integer location) {
        this.location = location;
    }

    /**
     * 获取m_relation中的id,默认合作方式为:4合作
     *
     * @return relation_id - m_relation中的id,默认合作方式为:4合作
     */
    public Integer getRelationId() {
        return relationId;
    }

    /**
     * 设置m_relation中的id,默认合作方式为:4合作
     *
     * @param relationId m_relation中的id,默认合作方式为:4合作
     */
    public void setRelationId(Integer relationId) {
        this.relationId = relationId;
    }

    /**
     * 获取自己邀请码
     *
     * @return invite_code - 自己邀请码
     */
    public String getInviteCode() {
        return inviteCode;
    }

    /**
     * 设置自己邀请码
     *
     * @param inviteCode 自己邀请码
     */
    public void setInviteCode(String inviteCode) {
        this.inviteCode = inviteCode == null ? null : inviteCode.trim();
    }

    /**
     * 获取默认收货地址ID
     *
     * @return default_consignee_addresses_id - 默认收货地址ID
     */
    public Integer getDefaultConsigneeAddressesId() {
        return defaultConsigneeAddressesId;
    }

    /**
     * 设置默认收货地址ID
     *
     * @param defaultConsigneeAddressesId 默认收货地址ID
     */
    public void setDefaultConsigneeAddressesId(Integer defaultConsigneeAddressesId) {
        this.defaultConsigneeAddressesId = defaultConsigneeAddressesId;
    }

    /**
     * 获取邀请者的邀请码
     *
     * @return inviter_code - 邀请者的邀请码
     */
    public String getInviterCode() {
        return inviterCode;
    }

    /**
     * 设置邀请者的邀请码
     *
     * @param inviterCode 邀请者的邀请码
     */
    public void setInviterCode(String inviterCode) {
        this.inviterCode = inviterCode == null ? null : inviterCode.trim();
    }

    /**
     * 获取行业ID
     *
     * @return industry_id - 行业ID
     */
    public Integer getIndustryId() {
        return industryId;
    }

    /**
     * 设置行业ID
     *
     * @param industryId 行业ID
     */
    public void setIndustryId(Integer industryId) {
        this.industryId = industryId;
    }

    /**
     * 获取来源ID
     *
     * @return source_id - 来源ID
     */
    public Integer getSourceId() {
        return sourceId;
    }

    /**
     * 设置来源ID
     *
     * @param sourceId 来源ID
     */
    public void setSourceId(Integer sourceId) {
        this.sourceId = sourceId;
    }

    /**
     * 获取用户测评
     *
     * @return comment - 用户测评
     */
    public String getComment() {
        return comment;
    }

    /**
     * 设置用户测评
     *
     * @param comment 用户测评
     */
    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }

    /**
     * 获取跟进人
     *
     * @return followed_by - 跟进人
     */
    public Integer getFollowedBy() {
        return followedBy;
    }

    /**
     * 设置跟进人
     *
     * @param followedBy 跟进人
     */
    public void setFollowedBy(Integer followedBy) {
        this.followedBy = followedBy;
    }

    /**
     * 获取消费积分数
     *
     * @return consumption_point - 消费积分数
     */
    public Integer getConsumptionPoint() {
        return consumptionPoint;
    }

    /**
     * 设置消费积分数
     *
     * @param consumptionPoint 消费积分数
     */
    public void setConsumptionPoint(Integer consumptionPoint) {
        this.consumptionPoint = consumptionPoint;
    }

    /**
     * 获取注册方式
     *
     * @return channel - 注册方式
     */
    public String getChannel() {
        return channel;
    }

    /**
     * 设置注册方式
     *
     * @param channel 注册方式
     */
    public void setChannel(String channel) {
        this.channel = channel == null ? null : channel.trim();
    }

    /**
     * 获取总收入
     *
     * @return income - 总收入
     */
    public BigDecimal getIncome() {
        return income;
    }

    /**
     * 设置总收入
     *
     * @param income 总收入
     */
    public void setIncome(BigDecimal income) {
        this.income = income;
    }

    /**
     * 获取单量
     *
     * @return count_of_order - 单量
     */
    public Integer getCountOfOrder() {
        return countOfOrder;
    }

    /**
     * 设置单量
     *
     * @param countOfOrder 单量
     */
    public void setCountOfOrder(Integer countOfOrder) {
        this.countOfOrder = countOfOrder;
    }

    /**
     * 获取钉钉用户id
     *
     * @return ding_user_id - 钉钉用户id
     */
    public String getDingUserId() {
        return dingUserId;
    }

    /**
     * 设置钉钉用户id
     *
     * @param dingUserId 钉钉用户id
     */
    public void setDingUserId(String dingUserId) {
        this.dingUserId = dingUserId == null ? null : dingUserId.trim();
    }

    /**
     * 获取用户头像
     *
     * @return avatar - 用户头像
     */
    public String getAvatar() {
        return avatar;
    }

    /**
     * 设置用户头像
     *
     * @param avatar 用户头像
     */
    public void setAvatar(String avatar) {
        this.avatar = avatar == null ? null : avatar.trim();
    }

    /**
     * 获取公司推广方式ID
     *
     * @return spread_way_id - 公司推广方式ID
     */
    public Short getSpreadWayId() {
        return spreadWayId;
    }

    /**
     * 设置公司推广方式ID
     *
     * @param spreadWayId 公司推广方式ID
     */
    public void setSpreadWayId(Short spreadWayId) {
        this.spreadWayId = spreadWayId;
    }

    /**
     * 获取微信用户企业唯一标识
     *
     * @return wechat_unionid - 微信用户企业唯一标识
     */
    public String getWechatUnionid() {
        return wechatUnionid;
    }

    /**
     * 设置微信用户企业唯一标识
     *
     * @param wechatUnionid 微信用户企业唯一标识
     */
    public void setWechatUnionid(String wechatUnionid) {
        this.wechatUnionid = wechatUnionid == null ? null : wechatUnionid.trim();
    }

    /**
     * 获取微信生成带参数的二维码时产生的ticket(https://mp.weixin.qq.com/wiki?t=resource/res_main&id=mp1443433542&token=&lang=zh_CN)
     *
     * @return wechat_ticket - 微信生成带参数的二维码时产生的ticket(https://mp.weixin.qq.com/wiki?t=resource/res_main&id=mp1443433542&token=&lang=zh_CN)
     */
    public String getWechatTicket() {
        return wechatTicket;
    }

    /**
     * 设置微信生成带参数的二维码时产生的ticket(https://mp.weixin.qq.com/wiki?t=resource/res_main&id=mp1443433542&token=&lang=zh_CN)
     *
     * @param wechatTicket 微信生成带参数的二维码时产生的ticket(https://mp.weixin.qq.com/wiki?t=resource/res_main&id=mp1443433542&token=&lang=zh_CN)
     */
    public void setWechatTicket(String wechatTicket) {
        this.wechatTicket = wechatTicket == null ? null : wechatTicket.trim();
    }

    /**
     * 获取预约签约状态
     *
     * @return appointment_sign_status - 预约签约状态
     */
    public Byte getAppointmentSignStatus() {
        return appointmentSignStatus;
    }

    /**
     * 设置预约签约状态
     *
     * @param appointmentSignStatus 预约签约状态
     */
    public void setAppointmentSignStatus(Byte appointmentSignStatus) {
        this.appointmentSignStatus = appointmentSignStatus;
    }

    /**
     * 获取用户来源的URL
     *
     * @return url_from - 用户来源的URL
     */
    public String getUrlFrom() {
        return urlFrom;
    }

    /**
     * 设置用户来源的URL
     *
     * @param urlFrom 用户来源的URL
     */
    public void setUrlFrom(String urlFrom) {
        this.urlFrom = urlFrom == null ? null : urlFrom.trim();
    }

    /**
     * 获取地推频率,见m_pushing_frequency_levels表
     *
     * @return pushing_frequency_level_id - 地推频率,见m_pushing_frequency_levels表
     */
    public Integer getPushingFrequencyLevelId() {
        return pushingFrequencyLevelId;
    }

    /**
     * 设置地推频率,见m_pushing_frequency_levels表
     *
     * @param pushingFrequencyLevelId 地推频率,见m_pushing_frequency_levels表
     */
    public void setPushingFrequencyLevelId(Integer pushingFrequencyLevelId) {
        this.pushingFrequencyLevelId = pushingFrequencyLevelId;
    }

    /**
     * 获取申请签约时间
     *
     * @return appointment_sign_at - 申请签约时间
     */
    public Date getAppointmentSignAt() {
        return appointmentSignAt;
    }

    /**
     * 设置申请签约时间
     *
     * @param appointmentSignAt 申请签约时间
     */
    public void setAppointmentSignAt(Date appointmentSignAt) {
        this.appointmentSignAt = appointmentSignAt;
    }

    /**
     * 获取需求面积
     *
     * @return demand_area - 需求面积
     */
    public BigDecimal getDemandArea() {
        return demandArea;
    }

    /**
     * 设置需求面积
     *
     * @param demandArea 需求面积
     */
    public void setDemandArea(BigDecimal demandArea) {
        this.demandArea = demandArea;
    }

    /**
     * 获取公司能接受的最低价格（单位：元）
     *
     * @return acceptable_minimum_price - 公司能接受的最低价格（单位：元）
     */
    public BigDecimal getAcceptableMinimumPrice() {
        return acceptableMinimumPrice;
    }

    /**
     * 设置公司能接受的最低价格（单位：元）
     *
     * @param acceptableMinimumPrice 公司能接受的最低价格（单位：元）
     */
    public void setAcceptableMinimumPrice(BigDecimal acceptableMinimumPrice) {
        this.acceptableMinimumPrice = acceptableMinimumPrice;
    }

    /**
     * 获取公司能接受的最高价格（单位：元）
     *
     * @return acceptable_maximum_price - 公司能接受的最高价格（单位：元）
     */
    public BigDecimal getAcceptableMaximumPrice() {
        return acceptableMaximumPrice;
    }

    /**
     * 设置公司能接受的最高价格（单位：元）
     *
     * @param acceptableMaximumPrice 公司能接受的最高价格（单位：元）
     */
    public void setAcceptableMaximumPrice(BigDecimal acceptableMaximumPrice) {
        this.acceptableMaximumPrice = acceptableMaximumPrice;
    }

    /**
     * 获取特征描述
     *
     * @return feature_description - 特征描述
     */
    public String getFeatureDescription() {
        return featureDescription;
    }

    /**
     * 设置特征描述
     *
     * @param featureDescription 特征描述
     */
    public void setFeatureDescription(String featureDescription) {
        this.featureDescription = featureDescription == null ? null : featureDescription.trim();
    }

    /**
     * 获取成长值
     *
     * @return growth_value - 成长值
     */
    public Integer getGrowthValue() {
        return growthValue;
    }

    /**
     * 设置成长值
     *
     * @param growthValue 成长值
     */
    public void setGrowthValue(Integer growthValue) {
        this.growthValue = growthValue;
    }

    /**
     * 获取会员等级ID
     *
     * @return membership_level_id - 会员等级ID
     */
    public Byte getMembershipLevelId() {
        return membershipLevelId;
    }

    /**
     * 设置会员等级ID
     *
     * @param membershipLevelId 会员等级ID
     */
    public void setMembershipLevelId(Byte membershipLevelId) {
        this.membershipLevelId = membershipLevelId;
    }

    /**
     * 获取用户会员等级更新时间
     *
     * @return grading_at - 用户会员等级更新时间
     */
    public Date getGradingAt() {
        return gradingAt;
    }

    /**
     * 设置用户会员等级更新时间
     *
     * @param gradingAt 用户会员等级更新时间
     */
    public void setGradingAt(Date gradingAt) {
        this.gradingAt = gradingAt;
    }

    /**
     * 获取营业执照的URL
     *
     * @return cert_url - 营业执照的URL
     */
    public String getCertUrl() {
        return certUrl;
    }

    /**
     * 设置营业执照的URL
     *
     * @param certUrl 营业执照的URL
     */
    public void setCertUrl(String certUrl) {
        this.certUrl = certUrl == null ? null : certUrl.trim();
    }

    /**
     * 获取场地意向其他需求
     *
     * @return other_requirement - 场地意向其他需求
     */
    public String getOtherRequirement() {
        return otherRequirement;
    }

    /**
     * 设置场地意向其他需求
     *
     * @param otherRequirement 场地意向其他需求
     */
    public void setOtherRequirement(String otherRequirement) {
        this.otherRequirement = otherRequirement == null ? null : otherRequirement.trim();
    }

    /**
     * 获取场地意目标人群性别倾向(0:不限，1:男性，2:女性)
     *
     * @return gender_tendency - 场地意目标人群性别倾向(0:不限，1:男性，2:女性)
     */
    public Integer getGenderTendency() {
        return genderTendency;
    }

    /**
     * 设置场地意目标人群性别倾向(0:不限，1:男性，2:女性)
     *
     * @param genderTendency 场地意目标人群性别倾向(0:不限，1:男性，2:女性)
     */
    public void setGenderTendency(Integer genderTendency) {
        this.genderTendency = genderTendency;
    }

    /**
     * 获取场地意向需求最大面积（单位：米，精确到小数点后两位）
     *
     * @return demand_max_area - 场地意向需求最大面积（单位：米，精确到小数点后两位）
     */
    public BigDecimal getDemandMaxArea() {
        return demandMaxArea;
    }

    /**
     * 设置场地意向需求最大面积（单位：米，精确到小数点后两位）
     *
     * @param demandMaxArea 场地意向需求最大面积（单位：米，精确到小数点后两位）
     */
    public void setDemandMaxArea(BigDecimal demandMaxArea) {
        this.demandMaxArea = demandMaxArea;
    }

    /**
     * 获取用户最后一次上线时间
     *
     * @return last_online - 用户最后一次上线时间
     */
    public Date getLastOnline() {
        return lastOnline;
    }

    /**
     * 设置用户最后一次上线时间
     *
     * @param lastOnline 用户最后一次上线时间
     */
    public void setLastOnline(Date lastOnline) {
        this.lastOnline = lastOnline;
    }

    /**
     * 获取QQ互联返回的id
     *
     * @return qq_login_id - QQ互联返回的id
     */
    public String getQqLoginId() {
        return qqLoginId;
    }

    /**
     * 设置QQ互联返回的id
     *
     * @param qqLoginId QQ互联返回的id
     */
    public void setQqLoginId(String qqLoginId) {
        this.qqLoginId = qqLoginId == null ? null : qqLoginId.trim();
    }

    /**
     * 获取下单须知 ：0/未标记  1/已标记
     *
     * @return ordering_noticed - 下单须知 ：0/未标记  1/已标记
     */
    public Byte getOrderingNoticed() {
        return orderingNoticed;
    }

    /**
     * 设置下单须知 ：0/未标记  1/已标记
     *
     * @param orderingNoticed 下单须知 ：0/未标记  1/已标记
     */
    public void setOrderingNoticed(Byte orderingNoticed) {
        this.orderingNoticed = orderingNoticed;
    }

    /**
     * 获取是否接受公众号消息提醒:1接受 0不接受
     *
     * @return accept_wechat_notice - 是否接受公众号消息提醒:1接受 0不接受
     */
    public Byte getAcceptWechatNotice() {
        return acceptWechatNotice;
    }

    /**
     * 设置是否接受公众号消息提醒:1接受 0不接受
     *
     * @param acceptWechatNotice 是否接受公众号消息提醒:1接受 0不接受
     */
    public void setAcceptWechatNotice(Byte acceptWechatNotice) {
        this.acceptWechatNotice = acceptWechatNotice;
    }

    /**
     * 获取用户最近下单时间
     *
     * @return last_order - 用户最近下单时间
     */
    public Date getLastOrder() {
        return lastOrder;
    }

    /**
     * 设置用户最近下单时间
     *
     * @param lastOrder 用户最近下单时间
     */
    public void setLastOrder(Date lastOrder) {
        this.lastOrder = lastOrder;
    }

    /**
     * 获取最后登录时间(与最后一条登录记录时间一致)
     *
     * @return last_login_time - 最后登录时间(与最后一条登录记录时间一致)
     */
    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    /**
     * 设置最后登录时间(与最后一条登录记录时间一致)
     *
     * @param lastLoginTime 最后登录时间(与最后一条登录记录时间一致)
     */
    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    /**
     * 获取用户最近售出时间
     *
     * @return last_sold - 用户最近售出时间
     */
    public Date getLastSold() {
        return lastSold;
    }

    /**
     * 设置用户最近售出时间
     *
     * @param lastSold 用户最近售出时间
     */
    public void setLastSold(Date lastSold) {
        this.lastSold = lastSold;
    }

    /**
     * 获取用户最近发布资源时间
     *
     * @return last_push - 用户最近发布资源时间
     */
    public Date getLastPush() {
        return lastPush;
    }

    /**
     * 设置用户最近发布资源时间
     *
     * @param lastPush 用户最近发布资源时间
     */
    public void setLastPush(Date lastPush) {
        this.lastPush = lastPush;
    }

    /**
     * 获取用户成交的单量
     *
     * @return order_count - 用户成交的单量
     */
    public Integer getOrderCount() {
        return orderCount;
    }

    /**
     * 设置用户成交的单量
     *
     * @param orderCount 用户成交的单量
     */
    public void setOrderCount(Integer orderCount) {
        this.orderCount = orderCount;
    }

    /**
     * 获取用户成交的交易额
     *
     * @return sale_amount - 用户成交的交易额
     */
    public BigDecimal getSaleAmount() {
        return saleAmount;
    }

    /**
     * 设置用户成交的交易额
     *
     * @param saleAmount 用户成交的交易额
     */
    public void setSaleAmount(BigDecimal saleAmount) {
        this.saleAmount = saleAmount;
    }

    /**
     * 获取是否邮箱验证(0:否,1:是)
     *
     * @return verified - 是否邮箱验证(0:否,1:是)
     */
    public Byte getVerified() {
        return verified;
    }

    /**
     * 设置是否邮箱验证(0:否,1:是)
     *
     * @param verified 是否邮箱验证(0:否,1:是)
     */
    public void setVerified(Byte verified) {
        this.verified = verified;
    }

    /**
     * 获取邮件发送时间
     *
     * @return email_at - 邮件发送时间
     */
    public Date getEmailAt() {
        return emailAt;
    }

    /**
     * 设置邮件发送时间
     *
     * @param emailAt 邮件发送时间
     */
    public void setEmailAt(Date emailAt) {
        this.emailAt = emailAt;
    }

    /**
     * 获取邮箱注册后，是否发放优惠券
     *
     * @return is_coupon - 邮箱注册后，是否发放优惠券
     */
    public Byte getIsCoupon() {
        return isCoupon;
    }

    /**
     * 设置邮箱注册后，是否发放优惠券
     *
     * @param isCoupon 邮箱注册后，是否发放优惠券
     */
    public void setIsCoupon(Byte isCoupon) {
        this.isCoupon = isCoupon;
    }

    /**
     * 获取通过订单数
     *
     * @return approved_order - 通过订单数
     */
    public Integer getApprovedOrder() {
        return approvedOrder;
    }

    /**
     * 设置通过订单数
     *
     * @param approvedOrder 通过订单数
     */
    public void setApprovedOrder(Integer approvedOrder) {
        this.approvedOrder = approvedOrder;
    }

    /**
     * 获取拒绝订单数
     *
     * @return rejected_order - 拒绝订单数
     */
    public Integer getRejectedOrder() {
        return rejectedOrder;
    }

    /**
     * 设置拒绝订单数
     *
     * @param rejectedOrder 拒绝订单数
     */
    public void setRejectedOrder(Integer rejectedOrder) {
        this.rejectedOrder = rejectedOrder;
    }

    /**
     * 获取创建场地数
     *
     * @return site - 创建场地数
     */
    public Integer getSite() {
        return site;
    }

    /**
     * 设置创建场地数
     *
     * @param site 创建场地数
     */
    public void setSite(Integer site) {
        this.site = site;
    }

    /**
     * 获取创建展位数
     *
     * @return booth - 创建展位数
     */
    public Integer getBooth() {
        return booth;
    }

    /**
     * 设置创建展位数
     *
     * @param booth 创建展位数
     */
    public void setBooth(Integer booth) {
        this.booth = booth;
    }

    /**
     * 获取创建供给数
     *
     * @return supply - 创建供给数
     */
    public Integer getSupply() {
        return supply;
    }

    /**
     * 设置创建供给数
     *
     * @param supply 创建供给数
     */
    public void setSupply(Integer supply) {
        this.supply = supply;
    }

    /**
     * 获取活跃天数
     *
     * @return active - 活跃天数
     */
    public Integer getActive() {
        return active;
    }

    /**
     * 设置活跃天数
     *
     * @param active 活跃天数
     */
    public void setActive(Integer active) {
        this.active = active;
    }

    /**
     * 获取优质供应商 1：月结  2：非月结
     *
     * @return excellent - 优质供应商 1：月结  2：非月结
     */
    public Byte getExcellent() {
        return excellent;
    }

    /**
     * 设置优质供应商 1：月结  2：非月结
     *
     * @param excellent 优质供应商 1：月结  2：非月结
     */
    public void setExcellent(Byte excellent) {
        this.excellent = excellent;
    }

    /**
     * 获取供应商自主审核的订单数
     *
     * @return approved_order_count - 供应商自主审核的订单数
     */
    public Integer getApprovedOrderCount() {
        return approvedOrderCount;
    }

    /**
     * 设置供应商自主审核的订单数
     *
     * @param approvedOrderCount 供应商自主审核的订单数
     */
    public void setApprovedOrderCount(Integer approvedOrderCount) {
        this.approvedOrderCount = approvedOrderCount;
    }

    /**
     * 获取是否订阅邮箱推送 0：否  1：是
     *
     * @return is_subscribe - 是否订阅邮箱推送 0：否  1：是
     */
    public Byte getIsSubscribe() {
        return isSubscribe;
    }

    /**
     * 设置是否订阅邮箱推送 0：否  1：是
     *
     * @param isSubscribe 是否订阅邮箱推送 0：否  1：是
     */
    public void setIsSubscribe(Byte isSubscribe) {
        this.isSubscribe = isSubscribe;
    }

    /**
     * 获取用户首次成交订单的时间
     *
     * @return first_order_at - 用户首次成交订单的时间
     */
    public Date getFirstOrderAt() {
        return firstOrderAt;
    }

    /**
     * 设置用户首次成交订单的时间
     *
     * @param firstOrderAt 用户首次成交订单的时间
     */
    public void setFirstOrderAt(Date firstOrderAt) {
        this.firstOrderAt = firstOrderAt;
    }

    /**
     * 获取15年的交易额
     *
     * @return year_15_amount - 15年的交易额
     */
    public BigDecimal getYear15Amount() {
        return year15Amount;
    }

    /**
     * 设置15年的交易额
     *
     * @param year15Amount 15年的交易额
     */
    public void setYear15Amount(BigDecimal year15Amount) {
        this.year15Amount = year15Amount;
    }

    /**
     * 获取16年的交易额
     *
     * @return year_16_amount - 16年的交易额
     */
    public BigDecimal getYear16Amount() {
        return year16Amount;
    }

    /**
     * 设置16年的交易额
     *
     * @param year16Amount 16年的交易额
     */
    public void setYear16Amount(BigDecimal year16Amount) {
        this.year16Amount = year16Amount;
    }

    /**
     * 获取17年的交易额
     *
     * @return year_17_amount - 17年的交易额
     */
    public BigDecimal getYear17Amount() {
        return year17Amount;
    }

    /**
     * 设置17年的交易额
     *
     * @param year17Amount 17年的交易额
     */
    public void setYear17Amount(BigDecimal year17Amount) {
        this.year17Amount = year17Amount;
    }

    /**
     * 获取18年的交易额
     *
     * @return year_18_amount - 18年的交易额
     */
    public BigDecimal getYear18Amount() {
        return year18Amount;
    }

    /**
     * 设置18年的交易额
     *
     * @param year18Amount 18年的交易额
     */
    public void setYear18Amount(BigDecimal year18Amount) {
        this.year18Amount = year18Amount;
    }

    /**
     * 获取19年的交易额
     *
     * @return year_19_amount - 19年的交易额
     */
    public BigDecimal getYear19Amount() {
        return year19Amount;
    }

    /**
     * 设置19年的交易额
     *
     * @param year19Amount 19年的交易额
     */
    public void setYear19Amount(BigDecimal year19Amount) {
        this.year19Amount = year19Amount;
    }

    /**
     * 获取20年的交易额
     *
     * @return year_20_amount - 20年的交易额
     */
    public BigDecimal getYear20Amount() {
        return year20Amount;
    }

    /**
     * 设置20年的交易额
     *
     * @param year20Amount 20年的交易额
     */
    public void setYear20Amount(BigDecimal year20Amount) {
        this.year20Amount = year20Amount;
    }

    /**
     * 获取是否隐藏用户页面上的金额（1是）
     *
     * @return is_hide_money - 是否隐藏用户页面上的金额（1是）
     */
    public Byte getIsHideMoney() {
        return isHideMoney;
    }

    /**
     * 设置是否隐藏用户页面上的金额（1是）
     *
     * @param isHideMoney 是否隐藏用户页面上的金额（1是）
     */
    public void setIsHideMoney(Byte isHideMoney) {
        this.isHideMoney = isHideMoney;
    }

    /**
     * 获取EBooking小程序的openid
     *
     * @return ebooking_openid - EBooking小程序的openid
     */
    public String getEbookingOpenid() {
        return ebookingOpenid;
    }

    /**
     * 设置EBooking小程序的openid
     *
     * @param ebookingOpenid EBooking小程序的openid
     */
    public void setEbookingOpenid(String ebookingOpenid) {
        this.ebookingOpenid = ebookingOpenid == null ? null : ebookingOpenid.trim();
    }

    /**
     * 获取近30天用户已成交大订单数
     *
     * @return monthly_order_count - 近30天用户已成交大订单数
     */
    public Integer getMonthlyOrderCount() {
        return monthlyOrderCount;
    }

    /**
     * 设置近30天用户已成交大订单数
     *
     * @param monthlyOrderCount 近30天用户已成交大订单数
     */
    public void setMonthlyOrderCount(Integer monthlyOrderCount) {
        this.monthlyOrderCount = monthlyOrderCount;
    }

    /**
     * 获取近30天用户成交场次
     *
     * @return monthly_community_times - 近30天用户成交场次
     */
    public Integer getMonthlyCommunityTimes() {
        return monthlyCommunityTimes;
    }

    /**
     * 设置近30天用户成交场次
     *
     * @param monthlyCommunityTimes 近30天用户成交场次
     */
    public void setMonthlyCommunityTimes(Integer monthlyCommunityTimes) {
        this.monthlyCommunityTimes = monthlyCommunityTimes;
    }

    /**
     * 获取近6个月用户购买场次
     *
     * @return half_year_community_times - 近6个月用户购买场次
     */
    public Integer getHalfYearCommunityTimes() {
        return halfYearCommunityTimes;
    }

    /**
     * 设置近6个月用户购买场次
     *
     * @param halfYearCommunityTimes 近6个月用户购买场次
     */
    public void setHalfYearCommunityTimes(Integer halfYearCommunityTimes) {
        this.halfYearCommunityTimes = halfYearCommunityTimes;
    }

    /**
     * 获取近30天用户自主发布场地数
     *
     * @return monthly_community_count - 近30天用户自主发布场地数
     */
    public Integer getMonthlyCommunityCount() {
        return monthlyCommunityCount;
    }

    /**
     * 设置近30天用户自主发布场地数
     *
     * @param monthlyCommunityCount 近30天用户自主发布场地数
     */
    public void setMonthlyCommunityCount(Integer monthlyCommunityCount) {
        this.monthlyCommunityCount = monthlyCommunityCount;
    }

    /**
     * 获取近30天用户自主审核订单数
     *
     * @return monthly_approved_on_self - 近30天用户自主审核订单数
     */
    public Integer getMonthlyApprovedOnSelf() {
        return monthlyApprovedOnSelf;
    }

    /**
     * 设置近30天用户自主审核订单数
     *
     * @param monthlyApprovedOnSelf 近30天用户自主审核订单数
     */
    public void setMonthlyApprovedOnSelf(Integer monthlyApprovedOnSelf) {
        this.monthlyApprovedOnSelf = monthlyApprovedOnSelf;
    }

    /**
     * 获取近30天用户活跃天数
     *
     * @return monthly_activity_days - 近30天用户活跃天数
     */
    public Integer getMonthlyActivityDays() {
        return monthlyActivityDays;
    }

    /**
     * 设置近30天用户活跃天数
     *
     * @param monthlyActivityDays 近30天用户活跃天数
     */
    public void setMonthlyActivityDays(Integer monthlyActivityDays) {
        this.monthlyActivityDays = monthlyActivityDays;
    }

    /**
     * 获取近90天用户活跃天数
     *
     * @return quarter_activity_days - 近90天用户活跃天数
     */
    public Integer getQuarterActivityDays() {
        return quarterActivityDays;
    }

    /**
     * 设置近90天用户活跃天数
     *
     * @param quarterActivityDays 近90天用户活跃天数
     */
    public void setQuarterActivityDays(Integer quarterActivityDays) {
        this.quarterActivityDays = quarterActivityDays;
    }

    /**
     * 获取近30天用户累计交易额
     *
     * @return monthly_sales_amount - 近30天用户累计交易额
     */
    public BigDecimal getMonthlySalesAmount() {
        return monthlySalesAmount;
    }

    /**
     * 设置近30天用户累计交易额
     *
     * @param monthlySalesAmount 近30天用户累计交易额
     */
    public void setMonthlySalesAmount(BigDecimal monthlySalesAmount) {
        this.monthlySalesAmount = monthlySalesAmount;
    }

    /**
     * 获取用户成交的总交易额
     *
     * @return sales_amount - 用户成交的总交易额
     */
    public BigDecimal getSalesAmount() {
        return salesAmount;
    }

    /**
     * 设置用户成交的总交易额
     *
     * @param salesAmount 用户成交的总交易额
     */
    public void setSalesAmount(BigDecimal salesAmount) {
        this.salesAmount = salesAmount;
    }

    /**
     * 获取用户成交且审核通过的总单量（主订单）
     *
     * @return field_order_count - 用户成交且审核通过的总单量（主订单）
     */
    public Integer getFieldOrderCount() {
        return fieldOrderCount;
    }

    /**
     * 设置用户成交且审核通过的总单量（主订单）
     *
     * @param fieldOrderCount 用户成交且审核通过的总单量（主订单）
     */
    public void setFieldOrderCount(Integer fieldOrderCount) {
        this.fieldOrderCount = fieldOrderCount;
    }

    /**
     * 获取企点
     *
     * @return biz_point - 企点
     */
    public Integer getBizPoint() {
        return bizPoint;
    }

    /**
     * 设置企点
     *
     * @param bizPoint 企点
     */
    public void setBizPoint(Integer bizPoint) {
        this.bizPoint = bizPoint;
    }

    /**
     * 获取已使用的企点数量
     *
     * @return point_used - 已使用的企点数量
     */
    public Integer getPointUsed() {
        return pointUsed;
    }

    /**
     * 设置已使用的企点数量
     *
     * @param pointUsed 已使用的企点数量
     */
    public void setPointUsed(Integer pointUsed) {
        this.pointUsed = pointUsed;
    }

    /**
     * 获取充值的企点数量
     *
     * @return point_charge - 充值的企点数量
     */
    public Integer getPointCharge() {
        return pointCharge;
    }

    /**
     * 设置充值的企点数量
     *
     * @param pointCharge 充值的企点数量
     */
    public void setPointCharge(Integer pointCharge) {
        this.pointCharge = pointCharge;
    }

    /**
     * 获取是否是location用户  1：是  0：否
     *
     * @return is_location - 是否是location用户  1：是  0：否
     */
    public Byte getIsLocation() {
        return isLocation;
    }

    /**
     * 设置是否是location用户  1：是  0：否
     *
     * @param isLocation 是否是location用户  1：是  0：否
     */
    public void setIsLocation(Byte isLocation) {
        this.isLocation = isLocation;
    }
}