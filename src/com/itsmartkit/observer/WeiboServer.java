package com.itsmartkit.observer;

/**
 * 具体主题，微博服务器
 */
public class WeiboServer extends Subject {

    private String news;
    @Override
    public void notifyObservers() {
        for (Observer observer : observerList) {
            observer.update("新浪新闻：" + news);
        }
    }

    public void setNews(String news) {
        this.news = news;
    }
}
