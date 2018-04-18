package nc.ui.devlu.util;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Enumeration;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.TreeMap;

import nc.bs.logging.Logger;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.CircularlyAccessibleValueObject;
import nc.vo.pub.SuperVO;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pub.lang.UFDate;
import nc.vo.pub.lang.UFDouble;
import nc.vo.pubapp.pattern.pub.MathTool;
/** 
 * @date 2014-09-18
 * @author bgc 
 * @Description: 常用工具类
 *  
 */
public class PrUtil {
	public static final UFDouble m_d_zero = UFDouble.ZERO_DBL;
	public static final char m_split_char = '&';
	  private PrUtil() {
		    // 缺省构造方法
		  }
	  /**
	   * 通用工具类的工厂方法。
	   * @return 返回通用工具类的实例
	   * @deprecated 用具体的static方法替代
	   */
	  @Deprecated
	  public static PrUtil getInstance() {
	    return new PrUtil();
	  }
	/** 
	 * @Description: 字符数组比对
	 */
	public static boolean isEqual(String[] s1, String[] s2) {
		if (s1 == null && s2 == null)
			return true;
		else if (s1.length != s2.length)
			return false;
		else {
			for (int i=0; i<s1.length; i++) {
				if (!isEqual(s1[i], s2[i]))
					return false;
			}
			return true;
		}
	}
	/** 
	 * @Description: 字符串比对
	 */
	public static boolean isEqual(String s1, String s2) {
		if (s1 == null && s2 == null)
			return true;
		else if (s1 != null && s2 != null && s1.equals(s2))
			return true;
		else
			return false;
	}
	
	/**
	 * 当前值是否为空 如果只是输入空格，也认为为空
	 * 
	 * @param value
	 * @return boolean
	 */
	public static boolean isNull(String value) {
		boolean flag = false;
		if ((value == null) || (value.trim().length() == 0)) {
			flag = true;
		}
		return flag;
	}
	 /**
	   * 两个数值的加法算法 数值为null时作为0对待
	   * 
	   * @param d1 要计算的数值1
	   * @param d2 要计算的数值2
	   * @return d1加上d2的运算结果
	   */
	  public static UFDouble add(UFDouble d1, UFDouble d2) {
	    UFDouble oper1 = MathTool.nvl(d1);
	    UFDouble oper2 = MathTool.nvl(d2);
	    return oper1.add(oper2);
	  }

	  /**
	   * 两个数值值是否相等 数值为null时作为0对待
	   * 
	   * @param d1 要计算的数值1
	   * @param d2 要计算的数值2
	   * @return 两个数值相等返回真
	   */
	  public static boolean equals(UFDouble d1, UFDouble d2) {
	    return MathTool.compareTo(d1, d2) == 0;
	  }

	  /**
	   * 数值1是否大于数值2 数值为null时作为0对待
	   * 
	   * @param d1 要计算的数值1
	   * @param d2 要计算的数值2
	   * @return 数值1大于数值2时返回真
	   */
	  public static boolean greaterThan(UFDouble d1, UFDouble d2) {
	    return MathTool.compareTo(d1, d2) > 0;
	  }

	  /**
	   * 数值1是否小于数值2 数值为null时作为0对待
	   * 
	   * @param d1 要计算的数值1
	   * @param d2 要计算的数值2
	   * @return 数值1小于数值2时返回真
	   */
	  public static boolean lessThan(UFDouble d1, UFDouble d2) {
	    return MathTool.compareTo(d1, d2) < 0;
	  }

	  /**
	   * 两个数值的减法算法 。数值为null时，作为0对待
	   * 
	   * @param d1 要计算的数值1
	   * @param d2 要计算的数值2
	   * @return d1减去d2的运算结果
	   */
	  public static UFDouble sub(UFDouble d1, UFDouble d2) {
	    UFDouble oper1 = MathTool.nvl(d1);
	    UFDouble oper2 = MathTool.nvl(d2);
	    return oper1.sub(oper2);
	  }

