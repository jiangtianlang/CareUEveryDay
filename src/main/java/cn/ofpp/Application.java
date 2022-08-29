package cn.ofpp;

import cn.ofpp.core.BoyFriend;
import cn.ofpp.core.GirlFriend;
import cn.ofpp.core.MessageFactory;
import cn.ofpp.core.Wx;

/**
 * 启动类
 *
 * 这个理论上只能用测试号 正式的号 个人认证是不支持模板消息的 企业认证的又必须使用微信模板库里的模板 只有测试的可以自定义模板内容
 * <a href="https://mp.weixin.qq.com/debug/cgi-bin/sandboxinfo?action=showinfo&t=sandbox/index">申请公众号测试应用地址</a>
 *
 * @author DokiYolo
 * Date 2022-08-22
 */
public class Application {

    /**
     * <li>创建配置</li>
     * <li>创建几个 男/女 朋友</li>
     * <li>发消息</li>
     */
    public static void main(String[] args) {
        // load and init
        Bootstrap.init();

        // -----------------  以下为演示数据  ------------------------

        GirlFriend girlFriend = new GirlFriend("小张同学",
                "四川省", "成都市", "1998-12-06", "2019-02-19", "o5PbW5jDOhkdEKLT-8zHx8VrBnOE");
        Wx.sendTemplateMessage(MessageFactory.resolveMessage(girlFriend,"o5PbW5gfNVS_vuWl3EaXSmw_bhPo"));
        Wx.sendTemplateMessage(MessageFactory.resolveMessage(girlFriend,"o5PbW5jDOhkdEKLT-8zHx8VrBnOE"));

    }

}
