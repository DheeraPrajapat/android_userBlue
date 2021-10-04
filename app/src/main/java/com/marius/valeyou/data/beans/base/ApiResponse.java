package com.marius.valeyou.data.beans.base;

import com.google.gson.annotations.SerializedName;

public class ApiResponse<T> extends SimpleApiResponse {
    @SerializedName("data")
    private T data;

    public T getData() {
        return data;
    }

    @Override
    public String toString() {
        return "ApiResponse{" +
                "data=" + data +
                '}';
    }
}
