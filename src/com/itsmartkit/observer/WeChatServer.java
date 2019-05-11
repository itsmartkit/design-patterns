package com.itsmartkit.observer;

/**
 * 具体主题，微信服务器
 */
public class WeChatServer extends Subject {

    private String news;
    @Override
    public void notifyObservers() {
        for (Observer observer : observerList) {
            observer.update("腾讯新闻：" + news);
        }
    }

    public void setNews(String news) {
        this.news = news;
    }
}
