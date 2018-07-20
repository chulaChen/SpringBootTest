package com.chenzhuo.util;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: UncleYee
 * Date: 2016/3/17
 * Time: 15:49
 * To change this template use File | Settings | File Templates.
 */
public class Defs {
    public static final String session_loginUser = "currUser";
    public static final String session_verifyCode = "session_verifyCode";
    public static String[] notFilter = new String[] {
            "/app/login",
            "/app/init",
            "/app/autoInitDeploy",
            "/2660bc7ffcd0138875b799ab8dab808c.txt",
            "/app/logout",
            "/app/index",
            "/app/shenghui",
            "/app/verify",
            "/app/forgetPwd",
            "/app/sendMobileCode",
            "/app/saveForget",
            "/public",
            "/public/",
            "/service/",
            "/robots.txt",
            "/comm/",
            "app/timeout",
            "/error",
            "/test/",
            "file/upload",
            "captcha/create"
    };

    /**  vn的平台号 **/
    public static final String VN_PLATFORM_FLAG = "vn";

    /** 超级管理员类型：1 **/
    public static final int ADMIN_USER_TYPE = 1;

    /** 商业用户类型：2 **/
    public static final int VN_USER_TYPE = 2;

    /** 商业子用户类型：3 **/
    public static final int CHILD_VN_USER_TYPE = 3;

    /** 类似现金的渠道，收银配制成参数中不需要参数data:"JSON"   **/
    public final static List sameCaseList = new ArrayList<>();

    /** 类似雅酷一卡通的渠道，收银配制成参数中需要参数data:"JSON",但是data中不需要银行卡业务参数   **/
    public final static List sameYkList = new ArrayList<>();

    /** 需要额外设置主动签到的渠道列表   **/
    public final static List needSignList = new ArrayList<>();

    /** 需要额外设置密钥的渠道列表   **/
    public final static List needKeyList = new ArrayList<>();

    /** 不需要额外设置商户号的渠道列表   **/
    public final static List noNeedMerchantNoList = new ArrayList<>();

    /** 不需要额外设置content字段的渠道列表   **/
    public final static List noNeedContentList = new ArrayList<>();

    /** 需要额外设置uno的渠道列表   **/
    public final static List needUnoList = new ArrayList<>();

//    /**  所有渠道的对应的参数列表  **/
//    public final static List<DBObject> allPayChannelParamsList = new ArrayList();

    //暂时定义支持的银行业务卡能力列表
    public final static List<Integer> bizCodeList = new ArrayList();

    static {

        sameCaseList.add(1001);//现金渠道
        sameCaseList.add(1097);//天街通支付宝渠道
        sameCaseList.add(1096);//天街通微信渠道
        sameCaseList.add(1092);//天街通渠道
        sameCaseList.add(1094);//武汉一卡通渠道
        sameCaseList.add(1102);//中付支付宝
        sameCaseList.add(1101);//中付微信
        sameCaseList.add(1036);//亿美汇金积分
        sameCaseList.add(1082);//远古高尔夫

        sameYkList.add(1084);//雅酷一卡通渠道
        sameYkList.add(1083);//雅酷预付卡渠道
        sameYkList.add(1042);//上海迅联支付宝渠道
        sameYkList.add(1044);//上海迅联微信渠道
        sameYkList.add(1117);//新疆联机一卡通
        sameYkList.add(1089);//上海杉德支付宝
        sameYkList.add(1014);//华势支付宝
        sameYkList.add(1095);//威富通支付宝
        sameYkList.add(1088);//上海杉德微信
        sameYkList.add(1086);//银联钱包
        sameYkList.add(1066);//御付支付宝
        sameYkList.add(1049);//南京银石支付宝
        sameYkList.add(1067);//北京弘付
        sameYkList.add(1065);//御付微信
        sameYkList.add(1007);//百度钱包自定义
        sameYkList.add(1069);//翼支付
        sameYkList.add(1028);//京东钱包自定义


        needSignList.add(1089);//上海杉德支付宝
        needSignList.add(1088);//上海杉德微信
        needSignList.add(1047);//杉德间联刷卡
        needSignList.add(1087);//上海杉德直联刷卡

        needKeyList.add(1095);//威富通支付宝
        needKeyList.add(1022);//威富通微信

        noNeedMerchantNoList.add(1014);//华势支付宝
        noNeedMerchantNoList.add(1012);//华势刷卡
        noNeedMerchantNoList.add(1086);//银联钱包
        noNeedMerchantNoList.add(1051);//苏州银石刷卡
        noNeedMerchantNoList.add(1106);//天津银石刷卡
        noNeedMerchantNoList.add(1049);//南京银石支付宝
        noNeedMerchantNoList.add(1007);//百度钱包自定义
        noNeedMerchantNoList.add(1069);//翼支付


        noNeedContentList.add(1095);//威富通支付宝
        noNeedContentList.add(1086);//银联钱包
        noNeedContentList.add(1007);//百度钱包自定义
        noNeedContentList.add(1028);//京东钱包自定义

        needUnoList.add(1117);//新疆联机一卡通
        needUnoList.add(1032);//南京银石刷卡
        needUnoList.add(1051);//苏州银石刷卡
        needUnoList.add(1106);//天津银石刷卡
        needUnoList.add(1066);//御付支付宝
        needUnoList.add(1049);//南京银石支付宝
        needUnoList.add(1067);//北京弘付
        needUnoList.add(1065);//御付微信


        bizCodeList.add(100032);//余额查询
        bizCodeList.add(100035);//退货
        bizCodeList.add(100033);//小额免密
        bizCodeList.add(100034);//预授权
        bizCodeList.add(100037);//电子签名
        bizCodeList.add(100046);//电子现金
    }


}
