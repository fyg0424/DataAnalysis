/**
 * 系统常量参数配置
 */
package com.shijie99.TestJava.util;


/**
 * @author <a href="mailto:jermeywoo@gmail.com">Jermey.Woo</a>
 *
 */
public class Constant {
	
	public static final String DS_ABUS = "ABUS_F";
	public static final String DS_SABR = "SABR_F";
	public static final String DS_AMAD = "AMAD_F";
	
	public static final String SUCC = "T";
	public static final String FAIL = "F";
	
	
	/**缓存里存的加价规则 key*/
	public static final String CACHE_KEY_PRICE_RULE = "pricerule";
	/**缓存里存的加价版本号 key*/
	public static final String CACHE_KEY_PRICE_VERSION = "pricev";
	/**缓存里存的加价额外规则 key*/
	public static final String CACHE_KEY_PRICE_EXTRA = "price_extra";
	/**必须进行价格校验*/
	public static final int PRICE_VERIFY_MUST = 1;
	/**
	 * 查询类型-机票(接口)
	 */
	public static final String LOGXML_AIR_QUERY = "AIRQUERY";
	/**
	 * 订单类型-机票(接口)
	 */
	public static final String LOGXML_AIR_ORDER = "AIRORDER";
	/**
	 * 处理业务逻辑命令定义
	 */
	/**机票查询命令*/
	public static final int COMMAND_AIR_QUERY = 0x65;
	/**机票价格校验命令*/
	public static final int COMMAND_AIR_PRICE_VALIDATE = 0x66;
	/**机票下订单命令103*/
	public static final int COMMAND_AIR_ORDER = 0x67;
	/**机票PNR校验及变价校验命令104*/
	public static final int COMMAND_AIR_PNR_VALIDATE = 0x68;
	/**对比价格**/
	public static final int COMMAND_AIR_COMPARE_PRICE = 0x69;
	/**机票PNR取消106*/
	public static final int COMMAND_AIR_PNR_CANCEL = 0x6A;
	/**机票PNR修改Qeue107*/
	public static final int COMMAND_AIR_PNR_QUEUE = 0x6B;
	/**机票PNR有效性校验108*/
	public static final int COMMAND_AIR_PNR_VERIFY = 0x6C;
	/**机票PNR-未出票，查询低价109*/
	public static final int COMMAND_AIR_PNR_BESTBUY = 0x6D;
	/**机票PNR-读取PNR的信息，航司大票号，出票票号，出票时间等 110*/
	public static final int COMMAND_AIR_PNR_READ = 0x6E;
	/**机票PNR-读取PNR的rule信息 111*/
	public static final int COMMAND_AIR_PNR_RULE = 0x6F;
	
	public static final int COMMAND_AIR_PNR_TICKET = 0x70;
	/**舱位验证(AV接口) 查询舱位数*/
	public static final int COMMAND_AIR_AVAIL_COUNT = 0x71;
	/**提取IBE航班信息*/
	public static final int COMMAND_AIR_IBE_FLIGHT = 0x72;
	
	/**
	 * 消息命令_数据查询_低
	 */
	public static final int COMMAND_SJCX_L = 0x08;
	/**
	 * 消息命令_数据查询_高
	 */
	public static final int COMMAND_SJCX_H = 0x88;
	/**
	 * 消息命令_数据发送_低
	 */
	public static final int COMMAND_SJFX_L = 0x0B;
	/**
	 * 消息命令_数据发送_高
	 */
	public static final int COMMAND_SJFX_H = 0x8B;
	/**
	 * 消息命令_SQL查询_低
	 */
	public static final int COMMAND_SQL_L = 0x10;
	/**
	 * 消息命令_SQL查询_高
	 */
	public static final int COMMAND_SQL_H = 0x90;
	/**
	 * 消息状态_不需返回处理结果状态报告
	 */
	public static final int STATUS_ZTBG_N = 0x00;

	/**
	 * 消息状态_需要返回处理结果状态报告
	 */
	public static final int STATUS_ZTBG_Y = 0x01;

