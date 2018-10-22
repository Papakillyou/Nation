package com.mysql.operation;


public class DbcontextHolder{

    public static final ThreadLocal<String> contextHolder = new ThreadLocal<String>();

    /**设置当前数据源*/
    public static void setDbType(String dbType){
        contextHolder.set(dbType);
    }
    /**获得当前数据源*/
    public static String getDbType(){
        String dbType = (String)contextHolder.get();
        return dbType;
    }
    /**清除上下文
     */
    public void clearContext(){
        contextHolder.remove();
    }
}