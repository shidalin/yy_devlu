package nc.pub.utils;

import java.util.ArrayList;
import java.util.HashMap;

public class SqlInUtil {
	/**
	 * ƴ��IN���
	 * 
	 * @param fieldName
	 *            �ֶ���
	 * @param cardids
	 *            ֵ����
	 * @return WHERE������
	 */
	public static String getUnionInSQL(String fieldName, String[] cardids) {
		if (fieldName == null || fieldName.trim().equals("") || PrUtil.isEmpty(cardids)) {
			return " 1=1 ";
		}
		String[] partSql = getUnionInSQL(cardids);
		StringBuilder sb = new StringBuilder(" ( ");
		String linkf = " in ";
		String linkf2 = " or ";
		for (int i = 0; i < partSql.length; i++) {
			sb.append(fieldName).append(linkf).append(partSql[i])
					.append(linkf2);
		}

		String sql = sb.substring(0, sb.length() - 3);
		sql = sql + " ) ";

		return sql;
	}

	private static String[] getUnionInSQL(String[] cardids) {
		String[] ex = new String[] { " ('') " };
		if (cardids == null || cardids.length == 0) {
			return ex;
		}

		String linkf = "') ";
		String linkf2 = "','";
		HashMap hm_ol = new HashMap();
		ArrayList al = new ArrayList();
		StringBuilder sb = new StringBuilder(" ('");
		for (int i = 0; i < cardids.length; i++) {
			if (i > 0 && i % 900 == 0) {
				String sql = sb.substring(0, sb.length() - 3);
				sql = sql + linkf;
				al.add(sql);
				sb = new StringBuilder(" ('");

			} else {
			}
			if (hm_ol.containsKey(cardids[i])) {
				continue;
			} else {
				hm_ol.put(cardids[i], cardids[i]);
			}
			sb.append(cardids[i]).append(linkf2);
		}
		String sql = sb.substring(0, sb.length() - 3);
		sql = sql + linkf;
		al.add(sql);
		return (String[]) al.toArray(new String[al.size()]);
	}
	
	/**
	 * ƴ��IN���
	 * 
	 * @param fieldName
	 *            �ֶ���
	 * @param cardids
	 *            ֵ����
	 * @return WHERE������
	 */
	public static String getUnionNotInSQL(String fieldName, String[] cardids) {
		if (fieldName == null || fieldName.trim().equals("") || PrUtil.isEmpty(cardids)) {
			return " 1=1 ";
		}
		String[] partSql = getUnionInSQL(cardids);
		StringBuilder sb = new StringBuilder(" ( ");
		String linkf = " not in ";
		String linkf2 = " and ";
		for (int i = 0; i < partSql.length; i++) {
			sb.append(fieldName).append(linkf).append(partSql[i])
					.append(linkf2);
		}

		String sql = sb.substring(0, sb.length() - 4);
		sql = sql + " ) ";

		return sql;
	}
}