	  /**
	   * 比较两个数值的大小。数值为null时，作为0对待
	   * 
	   * @param d1 要计算的数值1
	   * @param d2 要计算的数值2
	   * @return 0 相等
	   *         小于0 d1小于d2
	   *         大于0 d1大于d2
	   */
	  public static int compareTo(UFDouble d1, UFDouble d2) {
	    UFDouble oper1 = MathTool.nvl(d1);
	    UFDouble oper2 = MathTool.nvl(d2);
	    return oper1.compareTo(oper2);
	  }

	  /**
	   * 比较两个数值的绝对值大小。数值为null时，作为0对待
	   * 
	   * @param d1 要计算的数值1
	   * @param d2 要计算的数值2
	   * @return 0 相等
	   *         小于0 d1小于d2
	   *         大于0 d1大于d2
	   */
	  public static int absCompareTo(UFDouble d1, UFDouble d2) {
	    UFDouble oper1 = d1;
	    UFDouble oper2 = d2;

	    if (oper1 == null) {
	      oper1 = UFDouble.ZERO_DBL;
	    }
	    else {
	      oper1 = oper1.abs();
	    }
	    if (oper2 == null) {
	      oper2 = UFDouble.ZERO_DBL;
	    }
	    else {
	      oper2 = oper2.abs();
	    }
	    return oper1.compareTo(oper2);
	  }


	  /**
	   * 如果数值为空，则转化为0返回
	   * 
	   * @param d 要计算的数值
	   * @return 数值为null时，返回0。否则返回元数值
	   */
	  public static UFDouble nvl(UFDouble d) {
	    return d == null ? UFDouble.ZERO_DBL : d;
	  }

	  /**
	   * 数值取绝对值。如果数值为空，则转化为0返回
	   * 
	   * @param d 要计算的数值
	   * @return 数值的绝对值
	   */
	  public static UFDouble abs(UFDouble d) {
	    return MathTool.nvl(d).abs();
	  }

	  /**
	   * 数值是否为0。数值为null时，作为0对待
	   * 
	   * @param d 要计算的数值
	   * @return 数值为null或者等于0时返回真
	   */
	  public static boolean isZero(UFDouble d) {
	    return MathTool.equals(d, UFDouble.ZERO_DBL);
	  }
	  /**
	     *  拼接IN语句
	     * @param fieldName 字段名
	     * @param cardids 值数组
	     * @return WHERE后的语句
	     */
	    public static String getUnionInSQL(String fieldName , String[] cardids){
	        if(fieldName==null||fieldName.trim().equals("")){
	            return " 1=1 ";
	        }
	        String [] partSql = getUnionInSQL(cardids);
	        StringBuilder sb = new StringBuilder(" ( ");
	        String linkf = " in ";
	        String linkf2 = " or ";
	        for(int i=0;i<partSql.length;i++){
	            sb.append(fieldName).append(linkf).append(partSql[i]).append(linkf2);
	        }
	        
	        String sql = sb.substring(0, sb.length()-3);
	        sql = sql +" ) ";
	        
	        return sql;
	    }
	    
	    
	    private static String [] getUnionInSQL(String[] cardids){
	        String [] ex = new String []{" ('') "};
	        if(cardids==null||cardids.length==0){
	            return ex;
	        }
	        
	        String linkf = "') ";
	        String linkf2 = "','";
	        HashMap  hm_ol = new HashMap();
	        ArrayList al = new ArrayList();
	        StringBuilder sb = new StringBuilder(" ('");
	        for(int i=0;i<cardids.length;i++){
	            if(i>0&&i%900==0){
	                String sql = sb.substring(0, sb.length()-3);
	                sql=sql+linkf;
	                al.add(sql);
	                sb = new StringBuilder(" ('");
	                
	            }else{
	            }
	            if(hm_ol.containsKey(cardids[i])){
	                continue;
	            }else{
	                hm_ol.put(cardids[i], cardids[i]);
	            }
	            sb.append(cardids[i]).append(linkf2);
	        }
	        String sql = sb.substring(0, sb.length()-3);
	        sql=sql+linkf;
	        al.add(sql);
	        return (String[]) al.toArray(new String[al.size()]);
	    }
	 
