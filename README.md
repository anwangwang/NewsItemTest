# NewsItemTest
复杂ListView显示---> 新闻列表

#步骤

1.编写ListView布局

2.找到ListView

3.获取新闻数据封装到List集合中（采用模拟数据），作为adapter的显示数据。

  3.1怎么将获取到的数据给adapter？

4.创建一个adapter继承BaseAdapter,实现四个方法

  4.1 getCount:有多少条新闻数据，就有多少个条目
  
  4.2 getView：将返回一个复杂布局作为条目的内容展示

5.创建一个adapter对象设置给listview

6.设置listview条目的点击事件，并封装点击事件，去查看新闻详情。
