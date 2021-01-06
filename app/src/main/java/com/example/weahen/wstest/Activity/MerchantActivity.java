package com.example.weahen.wstest.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.example.weahen.wstest.BaseActivity;
import com.example.weahen.wstest.R;


/**
 * 从FunctionActivity跳转来
 * 功能：用于展示商家详情
 */

public class MerchantActivity extends BaseActivity {

    private static final String TAG2 = "MerchantActivity";
    String des, title;

    private TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_merchant);
        Log.e(TAG2, "onCreate");

        textView = findViewById(R.id.textView2);

        Intent intent = getIntent();
        Bundle bundle = intent.getBundleExtra("bun");
        des=bundle.getString("des_list");
        title=bundle.getString("title_list");

        Log.e("Merchant-des-title:", des+"--"+title);

        //文字缩进
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\u3000\u3000").append(des);
        textView.setText(stringBuilder);

        initTitle(title);


    }
}
