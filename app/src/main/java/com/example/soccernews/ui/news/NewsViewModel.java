package com.example.soccernews.ui.news;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.soccernews.domain.News;

import java.util.ArrayList;
import java.util.List;

public class NewsViewModel extends ViewModel {

    private final MutableLiveData<List<News>> news;

    public NewsViewModel() {
        this.news = new MutableLiveData<>();

        List<News> news = new ArrayList<>();
        news.add(new News("Title News 01", "This is a example of news"));
        news.add(new News("Title News 02", "This is a example of news"));
        news.add(new News("Title News 03", "This is a example of news"));

        this.news.setValue(news);
    }

    public LiveData<List<News>> getNews() {
        return this.news;
    }
}