	/**
	 * 消息状态_处理失败   16
	 */
	public static final int STATUS_CLJG_N = 0x10;

	/**
	 * 消息状态_处理成功  17
	 */
	public static final int STATUS_CLJG_Y = 0x11;

	/**
	 * 消息状态_无查询结果 18
	 */
	public static final int STATUS_CXJG_N = 0x12;
	/**
	 * 投放价(IBE) 点
	 */
	public static final int PUT_IN_DIAN = 2;
	/**
	 * 消息状态_查询结果太大
	 */
	public static final int STATUS_CXJG_Y = 0x13;	
	/**机票供应商 接口名称定义JPZH*/
	public static final String AIR_SUPPLIER_JPZH = "JPZH_F";
	/**机票供应商 接口名称定义trafree*/
	public static final String AIR_SUPPLIER_TRAFREE = "TRAF_F";
	/**机票供应商 接口名称定义team*/
	public static final String AIR_SUPPLIER_OWN_F_UT = "TP_UT_F";//众信自录团票
	
	public static final String AIR_SUPPLIER_OWN_F_UZ = "TP_UZ_F";//悠哉自录团票
	
	public static final String AIR_SUPPLIER_IBE = "PLUS_F";
	/**机票供应商 接口名称定义te2u*/
	public static final String AIR_SUPPLIER_TE2U = "TEU_F";
	/**机票供应商 接口名称定义abacus*/
	public static final String AIR_SUPPLIER_ABACUS = "ABUS_F";
	/**机票供应商 接口名称定义omega*/
	public static final String AIR_SUPPLIER_OMEGA = "OMG_F";
	/**机票供应商 接口名称定义Jintong今通*/
	public static final String AIR_SUPPLIER_JINTONG = "JINT_F";
	/**机票供应商 接口名称定义feiqiu*/
	public static final String AIR_SUPPLIER_FEIQIU = "QTT_F";
	/**机票供应商 接口名称定义sabre*/
	public static final String AIR_SUPPLIER_SABRE = "SABR_F";
	/**机票供应商 接口名称定义JQ*/
	public static final String AIR_SUPPLIER_JQF = "JQ_F";
	/**机票供应商 接口名称定义3K*/
	public static final String AIR_SUPPLIER_3KF = "3K_F";
	/**机票供应商 接口名称定义UO*/
	public static final String AIR_SUPPLIER_UOF = "UO_F";
	/**机票供应商 接口名称定义TZ*/
	public static final String AIR_SUPPLIER_TZF = "TZ_F";
	/**缓存机场代码对象，key为机场三字码*/
	public static final String KEY_AIRPORTS_BY_CODE="allDmAirportsByCodeMap";
	/**缓存机场代码对象，key为城市三字码*/
	public static final String KEY_AIRPORTS_BY_CITYCODE="allDmAirportsByCityMap";
	/**机票供应商 接口名称定义Amadeus*/
	public static final String AIR_SUPPLIER_AMADEUS = "AMAD_F";
	/**机票供应商 接口名称定义UTOUR(众信包机)*/
	public static final String AIR_SUPPLIER_UTOUR = "UTOUR_F";
	/**机票供应商 伽利略*/
	public static final String AIR_SUPPLIER_TRPT = "TRPT_F";
	
	/**
	 * 分隔符
	 * 
	 */
	public static final String FG_1 = "#^";
	/**
	 * 竖线
	 */
	public static final String FG_2 = "|";
	public static final String FG_3 = "#";
	public static final String FG_4 = "@^";
	/**
	 * 上尖号
	 */
	public static final String FG_5 = "^";
	
	public static final String AND = "&";
	/**
	 * 空格
	 */
	/**
	 * 空格
	 */
	public static final String KG = " ";
	/**
	 * 下划线
	 */
	public static final String XH = "_";
	
	/**
	 * 中划线
	 */
	public static final String ZH = "-";
	
