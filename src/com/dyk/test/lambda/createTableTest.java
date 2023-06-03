package com.dyk.test.lambda;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * @Title: createTableTest
 * @Package com.dyk.test.lambda
 * @Author: dingyunkai
 * @Description
 * @CreateTime: 2023/5/21 12:54
 */
public class createTableTest {

    public static void main(String[] args) {

        HashMap<String, String> stringStringHashMap = new HashMap<>();
        stringStringHashMap.put("userName","STRING");
        stringStringHashMap.put("idCard","STRING");

        StringBuilder start = new StringBuilder().append("CREATE TABLE ")
                .append("objectTableName").append("(");
        StringBuilder builder = new StringBuilder();
        for (Map.Entry<String, String> stringStringEntry : stringStringHashMap.entrySet()) {
            builder.append(stringStringEntry.getKey()).append(" ");
            String value = stringStringEntry.getValue();
            if (value.equals("STRING")){
                value = "varChar";
            }
            builder.append(value).append("(").append("255").append(")").append(" ");
            builder.append(" DEFAULT NULL ");
            builder.append("COMMENT").append(" ").append("'").append("field_notes").append("'").append(",");
        }
        StringBuilder end = new StringBuilder().append(")").append("ENGINE=InnoDB DEFAULT CHARSET=utf8").append(" ")
                .append("COMMENT=").append("'").append("objectCNName").append("'");
        StringBuilder sqlString = start.append(builder).append(end);
        System.out.println(sqlString);
    }
}