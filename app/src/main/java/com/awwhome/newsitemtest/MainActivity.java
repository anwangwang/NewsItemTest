package com.awwhome.newsitemtest;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;

import com.awwhome.newsitemtest.adapter.NewsAdapter;
import com.awwhome.newsitemtest.entity.NewsBean;
import com.awwhome.newsitemtest.util.NewsUtil;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Context mContext;
    private ListView lv_news_item;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mContext = this;

        // 1.找到控件
        lv_news_item = (ListView) findViewById(R.id.lv_news_item);

        NewsAdapter adapter = new NewsAdapter(NewsUtil.getAllNews(mContext));

        // 2.设置适配器
        lv_news_item.setAdapter(adapter);
    }


}