	    /**
	     * 方法功能描述：如果数组为空或者长度等于0则返回true
	     * <p>
	     * <b>参数说明</b>
	     * 
	     * @param strs
	     * @return <p>
	     * @since 6.0
	     * @author liuzy
	     * @time 2010-4-1 上午10:39:44
	     */
	    public static boolean isNull(Object[] objs) {
	      if (null == objs || objs.length == 0)
	        return true;
	      return false;
	    }
	    
	    /**
		 * <p>
		 * <li>判断对象是否为空</li>
		 * <li>一般对象为null返回true</li>
		 * <li>String对象为null或空字符串（不去空格）返回ture</li>
		 * <li>集合,数组,Map为空，或没有元素，或元素值全部为空，返回ture</li>
		 * </p>
		 * @param obj
		 * @return
		 */
		public static boolean isEmpty(Object obj){
			if(obj == null)
				return true;
			if(obj instanceof String){
				if(!"".equals(obj))
					return false;
			}else if(obj instanceof StringBuffer){
				return isEmpty(obj.toString());
			}else if(obj instanceof Map){
				if(!isEmpty(((Map)obj).values()))
					return false;
			}else if(obj instanceof Enumeration){
				Enumeration enumeration = (Enumeration) obj;
				while(enumeration.hasMoreElements()){
					if(!isEmpty(enumeration.nextElement()))
						return false;
				}
			}else if(obj instanceof Iterable){
				if(obj instanceof List && obj instanceof RandomAccess){
					List<Object> objList = (List)obj;
					for(int i = 0 ; i < objList.size() ; i ++ ){
						if(!isEmpty(objList.get(i)))
							return false;
					}

				}else if(!isEmpty(((Iterable)obj).iterator()))
					return false;
			}else if(obj instanceof Iterator){
				Iterator it = (Iterator)obj;
				while(it.hasNext()){
					if(!isEmpty(it.next()))
						return false;
				}
			}else if(obj instanceof Object[]){
				Object[] objs = (Object[])obj;
				for(Object elem : objs){
					if(!isEmpty(elem))
						return false;
				}
			}else if(obj instanceof int[]){
				for(Object elem : (int[])obj){
					if(!isEmpty(elem))
						return false;
				}
			}else{
				return false;
			}
			return true;
		}
		
		/**
		 *  返回多少个月以后的日期
		 *  @author shijun
		 *  @时间 2014-11-03
		 *  */
		public static UFDate getAfterNumberMonth(UFDate date, int i) throws BusinessException {
			GregorianCalendar gc = new GregorianCalendar();
			gc.setTime(date.toDate());
			gc.add(2, +i);
			gc.set(gc.get(Calendar.YEAR), gc.get(Calendar.MONTH), gc.get(Calendar.DATE));
			return new UFDate(gc.getTime());

		}
		/**
		 * 加日期，返回UFDate
		 * @author shijun
		 * @date 2014-11-03
		 * @param date
		 * @param i
		 * @return
		 * @throws BusinessException
		 */
		public static UFDate getQuarterDatesSum(UFDate date, int i) throws BusinessException {
			GregorianCalendar gc = new GregorianCalendar();
			gc.setTime(date.toDate());
			gc.add(5, +i);
			gc.set(gc.get(Calendar.YEAR), gc.get(Calendar.MONTH), gc.get(Calendar.DATE));
			return new UFDate(gc.getTime());

		}
		
