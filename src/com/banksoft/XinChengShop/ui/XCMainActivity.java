package com.banksoft.XinChengShop.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.KeyEvent;
import android.widget.ProgressBar;
import android.widget.Toast;
import com.banksoft.XinChengShop.R;
import com.banksoft.XinChengShop.config.ConfigPush;
import com.banksoft.XinChengShop.dao.UpdateDao;
import com.banksoft.XinChengShop.entity.InfoValue;
import com.banksoft.XinChengShop.model.InfoData;
import com.banksoft.XinChengShop.model.InfoDataMap;
import com.banksoft.XinChengShop.model.InfoHashMap;
import com.banksoft.XinChengShop.ui.base.XCBaseActivity;
import com.banksoft.XinChengShop.ui.base.XCBaseFragment;
import com.banksoft.XinChengShop.ui.fragment.*;
import com.banksoft.XinChengShop.utils.JSONHelper;
import com.banksoft.XinChengShop.utils.update.UpdateUtil;

import java.io.*;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by harry_robin on 15/11/4.
 */
public class XCMainActivity extends XCBaseActivity {
    /**
     * Called when the activity is first created.
     */
    private LinkedList<XCBaseFragment> baseFragmentList;
    public ProgressBar progressBar;

    public XCHomeFragment homePageFragment;
    public XCCategoryFragment categoryFragment;
    public XCMyselfFragment myselfFragment;
    public XCShopCartFragment shopCartFragment;
    public XCShopMallFragment shopMallFragment;
    private long firstTime;
    private Toast toast;

    public TabBarFragment tabFragment;


    private SharedPreferences pushSp;
    private UpdateDao updateDao;

//    public Button leftBtn;
//    public Button rightBtn;
//    public LinearLayout searchLayout;
//    public TextView title;
//    public ImageView backGround;


    @Override
    protected void initContentView() {
        pushSp = getSharedPreferences(ConfigPush.PUSH_SP, Context.MODE_PRIVATE);
        setContentView(R.layout.main);
        new UpdateUtil(this, false).isUpdate();
    }

    public static InfoValue getDataList(HashMap<String,HashMap<String,String>> poorMap,String name){
        InfoValue dataInfo = new InfoValue();
        dataInfo.setName(name);
        dataInfo.setIsLeaf(false);
        LinkedList poorList = new LinkedList();
        for (String key : poorMap.keySet()) {
            InfoValue infoValue = new InfoValue();
            infoValue.setName(key);
            infoValue.setIsLeaf(false);
            HashMap<String, String> mapData = poorMap.get(key);
            List childList = new LinkedList();
            for (String aa : mapData.keySet()) {
                InfoValue infoValue1 = new InfoValue();
                infoValue.setName(key);
                infoValue.setValue(mapData.get(aa));
                childList.add(infoValue1);
                infoValue.setIsLeaf(true);
            }
            infoValue.setChildList(childList);
            poorList.add(infoValue);
        }
        dataInfo.setChildList(poorList);
        return dataInfo;
    }

    @Override
    protected void initView() {
        progressBar = (ProgressBar) findViewById(R.id.progressBar);
        tabFragment = (TabBarFragment) getSupportFragmentManager().findFragmentById(R.id.tab_fragment);
//        leftBtn = (Button) findViewById(R.id.titleLeftButton);
//        searchLayout = (LinearLayout) findViewById(R.id.search_layout);
//        rightBtn = (Button) findViewById(R.id.titleRightButton);
//        title = (TextView) findViewById(R.id.titleText);
//        backGround = (ImageView) findViewById(R.id.titleBg);
    }

    @Override
    protected void initData() {
        //   title.setText(R.string.home_page);
    }

    @Override
    protected void initOperate() {
        // title.setText(R.string.app_name);

    }

    public void setFragmentTitle(CharSequence resId) {
        //  title.setText(resId);
    }


    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {

            if (tabFragment.baseFragment.getClass().equals(XCHomeFragment.class)) {
                long secondTime = System.currentTimeMillis();
                if (secondTime - firstTime > 800) {//如果两次按键时间间隔大于800毫秒，则不退出
                    //setToastView(getText(R.string.again_exit).toString());
                    toast = Toast.makeText(getApplicationContext(), "再按一次退出程序..", Toast.LENGTH_SHORT);
                    toast.show();
                    firstTime = secondTime;//更新firstTime
                    return true;
                } else {
                    if (toast != null) {
                        toast.cancel();
                    }
                    animation = false;
                    finish();
                }
            } else {
                tabFragment.onTabSelected(0);
            }
        }
        return false;
    }

//    private void showExitDialog(){
//        niftyDialogBuilder = NiftyDialogBuilder.getInstance(this);
//        View view = LayoutInflater.from(mContext).inflate(R.layout.custom_view, null);
//        niftyDialogBuilder.setContentView(view);
//        niftyDialogBuilder.withEffect(Effectstype.Slidetop);
//        niftyDialogBuilder.isCancelableOnTouchOutside(false);
//        niftyDialogBuilder.withDuration(1000);
//        niftyDialogBuilder.show();
//        TextView title = (TextView) view.findViewById(R.id.title);
//        TextView message = (TextView) view.findViewById(R.id.content);
//        TextView ok = (TextView) view.findViewById(R.id.ok);
//        TextView cancel = (TextView) view.findViewById(R.id.cancel);
//        title.setText(R.string.alert);
//        message.setText(R.string.exit_alert);
//        ok.setText(R.string.ok);
//        cancel.setText(R.string.cancel);
//        ok.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                animation = true;
//                finish();
//            }
//        });
//        cancel.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                niftyDialogBuilder.dismiss();
//            }
//        });
//    }

}
