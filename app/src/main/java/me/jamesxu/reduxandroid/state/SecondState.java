package me.jamesxu.reduxandroid.state;

import me.jamesxu.reduxlib.state.State;

/**
 * Created by mobilexu on 2/7/16.
 */
public class SecondState implements State {
    private boolean isLoading;
    private String text;


    public SecondState(boolean isLoading, String text) {
        this.isLoading = isLoading;
        this.text = text;
    }

    public boolean isLoading() {
        return isLoading;
    }

    public void setLoading(boolean loading) {
        isLoading = loading;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