		/**
		 * @param temp  in ('','','')
		 * @return
		 */
		public static String arrayToSqlCond(String[] temp) {
			StringBuffer st = new StringBuffer("");
			if (temp != null) {
				st = new StringBuffer();
				int len = temp.length;
				if(len ==0){
					st.append("='errorCond'");
				}else if(len == 1){
					st.append(" ='").append(temp[0]).append("'");
				}else if(len >1){
					st.append(" in (");
					for (int i = 0; i < len; i++) {
						st.append("'");
						st.append(temp[i]);
						st.append("'");
						if(i<len-1)
							st.append(",");
					}
					st.append(")");
				}
			}else{
				st.append("='errorCond'");
			}
			return st.toString();
		}
		/**
		 * @description 以fieldArray属性值为key，哈希化voList
		 * @author liaojia
		 * @create 2009-3-6 下午02:35:00
		 * @param fieldArray
		 * @param superVOs
		 * @return
		 */
		public static <T extends CircularlyAccessibleValueObject> HashMap<String,T> hashlizeList(String[] fieldArray,List<T> superVOs){
			HashMap<String,T> hashMap = new HashMap<String,T>();
			if(fieldArray==null||fieldArray.length==0||superVOs==null||superVOs.size()==0)
				return hashMap;
			int volen = superVOs.size();
			int fieldlen =  fieldArray.length;
			String key = null;
			String fieldname = null;
			T supervo = null;
			for(int i=0;i<volen;i++){
				supervo = superVOs.get(i);
				key="";
				for(int j=0;j<fieldlen;j++){
					fieldname = fieldArray[j];
					key=key+(supervo.getAttributeValue(fieldname)==null?"":getCheckedStr(supervo.getAttributeValue(fieldname)))+m_split_char;
				}
				hashMap.put(key, supervo);
			}
			return hashMap;
		}

		/**
		 * @description 以fieldArray属性值为key，哈希化voList
		 * @author liaojia
		 * @create 2009-3-6 下午02:35:00
		 * @param fieldArray
		 * @param superVOs
		 * @return
		 */
		public static<T extends CircularlyAccessibleValueObject> HashMap<String,String> hashlizeStrToStr(String[] fieldArray,T[] superVOs){
			HashMap<String,String> hashMap = new HashMap<String,String>();
			if(fieldArray==null||fieldArray.length==0||fieldArray.length>2
					||superVOs==null||superVOs.length==0)
				return hashMap;
			int volen = superVOs.length;
			String key = null;
			String value = null;
			T supervo = null;
			for(int i=0;i<volen;i++){
				supervo = superVOs[i];
				if(supervo == null)continue;
				key=(String)supervo.getAttributeValue(fieldArray[0]);
				value=toString(supervo.getAttributeValue(fieldArray[1]));

				hashMap.put(key, value);
			}
			return hashMap;
		}
		public static String toString(Object o) {
			if (o instanceof String) {
				return (String) o;
			} else if (isNotNull(o)) {
				return o.toString();
			} else {
				return null;
			}
		}
		public static boolean isNotNull(Object o) {
			return !isNull(o);
		}
		public static boolean isNull(Object o) {
			return o == null || o.toString() == null
					|| o.toString().trim().length() == 0;
		}
		/**
		 *
		 * @description 获取校验空后的字符串
		 * @author zhangyun1
		 *
		 * @param o
		 * @return String
		 */
		public static String getCheckedStr(Object o) {
			return (o == null || o.toString().trim().length() == 0) ? null : o.toString();
		}
		/**
		 * @description 以fieldArray属性值为key，哈希化voList
		 * @author liaojia
		 * @create 2009-3-6 下午02:35:00
		 * @param fieldArray
		 * @param superVOs
		 * @return
		 */
		public static<T extends CircularlyAccessibleValueObject> HashMap<String,String> hashlizeStrToStr(String[] fieldArray,List<T> superVOs){
			return hashlizeStrToStr(fieldArray,superVOs==null?null:superVOs.toArray(new CircularlyAccessibleValueObject[0]));
		}



		/**
		 * @description 以fieldArray属性值为key，哈希化voList
		 * @author liaojia
		 * @create 2009-3-6 下午02:35:00
		 * @param fieldArray
		 * @param superVOs
		 * @return
		 */
		public static HashMap<Object,Object> hashlizeArray(Object[] keyArray,Object[] valueArray){
			HashMap<Object,Object> hashMap = new HashMap<Object,Object>();
			if(keyArray==null||keyArray.length==0||valueArray==null||valueArray.length==0 || keyArray.length!=valueArray.length)
				return hashMap;
			int len =  keyArray.length;
			Object key = null;
			Object value = null;
			for(int i=0;i<len;i++){
				key=keyArray[i];
				value = valueArray[i];
				hashMap.put(key, value);
			}
			return hashMap;
		}


