package cn.huiounet.miniappproduct.utils;

/**
 * 作者 ：冷瑞阳
 * 首次编辑时间 ：2021/1/21 00:32
 */
public class AppException extends Exception{
    /**
     * 抛出异常
     * @param
     * @param message 状态信息
     */
    public AppException(String message){
        super(message);
    }
}
