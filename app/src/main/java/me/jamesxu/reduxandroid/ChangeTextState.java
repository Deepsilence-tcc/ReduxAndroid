package me.jamesxu.reduxandroid;

/**
 * Created by mobilexu on 2/7/16.
 */
public class ChangeTextState {

    private boolean isLoading;
    private String text;

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
