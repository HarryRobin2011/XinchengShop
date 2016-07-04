package com.banksoft.XinChengShop.ui.fragment.takeout;import android.os.AsyncTask;import android.support.v4.app.Fragment;import android.view.LayoutInflater;import android.view.View;import android.widget.*;import com.banksoft.XinChengShop.R;import com.banksoft.XinChengShop.dao.TakeOutShopInfoDao;import com.banksoft.XinChengShop.entity.ShopVO;import com.banksoft.XinChengShop.entity.TimeSetting;import com.banksoft.XinChengShop.model.ShopInfoData;import com.banksoft.XinChengShop.ui.takeout.TakeOutInfoActivity;import com.banksoft.XinChengShop.ui.base.XCBaseFragment;import com.banksoft.XinChengShop.utils.CommonUtil;/** * Created by harry_robin on 16/3/21. */public class TakeOutShopInfoFragment extends XCBaseFragment implements View.OnClickListener{    private LinearLayout content;    private ProgressBar progressBar;    private TextView shopName,shopPoint,shopTag,address,shopingLicense,shopTime;    private ImageView mImageView,callPhone;    private TakeOutShopInfoDao takeOutShopInfoDao;    private TakeOutInfoActivity activity;    private RatingBar ratingBar;    @Override    public View initContentView() {        return LayoutInflater.from(mContext).inflate(R.layout.take_out_shop_info_layout,null);    }    @Override    public void initView(View view) {        content = (LinearLayout) view.findViewById(R.id.content);        progressBar = (ProgressBar) view.findViewById(R.id.progressBar);        shopName = (TextView) view.findViewById(R.id.shop_name);        shopPoint = (TextView) view.findViewById(R.id.shop_point);        shopTag = (TextView) view.findViewById(R.id.tag);        address = (TextView) view.findViewById(R.id.address);        shopingLicense = (TextView) view.findViewById(R.id.shoping_license);        mImageView = (ImageView) view.findViewById(R.id.image);        ratingBar = (RatingBar) view.findViewById(R.id.ratingBar);        shopTime = (TextView) view.findViewById(R.id.shoping_time);        callPhone = (ImageView) view.findViewById(R.id.call_phone);    }    @Override    public void initData() {        activity = (TakeOutInfoActivity) getActivity();        if(takeOutShopInfoDao == null){           takeOutShopInfoDao = new TakeOutShopInfoDao(mContext);        }        new MyThread().execute(takeOutShopInfoDao);    }    @Override    public void initOperation() {        callPhone.setOnClickListener(this);    }    @Override    public Fragment getInstance() {        return null;    }    @Override    public CharSequence getTitle() {        return null;    }    @Override    public void onClick(View v) {        switch (v.getId()){            case R.id.call_phone:                CommonUtil.callPhone(mContext,activity.shopVO.getTelephone());                break;        }    }    /**     * 网络请求     */    private class  MyThread extends AsyncTask<TakeOutShopInfoDao,String,ShopInfoData>{        @Override        protected void onPreExecute() {            super.onPreExecute();            progressBar.setVisibility(View.VISIBLE);        }        @Override        protected ShopInfoData doInBackground(TakeOutShopInfoDao... params) {            return params[0].getShopInfoData(activity.shopVO.getId(),true);        }        @Override        protected void onPostExecute(ShopInfoData shopInfoData) {            super.onPostExecute(shopInfoData);            progressBar.setVisibility(View.GONE);            if(shopInfoData != null){                if(shopInfoData.isSuccess()){                    setShopInfoView(shopInfoData.getData());                }else{                    alert(R.string.netWork_warning);                }            }else{                alert(R.string.net_error);            }        }    }    private void setShopInfoView(ShopVO shopVO){        shopName.setText(shopVO.getName());        int score = (int) ((shopVO.getDispatchScore() +shopVO.getServiceScore()+shopVO.getMatchScore())/3);        ratingBar.setNumStars(score);        shopPoint.setText(score + "分");        address.setText(shopVO.getAddress());        TimeSetting timeSetting = shopVO.getShopTimeSetting().get(0);        shopTime.setText("营业时间：" + timeSetting.getStartHour() + ":" + String.format("%02d", timeSetting.getStartMinute())                + "-" + timeSetting.getEndHour() + ":" + String.format("%02d", timeSetting.getEndMinute()));    }}