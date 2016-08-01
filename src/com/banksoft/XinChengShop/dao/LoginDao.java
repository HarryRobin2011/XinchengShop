package com.banksoft.XinChengShop.dao;

import android.content.Context;
import com.banksoft.XinChengShop.config.ControlUrl;
import com.banksoft.XinChengShop.dao.base.BaseDao;
import com.banksoft.XinChengShop.model.MemberData;
import com.banksoft.XinChengShop.model.base.BaseData;
import com.banksoft.XinChengShop.type.MergeType;
import com.banksoft.XinChengShop.utils.JSONHelper;
import com.banksoft.XinChengShop.utils.MD5Factory;

/**
 * Created by harry_robin on 15/11/12.
 */
public class LoginDao extends BaseDao {
    public String account;
    public String password;

    public LoginDao(Context mContext) {
        super(mContext);
    }

    public MemberData login() {
        String url = ControlUrl.LOGIN_URL;
        String params = "account="+account+"&password="+ MD5Factory.encoding(password);
        MemberData data = (MemberData) postHttpRequest(mContext,url,params, JSONHelper.MEMBER_DATA,false);
        return data;
    }

    public MemberData qqLogin() {
        return null;
    }

    /**
     * 第三方登录
     * @param mergeType
     * @param openid
     * @return
     */
    public MemberData thirdLogin(MergeType mergeType, String openid) {
        String url = ControlUrl.THIRD_LOGIN;
        String params = "type="+mergeType+"&openid="+openid;
        MemberData data = (MemberData) postHttpRequest(mContext,url,params, JSONHelper.MEMBER_DATA,false);
        return data;

    }

    public BaseData getOrderStatus(String id){
        String url = ControlUrl.XC_ORDERsTATUS_NUM_URL;
        String parasm = "memberId="+id;
        BaseData data = (BaseData) postHttpRequest(mContext,url,parasm,JSONHelper.BASE_DATA,false);
        return data;
    }
}