	/**
	 * 反斜线
	 */
	public static final String FX = "/";
	/**
	 * 分号
	 */
	public static final String FH = ";";
	
	public static final String AT = "@";
	/**
	 * 读缓存的keyType
	 */
	public static final int KEYTYPE_AIRLINE = 1;
	public static final int KEYTYPE_COMMON = 2;
	public static final int KEYTYPE_PRICEINFO = 3;
	public static final int KEYTYPE_AIRPORT_CODE = 4;
	public static final int KEYTYPE_AIRPORT_CITYCODE = 5;
	public static final int KEYTYPE_QHASH= 6;
	public static final int KEYTYPE_QCACHEHASH = 7;
	public static final int KEYTYPE_PRICEVCACHEHASH= 8;
	public static final int KEYTYPE_QHCACHEHASH = 9;
	public static final int KEYTYPE_PRICERULE = 10;
	public static final int KEYTYPE_CODE_ALL = 11;
	public static final int KEYTYPE_AIRCONFIG = 12;
	public static final int KEYTYPE_REFUND = 13;
	public static final int KEYTYPE_MEMCACHE = 14;
	public static final int KEYTYPE_FEIQIUKEY = 15;
	public static final int KEYTYPE_AIRCARBINS = 16;
	public static final String OTHER_KEY = "OTHER-OTHER";
	/**订单错误的data存入memcache的主键key*/
	public static final String MEM_KEY_ORDER_ERR = "ORDER-ERROR-KEY";
	//类型编码 op
	public static final int TYPE_FLOW = 1;
	public static final int TYPE_VERIFY = 2;
	public static final int TYPE_ORDER = 3;
	public static final int TYPE_PV = 4;
	/**
	 * 成功
	 */
	public static final int STATUS_NORMAL = 1;
	public static final int STATUS_EXP = 9000;//程序处理捕获
	public static final int STATUS_NOPARAM = 9001;//参数无效
	public static final int STATUS_USELESS = 9002;//身份非法
	
	public static final int STATUS_QUERY_0 = 1000;//引擎查询返回 Fail
	public static final int STATUS_QUERY_1 = 1001;//调用超时
	public static final int STATUS_QUERY_2 = 1002;//引擎返回数据成功，为空
	public static final int STATUS_QUERY_3 = 1003;//过滤后为空
	public static final int STATUS_QUERY_4 = 1004;//并发等待
	
	public static final int STATUS_VALIDATE_SUCCESS = 0;
	public static final int STATUS_VALIDATE_00 = 2000;//查询条件过期
	public static final int STATUS_VALIDATE_10 = 2010;//API QTE调用失败
	public static final int STATUS_VALIDATE_11 = 2011;//API QTE返回失败
	public static final int STATUS_VALIDATE_12 = 2012;//API QTE重查失败
	public static final int STATUS_VALIDATE_13 = 2013;//API QTE重查匹配失败
	public static final int STATUS_VALIDATE_20 = 2020;//Query QTE重查失败
	public static final int STATUS_VALIDATE_21 = 2021;//Query QTE调用失败

	public static final int STATUS_ORDER_01 = 3001;//请求参数解码为空，提交订单失败
	public static final int STATUS_ORDER_02 = 3002;//重新查询，条件为空
	public static final int STATUS_ORDER_03 = 3003;//重新查询数据不匹配
	public static final int STATUS_ORDER_04 = 3004;//缓存信息不存在，重新查询，获取价格串信息失败，提交订单失败
	public static final int STATUS_ORDER_05 = 3005;//乘客信息不满足国籍要乘客信息不满足国籍要求
	public static final int STATUS_ORDER_06 = 3006;//IBE验舱超时，仅应用于OMG
	public static final int STATUS_ORDER_07 = 3007;//IBE指定舱位无票，OMG的验舱功能开启，IBE下单失败
	public static final int STATUS_ORDER_08 = 3008;//接口调用失败
	public static final int STATUS_ORDER_09 = 3009;//提交订单失败：%s
	public static final int STATUS_ORDER_10 = 3010;//生单拦截行程不匹配，%s
	public static final int STATUS_ORDER_11 = 3011;//生单拦截中转时间，%s
	public static final int STATUS_ORDER_12 = 3012;//生单拦截
	