		/**
		 * @description 以fieldArray属性值为key，value为ArrayList，解决一对多的问题
		 *              哈希化voList
		 * @author liaojia
		 * @create 2009-3-6 下午02:35:00
		 * @param fieldArray
		 * @param superVOs
		 * @return
		 */
		public static <T extends CircularlyAccessibleValueObject> HashMap<String, ArrayList<T>> hashlizeListMultRes(String[] fieldArray,List<T> superVOs){
			HashMap<String, ArrayList<T>> hashMap = new HashMap<String, ArrayList<T>>();
			if(fieldArray==null||fieldArray.length==0||superVOs==null||superVOs.size()==0)
				return hashMap;
			int volen = superVOs.size();
			int fieldlen =  fieldArray.length;
			String key = null;
			String fieldname = null;
			T supervo = null;
			String keyvalue = null;
			for(int i=0;i<volen;i++){
				supervo = superVOs.get(i);
				key="";
				for(int j=0;j<fieldlen;j++){
					fieldname = fieldArray[j];
					if(supervo.getAttributeValue(fieldname)==null)
						keyvalue = "";
					else
						keyvalue = supervo.getAttributeValue(fieldname).toString();
					key=key+keyvalue+m_split_char;
				}
				if(hashMap.get(key)==null){
					ArrayList<T> tempAL = new ArrayList<T>();
					tempAL.add(supervo);
					hashMap.put(key, tempAL);
				}else{
					hashMap.get(key).add(supervo);
				}
			}
			return hashMap;
		}


		/**
		 * @description 以fieldArray属性值为key，哈希化vos
		 * @author liaojia
		 * @create 2009-3-6 下午02:35:00
		 * @param fieldArray
		 * @param superVOs
		 * @return
		 */
		public static HashMap<Object,Object> hashlizeArray(int keyIndex,int valueIndex,Object[][] objArray){
			HashMap<Object,Object> hashMap = new HashMap<Object,Object>();
			if(objArray==null||objArray.length==0)
				return hashMap;
			int len =  objArray.length;
			Object[] objLine = null;
			Object key = null;
			Object value = null;
			for(int i=0;i<len;i++){
				objLine = objArray[i];
				key = objLine[keyIndex];
				value = objLine[valueIndex];
				hashMap.put(key, value);
			}
			return hashMap;
		}

		/**
		 * @description 克隆聚合vo（仅含表头，表体为空）
		 * @author liaojia
		 * @create 2009-2-27 上午10:05:53
		 * @param billVOs
		 * @return
		 */
		public static AggregatedValueObject cloneAggVOWithHead(AggregatedValueObject billVO)  throws BusinessException{
			if (billVO == null )
				return null;

			try {
				Class vosClass = billVO.getClass();
				AggregatedValueObject voclone = null;
				voclone = (AggregatedValueObject) vosClass.newInstance();
				if(billVO.getParentVO()==null)
					voclone.setParentVO(null);
				else
					voclone.setParentVO((CircularlyAccessibleValueObject) billVO.getParentVO().clone());

				return voclone;
			}catch(Exception ex){
				Logger.error("克隆聚合vo发生异常", ex);
				throw new BusinessException("克隆聚合vo发生异常");
			}
		}

