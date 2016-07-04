package com.banksoft.XinChengShop.entity;

import com.banksoft.XinChengShop.entity.base.BaseEntity;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 12-12-27
 * Time: 上午11:00
 * To change this template use File | Settings | File Templates.
 */
public class ShopVO extends BaseEntity {
	private String id;
	private String siteId;
	private String name;  //昵称
	private String account;   //商铺账号
	private String password;      //密码
	private String description;  //商铺描述
	private String no;          //商品编号
	private boolean status; //商铺是否开启
	private boolean auditStatus;  //商铺是否审核
	private String district;//地域
    private String province;
    private String city;
    private String county;

	private String idCard;//身份证
	private String shopType;//店铺类型Id
    private String shopTypeName;//店铺类型名称
	private String address;//地址
	private String postCode;//邮编10
	private String telephone;//电话64
	private String grade;//等级10
    private String gradeType;
	private String beginTime;//开始时间20
	private String createTime;//开始时间20
	private String endTime;//结束时间20
	private String closeReason;//关闭理由512
	private boolean realName;//实名认证
	private boolean realShop;//实体店认证
	private boolean recommend;//推荐
	private String sort;//序号

	private String banner;
	private String logo;
	private String imageFile;
	private String qq;
	private String ali;
	private String seoKey;
	private String seoDescription;
	private int score; //等级
    private float matchScore; //商品相符度
    private float dispatchScore;//发货速度
    private float serviceScore;   //服务质量

    private long productCount;       //商品数量
    private int goodCount;   //好评率
    private int orderCount;                  //订单数量，
    private String signShopId;
    private String qrCode;
    private String qrCodeUrl;     //二维码路径
    private int commentCount;    //评论条数

    private long collectionCount;         //被收藏数量
    private String jstAccount;   //即时通账号
    private float pointLng;     //在百度地图上的经度
    private float pointLat;     //在百度地图上的纬度
    private float rate;          //佣金费率
    private int sumProduct;     //查询的所有商品数

    private String shopServerType;  //店铺类型
    private String shopServerTypeName;  //服务类型店铺分类名称
    private String shopLocalTypeName; //本地服务分类
    private boolean showShop;  //服务类店铺是否显示
    private float perPrice;  //店铺人均消费
    private String nearArea;  //靠近地区

    private List<TimeSetting> shopTimeSetting;  //营业时间
    private double distance;  //与给定坐标的距离
    private String distanceRemark;  //距离描述 ， 如：0.5
    private boolean workTime; //是否营业

    private String expressAccount;
    private String expressId;

    private String business; //主营

    private float dispatchPrice; //免运费价格
    private float expressPrice; //运费， 低于免运费价格时

    private boolean deposit; //是否缴纳保证金
    private String depositMoney; //保证金额
    private boolean ship; //是否旗舰店
    private boolean rent; //是否有租金
    private String rentMoney; //租金
    private long startTime; //店铺服务开始时间
    private long closeTime; //服务到期时间   0 表示无期限

    private String gradeId; //店铺等级ID，管理员设定
    private String gradeName; //店铺等级名称，管理员设定
    private boolean xincheng; //是否鑫诚广告内店铺
    private String xinchengPoint; //广场内位置

    public boolean isWorkTime() {
        return workTime;
    }

    public void setWorkTime(boolean workTime) {
        this.workTime = workTime;
    }

    public String getXinchengPoint() {
        return xinchengPoint;
    }

    public void setXinchengPoint(String xinchengPoint) {
        this.xinchengPoint = xinchengPoint;
    }

    public boolean isXincheng() {
        return xincheng;
    }

    public void setXincheng(boolean xincheng) {
        this.xincheng = xincheng;
    }

    public String getGradeId() {
        return gradeId;
    }

    public void setGradeId(String gradeId) {
        this.gradeId = gradeId;
    }

    public String getGradeName() {
        return gradeName;
    }

    public void setGradeName(String gradeName) {
        this.gradeName = gradeName;
    }

    public String getShopLocalTypeName() {
        return shopLocalTypeName;
    }

    public void setShopLocalTypeName(String shopLocalTypeName) {
        this.shopLocalTypeName = shopLocalTypeName;
    }

    public boolean isShip() {
        return ship;
    }

    public void setShip(boolean ship) {
        this.ship = ship;
    }

    public boolean isRent() {
        return rent;
    }

    public void setRent(boolean rent) {
        this.rent = rent;
    }

    public String getRentMoney() {
        return rentMoney;
    }

