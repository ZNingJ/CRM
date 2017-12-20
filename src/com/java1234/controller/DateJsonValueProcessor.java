package com.java1234.controller;

import java.text.SimpleDateFormat;

import net.sf.json.JsonConfig;
import net.sf.json.processors.JsonValueProcessor;

/**
 * json-lib 日期处理类
 *
 * @author Administrator
 */
public class DateJsonValueProcessor implements JsonValueProcessor {

    private String format;

    DateJsonValueProcessor(String format) {
        this.format = format;
    }

    public Object processArrayValue(Object value, JsonConfig jsonConfig) {
        return null;
    }

    public Object processObjectValue(String key, Object value, JsonConfig jsonConfig) {
        if (value == null) {
            return "";
        }
        if (value instanceof java.sql.Timestamp) {
            return new SimpleDateFormat(format).format((java.sql.Timestamp) value);
        }
        if (value instanceof java.util.Date) {
            return new SimpleDateFormat(format).format((java.util.Date) value);
        }

        return value.toString();
    }

}
