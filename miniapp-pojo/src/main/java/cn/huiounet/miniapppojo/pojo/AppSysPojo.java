package cn.huiounet.miniapppojo.pojo;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 作者 ：冷瑞阳
 * 首次编辑时间 ：2021/2/5 16:49
 */
public class AppSysPojo {
    private String app_id; //小程序ID
    private String app_key; //小程序秘钥
    private String pay_id; //商户号
    private String pay_key; //商户秘钥
    private String version; //版本

    @Override
    public String toString() {
        return "AppSysPojo{" +
                "app_id='" + app_id + '\'' +
                ", app_key='" + app_key + '\'' +
                ", pay_id='" + pay_id + '\'' +
                ", pay_key='" + pay_key + '\'' +
                ", version='" + version + '\'' +
                '}';
    }

    public AppSysPojo() {
    }

    public String getApp_id() {
        return app_id;
    }

    public void setApp_id(String app_id) {
        this.app_id = app_id;
    }

    public String getApp_key() {
        return app_key;
    }

    public void setApp_key(String app_key) {
        this.app_key = app_key;
    }

    public String getPay_id() {
        return pay_id;
    }

    public void setPay_id(String pay_id) {
        this.pay_id = pay_id;
    }

    public String getPay_key() {
        return pay_key;
    }

    public void setPay_key(String pay_key) {
        this.pay_key = pay_key;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
