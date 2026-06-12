package io.openim.android.sdk.models;

import java.io.Serializable;

public class CustomElem implements Serializable {
    private String data;
    private String extension;
    private String description;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