    public void setRentMoney(String rentMoney) {
        this.rentMoney = rentMoney;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(long closeTime) {
        this.closeTime = closeTime;
    }

    public boolean isDeposit() {
        return deposit;
    }

    public void setDeposit(boolean deposit) {
        this.deposit = deposit;
    }

    public String getDepositMoney() {
        return depositMoney;
    }

    public void setDepositMoney(String depositMoney) {
        this.depositMoney = depositMoney;
    }

    public float getDispatchPrice() {
        return dispatchPrice;
    }

    public void setDispatchPrice(float dispatchPrice) {
        this.dispatchPrice = dispatchPrice;
    }

    public float getExpressPrice() {
        return expressPrice;
    }

    public void setExpressPrice(float expressPrice) {
        this.expressPrice = expressPrice;
    }

    public String getBusiness() {
        return business;
    }

    public void setBusiness(String business) {
        this.business = business;
    }

    public String getDistanceRemark() {
        return distanceRemark;
    }

    public void setDistanceRemark(String distanceRemark) {
        this.distanceRemark = distanceRemark;
    }

    public int getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(int commentCount) {
        this.commentCount = commentCount;
    }

    public String getExpressAccount() {
        return expressAccount;
    }

    public void setExpressAccount(String expressAccount) {
        this.expressAccount = expressAccount;
    }

    public String getExpressId() {
        return expressId;
    }

    public void setExpressId(String expressId) {
        this.expressId = expressId;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public float getPerPrice() {
        return perPrice;
    }

    public void setPerPrice(float perPrice) {
        this.perPrice = perPrice;
    }

    public String getNearArea() {
        return nearArea;
    }

    public void setNearArea(String nearArea) {
        this.nearArea = nearArea;
    }

    public List<TimeSetting> getShopTimeSetting() {
        return shopTimeSetting;
    }

    public void setShopTimeSetting(List<TimeSetting> shopTimeSetting) {
        this.shopTimeSetting = shopTimeSetting;
    }

    public boolean isShowShop() {
        return showShop;
    }

    public void setShowShop(boolean showShop) {
        this.showShop = showShop;
    }

    public String getShopServerTypeName() {
        return shopServerTypeName;
    }

    public void setShopServerTypeName(String shopServerTypeName) {
        this.shopServerTypeName = shopServerTypeName;
    }

    public String getShopServerType() {
        return shopServerType;
    }

    public void setShopServerType(String shopServerType) {
        this.shopServerType = shopServerType;
    }

    public float getPointLng() {
        return pointLng;
    }

    public void setPointLng(float pointLng) {
        this.pointLng = pointLng;
    }

    public float getPointLat() {
        return pointLat;
    }

    public void setPointLat(float pointLat) {
        this.pointLat = pointLat;
    }

    public long getCollectionCount() {
        return collectionCount;
    }

    public void setCollectionCount(long collectionCount) {
        this.collectionCount = collectionCount;
    }

    public String getQrCodeUrl() {
        return qrCodeUrl;
    }

    public void setQrCodeUrl(String qrCodeUrl) {
        this.qrCodeUrl = qrCodeUrl;
    }

    public String getQrCode() {
        return qrCode;
    }

    public void setQrCode(String qrCode) {
        this.qrCode = qrCode;
    }

    public String getSignShopId() {
        return signShopId;
    }

    public void setSignShopId(String signShopId) {
        this.signShopId = signShopId;
    }

    public int getOrderCount() {
        return orderCount;
    }

    public void setOrderCount(int orderCount) {
        this.orderCount = orderCount;
    }

    public int getGoodCount() {
        return goodCount;
    }

    public void setGoodCount(int goodCount) {
        this.goodCount = goodCount;
    }

    public long getProductCount() {
        return productCount;
    }

    public void setProductCount(long productCount) {
        this.productCount = productCount;
    }

    public String getGradeType() {
        return gradeType;
    }

    public void setGradeType(String gradeType) {
        this.gradeType = gradeType;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public float getDispatchScore() {
        return dispatchScore;
    }

    public void setDispatchScore(float dispatchScore) {
        this.dispatchScore = dispatchScore;
    }

    public float getServiceScore() {
        return serviceScore;
    }

    public void setServiceScore(float serviceScore) {
        this.serviceScore = serviceScore;
    }

    public float getMatchScore() {
        return matchScore;
    }

    public void setMatchScore(float matchScore) {
        this.matchScore = matchScore;
    }

    public String getBanner() {
		return banner;
	}

	public void setBanner(String banner) {
		this.banner = banner;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getImageFile() {
		return imageFile;
	}

	public void setImageFile(String imageFile) {
		this.imageFile = imageFile;
	}

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public boolean isAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(boolean auditStatus) {
        this.auditStatus = auditStatus;
    }

    public String getSiteId() {
        return siteId;
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getIdCard() {
		return idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public String getShopType() {
		return shopType;
	}

	public void setShopType(String shopType) {
		this.shopType = shopType;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPostCode() {
		return postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getBeginTime() {
		return beginTime;
	}

	public void setBeginTime(String beginTime) {
		this.beginTime = beginTime;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getCloseReason() {
		return closeReason;
	}

	public void setCloseReason(String closeReason) {
		this.closeReason = closeReason;
	}

	public boolean isRealName() {
		return realName;
	}

	public void setRealName(boolean realName) {
		this.realName = realName;
	}

	public boolean isRealShop() {
		return realShop;
	}

	public void setRealShop(boolean realShop) {
		this.realShop = realShop;
	}

	public boolean isRecommend() {
		return recommend;
	}

	public void setRecommend(boolean recommend) {
		this.recommend = recommend;
	}

	public String getSort() {
		return sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
	}

	public int getSumProduct() {
		return sumProduct;
	}

	public void setSumProduct(int sumProduct) {
		this.sumProduct = sumProduct;
	}

	public String getQq() {
		return qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	public String getAli() {
		return ali;
	}

	public void setAli(String ali) {
		this.ali = ali;
	}

	public String getSeoKey() {
		return seoKey;
	}

	public void setSeoKey(String seoKey) {
		this.seoKey = seoKey;
	}

	public String getSeoDescription() {
		return seoDescription;
	}

	public void setSeoDescription(String seoDescription) {
		this.seoDescription = seoDescription;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

    public String getJstAccount() {
        return jstAccount;
    }

    public void setJstAccount(String jstAccount) {
        this.jstAccount = jstAccount;
    }

    public float getRate() {
        return rate;
    }

    public void setRate(float rate) {
        this.rate = rate;
    }

    public String getShopTypeName() {
        return shopTypeName;
    }

    public void setShopTypeName(String shopTypeName) {
        this.shopTypeName = shopTypeName;
    }
}