		/**
		 * @description 以fieldArray属性值为key，哈希化vos
		 * @author liaojia
		 * @create 2009-3-6 下午02:35:00
		 * @param fieldArray
		 * @param superVOs
		 * @return
		 */
		public static<T extends CircularlyAccessibleValueObject> HashMap<String,T> hashlizeArray(String[] fieldArray,T[] superVOs){
			HashMap<String,T> hashMap = new HashMap<String,T>();
			if(fieldArray==null||fieldArray.length==0||superVOs==null||superVOs.length==0)
				return hashMap;
			int volen = superVOs.length;
			int fieldlen =  fieldArray.length;
			T supervo = null;
			String key = null;
			String fieldname = null;
			for(int i=0;i<volen;i++){
				supervo = superVOs[i];
				key="";
				for(int j=0;j<fieldlen;j++){
					fieldname = fieldArray[j];
					key=key+(supervo.getAttributeValue(fieldname)==null?"":(String)supervo.getAttributeValue(fieldname))+m_split_char;
				}
				hashMap.put(key, supervo);
			}
			return hashMap;
		}
		/**
		 * @description 以fields属性值为key，哈希化vos
		 * @param fields
		 * @param superVOs
		 */
		public static <T extends SuperVO> Map<String, T> hashlizeVOs(String[] fields, T[] superVOs) {
			HashMap<String, T> hashMap = new HashMap<String, T>();
			if (fields == null || fields.length == 0 || superVOs == null || superVOs.length == 0)
				return hashMap;
			StringBuffer key = new StringBuffer();
			for (T superVO : superVOs) {
				for (String field : fields)
					key.append(initStr(superVO.getAttributeValue(field))).append(m_split_char);
				hashMap.put(key.toString(), superVO);
				key.delete(0, key.length());
			}
			return hashMap;
		}
		
		/**
		 * 将VOhash化为key--list状态 按key进行分组
		 * @author zhangws1
		 * @param <T>
		 * @param keyField
		 * @param superVOs
		 * @return
		 */
		public static <T extends SuperVO> Map<String, List<T>> hashlizedVOs(String keyField,T[] superVOs){
			Map<String, List<T>> map = new HashMap<String, List<T>>();
			if(keyField!=null&&keyField.length()>0){
				for(T vo:superVOs){
					if(vo.getAttributeValue(keyField)!=null){
						if(map.containsKey(initStr(vo.getAttributeValue(keyField)))){
							map.get(initStr(vo.getAttributeValue(keyField))).add(vo);
						}else{
							List<T> list = new ArrayList<T>();
							list.add(vo);
							map.put(initStr(vo.getAttributeValue(keyField)), list);
						}
					}
				}
			}
			return map;
		} 
		
		/**
		 * @description 以fields属性值为key，哈希化vos
		 * @param fields
		 * @param superVOs
		 */
		public static <T extends SuperVO> Map<String, T> hashlizeVOs(String field, T[] superVOs) {
			HashMap<String, T> hashMap = new HashMap<String, T>();
			if (field == null || field.length() == 0 || superVOs == null || superVOs.length == 0)
				return hashMap;
			
			for (T superVO : superVOs) {
				String key=initStr(superVO.getAttributeValue(field));
				hashMap.put(key.toString(), superVO);	
			}
			return hashMap;
		}

		//================================数据类型转换工具===================================
		/**
		 * @description 从字符串数组转换成字符串形式 传入String[]，返回可以直接用在SQL中in()的字符串
		 * @author liaojia
		 * @create 2009-4-9 上午11:17:21
		 * @param temp
		 * @return
		 */
		public static String arrayToString(String[] temp) {
			StringBuffer st = null;
			if (temp != null) {
				st = new StringBuffer();
				for (int i = 0; i < temp.length; i++) {
					st.append("'");
					st.append(temp[i]);
					st.append("'");
					st.append(",");
				}
			}
			if (st != null) {
				return st.substring(0, st.length() - 1).toString();
			} else
				return "";
		}

		/**
		 * <p>功能描述:从字符串数组转换成字符串形式传入String[]，字符串之间采用任意字符进行分割</p>
		 * <p>创建人及时间： liaojia 2011-10-28下午04:19:18</p>
		 * @param temp
		 * @return
		 */
		public static String arrayToString(String[] temp,String charStr) {
			StringBuffer st = null;
			if (temp != null) {
				st = new StringBuffer();
				for (int i = 0; i < temp.length; i++) {
					st.append(charStr);
					st.append(temp[i]);
					st.append(charStr);
					st.append(",");
				}
			}
			if (st != null) {
				return st.substring(0, st.length() - 1).toString();
			} else
				return "";
		}
		
