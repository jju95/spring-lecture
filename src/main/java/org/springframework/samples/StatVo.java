/**
 * 
 */
package kr.co.upage.admin.api.vo;

import java.io.Serializable;
import java.util.List;

import org.json.simple.parser.JSONParser;

import kr.co.upage.admin.api.result.datavo.DataTableVo;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**Stat Vo
 * @author wha02068
 *
 */
@Data
@EqualsAndHashCode(callSuper=false)
public class StatVo extends DataTableVo implements Serializable{

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;
	
	/**json parser
	 */
	private static final JSONParser parser = new JSONParser();
	
	/**
	 * 순서
	 */
	private String statContentSeq;
	/**
	 * 날짜
	 */
	private String days;
	
	private String hour;
	
	/**
	 *코드
	 */
	private String code;
	
	private String title;
	
	/**
	 *항목
	 */
	private String value;
	
	/**
	 * 
	 */
	private String uuid;
	
	/**
	 * 
	 */
	private String pv;
	
	/**
	 * 
	 */
	private String uv;
	
	/**
	 *카테고리ID 
	 */
	private String conId;
	
	/**
	 *클릭수
	 */
	private String odr;
	
	/**
	 * 검색 조건
	 */
	//시작 날짜
	private String startDt;
	
	//종료 날짜
	private String endDt;
	
	//검색 시작 시간
	private String startTime;
	
	//검색 종료 시간
	private String endTime;
	
	//검색 날짜(단일)
	private String searchDt;
	
	//검색 코드
	private List<String> searchCode;
	
	//정렬 조건
	private String searchSort;
	
	//등록일
	private String createDt;
	
	//등록일(채널 끝날짜 시간까지 포함한 날짜)
	private String createDtTo;
	
	//페이징
	private List<Object> dayList;
}
