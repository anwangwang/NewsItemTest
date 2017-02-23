package com.awwhome.newsitemtest.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.awwhome.newsitemtest.entity.NewsBean;
import com.awwhome.newsitemtest.util.NewsUtil;

import java.util.List;

/**
 * 新闻适配器
 * Created by Administrator on 2017/2/23 0023.
 */
public class NewsAdapter extends BaseAdapter {

    private List<NewsBean> list;

    public NewsAdapter(List<NewsBean> list) {
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        // TODO: 2017/2/23 0023  
        return null;
    }

    @Override
    public long getItemId(int position) {
        // TODO: 2017/2/23 0023
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = null;



        return view;
    }
}