		/**
		 * 
		 * <p>功能描述:把数组转化成List。Arrays.asList()方法生成List后不能调用remove方法</p>
		 * <p>创建人及时间： qindq 2012-11-6上午11:36:04</p>
		 * @param arrStr
		 * @return
		 */
		public static <T> List<T> arrayToList(T... arrStr){
			List<T> retList = new ArrayList<T>();
			if(arrStr==null||arrStr.length==0)
				return retList;
			
			for (int i = 0; i < arrStr.length; i++) {
				retList.add(arrStr[i]);
			}
			
			return retList;
		}
		
		/**
		 * 数组转字符串，不添加"'"
		 * chenhao
		 * @param values
		 * @param isDistinct
		 * @return
		 */
		public static String arrToStr(Object[] values, boolean isDistinct) {
			if (values == null || values.length == 0) return "";
			if (isDistinct) {
				values = new HashSet<Object>(Arrays.asList(values)).toArray();
			}
			StringBuffer sb = new StringBuffer();
			for (Object v : values) {
				if(v == null){ 
					v = "";
				}
				sb.append(v.toString()).append(',');
			}
	        return sb.length() > 0 ? sb.substring(0, sb.length() - 1) : "";
		}
		/**
		 *
		 * @description 初始化字符串
		 * @author zhangyun1
		 *
		 * @param o
		 * @return
		 * @return String
		 */
		public static String initStr(Object o) {
			return o == null ? "" : o.toString().trim();
		}
		public static String initStr(Object o,String value) {
			return o == null ? value : o.toString().trim();
		}
		public static UFDate initUFdate(String dataStr){
			if (dataStr == null || dataStr.trim().length()== 0)
				return null;
			try {
				return new UFDate(dataStr);
			} catch (Exception e) {
				return null;
			}
		}

		public static UFDate initUFdate(Object o){
			return initUFdate(initStr(o));
		}
		public static UFBoolean initUFBoolean(String dataStr){
			return dataStr == null?new UFBoolean(false):new UFBoolean(dataStr);
		}
		public static UFDouble initUFDouble(String dataStr){
			return dataStr == null?m_d_zero:new UFDouble(dataStr);
		}
		public static Integer initInteger(Object dataStr){
			return dataStr == null?null:new Integer(dataStr.toString());
		}

		public static Integer initInteger(Object dataStr,int defValue){
			String date = initStr(dataStr);
			return isNullStr(date) ? Integer.valueOf(defValue) : Integer.parseInt(dataStr.toString());
		}
		/**
		 *
		 * @description 字符串是否为空
		 * @author zhangyun1
		 *
		 * @param o
		 * @return
		 * @return boolean
		 */
		public static boolean isNullStr(Object o) {
			boolean flag = false;
			if (getCheckedStr(o) == null) {
				flag = true;
			}
			return flag;
		}
		
