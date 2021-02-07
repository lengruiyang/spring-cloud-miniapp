package cn.huiounet.miniappproduct.utils.send_message;

import com.github.qcloudsms.SmsSingleSender;
import com.github.qcloudsms.SmsSingleSenderResult;

//导入可选配置类
// 导入 SMS 模块的 client
// 导入要请求接口对应的 request response 类

/**
 * Tencent Cloud Sms Sendsms
 * https://cloud.tencent.com/document/product/382/38778
 */
public class SendMessageUtil {

    public static String getMess(String tel, String code,String time) throws Exception {
        int appid = 1400389620; // 1400开头
        String appkey = "c17cf13fa0867266db3b25aea0e20872";
        String[] phoneNumbers = {tel};
        int templateId = 645984; // NOTE: 这里的模板ID`7839`只是一个示例，真实的模板ID需要在短信控制台中申请
        String smsSign = "辉欧网络工作室"; // NOTE: 这里的签名"腾讯云"只是一个示例，真实的签名需要在短信控制台中申请，另外签名参数使用的是`签名内容`，而不是`签名ID`

        String[] params = {code,time};
        SmsSingleSender ssender = new SmsSingleSender(appid, appkey);
        SmsSingleSenderResult result = ssender.sendWithParam("86", phoneNumbers[0],
                templateId, params, smsSign, "", "");  // 签名不能为空串

        return result + "";
    }
}
