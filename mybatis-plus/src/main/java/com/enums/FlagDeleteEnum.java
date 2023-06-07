package com.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;

@Getter
public enum FlagDeleteEnum  {

    NO(0, "未删除"), YES(1, "已删除");

    @EnumValue
    final int code;

    final String msg;

    FlagDeleteEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    @JsonValue
    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

}