		/**
		 * 功能：进行VO的合单处理，表头VO为子表的第一个VO
		 * 
		 * @param billVOName
		 * @param voName
		 * @param VOs
		 * @param keys
		 * @return 
		 */
		public static AggregatedValueObject[] getSplitVOs(String billVOName, String voName, CircularlyAccessibleValueObject[] VOs, String[] keys){
			try{
				String key=null;
				//用特殊符号进行分割，以避免多个空值相连的错误
				String splitStr="&@&";
				if (VOs==null)
					return null;
				
				if (keys.length==0)
					return null;
				
				TreeMap<String, ArrayList<CircularlyAccessibleValueObject>> hm=new TreeMap<String, ArrayList<CircularlyAccessibleValueObject>>();
				ArrayList<CircularlyAccessibleValueObject> al=null;
				for (int i=0;i<VOs.length;i++){
					key="";
					for (int j=0;j<keys.length;j++){
						key=key+splitStr+(VOs[i].getAttributeValue(keys[j])==null?"":VOs[i].getAttributeValue(keys[j]).toString());
					}
					if (hm.containsKey(key)){
						al=hm.get(key);
						al.add(VOs[i]);
					}else{
						al=new ArrayList<CircularlyAccessibleValueObject>();
						al.add(VOs[i]);
					}
					hm.put(key, al);
				}
				
				Iterator<String> it=hm.keySet().iterator();
				
				Class bodyVOClass = Class.forName(voName);
				Class VOClass = Class.forName(billVOName);
				AggregatedValueObject[] returnVO = (AggregatedValueObject[]) Array.newInstance(VOClass, hm.size());
				int i=0;
				while(it.hasNext()){
					key=it.next();
					returnVO[i]= (AggregatedValueObject) Class.forName(billVOName).newInstance();
					
					al=hm.get(key);
					CircularlyAccessibleValueObject[] bodyVOs = (CircularlyAccessibleValueObject[]) Array.newInstance(bodyVOClass, al.size());
					al.toArray(bodyVOs);
					
					returnVO[i].setParentVO(bodyVOs[0]);
					returnVO[i].setChildrenVO(bodyVOs);
					
					i++;
				}
				
				return returnVO;
			} catch (ClassNotFoundException e) {
				return null;
			} catch (InstantiationException t) {
				return null;
			} catch (IllegalAccessException r) {
				return null;
			}
		}
		/**
		 * 描述：从SuperVO数组中获取fieldname字段的字符串数组（剔除重复）
		 * 作者：廖佳
		 * 日期：2009-9-21  下午05:05:54
		 * @param fieldname
		 * @param vos
		 * @return
		 */
		public static<T extends CircularlyAccessibleValueObject> String[] getDisStrFieldArrFromVOArray(String fieldname,T[] vos){
			if(vos==null||vos.length==0||fieldname==null||fieldname.trim().equals(""))
				return null;
			HashSet<String> setHash = new HashSet<String>();
			int len = vos.length;
			String value = null;
			for(int i=0;i<len;i++){
				T vo = vos[i];
				if(vo==null||vo.getAttributeValue(fieldname)==null){
					continue;
				}else if(vo.getAttributeValue(fieldname) instanceof String){
					value = (String)vo.getAttributeValue(fieldname);
					setHash.add(value);
				}
				else {
					value = vo.getAttributeValue(fieldname).toString();
					setHash.add(value);
				}
			}
			return setHash.toArray(new String[0]);
		}
		/**
		 * 计算某vo特定字段的合计值
		 *
		 * @param voList
		 * @param fieldname
		 * @return
		 */
		public static <T extends CircularlyAccessibleValueObject> UFDouble countTotalMny(T[] voArray,String fieldname){
			UFDouble totalMny = PrUtil.m_d_zero;
			if(voArray == null || voArray.length ==0 ||fieldname == null || fieldname.trim().length() == 0)
				return totalMny;
			int len = voArray.length;
			T tempvo = null;
			UFDouble tempMny = null;
			for(int i = 0;i<len;i++){
				tempvo = voArray[i];
				if(tempvo == null) continue;
				tempMny = tempvo.getAttributeValue(fieldname)==null?PrUtil.m_d_zero:(UFDouble)tempvo.getAttributeValue(fieldname);
				totalMny = totalMny.add(tempMny);
			}
			return totalMny;
		}
		/**
		 *@author shijun 2014-11-13
		 * @param str
		 * @return
		 * @DESC 判断字符串里面是否有中文
		 */
		public static boolean isCotainChinese(String str){
		    if(str==null||str.trim().length()==0)
		    	return false;
	        for(int i=0;i<str.length();i++){
	            if(str.substring(i,i+1).matches("[\\u4e00-\\u9fbf]+")){
	               return true;
	            }
	        }
	        return false;

		}
		/**
		 *
		 * @description 初始化UFDouble
		 * @author zhangyun1
		 *
		 * @param o
		 * @return
		 * @return String
		 */
		public static UFDouble initUFDouble(Object o) {
			return o == null ? m_d_zero :
					o instanceof UFDouble ? (UFDouble) o : new UFDouble(o.toString());
		}
}
