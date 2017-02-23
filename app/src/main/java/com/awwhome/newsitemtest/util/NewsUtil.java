package com.awwhome.newsitemtest.util;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;

import com.awwhome.newsitemtest.R;
import com.awwhome.newsitemtest.entity.NewsBean;

import java.util.ArrayList;
import java.util.List;

/**
 * 新闻工具包
 * Created by Administrator on 2017/2/23 0023.
 */
public class NewsUtil {

    /**
     * 获取全部新闻
     * 封装新闻的假数据
     * @return
     */
    public static List<NewsBean> getAllNews(Context context) {

        List<NewsBean> list = new ArrayList<NewsBean>();

        NewsBean news1 = new NewsBean();
        news1.mTitle = "hahaha";
        news1.mDesc = "这是第一条新闻";
        news1.mIcon = context.getResources().getDrawable(R.mipmap.ic_launcher);
        news1.mNewsUrl = "http://www.baidu.com";

        NewsBean news2 = new NewsBean();
        news2.mTitle = "hahahaffssff";
        news2.mDesc = "这是第二条新闻";
        news2.mIcon = context.getResources().getDrawable(R.mipmap.ic_launcher);
        news2.mNewsUrl = "http://www.sina.com";

        NewsBean news3 = new NewsBean();
        news3.mTitle = "hahahafggggg";
        news3.mDesc = "这是第三条新闻";
        news3.mIcon = context.getResources().getDrawable(R.mipmap.ic_launcher);
        news3.mNewsUrl = "http://www.github.com";

        list.add(news1);
        list.add(news2);
        list.add(news3);

        return list;
    }
}