	public static final int STATUS_CHECK_01 = 4001;//请求参数解码为空
	public static final int STATUS_CHECK_02 = 4002;//通过订单号未查询到订单
	public static final int STATUS_CHECK_03 = 4003;//订单支付超时
	public static final int STATUS_CHECK_04 = 4004;//PNR不正确，支付校验失败
	public static final int STATUS_CHECK_05 = 4005;//机票PNR有效性校验，返回fail，校验超时不成功
	public static final int STATUS_CHECK_06 = 4006;//机票PNR有效性校验，未返回数据
	public static final int STATUS_CHECK_07 = 4007;//机票PNR有效性校验，返回信息不为success，此PNR不可出票
	public static final int STATUS_CHECK_08 = 4008;//航段校验是否可用，航段信息为空或者null或fail，支付校验失败
	public static final int STATUS_CHECK_09 = 4009;//航段校验是否可用，下订单的航段数大于检验的航段数
	public static final int STATUS_CHECK_10 = 4010;//航段校验是否可用，航班状态(HN,NN,US,UC等)不可用
	public static final int STATUS_CHECK_11 = 4011;//航段校验是否可用，下订单航班于检验航班不一致
	public static final int STATUS_CHECK_12 = 4012;//PNR为空，支付校验失败
	public static final int STATUS_CHECK_13 = 4013;//NR校验失败，支付校验失败
	public static final int STATUS_CHECK_14 = 4014;//支付校验跳价，支付校验失败
	public static final int STATUS_CHECK_15 = 4015;//支付校验没有返回价格支付校验未返回价格
	public static final int STATUS_CHECK_16 = 4016;//支付订单号为空，支付校验失败
	
	public static final String ENC_UTF8 = "UTF-8";
	/**Abacus请求掉的家口**/
	public static final int ABACUS_TYPE_ONE = 1;//BargainFinderMax接口
	public static final int ABACUS_TYPE_TWO_ = 2;//OTA_AirLowFareSearchLLS
	/**价格来源，公布运价*/
	public static final String PRICESOURCE_PUBLIC = "public";
	/**价格来源，私有运价*/
	public static final String PRICESOURCE_PRIVATE = "private";
	
	public static final String PRICESOURCE_PRIVATE_JCB = "pricej";
	
	public static final String PRICESOURCE_PAPER = "paper";
	
	/**当地价格类型 0*/
	public static final String LOCALPRICE_TYPE = "0";//当地价格类型
	/**结算类型  1*/
	public static final String PRICE_TYPE = "1";//结算价格类型
	
	public static final String DB_TPF = "tpf";//数据库tpf
	
	public static final String DB_TPFQUNAR = "tpfqunar";//数据库tpfqunar
	
	public static final String DB_POLICY = "policy";//数据库policy
	
	public static final String DB_ONEQUERY = "onequery";//数据库config
	
	public static final String DB_QUERYLOG = "querylog";//数据库config,专门为查询日志保存单开的一个数据库连接 
	
	public static final String PRICEADDINFO_TYPE_JCB = "2";
	
	public static final String PRODUCT_PUB = "PUB";
	public static final String PRODUCT_PRV = "PRV";
	public static final String PRODUCT_OTH = "OTH";

	//黑名单功能 根据cid过滤的memcache key
	public static final String BLICKLIST_CID_FILTERKEY = "BLICKLIST_CID_FILTERKEY";
	//黑名单功能 动态过滤字段值的memcache key
	public static final String BLICKLIST_FILTERKEY = "BLICKLIST_FILTERKEY";
	//黑名单功能开关
	public static final String OPENBLACKLIST_KEY = "OPENBLACKLIST_KEY";
	// 2016-07-11每件行李额上限重量
	public static final String MAX_WT = "23";
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
