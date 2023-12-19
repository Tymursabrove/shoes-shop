package com.shoeshop.response;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum SuccessInfo {
    GET_PRODUCT("GET PRODUCT"),
    CREATE_PRODUCT("CREATE PRODUCT"),
    GET_ALL_PRODUCT("GET ALL PRODUCT");

    private final String code = "1";
    private final String message;
}